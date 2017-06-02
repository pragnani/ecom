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

1. install Gulp and Gulp client
npm install -g gulp
npm install -g gulp-cli

2. typings
npm install -g typings@1.3.3

3. typescript
npm install -g typescript@2.0.2
4. tsnode
npm i -g ts-node@1.3.0


Install All dependencies
npm install

To clean

npm run clean


to Build
npm run Build

to start server (lite server)
npm start
