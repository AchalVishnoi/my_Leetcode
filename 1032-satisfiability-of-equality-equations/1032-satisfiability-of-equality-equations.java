class Solution {
    public boolean equationsPossible(String[] eq) {

        int par[]=new int[26];
        for(int i=0;i<26;i++) par[i]=i;
        for(String s:eq){
            if(s.charAt(1)=='=') union(s.charAt(0)-'a',s.charAt(3)-'a',par);
        }
        for(String s:eq){
            if(s.charAt(1)=='!'){
                if(find(s.charAt(0)-'a',par)==find(s.charAt(3)-'a',par)) return false;
            }
        }

        return true;
        
    }
    private void union(int a,int b,int par[]){
        int pa=find(a,par);
        int pb=find(b,par);
        par[pb]=pa;
    }
    private int find(int a,int []par){
        if(par[a]==a) return a;
        return par[a]=find(par[a],par);
    }
}