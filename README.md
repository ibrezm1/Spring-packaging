# Spring Boot Multi-Module Monorepo Demo

This repository demonstrates the practical transition from a single-module Spring Boot application to a decentralized, multi-module "Monorepo" structure. 

## Architectural Progression

Most software products follow a path of increasing decoupling as they scale:

1.  **The Classic Monolith**: Fastest to build, but leads to "Big Ball of Mud" as the team grows.
2.  **The Structured Monolith**: Organized by layers, but lacks physical boundaries.
3.  **The Modular Monolith**: Clear domain boundaries and strict internal APIs (e.g., Spring Modulith).
4.  **The Monorepo / Multi-Module (Current Stage)**: Code is physically separated into independent Gradle modules, allowing for independent deployment (Separate JARs) while maintaining a single shared repository.
5.  **Microservices**: Fully independent codebases, databases, and deployment pipelines.

**This project is currently at Stage 4.** We have the organizational benefits of microservices (independent modules/teams) without the Day-2 operational complexity of managing 20+ git repositories.

---

## Technical Implementation: Monorepo Microservice Transition

This branch (`monorepo-microservice`) marks the physical transition to a multi-module structure. 

### Key Changes:
*   **Modularization**: The core logic is split into independent Gradle modules under `/modules`:
    *   `modules/demo1`: Focuses on functional unit 1 (Port 8081).
    *   `modules/demo2`: Focuses on functional unit 2 (Port 8082).
*   **Independent Entry Points**: Each module has its own Spring Boot Main Class (`Demo1Application` and `Demo2Application`).
*   **Build Optimization**: The root configuration manages shared dependencies (Lombok, Test Starters), while sub-modules handle independent artifact generation.
*   **Isolated Environments**: Separate `application.yaml` files allow these services to run simultaneously on the same machine without port conflicts.

## Getting Started

### Building the Project
Generate both independent JAR files simultaneously:
```bash
./gradlew bootJar
```

### Running the Services
You can run the generated JARs independently:
```bash
# Start Demo 1
java -jar modules/demo1/build/libs/demo1.jar

# Start Demo 2
java -jar modules/demo2/build/libs/demo2.jar
```

### Running Tests
Run all tests across all modules:
```bash
./gradlew test
```