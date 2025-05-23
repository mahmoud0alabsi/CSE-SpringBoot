# CodeSpace Editor - SpringBoot API

###

<div align="center">
  <img src="https://github.com/mahmoud0alabsi/mahmoud0alabsi/blob/main/assets/logo/codespace.png?raw=true"  />
</div>

###

CodeSpace Editor is a collaborative code editing platform built with Spring Boot. It enables multiple users to work on projects, manage branches, create commits, and edit files concurrently, with robust authentication and concurrency control.

###

🎥 [Watch the CodeSpace Editor Tour](https://youtu.be/xTDq5a8hy6A)

###

## Features

- **Project Management**: Create and manage coding projects with role-based access.
- **Branching and Forking**: Fork branches and merge changes with conflict detection.
- **Commit System**: Create commits with multiple file changes, linked to branches.
- **File Editing**: Real-time file creation, updating, and reading with version control.
- **Concurrency Control**: Thread-safe operations using locks for branches, commits, and files.
- **Authentication**: JWT-based user authentication for secure access.
- **Database Integration**: MySQL for persistent storage of projects, branches, commits, and files.

## Tech Stack

- **Backend**: Spring Boot, Spring Security, Spring Data JPA
- **Database**: MySQL
- **Concurrency**: Java `ExecutorService`, `ReentrantLock`, `ReentrantReadWriteLock`
- **Authentication**: JWT
- **Build Tool**: Maven

## Prerequisites

- Java 17+
- Maven 3.8+
- MySQL 8.0+
- Git

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/CSE-SpringBoot.git
cd CSE-SpringBoot
```

### 2. Configure the Database

- Create a MySQL database:

  ```sql
  CREATE DATABASE code_space;
  ```
- Update `src/main/resources/application.properties` with your database credentials:

  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/code_space
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.properties.hibernate.connection.isolation=2
  spring.datasource.hikari.connectionTimeout=30000
  spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
  file.storage.root-dir=/path/to/uploads
  jwt.secret=your-jwt-secret
  ```

### 3. Build and Run

```bash
mvn clean install
mvn spring-boot:run
```

- The app will start on `http://localhost:8080`.

### 4. Access the API

- Use tools like Postman or curl to interact with the API.
- Authenticate with a JWT token by sending a POST request to `/auth/login` (adjust based on your auth endpoint).
- Example endpoints:
  - `POST /api/v1/projects`: Create a project.
  - `GET /api/v1/projects/{id}`: Read project.

## Database Schema

The app uses the following main tables:

- `users`: Stores user credentials and roles.
- `projects`: Stores project metadata.
- `branches`: Stores branch details, linked to projects.
- `commits`: Stores commit history, linked to branches.
- `files`: Stores file metadata and paths, linked to commits.

Run the following to inspect the schema:

```sql
DESCRIBE projects;
DESCRIBE branches;
DESCRIBE commits;
DESCRIBE files;
DESCRIBE users;
```

## Concurrency Features

- **Locks**: Uses `ConcurrencyService` for thread-safe operations:
  - Branch-level locks for forking and commits.
  - Commit-level locks for file creation.
  - File-level read/write locks for editing and storage.
- **Thread Safety**: Ensures safe concurrent access to shared resources.

## Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/your-feature`).
3. Commit changes (`git commit -m "Add your feature"`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

## Contact

For issues or questions, open a GitHub issue or contact mailto:malabsi034@gmail.com.