FROM ubuntu:16.04
RUN apt-get update 
RUN apt-get install openjdk-8-jdk -y
#RUN apt install iputils-ping -y

#COPY EMS-Session /opt/EMS-Session
#COPY Message /opt
#WORKDIR /tmp
COPY x.sh /tmp
COPY . /tmp
RUN ls -l /tmp
#EXPOSE 9010/TCP
CMD java -jar /tmp/target/myproject-0.0.1-SNAPSHOT.jar
#CMD /tmp/x.sh

