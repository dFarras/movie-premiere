FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/movie-premiere*.jar movie-premiere.jar
CMD java ${JAVA_OPTS} -jar movie-premiere.jar