FROM openjdk:11-jdk-slim

WORKDIR /app

COPY target/k8s-spark.jar k8s-spark.jar

CMD ["java", "-jar", "k8s-spark.jar"]
