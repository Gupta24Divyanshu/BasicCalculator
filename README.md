# 🔢 Basic Calculator using React & Spring Boot

A full-stack web-based calculator application that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division) using a **React frontend** and **Spring Boot backend**.

> 🚀 Codveda Internship Project – Level 1 Task 1

---

## 🔧 Features

- ✅ Enter two numbers and choose an operation
- ✅ View the result instantly
- ✅ Reset the form to clear previous input
- ✅ Graceful error handling (e.g., divide by zero)

---

## 🖼️ Screenshots

> _(Add your own screenshots later or update the links)_

- ![Calculator UI](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(129).png)
- ![cal](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(130).png)
- ![cal](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(131).png)
- ![calt](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(132).png)
- ![cal](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(133).png)
- ![cal](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(134).png)
- ![cal](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(135).png)

---

## 🖥️ System Architecture

The app uses a **client-server model**:

- **Frontend (Client)**:  HTML5, CSS, JS  
- **Backend (Server)**: Java, Spring Boot, REST APIs


````

## 🗂️ Project Structure

```
BasicCalculatorApp/
├── backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── calculator/
│   │       │           ├── CalculatorApplication.java
│   │       │           ├── controller/
│   │       │           │   └── CalculatorController.java
│   │       │           └── model/
│   │       │               └── CalculationRequest.java
│   │       └── resources/
│   │           ├── application.properties
│   │           └── static/
│   └── pom.xml
│
└── frontend/
    ├── index.html
    ├── style.css
    └── script.js


---

## 🧰 Technology Stack

| Area       | Tech Stack                             |
| ---------- | -------------------------------------- |
| Frontend   | HTML5, CSS3, JavaScript                |
| Backend    | Java 21, Spring Boot 3.5.3, Maven      |
| Tools      | VS Code, Git, GitHub, npm, Live Server |
| API Format | REST APIs using JSON                   |

---

## ▶️ Run the Application

### ✅ Backend (Spring Boot)

```bash
cd BasicCalculatorApp/backend
mvn spring-boot:run
```

> Runs on: `http://localhost:8080/`
> To change port, update `application.properties`:

```properties
server.port=8081
```

---

### ✅ Frontend (React)

```bash
cd BasicCalculatorApp/frontend
npm install
npm start
```

> Runs on: `http://localhost:3000/`

---

## 🔍 How It Works

1. User inputs two numbers and selects an operation.
2. React sends a `POST` request to the backend.
3. Spring Boot processes the request, performs the calculation.
4. Result is returned as JSON and displayed on screen.

---

## 💡 Future Improvements

* Add history of past calculations
* Add new operations (modulus, power, square root)
* Improve form validation and UX
* Switch to JWT-based authentication
* Host on cloud (Render, Vercel, or AWS)

---

## 🙋‍♂️ Author

| Name                | GitHub                                              | LinkedIn                                          | Email                                                 |
| ------------------- | --------------------------------------------------- | ------------------------------------------------- | ----------------------------------------------------- |
| **Divyanshu Gupta** | [DivyanshuGitHub](https://github.com/YOUR_USERNAME) | [LinkedIn](https://linkedin.com/in/YOUR_LINKEDIN) | [youremail@example.com](mailto:youremail@example.com) |

