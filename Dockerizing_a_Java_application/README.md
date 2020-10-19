# Getting Started with Docker

Dev and Sonia were two friends who were working on an application. Dev started with his work first. He went ahead and created a repository. He then wrote some code, tested the application and uploaded his files to the repository. Now Sonia wanted to further develop the application so she cloned the repository on her local machine and tried to run the application...ERRRRRR! it doesnot work. She tried everything from shaking her laptop to banging the keyboard to singing to her computer. Dev raised his hands by saying, the infamous, "It worked on my machine". Alas, the application doesn't run. Why?

There could be several reasons. Maybe Sonia's machine does not have some dependencies required to run the application or maybe because Dev has a Macbook with macOS and Sonia has a Dell with Windows so there could be some OS level errors.

This is a problem we often encounter in our development cycles. How do we solve it? Is there anyone who can help us?

![Another Image](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/I%20can%20help%20you!.png)

## Docker
Docker is an open platform for developing, shipping, and running applications by using containers. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. Lying at the heart of Docker are containers.

**What is a container?**
A container is standard unit of software that packages up code and all its dependencies so the application runs quickly and reliably from one computing environment to other. Containers provide an isolated execution environment to run the application. Containers are great for continuous integration and continuous delivery (CI/CD) workflows.

A container is built using a container image which is a package of software that includes _EVERYTHING_ needed to run an application: code, runtime, system tools, system libraries and settings. When container images are run on the Docker Engine they become containers. A container image and container are like a class and object. You can create many containers using a container image. 

Docker removes the "It worked on my machine" phrase from a developer's life because now it can work anywhere. The best part is that you can develop an application on a Windows machine and run it on a Linux machine without any errors because everything needed to run the application is present inside the container.

When you try to run an app into production usually everything starts to fall apart. Docker holds the application and it's dependencies together in containers so you can rest assured that nothing will fall apart and you can easily run the application into production.

**Containers vs. Virtual Machines**

![Container_vs_VM](https://i2.wp.com/www.docker.com/blog/wp-content/uploads/Blog.-Are-containers-..VM-Image-1.png?fit=1600%2C680&ssl=1)

Unlike VMs, Containers don't need a Guest OS to run the application and since all the dependencies are already there you don't need to install anything, this makes containers lightweight (they are usually tens of MBs unlike VMs which are hundreds of MBs). Containers don’t need the extra load of a hypervisor, but run directly within the host machine’s kernel. This means you can run more containers on a given hardware combination than if you were using virtual machines. You can even run Docker containers within host machines that are actually virtual machines!


# Prerequisites
* Docker installed on your machine. If you are a windows user you can follow [my guide on medium](https://medium.com/@raziuddin033/docker-101-installation-on-windows-10-f979ecf1aedb). 
* An IDE. I used IntelliJ IDEA but you can use Visual Studio Code as well.
* A little knowledge of Java and Spring can help but it is not mandatory.
* Curiosity and Excitement (very very important)

# Activities
## Activity 1: Build a Spring Application
Before containerizing an application we need an application, since we are focusing on Spring we use Spring Initializr to create a Spring Application.(you can containerize any application such as a node.js app or a django app or flask app etc.)

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/spring_initalizr.png)

After downloading the .zip file. Extract the folder and open it in your IDE.
Open Application.java and write the following code.
What we are doing is creating a simple REST api which returns a string "This is a docker application".

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/spring_app_code.png)

Now build and run the application using `./gradlew build bootrun` in the terminal.
Make sure the application runs perfectly without any errors and you see the output string on localhost:8080 in your browser.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/application_running_in_browser.png)

## Activity 2: Make a Dockerfile
The Docker engine looks for a "Dockerfile" in you application folder. This file is used to build container images which are later used to build containers. It is a 3 step process. Dockerfile -> Container Image -> Container.
Create a newfile called "Dockerfile" in the application folder. This file should be inside the root folder - application/Dockerfile.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/dockerfile_code.png)

A docker file almost always starts with `FROM` which initializes a new build and sets a base image. `openjdk:8-jdk-alpine` which means that we are using an alpine (A lightweight linux distribution) based image with contains Java 8 JDK and JRE.
`ARG` defines a variable that users can pass at build time.
The `COPY` instruction copies the .jar file to the container filesystem.
`ENTRYPOINT` allows you to configure a container that will run as an executable. We use the exec form for `ENTRYPOINT` to execute the java application, using the jar file, without shell wrapping.

## Actvity 3: Build the container image
Now that we have a Dockerfile we can go ahead and use it to build a container image using command below.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/docker_build.png)

the `docker build` command is used to build an image from a Dockerfile.
`--build-arg` specifies the arguments to be passed to `ARG` in the Dockerfile.
`-t` is used to tag the image.
(When executing the build command inside the root folder donot forget the `.` at the end)

Now that we have an image, we can use it to create containers. We can create containers using the `docker run` command. 

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/docker_run.png)

`-p` specifes the port used, 8080 in our case. 
When we check the `localhost:8080` our browser we can see the application running.

Using `docker ps` we can see the running containers. In order to stop a container use `docker stop CONTAINER_NAME`

## Activity 4: Share container images using Docker Hub.
Our application runs perfectly in a container. Now it's time to share our container image so that others can use it to run our application.
Docker Hub helps us create repositories and share images. If you don't have a Docker Hub account go ahead and create one at ![hub.docker.com].
Create a repository to store our container images. 

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/create_a_docker_repository.png)

Now inorder to upload our image to our repository the image needs to follow a particular format <YOUR_USERNAME>/<YOUR_REPOSITORY>:tag.
Go ahead and tag the existing image in such format using `docker tag`
There is only one thing left to do, push the image to docker hub using `docker push`.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/docker_push.png)

You can check your repository on Docker Hub to see the uploaded image.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/container_in_docker_hub.png)

## Activity 5 (Optional): Pull the images and run the application on other machine.
Now that you have a container image in your repository you can pull that image using `docker pull <YOUR_USERNAME>/<YOUR_REPOSITORY>:tag` and create containers using `docker run -p 8080:8080 `.
Try this experiment on your friend's laptop or use your own Terminal (cmd) to do this.

![](https://github.com/raziiiuddin/Miscellaneous/blob/main/Dockerizing_a_Java_application/images/docker_pull.png)


## SUMMARY 
We created a spring application and containerized it using docker. We also used Docker Hub to share our container images. 

## REFERENCES 
* [Docker Docs](https://docs.docker.com/)
* [Spring Guide on Docker](https://spring.io/guides/gs/spring-boot-docker/)

