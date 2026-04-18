# Modular Monolith Demo

This project is a demonstration of a modular monolith architecture in Spring Boot.

## Structure

The project is divided into two main modules: `demo1` and `demo2`. Each module has its own controller and service, and can be developed and tested independently.

- `com.example.demo1`: Contains the first module, with a "Hello 1" endpoint.
- `com.example.demo2`: Contains the second module, with a "Hello 2" endpoint.

The `index.html` file in `src/main/resources/static` provides links to both endpoints.

## Building and Running

To build and run the project, use the following command:

```
./gradlew bootRun
```

The application will be available at http://localhost:8080.
