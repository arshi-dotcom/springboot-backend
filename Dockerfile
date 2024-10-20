FROM openjdk:17-jdk-alpine
COPY ./C:/Users/MMC/springboot-backend/website/target/*.jar app.jar
EXPOSE 8080  
ENTRYPOINT ["java", "-jar", "/app.jar"]
