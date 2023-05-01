
# Bookstore

This is a project using Spring Boot 3.0 that will start simple and, in the course of time, will
be incremented using the most variables features of spring.

The first step is make an CRUD operations for books and authors.

## Running this project

You will need, for now, just Java 17. The database used is H2 and doesn't need to be installed.
Follow those steps to run the Bookstore project

- Clone this repo 
<br/>```git clone https://github.com/arionmath/bookstore.git```

- Get inside the new dir 
<br/>`cd bookstore `

- Build the project
    - Linux
<br/> `./mvnw package -DskipTests`

    - Windows
<br/> `mvnw.cmd package -DskipTests`
	
- Execute the jar to start the application with embbebed tomcat
<br/>```java -jar target/bookstore-0.0.1-SNAPSHOT.jar```


To access H2 database from browser:
Type http://localhost:8080/h2-console url in a browser and you will see a login page.
Put jdbc:h2:mem:testdb in JDBC URL input, verify if username input is sa and password input is empty. Hit the Connect button.
Now you will see the database schema of this application :)

## Technologies used
- java
- Spring Boot
- Hibernate
- JPA
- Thymeleaf
- Bootstrap
- H2
