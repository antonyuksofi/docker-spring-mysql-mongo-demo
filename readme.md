# Docker + Spring Boot demo
 This is a demo project for Docker with Spring Boot.
 
## How to build and run container from scratch

### Maven build

Run the phases:
`mvn clean`
`mvn install`

As a result you should have target/docker-spring-boot-demo.jar

_Note: the name of JAR can be changed in pom.xml -> build -> finalName._

### Docker image creation

`docker build -f Dockerfile -t docker-spring-boot-demo .`

builds image from file (-f) with name Dockerfile and gives a tag (-t) for this image docker-spring-boot-demo, and Dockerfile is in the current directory (.)

Verify that the new image was added by running:

`docker images`

### Docker container running
**TODO: update for docker-compose**

`docker run -p 8085:8090 docker-spring-boot-demo`

This will run the image docker-spring-boot-demo, and it will publish (-p) the port of the host machine (8085) to the port of container (8090).

_Note: this command runs the container in the foreground mode, so to stop the container press `^C` (MacOS). To run in detached mode use key `-d` which can be used with additional `--rm` option._

### Verify

If everything ran successfully, you should see the greeting page visiting

_http://localhost:8085/app/helloworld_

