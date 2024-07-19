<h1 align="center">MS User</h1>

![Badge Concluído](https://img.shields.io/static/v1?label=Status&message=In+progress&color=yellow&style=for-the-badge)
![Badge Java](https://img.shields.io/static/v1?label=Java&message=17&color=orange&style=for-the-badge&logo=java)
![Badge Spring](https://img.shields.io/static/v1?label=SpringBoot&message=v3.3.1&color=brightgreen&style=for-the-badge&logo=SpringBoot)
![Badge swagger](https://img.shields.io/static/v1?label=Swagger&message=2.6.0&color=green&style=for-the-badge&logo=Swagger)

## Project summary

This microservice is responsible for registering users, making charges and anythis else for the user.

## Features

## How to build
Technologies necessary for build
``
Java
``
``
Maven
``
``
Docker
``

Configure environment variables:
```` 
RABBITMQ_URL
````

First clone the repository.
 ```
    git clone https://github.com/jvictornascimento/ms-user.git
  ```

Run compose to create the postgresql database.

  ```
    docker-compose up -d
  ```
And finally to build the project.
```
mvn clean install&&mvn spring-boot:run
```

After completing the steps above, go to: <http://localhost:8081/swagger-ui.html>.

#### If you want to see the complete application with all microservices, visit: https://github.com/jvictornascimento/microservice.git

## Technologies

- `Intellij`
- `Java 17`
- `Maven`
- `Spring Boot, Spring web, Spring Data JPA, Spring email, Spring Validation, Spring amqp`
- `Docker`
- `PostgreSQL`
- `OpenAPI`

## Future updates
- [ ] Create automated tests.
- [ ] HATEOAS to help customers consume to API without the need for prior knowledge
- [ ] To set up CORS.
- [ ] update project Docker image.
- [ ] Access to resources only authenticated.
- [ ] Deploy the application to a cloud service.