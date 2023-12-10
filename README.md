# SelectionProcessTest

## Test with SpringBoot and docker.
A backend was developed using the Spring Boot framework and packaged in a Docker container.

## Scheme
![Scheme](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Docs/Diagrams/Scheme.png?raw=true)

## BBDD
![BBDD](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Docs/Diagrams/BBDD.png?raw=true)

## Screenshot
![BBDD](https://github.com/jdlpg/SelectionProcessTest/blob/develop/Docs/Diagrams/ScreenShot.png?raw=true)

## Requeriments
* Java version: 17.0.9
* Apache Maven 3.6.3
* Docker version 24.0.5
* Docker comose
## Install without docker
* git clone https://github.com/jpg2013/SelectionProcess.git
* cd SelectionProcessTest/
* mvn clean package spring-boot:run
* open your browser and go to https://localhost:8080/api/v1
## Install with docker
* git clone https://github.com/jpg2013/SelectionProcess.git
* cd SelectionProcessTest/
* mvn clean package install
* docker-compose up  -d
* open your browser and go to https://localhost:8080/api/v1
