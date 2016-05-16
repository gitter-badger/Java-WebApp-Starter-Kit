# Java-WebApp-Starter-Kit
Spring based WebApp Starter Kit(Boilerplate) Based on Java 8 And
 with very customizable and scalable structure.

A solid starting point for Building a new Start-Up that Based on Java as Backend solution.
## Tested On / With || What are the tools of the trade
#### Jdk 1.8.0_91

```
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
```
=================
#### Git 2.8.2
```
sudo apt-add-repository ppa:git-core/ppa
sudo apt-get update
sudo apt-get install git
```
=================
####Maven 3.3.9
```
wget wget http://apache.mirror.anlx.net/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
tar -zxf apache-maven-3.3.9-bin.tar.gz
sudo cp -R apache-maven-3.3.9 /usr/local
sudo ln -s /usr/local/apache-maven-3.3.9/bin/mvn /usr/bin/mvn
sudo ln -s /usr/local/apache-maven-3.3.9/bin/mvnDebug /usr/bin/mvnDebug
```
=================
####Tomcat 8.0.33
Download tomcat and conf it
```
sudo groupadd tomcat
sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
cd ~
wget http://mirror.sdunix.com/apache/tomcat/tomcat-8/v8.0.33/bin/apache-tomcat-8.0.33.tar.gz
sudo mkdir /opt/tomcat
sudo tar xvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1
cd /opt/tomcat
sudo chgrp -R tomcat conf webapps
sudo chmod g+rwx conf webapps
sudo chmod g+r conf/* webapps/*
sudo chown -R tomcat work/ temp/ logs/ webapps/
```
Where java is
```
sudo update-alternatives --webapp.config java
```
Create a new start up script
```
sudo nano /etc/init/tomcat.conf
```
Copy this into it
```
description "Tomcat Server"

  start on runlevel [2345]
  stop on runlevel [!2345]
  respawn
  respawn limit 10 5

  setuid tomcat
  setgid tomcat

  env JAVA_HOME=/usr/lib/jvm/java-8-oracle/jre
  env CATALINA_HOME=/opt/tomcat

  # Modify these options as needed
  env JAVA_OPTS="-Djava.awt.headless=true -Djava.security.egd=file:/dev$
  env CATALINA_OPTS="-Xms512M -Xmx1024M -server -XX:+UseParallelGC"

  exec $CATALINA_HOME/bin/catalina.sh run

  # cleanup temp directory after stop
  post-stop script
    rm -rf $CATALINA_HOME/temp/*
  end script
```
Set env JAVA_HOME= to your java home path
and than Do:
```
sudo initctl reload-configuration
sudo nano /opt/tomcat/conf/tomcat-users.xml
```
Add your admin user
```
<tomcat-users>
    <user username="admin" password="password" roles="manager-gui,admin-gui"/>
</tomcat-users>
```
Restart Tomcat
```
sudo initctl restart tomcat
```
=================
####Ubuntu 14.04.4 LTS

## Features

Java Based configuration vs xml Based Configuration

Multi Module Project

Dev and Prod Environments

DB upgrader scripts Engine

Spring framework 4.2.5

Spring MVC Rest API

Spring Security 4.1

Spring Data Jpa 1.10.1

Spring Data Redis 1.7.1

Jedis 2.8.1

Hibernate 5.1

MyBatis 3.4.0

Works with Mysql 5.7.12 vs Postgres 9.5.2 vs mariaDB 10.1.14

AWS / Google cloud / Azzure SDKs

SendGrid / MailChimp Sdks

codeCov and coveralls and travis CI integrations

Struts 2

Guava 19

Jackson 2.7.0

JooQ 3.8.0

lombok 1.16.8

sl4j 1.7.21

logback 1.1.7

SpringMock MVC 2.3.4

testNG 6.9.10

PowerMock 1.6.5

Mockito 1.10.19

## What is the structure

## How To Start

./cleanProj

mvn clean install

## How Can I contribute to this wonderfull project
Just clone it man...

and of course don't forget to push when you done.
## What to do with the Complains

email to yliskovich@gmail.com
