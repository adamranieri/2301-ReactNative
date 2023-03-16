## Why Docker? What Problem is it addressing?
- Installing technologies and dependencies isn't always easy
- Docker helps us set up isolated environments where we can
    - Relatively easily install dependencies/technologies we need to run
    - Run our programs

### Containers
- Container - a mechanism for packaging an app with its dependencies so that it runs in its own isolated sandbox
    - Examples
        - Installing JDK
        - Maven
        - Node
    - Ensuring that any host can run it as long as docker is installed
    - Container can't change the host environment and vice versa (unless we explicitly allow it) 
        - For example, we can map the port of the container to a port on our host machine 
- Benefits
    - Isolation and virtualization - won't be affected by host machine
    - Lightweight - not creating an entire OS, just using what is necessary
    - Portable - as long as some has Docker installed, they can run a container
    - Scalable - can spin many containers from the same image
- Virtualization - providing a virtualized/simulated view of some set of resources

### Images
- Static object, template for a container to run
- Images are built in layers
    - If we change one layer, it won't have to re-run the entire build
        - It would just re-run what was changed

### Architecture
- Client-Server Architecture
#### Docker Daemon
- Long running process that manages Docker objects
    - Docker images
    - Docker containers
- Listens for calls to manage them
- Acts as the "server" of the client-server architecture
#### Docker CLI Client
- The main command-line-interface by which we write commands to the Docker Daemon
- Commands are prefaced by "docker"
- https://dockerlabs.collabnix.com/docker/cheatsheet/

### Docker Objects
- Managed by Docker daemon
- container - runnable instance of the image
- image - static template for the container

#### Docker Images
- Two main ways we can obtain images
    - Pulling from somewhere (Dockerhub)
    - Building them using a Dockerfile
- Blueprint for a container
- We can run many containers based on one image
- docker pull *image_name*
    - If we try to create a container based on an image that we don't have, Docker will try to pull automatically
- docker push *image_name*

#### Docker Containers
- Running instance of the image
- If we run a container on a Linux machine, it will share the host OS
- On Windows, there is an additional layer of virtualization
    - Must have Hyper-V and virtualization enabled
        - IMPORTANT: BEFORE YOU INSTALL DOCKER, MAKE A RESTORE POINT
            - Otherwise, might have to reinstall everything
    - DockerPlayground is a good temporary solution if Docker doesn't work on your machine
    - We will say how to host Docker on EC2 instance
- Docker Container States
    - created
    - running
    - restarting
    - paused
    - exited
    - dead

### Dockerfile
- Make sure the name is "Dockerfile"
    - no extensions


### Docker Playground
- https://labs.play-with-docker.com/
- Online website that gives us our own environment that has Docker installed
    - Sessions last 4 hours so only good for development/learning
- Unix-based command line
    - ls - lists files/folders in the current directory
    - cd - lets us change directories
    - touch -create a file
    - vim lets us edit/create a file
        - i - insert mode
        - esc - leave insert mode
        - :wq - write and quit, save and close the file
        - :q - escape
    - mkdir - makes a new directory
    - cat - lets us view the contents of a file
- Try running docker run docker/whalesay cowsay boo
    - Docker will pull the image from Dockerhub and run the container
    - You should see a whale saying boo or whatever message you passed in
    - We can check with ls to see that nothing was actually created in our directory because these Docker containers are isolated

### Installation
- Install Docker Desktop
    - https://www.docker.com/products/docker-desktop/
    - Should give you Docker Desktop and CLI
- Make sure to set up a restore point
    - Look up Create a Restore Point
    - Click on Create
        - Give it a name like "Before_Docker_Install"
    - This should create a snapshot of our computer so if it crashes, we can easily get back

### Demos

#### Basic Java Container
```Dockerfile
# Define the parent image
FROM ubuntu

# Install needed programs
RUN apt-get update
RUN apt-get -y dist-upgrade
RUN apt-get -y install default-jdk 

# Within the image and thus container, set the working directory to the new directory example
WORKDIR /example

# Create Hello World Java program and save it in the appropriate file 
RUN echo 'public class HiWorld{ public static void main(String[] args){System.out.println("Hi world");}}'> HiWorld.java

# Compile the Java program, creating the file that the JVM can actually run 
RUN javac HiWorld.java

# Run the HelloWorld program in the container 
CMD ["java", "HiWorld"]
```
- Once you have the Dockerfile created, make sure you're in the same directory as the Dockerfile and it should use that
- Create the image:  docker build -t java-hello-world .
- Run the container: docker run java-hello-world

##### Things to Note
- Notice that nothing was created on our host machine
- Java is not installed on our host machine
    - Unless you already had it installed
- Image took a few minutes to build at first
    - But if we change the file and re-run it should know that only 1 layer was changed so it won't re-run the entire build
    - The layers can use the cache of the previous run so it knows not to re-run the same thing


#### Spring Boot App
- https://github.com/roryeiffe/pet-project-3-9-2023
```Dockerfile
# Build State, using Maven as our base image:
FROM maven:3.6.0-jdk-11-slim AS build
# Copy the src folder from host machine and move it into the container:
COPY src /home/app/src
# Copy the pom file from host machine and move it into the container:
COPY pom.xml /home/app

# Package the maven app, by specifying where the pom.xml is
RUN mvn -f /home/app/pom.xml clean package

# Once we package the Maven app, we need to execute it using Java:
FROM openjdk:11-jre-slim
# Now that we've packaged the application, it sets in the target folder as a JAR file
# We can inspect the pom.xml to deduce what the name of the jar file is (artifact-id and version)
# Copying the jar file to a new location
COPY --from=build /home/app/target/spring-boot-demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar

# Expose the port from the container, so we can access from our host machine
EXPOSE 8080

# Final command, execute the jar file, using the new location that we moved it to
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo.jar"]
```

##### Running the Container:
- docker run --name spring-container spring-image
    - The issue here is that the container doesn't have access to environment variables
- docker run --name spring-container -e RDS_URL=jdbc_url -e RDS_USERNAME = postgres -e RDS_PASSWORD=password spring-image
    - Manually pass in the environment variables
- docker run --name spring-container -e RDS_URL -e RDS_USERNAME -e RDS_PASSWORD spring-image
    - If we just specify key and no value, it will use our host environment variables:
- docker run --name spring-container -p 8080:8080 -e RDS_URL -e RDS_USERNAME -e RDS_PASSWORD spring-image
    - Map the container's port 8080 to our host machine's 8080 so we can access localhost:8080 on our host machine


##### Things to Note
- Database?
    - Since we're hosting it on RDS, it shouldn't be an issue
- Environment Variables
    - Because Docker create its own isolated environments, we won't automatically have access to our host machine's environment variables
- 
