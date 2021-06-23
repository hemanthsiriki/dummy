FROM node:latest
RUN apt-get update && \
apt-get install -y --no-install-recommends \
        openjdk-11-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
