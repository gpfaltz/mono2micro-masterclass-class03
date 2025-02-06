# mono2micro-masterclass-class03
Monolithic Applcation to Micro Services Applications - Class 02/05

Main Objective: Migrate the Monolithic Travel App to Micro Services Travel Order, Flight and Hotel Apps using Postgresql.

Pre requistes:
JAVA 21 Installed
Docker  Installed

Quarkus Extensions Used on Project:
RestEasy Reactive - quarkus-resteasy
RestEasy Reactive JSON-B - quarkus-resteasy-jsonb
Hibernate ORM - quarkus-hibernate-orm3
Hibernate ORM with Panache - quarkus-hibernate-orm-panache
JDBC Driver - PostgreSQL - quarkus-jdbc-postgresql
Lombok - 1.18.36 - org.projectlombok
RestEasy Reactive Client - quarkus-resteasy-client
RestEasy Reactive Client JSON-B - quarkus-resteasy-client-jsonb

#################Testing Monolithic Application ###################

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

Check Docker Containers:
docker ps

Checking Quarkus User Interface:
http://localhost:8080/q/dev-ui/dev-services

Create Travel Order:
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"GIG\", \"nights\": \"5\"}" -H "Content-Type: application/json" http://localhost:8080/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"SDU\", \"nights\": \"10\"}" -H "Content-Type: application/json" http://localhost:8080/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"CWB\", \"nights\": \"15\"}" -H "Content-Type: application/json" http://localhost:8080/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"FLN\", \"nights\": \"20\"}" -H "Content-Type: application/json" http://localhost:8080/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"POA\", \"nights\": \"25\"}" -H "Content-Type: application/json" http://localhost:8080/travelorder

List Travel Order:
curl localhost:8080/travelorder

List Flights:
curl localhost:8080/flight

List Hotels
curl localhost:8080/hotel

Find Travel Order:
curl localhost:8080/travelorder/findById?id=1

Find Hotel
curl localhost:8080/hotel/findById?id=1
curl localhost:8080/hotel/findByTravelOrderId?travelOrderId=1

Find Flight
curl localhost:8080/hotel/findById?id=1
curl localhost:8080/flight/findByTravelOrderId?travelOrderId=1


#################Testing Micro Flight Application ###################

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

List Flights:
curl localhost:8081/flight

Find Flight
curl localhost:8081/flight/findById?id=1
curl localhost:8081/flight/findByTravelOrderId?travelOrderId=1

#################Testing Micro Hotel Application ###################

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

List Flights:
curl localhost:8082/Hotel

Find Flight
curl localhost:8082/hotel/findById?id=1
curl localhost:8082/hotel/findByTravelOrderId?travelOrderId=1

#################Testing Micro TravelOrder Application ###################

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

List Travel Orders:
curl localhost:8083/travelorder

Create Travel Order:
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"GIG\", \"nights\": \"5\"}" -H "Content-Type: application/json" http://localhost:8083/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"SDU\", \"nights\": \"10\"}" -H "Content-Type: application/json" http://localhost:8083/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"CWB\", \"nights\": \"15\"}" -H "Content-Type: application/json" http://localhost:8083/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"FLN\", \"nights\": \"20\"}" -H "Content-Type: application/json" http://localhost:8083/travelorder
curl -d "{\"sourceAirport\": \"GRU\", \"destinyAirport\": \"POA\", \"nights\": \"25\"}" -H "Content-Type: application/json" http://localhost:8083/travelorder

Find Travel Order:
curl localhost:8083/travelorder/findById?id=1