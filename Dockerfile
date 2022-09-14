FROM openjdk:11
EXPOSE 8080
ADD target/betterreads.jar betterreads.jar
ENTRYPOINT ["java","-jar","/betterreads.jar"]
