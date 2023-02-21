FROM eclipse-temurin:19
EXPOSE 8080
ADD target/cassandra-data-access.jar cassandra-data-access.jar
ENTRYPOINT ["java","-jar","/cassandra-data-access.jar"]