
## Monorepo Microservice Transition

This branch (`monorepo-microservice`) marks the physical transition from a single-module monolith to a multi-module structure. 

### Key Technical Changes:
*   **Modularization**: The core logic has been split into independent Gradle modules under the `modules/` directory:
    *   `modules/demo1`: Contains the first functional unit.
    *   `modules/demo2`: Contains the second functional unit.
*   **Independent Apps**: Each module now has its own Spring Boot Entry Point (`Demo1Application` and `Demo2Application`), allowing them to be run as completely separate processes.
*   **Artifact Generation**: The build is configured to generate two independent JAR files simultaneously using `./gradlew bootJar`.
*   **Isolated Configuration**: Each module has its own `application.yaml` with unique server ports (`8081` and `8082`), demonstrating runtime independence while sharing a single parent repository for shared dependencies.