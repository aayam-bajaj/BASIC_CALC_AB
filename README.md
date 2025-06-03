# BASIC_CALC_AB

**BASIC_CALC_AB** is a simple command-line calculator application developed in Java using Visual Studio Code.  
It supports basic arithmetic operations such as addition, subtraction, multiplication, and division.  
The project is designed for beginners learning Java and understanding CLI-based applications.

---

## ✨ Features

- Supports basic arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Simple and interactive command-line interface
- Easy-to-understand Java source code
- Suitable for educational and beginner use

---

## 🛠️ Getting Started

### ✅ Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK 8 or above)
- Visual Studio Code or any Java-compatible IDE
- Command-line terminal (Windows CMD, PowerShell, Terminal, etc.)

---

## 📦 Installation

Follow these steps to run the calculator:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/aayam-bajaj/BASIC_CALC_AB.git
   ```

2. **Navigate into the project directory:**

   ```bash
   cd BASIC_CALC_AB
   ```

3. **Compile the Java files:**

   ```bash
   javac -d bin src/*.java
   ```

4. **Run the calculator:**

   ```bash
   java -cp bin Main
   ```

> ⚠️ Make sure the main class is named `Main`. Update the class name in the command if it's different.

---

## 💡 Usage

Once the application is running:

- You will be prompted to enter two numbers and choose an arithmetic operation.
- The result will be displayed on the screen.
- The program may prompt for another calculation depending on the implementation.

Example interaction:

```
Enter first number: 20  
Enter operator (+, -, *, /): /  
Enter second number: 5  
Result: 4.0
```

---

## 📁 Project Structure

```
BASIC_CALC_AB/
├── .vscode/            # Visual Studio Code settings
│   └── settings.json
├── bin/                # Compiled bytecode files
│   └── Main.class      # Output after compilation
├── src/                # Java source code
│   └── Main.java       # Main application logic
└── README.md           # Project documentation
```

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).  
You are free to use, modify, and distribute this project with proper attribution.

---

## 🙌 Acknowledgments

- Built as a practice project for learning Java
- Thanks to the open-source community for continuous inspiration
