FROM openjdk:21

ADD target/sonar-demo.jar sonar-demo.jar
EXPOSE 9988
ENTRYPOINT [ "java" ,"-jar","sonar-demo.jar" ]
