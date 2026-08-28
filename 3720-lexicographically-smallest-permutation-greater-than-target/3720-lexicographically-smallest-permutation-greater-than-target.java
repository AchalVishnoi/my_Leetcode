class Solution {
    public String lexGreaterPermutation(String s, String tar) {

        int n=s.length();

        int freq[]=new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        char ans[]=new char[s.length()];

        for(int i=0;i<n;i++){
            char c=tar.charAt(i);
            if(freq[c-'a']>0){
                if(i<n-1){
                    ans[i]=c;
                    freq[c-'a']--;
                }
                else{
                    if(i-1<0) return "";
                    freq[ans[i-1]-'a']++;
                    if(!fillAns(ans,i-1,tar,freq)) return "";
                    break;
                }
            }
            else{
                if(!fillAns(ans,i,tar,freq)) return "";
                break;
            }
        }


        return String.valueOf(ans);
        
    }

    private boolean fillAns(char ans[],int i,String tar,int freq[]){
        if(i<0) return false;
        char c=tar.charAt(i);
        boolean found=false;
        for(int j=c-'a'+1;j<26;j++){
            if(freq[j]>0){
                found=true;
                ans[i++]=(char)(j+'a');
                freq[j]--;
                break;
            }
        }

        if(!found){
            if(i-1<0) return false;
            freq[ans[i-1]-'a']++;
            return fillAns(ans,i-1,tar,freq);
        }
        
        for(char j='a';j<='z';j++){
            while(freq[j-'a']>0){
                ans[i++]=j;
                freq[j-'a']--;
            }
        }
        return true;
    }
}