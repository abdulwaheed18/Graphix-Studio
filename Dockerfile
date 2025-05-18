FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file from your project's build output (e.g., target/ for Maven)
# into the container. The wildcard assumes there's one primary JAR.
# It's renamed to app.jar for consistency within the container.
# Adjust 'target/*.jar' if your JAR is named differently or located elsewhere after building.
COPY target/*.jar app.jar

# Make port 8080 available to the world outside this container
# This is the default port for Spring Boot applications.
EXPOSE 8080

# Define the command to run your application.
# This executes the Spring Boot application from the copied JAR.
ENTRYPOINT ["java", "-jar", "app.jar"]