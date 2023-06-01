FROM openjdk:17-alpine

ADD target/*.jar docker-api.jar

ENTRYPOINT ["java","-jar","docker-api.jar"]