# 🔢 Basic Calculator using Spring Boot

A full-stack web-based calculator application that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division) 

> 🚀 Codveda Internship Project – Level 1 Task 1

---

## 🔧 Features

- ✅ Enter two numbers and choose an operation
- ✅ View the result instantly
- ✅ Reset the form to clear previous inputs
- ✅ Graceful error handling (e.g., divide by zero)

---

## 🖼️ Screenshots


- ![Calculator UI](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(129).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(130).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(131).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(132).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(133).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(134).png)
- ![Screenshot](https://github.com/Gupta24Divyanshu/BasicCalculator/blob/main/Images%20and%20Video/Screenshot%20(135).png)

---

## 🖥️ System Architecture

The application follows a **client-server architecture**:

- **Frontend (Client)**: HTML5, CSS3, JavaScript  
- **Backend (Server)**: Java, Spring Boot

---

## 🗂️ Project Structure

```

G:\
└── Codveda\
    └── level_1\
        └── Task_1\
            ├── BasicCalculator_frontend\
            │   ├── index.html  
            │   ├── style.css  
            │   └── script.js  
            │
            └── BasicCalculator_backend\
                ├── src\
                ├── pom.xml
                └── application.properties


````

---

## 🧰 Technology Stack

| Area       | Tech Stack                             |
|------------|----------------------------------------|
| Frontend   | HTML5, CSS3, JavaScript                |
| Backend    | Java 21, Spring Boot 3.5.3, Maven      |
| Tools      | VS Code, Git, GitHub, npm, Live Server |

---

## ▶️ How to Run the Application

### ✅ Backend (Spring Boot)

```bash
cd G:\Codeveda\Level_1\Task_1\BasicCalculator_backend
mvn spring-boot:run
````

> Runs on: `http://localhost:8080/`
> To change the port, edit `application.properties`:

```properties
server.port=8081
```

---

### ✅ Frontend (Live Server)

```bash
cd G:\Codveda\level_1\Task_1\BasicCalculator_frontend
npm init -y                   # Only once
npm install live-server --save-dev
npm start

```

> Runs on: `http://localhost:5500/`

---

## 🔍 How It Works

1. User enters two numbers and selects an operation.
2. JavaScript sends data to Spring Boot backend via fetch().
3. Backend processes the request and returns the result.
4. Frontend displays the result on the screen.

---

## 💡 Future Improvements

* Add a history log for previous calculations
* Implement more operations (modulus, power, square root)
* Enhance input validation and user experience
* Integrate JWT-based authentication
* Deploy on cloud platforms like Vercel, Render, or AWS

---

## 🙋‍♂️ Author

| Name            | GitHub                                        | LinkedIn                                                    | Email                                                             |
| --------------- | --------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------------- |
| Divyanshu Gupta | [GitHub](https://github.com/Gupta24Divyanshu) | [LinkedIn](https://linkedin.com/in/divyanshu-gupta-dev670/) | [divyanshugupta670@gmail.com](mailto:divyanshugupta670@gmail.com) |

```
