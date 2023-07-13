# Backend-Authentication


![1](https://i.pinimg.com/originals/90/4f/84/904f84e9e2147a6a0f5c839637934f00.jpg)



## REST A.P.I

A backend project focused on implementing user authentication and authorization using the Spring Boot framework. It provides a REST API for user login and signup functionality, with security features and web tokens (JWT) for authentication.


The application also includes user and admin validation and authentication.

## Features

- User signup: Users can create new accounts by providing their details such as name, email, and password. The user information is securely stored in the H2 database.
- User login: Users can authenticate themselves by providing their credentials (email and password) through the login endpoint. Upon successful authentication, a web token is generated and returned.
- JWT-based authentication: The application uses JSON Web Tokens (JWT) to authenticate and authorize users. The generated token is required to access protected resources, ensuring that only authenticated users can access them.


## Tech Stack

- JAVA
- SPRING
- SPRINGBOOT
- MAVEN
- H2 Database
- POSTMAN

## Dependencies

- SPRING DATA JPA
- SPRING BOOT DEVTOOLS
- SPRING WEB
- HIBERNATE
- MYSQL DRIVER
- VALIDATION
- LOMBOK
- SWAGGER UI
- JWT API
- JWT IMPL
- JWT JACKSON

## Setting & Installation 

Install the Spring Tools Suite 
```bash
https://spring.io/tools
```

Install MySQL Community Server

```bash
https://dev.mysql.com/downloads/mysql/
```

Clone the Repository

```bash
git clone https://github.com/Im-vishalanand/Backend-Authentication.git
```

## Run Locally


Go to the Project Directory

```bas
Open the Backend_for_login_signup Folder with S.T.S
```

Go to **src/main/resources > application.properties** & change your username and password (MySQL server username & password)
(By default, Spring Boot configures the application to connect to an in-memory store with the username "sa" and an empty password)

```bash
spring.datasource.username="root"
spring.datasource.password="root"
```

To change the **Server Port**

```bash
server.port=8082
```

Go to **com.backend package > BackendForLoginSignupApplication.java**

```bash
Run as Spring Boot App or Alt+Shift+X, B
```

## URL
```bash
http://localhost:8082
```

Open Postman and navigate to the following URLs:

1. Home:

   **Method**: `GET`
   ```bash
   http://localhost:8082/user
   ```

2. User Signup:

   ```bash
   http://localhost:8082/user/signup
   ```
   **Method**: `POST` </br>
   
   **Request Body**:
   ```json
   {
    "firstName": "firstName",
    "lastName": "lastName",
    "email": "email@mail.com",
    "password": "password"
   }
   ```

3. Admin Signup:

   ```bash
   http://localhost:8082/user/signup/
   ```
   Pass the secret key as Request Param with the actual secret key value.

   **Method**: `POST` </br>
   **Request Body**:
   ```json
   {
    "firstName": "firstName",
    "lastName": "lastName",
    "email": "email@mail.com",
    "password": "password"
   }
   ```

4. User Login:
   
   ```bash
   http://localhost:8082/user/userLogin
   ```
   **Method**: `GET` </br>
   **Request Body**:
   ```json
   {
    "email": "email@mail.com",
    "password": "password"
   }
   ```

5. Admin Login:
   
   ```bash
   http://localhost:8082/user/adminLogin
   ```
   **Method**: `GET` </br>
   **Request Body**:
   ```json
   {
    "email": "email@mail.com",
    "password": "password"
   }
   ```
