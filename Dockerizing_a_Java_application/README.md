# Getting Started with Docker

Dev and Sonia were two friends who were working on an application. Dev started with his work first. He went ahead and created a repository. He then wrote some code, tested the application and uploaded his files to the repository. Now Sonia wanted to further develop the application so she cloned the repository on her local machine and tried to run the application...ERRRRRR! it doesnot work. She tried everything from shaking her laptop to banging the keyboard to singing to her computer. Dev raised his hands by saying, the infamous, "It worked on my machine". Alas, the application doesn't run. Why?

There could be several reasons. Maybe Sonia's machine does not have some dependencies required to run the application or maybe because Dev has a Macbook with macOS and Sonia has a Dell with Windows so there could be some OS level errors.

This is a problem we often encounter in our development cycles. How do we solve it? Is there anyone who can help Sonia?
![Docker image](https://pbs.twimg.com/profile_images/1273307847103635465/lfVWBmiW_400x400.png)
## Docker
Docker is an open platform for developing, shipping, and running applications by using containers. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly.

**What is a container?**
A container is standard unit of software that packages up code and all its dependencies so the application runs quickly and reliably from one computing environment to other. Containers provide an isolated execution environment to run the application. Containers are great for continuous integration and continuous delivery (CI/CD) workflows.

A container is built using a container image which is a package of software that includes EVERYTHING needed to run an application: code, runtime, system tools, system libraries and settings. A container image and container are like a class and object. You can create many containers using a container image. 

Docker removes the "It worked on my machine" phrase from a developer's life because now it can work anywhere. The best part is that you can develop an application on a Windows machine and run it on a Linux machine without any errors because everything needed to run the application is present inside the container.

How is a Virtual Machine different from a container?
Unlike VMs, Containers don't need a Guest OS to run the application and since all the dependencies are already there you don't need to install anything, this makes containers lightweight (they are usually tens of MBs unlike VMs which are hundreds of MBs). Containers don’t need the extra load of a hypervisor, but run directly within the host machine’s kernel. This means you can run more containers on a given hardware combination than if you were using virtual machines. You can even run Docker containers within host machines that are actually virtual machines!
 



Dev was one of three friends who were developing an application. They used the computers in their college to work on the application together. After the project was done, Dev copied the application folder to a pendrive and went home happily. He reached home, copied the application folder to his laptop and ... ERRRRRR! the application doesn't work. Dev thought to himself "It worked on the college computer what happened now".There could be several reasons the application doesn't work maybe Dev doesn't have some dependencies needed to run the application or Dev developed the application on a linux machine and his laptop is a windows machine or something else. Now how do we solve this problem? Containers to the rescue.


When you try to run an app into production usually everything starts to fall apart. Docker holds the application and it's dependencies together in containers so you can rest assured that nothing will fall apart and you can easily run the application into production.

