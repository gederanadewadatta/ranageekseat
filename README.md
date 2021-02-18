# ranageekseat

for testing thru API:
kindly do:
1. type mvn spring-boot:run
2. type following content on terminal :
  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/xml' -d '{ \ 
   "agedeath": 12, \ 
   "yeardeath": 17 \ 
 }' 'http://localhost:2011/api/kill'



for testing by java class:
kindly open IDE > import project > open src/main/java/com/rana/test/geekseat/testing.java >run as Java Application


for testing using heroku:
1.type following content on terminal :
  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/xml' -d '{ \ 
   "agedeath": 12, \ 
   "yeardeath": 17 \ 
 }' 'http://ranageekseat.herokuapp.com/api/kill'
2. if using postman set url into : https://ranageekseat.herokuapp.com/api/kill and set Method to be : POST;

PS: 
for any result, please change agedeath or yeardeath using any kind of integer number

PPS:
this API only consume and produce application/json, the rest of mediatype will give error message from server
