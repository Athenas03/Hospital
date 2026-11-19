# 🏥 Hospital Patient Management System

A Java Spring Boot REST API developed for an Advanced Java final project. This application manages hospital patient information, hospital room assignments, and dietitian records. It provides REST endpoints for creating, retrieving, updating, and deleting records, as well as retrieving combined patient information.

## 📺 Project Demo

Watch the API demonstration using Postman:

[▶️ Watch the Hospital Management System Demo on YouTube](https://youtu.be/F8-UnBMQWIU)

## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot 3.2**
- **Spring Web** – REST API development
- **Spring Data JPA** – Database persistence and repository operations
- **H2 Database** – In-memory database
- **Gradle** – Build and dependency management
- **Lombok** – Reducing boilerplate code
- **Postman** – API testing
- **JUnit & Mockito** – Unit testing

## ✨ Features

### Patient Management
- Create new patient records
- Retrieve all patient records
- Retrieve a patient by ID
- Delete patient records
- Validate required patient information

Patient records include:
- First, middle, and last name
- Age
- Height and weight
- Birthday
- Symptoms
- Diagnosis
- SSN

### Hospital Room Management
- Add hospital room assignments
- Retrieve all hospital rooms
- Retrieve a room assignment by ID
- Delete hospital room assignments
- Assign room types

Supported room types:
- SINGLE
- DOUBLE
- MULTIPLE
- WARD
- ICU
- EMERGENCY

### Dietitian Information Management
- Add dietitian-related patient information
- Retrieve all dietitian records
- Retrieve dietitian information by ID
- Update dietitian information
- Delete dietitian records

Dietitian information includes:
- Patient ID
- Current weight
- Weight change
- Wound location
- Tube feeding information
- Doctor

### Combined Patient Information
The API also includes an endpoint that retrieves a patient's information from multiple areas of the system, including:

- Patient vitals
- Hospital room information
- Dietitian information

This information is returned together in a single API response.

## 📡 API Endpoints

### Patient Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/getAllPatientsVitals` | Retrieve all patients |
| GET | `/getPatientByPatientId?id={id}` | Retrieve a patient by ID |
| POST | `/addNewPatient` | Create a patient |
| DELETE | `/deletePatient?id={id}` | Delete a patient |

### Hospital Room Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/getAllHospitalRooms` | Retrieve all hospital rooms |
| GET | `/GetHospitalRoomById?patientID={id}` | Retrieve a room record |
| POST | `/addHospitalRoom` | Add a hospital room assignment |
| DELETE | `/deleteHospitalRoom?roomNumber={number}` | Delete a room assignment |

### Dietitian Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/getAllDietitians` | Retrieve all dietitian records |
| GET | `/getDietitiansById?patientID={id}` | Retrieve dietitian information |
| POST | `/addDietitian` | Create dietitian information |
| PATCH | `/updateDietitianInfo?id={id}` | Update dietitian information |
| DELETE | `/deleteDietitianInfo?id={id}` | Delete dietitian information |

### Combined Information Endpoint

| Method | Endpoint | Description |
|---|---|---|
| GET | `/getAllPatientInfo?id={id}` | Retrieve combined patient information |

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- IntelliJ IDEA or another Java IDE
- Postman (for testing API endpoints)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
   ```

2. Navigate into the project directory:

   ```bash
   cd databaseFinal/DatabaseFinal
   ```

3. Run the application using Gradle:

   **Windows:**
   ```bash
   gradlew.bat bootRun
   ```

   **Mac/Linux:**
   ```bash
   ./gradlew bootRun
   ```

4. The Spring Boot application will start locally at:

   ```text
   http://localhost:8080
   ```

## 🧪 Testing

The API was tested using Postman by sending HTTP requests to the various endpoints.

Testing included operations such as:

- Creating patient records
- Retrieving patient information
- Adding hospital room assignments
- Managing dietitian information
- Updating records
- Deleting records
- Retrieving combined patient information

The project also includes Java tests using JUnit and Mockito.

## 🗄️ Database

This project uses an H2 in-memory database.

Database configuration is located in:

```text
src/main/resources/application.properties
```

The database is configured to run in memory, meaning data is temporary and is reset when the application restarts.

## 📂 Project Structure

```text
DatabaseFinal/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/advancedJava/DatabaseFinal/
│   │   │       ├── controller/
│   │   │       ├── entities/
│   │   │       ├── repository/
│   │   │       ├── services/
│   │   │       ├── expections/
│   │   │       └── FinalProjectApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── gradle/
├── build.gradle
└── README.md
```

## 📚 What I Learned

Through this project, I gained experience with:

- Developing REST APIs using Spring Boot
- Working with HTTP methods such as GET, POST, PATCH, and DELETE
- Designing entity classes and database repositories
- Implementing service layers and controllers
- Using Spring Data JPA
- Working with an H2 database
- Validating API requests
- Handling exceptions
- Testing APIs with Postman
- Writing unit tests with JUnit and Mockito
- Connecting multiple components to create a complete backend application

---

*Developed as a final project for CIS-271 Advanced Java.*
 
