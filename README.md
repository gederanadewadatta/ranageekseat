# ranageekseat

for testing thru API:
kindly do:
1. type mvn spring-boot:run
2. type following content on terminal :
  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/xml' -d '{ \ 
   "agedeath": 12, \ 
   "yeardeath": 17 \ 
 }' 'http://localhost:2011/api/kill'

PS: 
for any result, please change agedeath or yeardeath using any kind of integer number


for testing by java class:
kindly open IDE > import project > open src/main/java/com/rana/test/geekseat/testing.java >run as Java Application


for testing using heroku:
1.access http://ranageekseat.herokuapp.com/swagger-ui.html#!/test-controller/findAvgKillPeopleUsingPOST 
2.change agedeath or yeardeath with interger data type 
