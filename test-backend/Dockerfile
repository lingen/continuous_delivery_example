# syntax=docker/dockerfile:1

#构建镜像
FROM openjdk:11.0.12-jre-slim
WORKDIR /app
COPY ./test-backend-bootstrap/build/libs/test-backend-bootstrap-1.0.0-SNAPSHOT.jar .
CMD ["java","-jar","/app/test-backend-bootstrap-1.0.0-SNAPSHOT.jar"]
