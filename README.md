# Study Project with Clean Architecture and Spring Boot

This is a study project that implements an application using Clean Architecture in Java, with the Spring Boot framework and managed with Maven.

## Overview

The objective of this project is to provide a basic structure for developing an application using clean architecture principles. Clean architecture is an approach that promotes the separation of concerns into layers, making code more organized, testable and scalable.

## Technologies Used

- Java 17
- Spring Boot
- Maven

## Project Structure

The project follows the typical clean architecture structure, which consists of the following layers:

1. **Entities**: Contains the classes that represent the main objects of the application.
2. **Use Cases**: Defines the application's use cases, containing the services that perform the business logic.
3. **Adaptors (Controllers, Repositories, etc.)**: Responsible for handling HTTP requests, mapping endpoints and calling appropriate use cases.


## Running the Project

To run the project, follow the steps below:

1. Make sure you have Java and Maven installed on your machine.
2. Clone this repository:

```bash
git clone https://github.com/gabrielprog/clean-arch-spring-boot.git
cd clean-arch-spring-boot
mvn spring-boot:run
```
The application will be available at http://localhost:8080/loan only post request.

## Contributing
This project is intended for study purposes only, but you are welcome to explore and learn from it. If you want to contribute or make improvements, feel free to submit a pull request.

## License
This project is distributed under the [MIT](LICENSE) License.



