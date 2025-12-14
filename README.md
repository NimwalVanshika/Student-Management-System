# 🎓 DSA-Powered Student Management System (Java Backend)

A **console-based Student Management System** built using **Java**, focused on **Data Structures & Algorithms (DSA)** and **Object-Oriented Programming (OOP)**.  
This project is part of a learning journey to build strong backend fundamentals before adding a GUI.

---

## 🚀 Features Implemented

- ➕ Add a student  
- 📋 View all students  
- 🔍 Search student by ID (Linear Search)  
- 🗑️ Delete student by ID  
- 🧠 Clean separation of concerns using OOP  

---

## 🛠️ Tech Stack

- **Language**: Java  
- **JDK**: Java 23  
- **IDE**: IntelliJ IDEA  
- **Concepts Used**:
  - Object-Oriented Programming (OOP)
  - ArrayList
  - Linear Search
  - Basic data management

---

## 📂 Project Structure
StudentManagementSystem
│
├── src
│   └── com.sms
│       ├── Main.java           # Application entry point
│       ├── Menu.java           # Console menu & user interaction
│       ├── Student.java        # Student data model
│       └── StudentManager.java # Core business logic

## 🧩 Class Overview
🔹 Student

Represents a student entity containing:

Student ID

Name

Marks

Grade

This class follows encapsulation by keeping fields private and exposing them through constructors and getter methods.

🔹 StudentManager

-Handles all core backend logic of the application:
-Stores students using ArrayList
-Adds new student records
-Searches students using linear search
-Deletes students by ID
-Displays all student details
-This class acts as the business logic layer.

## 🔹 Menu
-Provides a console-based user interface
-Displays menu options
-Takes user input using Scanner
-Calls appropriate methods from StudentManager
-Keeps UI logic separate from backend logic

## 🔹 Main
-Entry point of the application
-Starts the menu-driven system

## ▶️ How to Run the Project

-Clone the repository
-Open the project in IntelliJ IDEA
-Ensure JDK 23 is set as the Project SDK
-Run Main.java

## Use the console menu to interact with the system

## ⏱️ Time Complexity Analysis
-Operation	Time Complexity
-Add Student	O(1)
-View Students	O(n)
-Search Student by ID	O(n)
-Delete Student by ID	O(n)
-🧠 Learning Outcomes

## Practical understanding of ArrayList operations

## Implementation of search and delete logic

## Hands-on experience with OOP concepts

## Writing clean, structured backend code

## Building a scalable foundation for future enhancements

## 🔮 Planned Enhancements

Sort students by marks and name

Find topper (maximum marks)

Calculate average marks

Grade frequency using HashMap

File handling for data persistence

JavaFX-based graphical user interface

## 📌 Purpose of This Project

This project is built to learn DSA concepts through real-world implementation, rather than isolated coding problems.
It serves as a strong backend foundation and can be extended into a full-stack application.

## ✨ Author

Vanshika Nimwal
Computer Science Student
