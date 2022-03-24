##순서
-스프링부트 프로젝트세팅
-테이블생성 boardTbl
-더미데이터 10건!
-mustache 메인페이지(부트스트랩테이블,검색바)
JPA에서 제공하지 않기 때문에 네이티브 쿼리생성
```sql

SELECT * FROM boardTbl WHERE title ilke '%:keyword%';
```
get요청은 a태그 form 태그
get요청을 fetch로 하는 경우
