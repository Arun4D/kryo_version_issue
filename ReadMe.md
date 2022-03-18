# Read Me First

# Getting Started

This sample project to setup Redis cache with spring boot + java.

## Requirement
* Java 11
* Spring boot 2.6.4
* Lombok
* Redis latest version (local / Docker)

## Curl

APIs cache the H2 database entity values

````
curl -X GET  http://localhost:8080/rest/api/sample/all

curl -X GET  http://localhost:8080/rest/api/sample/2

curl -X POST  http://localhost:8080/rest/api/sample/ -d '{"startDate":"2022-03-17"}' -H "Content-Type: application/json"

curl -X DELETE  http://localhost:8080/rest/api/sample/3 -H "Content-Type: application/json"

````

## Redis-cli Command

Run redis-cli
````
docker exec -it redis redis-cli
````
Flush all date in redis.
````
FLUSHDB
````

List of all keys

````
KEYS *
````
Get value for key

````
MGET "sample::3"

//for list
MGET "sampleList::SimpleKey []" 
````

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.4/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

