# Hospital Management System – Java (OOP Project)

This repository contains an Object-Oriented Programming (OOP) based **Hospital Management System** developed in Java.  
The project demonstrates core OOP concepts such as inheritance, polymorphism, encapsulation, abstraction, interfaces, and class relationships.

---

## 🚀 Project Overview

The system manages essential hospital operations, including:

- Managing Patients  
- Managing Doctors  
- Medical Records Handling  
- Billing & Billing Departments  
- Hospital Information Management  

The code is fully modular and demonstrates clean OOP architecture.

---

## 📂 Project Structure

```
Oop-Project/
│
├── Billing.java
├── Billing.class
├── BillingDepartments.java
├── BillingDepartments.class
├── Doctor.java
├── Doctor.class
├── Hosiptal.java
├── Hosiptal.class
├── HospitalManagementSystem.java
├── HospitalManagementSystem.class
├── MedicalRecord.java
├── MedicalRecord.class
├── Patient.java
├── Patient.class
├── Person.java
├── Person.class
│
├── Hospital Management Systems.mdj   (UML Design)
├── requirement oop.docx              (Requirements)
├── sc hosipta;.png                   (Screenshot)
└── README.md
```

---

## 🧑‍💻 Key Classes Explained

### **Person.java**
Parent class for all persons in the system, containing:
- name  
- age  
- gender  
- contactInfo  

---

### **Doctor.java**
Inherits from Person and contains:
- specialization  
- experience  
- assignedPatients  

---

### **Patient.java**
Inherits from Person and includes:
- disease  
- assignedDoctor  
- medicalRecord  

---

### **MedicalRecord.java**
Stores:
- prescription  
- history  
- diagnosis  
- testReports  

---

### **Billing.java**
Handles:
- billAmount  
- paymentStatus  
- calculation logic  

---

### **BillingDepartments.java**
Manages:
- departmentWiseBilling  
- additionalCharges  

---

### **HospitalManagementSystem.java**
Main driver class that connects all modules and runs the program menu.

---

### **Hosiptal.java**
(Existing file spelling)  
Contains:
- hospitalName  
- address  
- staffList  
- recordManagement  

---

## 📊 UML Diagram
A complete UML class diagram is included:  
**Hospital Management Systems.mdj**

---

## 🏁 How to Run the Project

### **Compile**
```bash
javac *.java
```

### **Run**
```bash
java HospitalManagementSystem
```

---

## 🎯 Learning Outcomes

- Inheritance  
- Polymorphism  
- Encapsulation  
- Abstraction  
- Class Relationships  
- Java Modular Structure  

---

## 📸 Screenshot
A preview screenshot is included:  
`sc hosipta;.png`

---

## 📄 Requirements File
Assignment outline available at:  
`requirement oop.docx`

---

If you want a **short version**, **badge version**, or **professional GitHub-styled version**, just ask!
