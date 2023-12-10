# SelectionProcessTest

## Test with SpringBoot and docker.
A backend was developed using the Spring Boot framework and packaged in a Docker container.

##Scheme

##BBDD

##Screenshot

## Install without docker
* git clone https://github.com/jpg2013/SelectionProcess.git
* cd SelectionProcessTest/
* mvn clean package spring-boot:repackage
* docker-compose build up -d 
* open your browser and go to https://localhost:8080/api/v1