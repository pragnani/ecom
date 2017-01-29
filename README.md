# ecom

#----------------How to RUN------#

1. In order to start a web or service layer , we need to first start config server. 

ecom-config-server-> Run as Spring boot application or from command prompt

java -jar ecom-config-server\target\jar file version

To run web application we need supply environment we are currently working as a argument to the 
server

To do this Right click on project -> run as-> run configuration ->spring boot application->
go to Arguments Tag->
Vm Arguments add the following argument

-Dspring.profiles.active=dev