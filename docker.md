# Docker

Docker is a platform for developing, shipping, and running applications in containers.
It enables you to separate your applications from your infrastructure, so you can deliver software quickly.

#### Docker Container
A container is a standard unit of software that packages up code and all its dependencies,
so the application runs quickly and reliably from one computing environment to another.

#### Docker Image
An image is a lightweight, stand-alone, executable package that includes everything needed to run a piece of software,
including the code, a runtime, libraries, environment variables, and config files.

#### Docker Container vs Virtual Machine
- Containers are lightweight because they don't need the extra load of a hypervisor, but run directly within the host machine's kernel.
- Containers can share a single kernel, and the only information that needs to be in a container image is the executable and its package dependencies, which reduces the image size.
- Containers start up very quickly and use fewer resources than virtual machines.

#### Docker Commands

1. docker -v
2. docker images
3. docker pull {image-name}:{image-version}
4. docker run --name {set-container-name} {image-name} | example: docker run --name francisco-postgres -e POSTGRES_PASSWORD=password postgres
5. docker run -v [host-path]:[container-path] | example: docker run -v /user/some/path/data:/var/lib/postgres/data
6. docker run -v [container-path] | example: docker run -v /var/lib/postgres/data
7. docker run -v name:[container-path] | example: docker run -v name:/var/lib/postgres/data
8. docker ps | list running containers
9. docker ps -a
10. docker start {container-name}
11. docker stop {container-name}
12. docker logs {container-name}
13. docker logs -f {container-name} | blocking logs
14. docker rm {container-name} | delete container
15. docker rmi {image-name}
16. docker exec -it {container-name} {specific-command} | example: docker exec -it practical_cartwright psql -U postgres
17. docker exit

After restart or stop the container, the data will be lost to persist the data; we can use volumes

#### Docker Volumes
A Docker volume is a directory stored outside the container's filesystem.
It is part of the host filesystem and can be shared among containers.

example: docker run --name postgres-db -e POSTGRES_PASSWORD=password -v C:\Users\franc\docker\volumes\postgres:/var/lib/postgres/data postgres

#### Working Before Containers
1. Different installation process for each OS
2. Hard to reproduce the same issues in different environments
3. Many steps if something goes wrong

#### Expose Docker Container to the Host
1. docker run -p 8080:8080 {image-name}

Full example:
 ````
 docker run --name postgres-xico -p 5430:5432 -e POSTGRES_USER=ffreitas -e POSTGRES_PASSWORD=29101997 -e POSTGRES_DB=demo_db -v C:\Users\franc\docker\volumes\postgres\data:/var/lib/postgres/data postgres
 ````


#### Docker file
A Dockerfile is a text document
that contains all the commands a user could call on the command line to assemble an image.

Structure Example:
````dockerfile
FROM java:21 {base_image_name}
RUN {command_1} && {command_2}
COPY {source} {destination}
WORKDIR {path}
ENV {key}={value}
EXPOSE {port}
CMD {command}
````

Dockerfile for the application:
````dockerfile
FROM openjdk:21-jdk

LABEL authors="Francisco"
LABEL description="This is a Dockerfile for a Spring Boot application"
LABEL version="1.0"

WORKDIR /app

COPY target/School-Management-System-Spring-1.0.0.jar /app

EXPOSE 8080

CMD ["java", "-jar", "School-Management-System-Spring-1.0.0.jar"]
````
then we can build the image using the command:
````docker
docker build -t school-management-system-spring .
````

#### Docker Network
Docker network is a type of network that allows communication between different containers.

Create Network:
````docker
docker network create --driver bridge {network-name}
````
List Networks:
````docker
docker network ls
````

Connect Container to Network:
````docker
docker network connect {network-name} {container-name}
````
````docker
docker run --name {container-name} --network {network-name} {image-name}
````

#### Docker Compose
Docker Compose is a tool for defining and running multi-container Docker applications.
With Compose, you use a YAML file to configure your application's services.
Then, with a single command, you create and start all the services from your configuration.

Example of a docker-compose file:
````yaml
# It's required that the image must be created before running the docker-compose
# spring-school-management:1.0.0 is app image name
# openjdk:21-jdk is the base image name Java 21

services:
  database:
    image: postgres:latest
    container_name: postgres-school-management
    environment:
      POSTGRES_USER: ffreitas
      POSTGRES_PASSWORD: 29101997
      POSTGRES_DB: school_management_database
    ports:
      - "5430:5432"
    volumes:
      - postgres:/var/lib/postgres/data
    networks:
      - school-management-network

  spring-application:
    image: spring-school-management:latest
    container_name: spring-school-management
    ports:
      - "8080:8080"
    networks:
      - school-management-network
    volumes:
      - spring-application:/var/lib/spring-application/data

volumes:
    postgres:
    spring-application:

networks:
    school-management-network:
        driver: bridge
````

#### Docker compose commands
1. docker-compose up
2. docker-compose up -d
3. docker-compose down

Overview Steps:
1. Create a Dockerfile for the application
2. Docker Build
3. Docker Compose run
````docker
docker build -t {image_name} .
````
````dockerfile
FROM openjdk:21-jdk

LABEL authors="FFreitas"
LABEL description="This is a Dockerfile for a Spring Boot application"
LABEL version="1.0.0"

WORKDIR /app

COPY target/School-Management-System-Spring-1.0.0.jar /app

EXPOSE 8080

CMD ["java", "-jar", "School-Management-System-Spring-1.0.0.jar"]
````