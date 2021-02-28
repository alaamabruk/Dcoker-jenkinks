FROM openjdk:8
ADD target/docker-spring-bootCloud.jar docker-spring-bootCloud.jar
EXPOSE 8085
ENTRYPOINT {"java", "-jar" , "docker-springdocker -bootCloud.jar"}