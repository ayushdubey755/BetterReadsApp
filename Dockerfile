FROM openjdk:11
EXPOSE 8081
COPY src/main/resources/secure-connect.zip secure-connect.zip
ADD target/betterreads.jar betterreads.jar
ENTRYPOINT ["java","-jar","/betterreads.jar"]
