# Introduction

A startup team created a great website and the website is next level and have a huge traffic in seconds they have code with them and they can server to anyone but the problem is with IT Infrastructure.

Based on client traffic startup team need to launch Webservers.You all konw, that if they provision Operating System to install Webservers in Base Operating System. It takes morethan 30 minutes to just install OS and It take some time to boot.They need something which is agile to depoly the website.

The startup can leverage the power of Docker.With Docker the company can launch OS in just a second. Think how agile is this?

Docker is a DevOps tool works with containerization technology.

![Docker](Images/docker.png?raw=true)

### Activities 
1. Install Docker
2. Build a Docker Image from Dockerfile {This Activity Included in Docker-Compose, Next Activity}
3. Launch container from the Image created with Docker Compose 


## Activity - 1

### 1. Pre-Configuration :
Ubuntu 18.04 LTS and installed with Docker and Docker Compose .
* we need to download mysql to check database
```
sudo apt-get install mysql
```

### 2. Install Docker 
* Install docker 
``` 
sudo apt-get install docker-ce
```
* start docker 
```
systemctl start docker 
```
* To check the status of docker 
```
systemctl status docker 
```
**Disable firewall if Docker is dead**



## Activity 2

### Dockerfile 
We need an image to install any Operating System.Dockerfile is the file where we can write code with all the things we want in an Operating System. 

**Keywords in Dockerfile**
RUN - To install packages and run commands
ENV - Define Environmental Variables in Docker Image
COPY - copy files from Base OS to Docker Image 
EXPOSE - To forward the ports to Base OS
CMD - To run service as soon as we start container from Docker Image. We have a challenge with CMD keyword, that is we can only keep a service alive at a time

Now, You can understand  the file ***./src/Dockerfile***

## Activity 3

### Docker Compose

Docker Compose is the Infrastructure as Code (IAC) to configure docker containers.Compose is a tool for defining and running multi-container Docker applications. With Compose, you use a YAML file to configure your application’s services. Then, with a single command, you create and start all the services from your configuration. 

* Docker Compse makes Docker more powerful to solve the challenge faced by the start-up company.They just need to run a command to build complete Infrastructure 

![Docker](Images/composeup.png?raw=true)

* To start docker compose
```
docker-compose up -d 
```

* To stop the docker compose
```
docker-compose stop
```

* To start the docker compose
```
docker-compose start
```

![Docker](Images/containers.png?raw=true)


# References 

Dockerfile : https://docs.docker.com/engine/reference/builder/ 

DockerCompose : https://docs.docker.com/compose/

