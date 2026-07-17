# Write your MySQL query statement below

with users as (

    select m.user_id,u.name,count(*) as cnt
    from MovieRating m join Users u
    on m.user_id=u.user_id
    group by m.user_id,u.name

), user_result as(

    select name as results
    from users
    order by cnt desc,name
    limit 1

), movies as(

    select m.movie_id,m.title,avg(mr.rating) rating
    from MovieRating mr join Movies m
    on mr.movie_id=m.movie_id
    where month(mr.created_at)=2 and year(mr.created_at)=2020
    group by m.movie_id,m.title

), movie_result as(
    select title as results
    from movies
    order by rating desc, title
    limit 1
)

select results from user_result
union all
select results from movie_result