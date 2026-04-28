# CURA Healthcare Service Automated Testing

This repository contains an automated testing suite for the [CURA Healthcare Service](https://katalon-demo-cura.herokuapp.com/) demo website. The project is built using **Java**, **Selenium WebDriver**, and follows the **Page Object Model (POM)** design pattern for better maintainability and scalability.

## 🛠️ Tech Stack

- **Language:** Java 17
- **Automation Tool:** Selenium WebDriver (v4.43.0)
- **Framework:** TestNG (v7.12.0)
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)

## ⚙️ Prerequisites

- **Java Development Kit (JDK) 17** or higher.
- **Apache Maven** installed.
- **Google Chrome** browser installed (the project uses `ChromeDriver`).

## 🏃 How to Run

### 1. Clone the repository
```bash
git clone https://github.com/your-username/CURAHealthcareServiceTest.git
cd CURAHealthcareServiceTest
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Run Tests
You can run the tests directly from your IDE by executing `src/test/java/main/TestRunner.java` or via command line:
```bash
mvn exec:java -Dexec.mainClass="main.TestRunner"
```

---
*Created for automated testing demonstration purposes.*
