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
    
    