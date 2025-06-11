FROM openjdk:17-alpine
LABEL maintainer="akashpatel"
ADD target/backend-0.0.1-SNAPSHOT.jar backend-springboot.jar
ENTRYPOINT ["java","-jar","backend-springboot.jar"]