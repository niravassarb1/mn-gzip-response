FROM openjdk:14-alpine
COPY build/libs/mn-gzip-response-*-all.jar mn-gzip-response.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mn-gzip-response.jar"]