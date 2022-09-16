FROM openjdk:11
EXPOSE 8081
ADD target/betterreads.jar betterreads.jar
ENTRYPOINT ["java","-jar","/betterreads.jar"]
