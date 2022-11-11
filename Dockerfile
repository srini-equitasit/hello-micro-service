FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar hello-micro-service.jar
ENTRYPOINT ["java","-jar","/hello-micro-service.jar"]