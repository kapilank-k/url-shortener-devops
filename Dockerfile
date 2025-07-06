# Use a small official Java image to run the app
FROM openjdk:17-jdk-slim

# Copy the .jar file from your target folder to the Docker image
COPY target/url-shortener-1.0.0.jar app.jar

# Make port 8080 available outside the container
EXPOSE 8080

# This tells Docker what to run when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
