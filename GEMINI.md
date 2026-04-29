# GEMINI.md - CURA Healthcare Service Test Suite

## Project Overview
This project is an automated testing suite for the [CURA Healthcare Service](https://katalon-demo-cura.herokuapp.com/) demo website. It is implemented in **Java** using **Selenium WebDriver** and **TestNG**, following the **Page Object Model (POM)** design pattern.

### Key Technologies
- **Language:** Java 17
- **Automation Tool:** Selenium WebDriver (v4.43.0)
- **Test Framework:** TestNG (v7.12.0)
- **Build Tool:** Maven
- **Logging:** Log4j2 (v2.25.4)

## Project Structure
- `src/main/java/base/BaseTest.java`: The base class for all tests, handling WebDriver initialization (`ChromeDriver`) and browser teardown.
- `src/main/java/pages/`: Contains Page Object classes representing different pages of the application (e.g., `LoginPage`, `HomePage`, `AppointmentPage`).
- `src/main/java/utils/`:
    - `Config.java`: Contains configuration constants like `BASE_URL`, credentials, etc.
    - `Helper.java`: Contains custom verification methods using TestNG `SoftAssert`.
    - `Log.java`: Wrapper for Log4j2 logging.
- `src/test/java/tests/`: Contains the actual test cases (e.g., `HomeTests.java`, `DropDownTests.java`).
- `testng.xml`: Defines the test suites and classes to be executed.

## Building and Running

### Build Project
```bash
mvn clean install
```

### Run Tests
To run all tests via Maven:
```bash
mvn test
```
To run a specific test suite using `testng.xml`:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Development Conventions

### Page Object Model (POM)
- Each page in the application should have a corresponding class in the `pages` package.
- Locators should be private and defined using `By`.
- Interaction methods should be public and use the defined locators.

### Test Implementation
- All test classes must extend `BaseTest` to leverage the setup and teardown logic.
- Use `@Test` annotation for test methods.
- Verification logic is handled by `utils.Helper` using `if-else` and `System.out.println` to log PASS/FAIL status to the console.

### Configuration
- Store any reusable constants (URLs, credentials, timeouts) in `utils.Config`.

### Logging
- Use `utils.Log` for consistency in logging across the framework.
