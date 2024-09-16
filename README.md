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
/cataas
```
This endpoint is the base endpoint.

```
/cataas/dogwater
```
This endpoint returns a picture of a dog drinking water.

```
/cataas/cats
```
This endpoint returns a random cat photo from CATAAS. You may choose to add a `text` param to your request to overlay your desired text onto the photo. For example
```
/cataas/cats?text=example
```
