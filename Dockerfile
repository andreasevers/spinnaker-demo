FROM openjdk:8-jdk
ADD target/spinnaker-demo-0.0.1-SNAPSHOT.jar spinnaker-demo-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "spinnaker-demo-1.0.0-SNAPSHOT.jar"]
