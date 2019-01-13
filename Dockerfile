FROM openjdk:8
RUN apt-get update -y && apt-get install maven -y
ENV M2_HOME /var/maven_home
RUN mvn clean
RUN mvn install
ADD target/docker-spring-boot.jar . 
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]
