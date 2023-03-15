FROM openjdk:17
EXPOSE 8080
ADD target/springbootk8sdemousingyaml.jar springbootk8sdemousingyaml.jar
ENTRYPOINT ["java","-jar","/springbootk8sdemousingyaml.jar" ]