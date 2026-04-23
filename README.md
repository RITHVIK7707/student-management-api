# Student Management REST API

A simple backend REST API built with **Spring Boot**, **Spring MVC**, **Spring Data JPA**, and **MySQL**.

---

## Project Structure

```
student-management/
├── src/main/java/com/rithvik/studentapi/
│   ├── StudentManagementApplication.java   ← Entry point
│   ├── controller/
│   │   └── StudentController.java          ← REST endpoints
│   ├── service/
│   │   └── StudentService.java             ← Business logic
│   ├── repository/
│   │   └── StudentRepository.java          ← Database access (JPA)
│   └── model/
│       └── Student.java                    ← Entity / data model
├── src/main/resources/
│   └── application.properties             ← DB config
└── pom.xml                                ← Maven dependencies
```

---

## Setup Instructions

### 1. Prerequisites
- Java 17+
- Maven
- MySQL running locally

### 2. Configure Database
Open `src/main/resources/application.properties` and update:
```
spring.datasource.username=root
spring.datasource.password=your_password_here
```
The database `student_db` will be created automatically.

### 3. Run the App
```bash
mvn spring-boot:run
```
Server starts at: `http://localhost:8080`

---

## API Endpoints

| Method | Endpoint                          | Description              |
|--------|-----------------------------------|--------------------------|
| GET    | /api/students                     | Get all students         |
| GET    | /api/students/{id}                | Get student by ID        |
| GET    | /api/students/department/{dept}   | Get students by dept     |
| POST   | /api/students                     | Create a new student     |
| PUT    | /api/students/{id}                | Update a student         |
| DELETE | /api/students/{id}                | Delete a student         |

---

## Sample Request — Create Student

**POST** `http://localhost:8080/api/students`

```json
{
  "name": "Rithvik M",
  "email": "rithvik@example.com",
  "department": "Computer Science",
  "year": 4
}
```

**Response (201 Created):**
```json
{
  "id": 1,
  "name": "Rithvik M",
  "email": "rithvik@example.com",
  "department": "Computer Science",
  "year": 4
}
```

---

## Tech Stack
- Java 17
- Spring Boot 3.2
- Spring MVC (REST Controllers)
- Spring Data JPA (Hibernate)
- MySQL
- Maven
