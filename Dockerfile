FROM openjdk:8-jdk-alpine
COPY /target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","spring-boot-mongodb-0.0.1-SNAPSHOT.jar"]