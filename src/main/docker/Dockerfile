FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD dockerized-microservice.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8094
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]