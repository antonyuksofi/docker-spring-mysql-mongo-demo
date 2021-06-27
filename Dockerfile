FROM openjdk:8
ADD target/docker-spring-boot-demo.jar docker-spring-boot-demo.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "docker-spring-boot-demo.jar"]