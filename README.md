# Calculator Application

A simple Java console application demonstrating Maven, JUnit testing, JaCoCo code coverage, and SonarQube integration.

## Requirements Met

- ✅ JDK Java 1.8 console app
- ✅ Maven/pom.xml configuration
- ✅ JUnit-4 unit tests
- ✅ JaCoCo test coverage (configured for 80% minimum)
- ✅ SonarQube integration
- ✅ IDE agnostic (works with Eclipse, IntelliJ, VS Code)
- ✅ Azure Pipeline build yml
- ✅ GitLab CI build yml

## Building and Running

### Prerequisites
- JDK 1.8 or higher
- Maven 3.6 or higher

### Commands

```
# Compile the application
mvn compile

# Run tests with coverage
mvn test

# Run full verification (tests + coverage check)
mvn verify

# Run SonarQube analysis
mvn sonar:sonar

# Run the application
mvn exec:java -Dexec.mainClass="com.example.calculator.Calculator"
```

## Code Coverage

JaCoCo is configured to enforce a minimum of 80% code coverage[3]. The current test suite achieves this requirement by testing all calculator methods including edge cases.

## SonarQube Integration

The project includes SonarQube configuration for static code analysis[4]. Configure your SonarQube server URL in the pom.xml or pass it as a parameter:

```
mvn sonar:sonar -Dsonar.host.url=http://your-sonarqube-server:9000
```
