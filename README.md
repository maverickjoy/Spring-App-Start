# Spring-App-Start
Prerequisites:
-------------
- JVM

    Check for Java environment if installed or not
    ```
    java -version
    ```
    
    If not install JDK version 1.8.x from `https://www.oracle.com/java/technologies/javase-downloads.html`


- Maven
    ```
    brew install maven
    mvn --version
    ```
  
- Spring 

    Open website:
    ```
     https://start.spring.io/
    ```
    Group Name: `com.demo.project`
    
    Artifact: `SpringDemoApp`
    
    Desc: `Demo project for Spring Boot`
    
    Dependencies:
    
      - Web: Spring Web
      - Lombok
      - JPA
      - HSQL
      
- Debug:

    - If intellij is unable to understand the maven package go to terminal
    and run command `mvn clean install` in the package
    
    - Open intellij package SpringDemoApp.
    
- Requests:
    - ```
        curl --location --request GET 'http://localhost:1337/health-check'
      ```
    - ```
        curl --location --request GET 'http://localhost:1337/api/sample/getServiceName'
      ```
    - ```
        curl --location --request GET 'http://localhost:1337/api/sample/getNameById?id=1'
      ```
    - ``` 
      curl --location --request POST 'http://localhost:1337/api/sample/saveUser' \
       --header 'Content-Type: application/json' \
       --data-raw '{
           "id" : 2,
           "name" : "hello world",
           "email": "helloworld@gmail.com"
       }'
      ```
    - ```
      curl --location --request GET 'http://localhost:1337/api/sample/getEmailById?id=1'
      ```
    - 
    
- JUNIT
  - Can use junit 5 for writing unit tests
  - Can use very useful plugin Square Test
  
- Postman Collection
  - Import the following JSON
  
```JSON
{
	"info": {
		"_postman_id": "0e2df0a8-73c2-4b39-836a-01a0fc1412ae",
		"name": "Sample App",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "Actuator Health Check",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:1337/actuator/health",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "1337",
					"path": [
						"actuator",
						"health"
					]
				}
			},
			"response": []
		},
		{
			"name": "GetNameById",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:1337/api/sample/getNameById?id=1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "1337",
					"path": [
						"api",
						"sample",
						"getNameById"
					],
					"query": [
						{
							"key": "id",
							"value": "1"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "SaveUser",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"id\" : 2,\n    \"name\" : \"hello world\",\n    \"email\": \"helloworld@gmail.com\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:1337/api/sample/saveUser",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "1337",
					"path": [
						"api",
						"sample",
						"saveUser"
					]
				}
			},
			"response": []
		},
		{
			"name": "GetEmailById",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:1337/api/sample/getEmailById?id=1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "1337",
					"path": [
						"api",
						"sample",
						"getEmailById"
					],
					"query": [
						{
							"key": "id",
							"value": "1"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "DummyDelete",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"id\" : 2,\n    \"name\" : \"hello world\",\n    \"email\": \"helloworld@gmail.com\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:1337/api/sample/dummyDelete/vikram",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "1337",
					"path": [
						"api",
						"sample",
						"dummyDelete",
						"vikram"
					]
				}
			},
			"response": []
		}
	]
}

```