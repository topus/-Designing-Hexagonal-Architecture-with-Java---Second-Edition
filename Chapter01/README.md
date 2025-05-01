## Chapter 01 - Java Project

## Overview
This is a Java project to learn how to design a Hexagonal Architecture built with Maven, configured to use Java 24.

## Prerequisites
- Java Development Kit (JDK) 24 or later
- Apache Maven 3.9+ 

## Project Structure
```
chapter01/ 
├── src/ 
│ ├── main/ 
│ │ └── java/ 
│ │   └── dev/ 
│ │     └── davivieira/ 
│ │       └── App.java 
├── pom.xml 
└── README.md
```

## Build
To build the project, run:
`mvn clean package`

## Run
You can run the application in several ways:

1. Using Maven exec plugin:
`mvn exec:java`
 
2. Using the generated JAR file:
```bash
java -jar target/chapter01-1.0-SNAPSHOT.jar
```
## Build Configuration
The project uses the following Maven plugins:
- `maven-compiler-plugin` (v3.14.0) - For compiling Java sources
- `maven-jar-plugin` (v3.3.0) - For creating the JAR file
- `exec-maven-plugin` (v3.2.0) - For running the application

## Development
The project is configured with:
- Java 24
- UTF-8 encoding
- Main class: `dev.davivieira.App`

## Book Reference
This code is part of the book:
**Designing Hexagonal Architecture with Java - Second Edition**
- Author: Davi Vieira
- Release Date: September 2023
- Publisher: Packt Publishing
- ISBN: 9781837635115

The book provides comprehensive coverage of building maintainable and long-lasting applications with Java and Quarkus using Hexagonal Architecture principles. For more information about the book and its complete codebase, visit the [official repository](https://www.packtpub.com/product/designing-hexagonal-architecture-with-java-second-edition/9781837635115).


## License

Distributed under the Unlicense License. See [LICENSE.txt](LICENSE.txt) for more information.
