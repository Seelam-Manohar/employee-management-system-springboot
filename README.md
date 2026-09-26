# Employee Management System (EMS)

A backend REST API built with Spring Boot for managing employee records — built as a hands-on portfolio project to practice Java, Spring Boot, and REST API development.

## 🚀 Features

- Create, read, update, and delete (CRUD) employee records
- Fetch employees by department
- Input validation for employee data
- Centralized exception handling for clean error responses
- Layered architecture (Controller → Service → Repository)

## 🛠️ Tech Stack

- **Language:** Java 25
- **Framework:** Spring Boot 4.0.7
- **Data Access:** Spring Data JPA
- **Validation:** Spring Boot Starter Validation
- **Database:** MySQL
- **Build Tool:** Maven

## 📁 Project Structure

```
src/main/java/com/manohar/ems/
├── controller/         # REST API endpoints
│   └── EmployeeController.java
├── entity/             # JPA entities
│   └── Employee.java
├── exception/          # Custom exceptions & global exception handler
│   ├── EmployeeNotFoundException.java
│   └── GlobalExceptionHandler.java
├── repository/         # Spring Data JPA repositories
│   └── EmployeeRepository.java
├── service/            # Business logic
│   └── EmployeeService.java
└── EmployeeManagementSystemApplication.java
```

## 📡 API Endpoints

| Method | Endpoint                              | Description                     |
|--------|----------------------------------------|----------------------------------|
| POST   | `/employees`                          | Add a new employee              |
| GET    | `/employees`                          | Get all employees               |
| GET    | `/employees/{id}`                     | Get employee by ID              |
| GET    | `/employees/department/{department}`  | Get employees by department     |
| PUT    | `/employees/{id}`                     | Update an existing employee     |
| DELETE | `/employees/{id}`                     | Delete an employee              |

## ⚙️ Getting Started

### Prerequisites
- Java 25
- Maven
- MySQL running locally

### Setup

1. Clone the repository:
```bash
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system
```

2. Configure your database connection in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the project:
```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`.

## 📌 Status

🚧 Actively under development — currently at the Spring Boot / REST API stage. Frontend (React) integration planned next.