FROM openjdk:alpine

EXPOSE 9092:9092

ADD /target/*.jar ms2.jar

ENTRYPOINT ["java","-jar","/ms2.jar"]
