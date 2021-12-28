FROM openjdk:8
EXPOSE 8080
ADD target/jenkinsDemo-0.0.1-SNAPSHOT.jar jenkinsDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkinsDemo-0.0.1-SNAPSHOT.jar"]
