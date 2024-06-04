# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the jar file to the container
COPY target/One-One-Mapping-0.0.1-SNAPSHOT.jar /app/One-One-Mapping-0.0.1-SNAPSHOT.jar

# Expose the port the application runs on
EXPOSE 9091

# Command to run the application
ENTRYPOINT ["java", "-jar", "One-One-Mapping-0.0.1-SNAPSHOT.jar"]
