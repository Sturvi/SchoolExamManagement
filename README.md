# School Exam Management System

## Description
This project is an exam management system designed for high schools. It offers a RESTful API that allows for CRUD (Create, Read, Update, Delete) operations on entities such as courses, students, and exams.

## Features
- Course registration
- Student registration
- Exam registration

## Technologies Used
- Java
- Spring Boot
- PostgreSQL
- Maven

## API Endpoints

### Courses
- `GET /api/courses`: Fetch all courses
- `GET /api/courses/{id}`: Fetch a single course by ID
- `POST /api/courses`: Create a new course
- `DELETE /api/courses/{id}`: Delete a course by ID

### Students
- `GET /api/students`: Fetch all students
- `GET /api/students/{id}`: Fetch a single student by ID
- `POST /api/students`: Create a new student
- `DELETE /api/students/{id}`: Delete a student by ID

### Exams
- `GET /api/exams`: Fetch all exams
- `GET /api/exams/{id}`: Fetch a single exam by ID
- `POST /api/exams`: Create a new exam
- `DELETE /api/exams/{id}`: Delete an exam by ID

## Request Examples

Below are examples of JSON request bodies you would submit when creating new entities via the API.

### For Courses
To create a new course, you would send a POST request to `/api/courses` with the following JSON structure:
```json
{
  "courseCode": "MAT",
  "courseName": "Mathematics",
  "grade": 10,
  "teacherFirstName": "John",
  "teacherLastName": "Doe"
}
```

### For Students
To create a new student, you would send a POST request to /api/students with the following JSON structure:

```json
{
  "studentID": 12345,
  "studentFirstName": "Jane",
  "studentLastName": "Doe",
  "grade": 10
}
```

### For Exams
To create a new exam, you would send a POST request to /api/exams with the following JSON structure:

```json
{
  "courseCode": "MAT",
  "studentID": 12345,
  "examDate": "2023-01-01",
  "score": 5
}
```