FROM java:8

ARG java_file=target/author-service.jar

WORKDIR /opt/app

EXPOSE 8050

COPY ${java_file} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

