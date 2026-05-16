🚆 IRCTC Hybrid Automation Framework Project
📌 Project Overview
This project is a Hybrid Automation Testing Framework developed for automating the IRCTC web application using Selenium WebDriver with Java. The framework is designed with reusable components, modular architecture, automated reporting, screenshot capturing, logging, and data-driven testing capabilities.
The project follows industry-standard automation practices using Maven, TestNG, Page Object Model (POM), and supports CI/CD integration using Jenkins.
🛠️ Technologies Used
Java
Selenium WebDriver
TestNG
Maven
Apache POI
Log4j
Extent Reports
Jenkins
Eclipse IDE
Git & GitHub
📂 Project Structure
Bash
IRCTC-Hybrid-Automation-Framework/
│
├── hybridirctc/            # Main framework folder
├── reports/                # Extent & execution reports
├── screenshots/            # Failure screenshots
├── src/                    # Source code and test scripts
│   ├── main/
│   └── test/
│
├── test-output/            # TestNG reports
├── testdata/               # Excel test data
├── logs/                   # Log files
├── pom.xml                 # Maven configuration
├── testng.xml              # TestNG suite file
├── .gitignore
└── README.md
✨ Framework Features
Hybrid Automation Framework
Page Object Model (POM)
Selenium WebDriver Integration
TestNG Framework
Maven Dependency Management
Data-Driven Testing using Excel
Apache POI Excel Utility
Extent Report Generation
Log4j Logging
Automated Screenshot Capture
Reusable Utility Methods
Cross Browser Testing
Jenkins CI/CD Integration
Failure Handling & Reporting
⚙️ Prerequisites
Before running the project, install:
Java JDK 8 or above
Maven
Eclipse IDE
Google Chrome Browser
ChromeDriver
Jenkins (Optional)
🔧 Setup & Installation
Clone Repository
Bash
git clone https://github.com/akshay123-debug/Automoation-Testing.git
Import Project in Eclipse
Open Eclipse IDE
Select:
File → Import → Existing Maven Projects
Choose the project folder
Click Finish
Install Dependencies
Bash
mvn clean install
▶️ Execute Test Cases
Using TestNG
Run:
Bash
testng.xml
directly from Eclipse.
Using Maven
Bash
mvn test
📊 Reports & Logging
The framework automatically generates:
Extent Reports
TestNG Reports
HTML Reports
Execution Logs
Failure Screenshots
Generated files are stored inside:
Bash
reports/
test-output/
screenshots/
logs/
📑 Data-Driven Testing
The framework supports Data-Driven Testing using Excel files through Apache POI.
Features include:
Reading test data from Excel
Multiple test data execution
Reusable Excel utility methods
Parameterized test execution
🔄 Cross Browser Testing
Framework supports execution on:
Google Chrome
Mozilla Firefox
Microsoft Edge
🚀 Jenkins CI/CD Integration
The framework supports Jenkins integration for:
Automated Build Execution
Scheduled Test Runs
Continuous Integration
Automated Report Generation
✅ Automated Test Scenarios
Login Functionality Testing
Search Functionality Validation
Form Validation Testing
Navigation Testing
Web Element Validation
End-to-End Workflow Testing
Assertion & Verification Testing

