
# 📌 Social Bot Demo

A simple Spring Boot project demonstrating basic login/logout APIs and CRUD operations with a MySQL database.

---

## 🚀 Features

* ✔ **POST /login** → Returns “Login successful”
* ✔ **POST /logout** → Returns “Logout successful”
* ✔ **POST /users** → Create a new user
* ✔ **GET /users** → Fetch all users
* ✔ **MySQL Integration** with Spring Data JPA
* ✔ **REST APIs** built using Spring Boot


---

## 📂 Project Structure

```
social-bot-demo/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── com.example.socialbot/
 │   │   │        ├── controller/
 │   │   │        ├── model/
 │   │   │        ├── repository/
 │   │   │        └── SocialBotApplication.java
 │   │   └── resources/
 │   │       ├── application.properties
 │   │       └── static/
 │   └── test/
 ├── pom.xml
 └── README.md
```

---

## 🛠️ Tech Stack

| Technology          | Purpose                        |
| ------------------- | ------------------------------ |
| **Java 21**         | Backend language               |
| **Spring Boot 3**   | REST APIs & application config |
| **Spring Data JPA** | ORM & DB operations            |
| **MySQL**           | Database                       |
| **Maven**           | Project build tool             |

---

## ⚙️ Setup Instructions

### **1. Clone the repository**

```bash
git clone https://github.com/aartimultiservices23/social-bot-demo.git
```

---

### **2. Configure MySQL database**

Create a database:

```sql
CREATE DATABASE social_bot_db;
```

---

### **3. Update database configuration**

In `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/social_bot_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### **4. Run the project**

Using Maven:

```bash
mvn spring-boot:run
```

Or run `SocialBotApplication.java` from your IDE.

---

## 📡 API Endpoints

### 🔐 Authentication APIs

| Method | Endpoint  | Description                 |
| ------ | --------- | --------------------------- |
| POST   | `/login`  | Returns “Login successful”  |
| POST   | `/logout` | Returns “Logout successful” |

---

### 👤 User APIs

| Method | Endpoint | Description       |
| ------ | -------- | ----------------- |
| POST   | `/users` | Create a new user |
| GET    | `/users` | Fetch all users   |

---

## 📘 Example Request

### Create User

```http
POST /users
Content-Type: application/json

{
  "name": "Shantanu",
  "email": "shantanu@example.com"
}
```

---

## 🗃️ Database Table (User)

| Column  | Type                    | Description  |
| ------- | ----------------------- | ------------ |
| `id`    | BIGINT (AUTO_INCREMENT) | Primary Key  |
| `name`  | VARCHAR                 | User's name  |
| `email` | VARCHAR (unique)        | User's email |

---

