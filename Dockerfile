FROM openjdk:17-jdk-alpine
WORKDIR /opt
COPY ./fineract-provider/build/libs/fineract-provider-*.jar /opt/fineract-provider.jar
EXPOSE 8443
CMD ["java", "-jar", "-Dloader.path=.", "/opt/fineract-provider.jar"]
