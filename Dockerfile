#
#   Dockerfile
#
FROM eclipse-temurin:17-jdk-alpine
LABEL authors="Jorge de la Peña"
#
#   Create Workdir
#
RUN mkdir -p /usr/src/app/
WORKDIR /usr/src/app/
#
#   Copy data
#
COPY boot/target/boot-1.0.0-SNAPSHOT.jar /usr/src/app/app.jar
#
#   opening ports
#
EXPOSE 8080
#
#   executing cmd
#
ENTRYPOINT ["java", "-jar", "app.jar"]