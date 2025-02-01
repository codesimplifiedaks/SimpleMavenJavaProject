# **Simple Maven Java App**

Welcome to the **Simple Maven Java App** repository! This project serves as an example for understanding the fundamentals of CI/CD, Jenkins, and automating build and deployment pipelines for Java Maven applications.

This project is part of a course where we will explore the following topics:

## **1. Master CI/CD Fundamentals**
   - Understand the core principles of Continuous Integration and Continuous Deployment (CI/CD) and how they apply to Java Maven applications.

## **2. Set Up Jenkins on Docker (Windows & Linux)**
   - Install, configure, and run Jenkins in a Docker container on a Windows machine, and set up a Jenkins agent with Linux OS using Docker.

## **3. Automate Build & Deployment Pipelines**
   - Create and configure Jenkins pipelines to automate building, testing, and deploying Java applications with Git, Maven, and Docker.

## **4. Integrate Git Webhooks for Automation**
   - Set up Git webhooks to trigger Jenkins builds automatically upon code changes, ensuring a seamless CI/CD workflow.

---

## **Project Overview**

This project is a simple Java Maven application that prints "Hello World" to the console. It is used as a demonstration for building and deploying Java applications in an automated CI/CD pipeline.

---

## **Prerequisites**

Before getting started, ensure you have the following tools installed:

- **Java** (version 8 or higher)
- **Maven** (version 3.0 or higher)
- **Git** (for version control)
- **Docker** (for Jenkins and containerized environments)
- **Jenkins** (for continuous integration and deployment)
  
### **Running the Application Locally**

1. Clone the repository and Build and Test:

   ```bash
   git clone https://github.com/codesimplifiedaks/SimpleMavenJavaProject.git
   cd simple-maven-java-app
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.codesimplified.App"
   mvn test



