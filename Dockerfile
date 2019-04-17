FROM java:8-jre

ADD target/spring-boot-security-awareness-workshop-0.0.0.jar /app/app.jar

WORKDIR /app
CMD ["java", "-jar", "/app/app.jar"]
