# Spring Boot Modular Monolith (Spring Modulith)

This branch demonstrates **Stage 3** of the architectural progression: the **Modular Monolith** enforced by the **Spring Modulith** framework.

## Project Context: Architectural Progression

1.  **Classic Monolith**: A single project where all features are mixed in `src/main/java`.
2.  **Structured Monolith**: Code is organized into internal packages (e.g., `com.example.demo1`), but nothing prevents illegal cross-package access.
3.  **Modular Monolith (This Branch)**: Uses **Spring Modulith** to enforce domain boundaries within a single Winter Boot application. It ensures that internal details of one module aren't accidentally used by another.
4.  **Monorepo Multi-Module**: Physically separating code into Gradle/Maven modules (see `monorepo-microservice` branch).

---

## Features on this Branch

### 1. Module Enforcement
We use `ApplicationModules` to verify our architecture. If `demo1` controllers were to accidentally import private classes from `demo2`, the `ModularityTests` would fail, even if the code compiles.

### 2. Spring Modulith Integration
The project includes the Spring Modulith BOM and starters in `build.gradle`:
- `spring-modulith-starter-core`: Core runtime modularity support.
- `spring-modulith-starter-test`: Testing support for modularity verification.

### 3. Structural Integrity
*   **Root**: `com.example.DemoApplication`
*   **Module 1**: `com.example.demo1`
*   **Module 2**: `com.example.demo2`

---

## Getting Started

### Verify Modularity
To ensure that all module boundaries are respected, run the modularity verification test:
```bash
./gradlew test --tests com.example.ModularityTests
```

### Building and Running
The project builds into a **single JAR file** (Stage 3 characteristic):
```bash
./gradlew bootJar
java -jar build/libs/demo1-0.0.1-SNAPSHOT.jar
```
The application will be available at `http://localhost:8080`.
