# Student Microservice

Simple Spring Boot Microservice app for managing student data with MongoDB. Basic CRUD operations via REST API.

## What it does

- Add students
- Get all students or find by ID  
- Update student info
- Delete students

## Tech stack

- Java 17+
- Spring Boot
- MongoDB
- Maven

## Setup

You'll need Java 17+, Maven, and MongoDB running.

Clone and run:

```bash
git clone https://github.com/lahat-m/Student_Microservice.git
cd Student_Microservice
```

Make sure MongoDB is running (local or cloud), then:

```bash
mvn spring-boot:run
```

App runs on http://localhost:8080

## API endpoints

- **GET /students** - get all students
- **GET /students/{id}** - get one student  
- **POST /students** - create new student
- **PUT /students/{id}** - update student
- **DELETE /students/{id}** - remove student

## Example request body

```json
{
  "name": "Adok",
  "email": "adok@example.com",
  "age": 23
}
```

## License

MIT License