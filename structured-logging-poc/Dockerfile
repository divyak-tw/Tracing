FROM openjdk:17
VOLUME /tmp
EXPOSE 7654
ARG JAR_FILE=build/libs/structured-logging-poc-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} structured-logging-poc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/structured-logging-poc-0.0.1-SNAPSHOT.jar"]