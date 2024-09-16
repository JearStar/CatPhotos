# Cat Photos
This is a simple project to learn the basics of RESTful APIs using Java, Spring Boot, and JPA. This microservice calls the [CATAAS](https://cataas.com/) API to to retrieve cat photos.

## Prerequisites
This project uses [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), and dependencies are build with [Maven](https://maven.apache.org/). Please ensure you have both.

## Getting Started
To get started, clone the repository. To install the dependencies, you need to run 
```
mvn clean install
```
After the dependencies are installed, please run the `ApiApplication` class to start the microservice. You may choose to set the port you want to run the service on in the `application.properties` by changing the server port
```
server.port=8080
```
## How to Use
The part of the application concerned with cats and cat photos has the following endpoints
```
GET /cataas
```
This endpoint is the base endpoint.

```
GET /cataas/dogwater
```
This endpoint returns a picture of a dog drinking water.

```
GET /cataas/cats
```
This endpoint returns a random cat photo from CATAAS. You may choose to add a `text` param to your request to overlay your desired text onto the photo. For example
```
GET /cataas/cats?text=example
```

### Topics and Course
The other part of this microservice is concerned with courses and topics. This part of the project demonstrates how to use JPA to support CRUD functionalities with the `Course` and `Topic` objects. You may try the following endpoints to interact with these objects
```
GET /topics
```
Retrives all topics.
```
GET /topics/{id}
```
Gets a topic with the given ID.

```
POST /topics
```
Adds a topic with given body.

```
PUT /topics/{id}
```
Updates a topic with the given ID.

```
DELETE /topics/{id}
```
Deletes a topic with the given ID.

Courses also supports a similar list of APIs.
