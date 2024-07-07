FROM openjdk:17
EXPOSE 8082
ADD target/springboot-0.0.1-SNAPSHOT.jar springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-0.0.1-SNAPSHOT.jar"]