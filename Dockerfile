FROM maven:3.6.3 AS  build

WORKDIR /app

COPY . .

RUN ./mvnw clean install

FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/chaos-monkey-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "chaos-monkey-0.0.1-SNAPSHOT.jar"]
