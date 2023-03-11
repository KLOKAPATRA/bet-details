FROM openjdk-8-jdk

ADD ./target/bet_details-0.0.1-SNAPSHOT.jar /usr/src/bet_details-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar","bet_details-0.0.1-SNAPSHOT.jar"]