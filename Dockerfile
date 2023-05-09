FROM eclipse-temurin:17-jdk-alpine
#FROM eclipse-temurin:11-jre-alpine

RUN apk add --no-cache tzdata bash curl

ENV TZ=Asia/Seoul
ENV LANG=ko_KR.UTF-8
ENV LANGUAGE=ko_KR:ko;en_US:en
ENV LC_ALL=ko_KR.UTF-8

EXPOSE 8080

COPY ./pilota.jar app.jar
ARG PROFILE=dev
ENV PROFILE=${PROFILE}

ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}", "-Djava.security.egd=file:/dev/./urandom","-jar","-Duser.timezone=Asia/Seoul","/app.jar"]