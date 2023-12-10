# SelectionProcessTest

## Test with SpringBoot and docker.
A backend was developed using the Spring Boot framework and packaged in a Docker container.

## Scheme
![Scheme](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Diagrams/Scheme.png?raw=true)

## BBDD
![BBDD](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Diagrams/BBDD.png?raw=true)

## Screenshot
![BBDD](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Diagrams/ScreenShot.png?raw=true)

## Install without docker
* git clone https://github.com/jpg2013/SelectionProcess.git
* cd SelectionProcessTest/
* mvn clean package spring-boot:repackage
* docker-compose build up -d 
* open your browser and go to https://localhost:8080/api/v1
