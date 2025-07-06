FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon

CMD ["java", "-jar", "build/libs/alert-service-0.1-all.jar"]
