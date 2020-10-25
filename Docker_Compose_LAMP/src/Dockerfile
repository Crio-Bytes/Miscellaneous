FROM ubuntu:18.04
# making non-interactive when Dockerfile Creation 
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get  update -y

#Install Webserver 
RUN apt-get install apache2 -y
RUN apt-get install libapache2-mod-php php -y

#Deploy 
COPY index.php /var/www/html/

#Install MySQL
RUN apt-get install libaio1 libaio-dev
RUN apt-get install mysql-server -y
RUN usermod -d /var/lib/mysql/ mysql
RUN apt-get install net-tools -y
RUN apt-get install curl -y

#Forwarding Webserver port and MySQL port
EXPOSE 80
EXPOSE 3306

# EntryPoint - We have challenge with CMD keyword so to run multiple services with CMD we have to use EntryPonint to run multiple commands
COPY apache apache  
COPY mysql mysql
COPY start_service.sh start_service.sh

CMD ./start_service.sh
