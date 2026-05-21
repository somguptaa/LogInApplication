# LoginApplication

A secure and scalable Login REST API built using Java Spring Boot. This application provides authentication and user management functionalities with RESTful APIs.

---

## 🚀 Features

* User Registration
* User Login Authentication
* Password Encryption using BCrypt
* RESTful API Architecture
* Spring Boot Backend
* MySQL Database Integration
* Exception Handling
* Validation Support
* Email Verification
* JWT Authentication
* Role-Based Access Control
* OAuth2 Integration

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* REST APIs

---

## 📂 Project Structure

```bash
src/
 ├── main/
 │   ├── java/com/som/loginApp/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   ├── model/
 │   │   ├── security/
 │   │   └── LoginApplication.java
 │   └── resources/
 │       ├── application.properties
 │       └── static/
 └── test/
```

---


### 3️⃣ Configure Database

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/login_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🔑 API Endpoints

### Register User

```http
POST /api/auth/register
```

Request Body:

```json
{
  "username": "john",
  "email": "john@example.com",
  "password": "password123"
}
```

---

### Login User

```http
POST /api/auth/login
```

Request Body:

```json
{
  "email": "john@example.com",
  "password": "password123"
}
```

---

## 🔒 Security

* Passwords encrypted using BCrypt
* Spring Security integration
* JWT Token Authentication

---

## 📌 Future Improvements

* Refresh Token Support
* Forgot Password Functionality
* Docker Deployment

---

## 👨‍💻 Author

**Your Name**

* GitHub: https://github.com/somguptaa
* LinkedIn: https://linkedin.com/in/somguptaa

---

## 📄 License

This project is licensed under the MIT License.
