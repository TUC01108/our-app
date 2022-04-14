FROM java:8
ADD /target/demo.jar app.jar
ENTRYPOINT [ "java" , "-jar" , "app.jar" ]
EXPOSE 8080