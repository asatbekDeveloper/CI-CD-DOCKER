FROM openjdk:8
EXPOSE 4444
ADD target/docker-ci-cd.jar docker-ci-cd.jar
ENTRYPOINT ["java","-jar","/docker-ci-cd.jar"]