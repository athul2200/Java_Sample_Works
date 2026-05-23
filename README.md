# ☕ Java Sample Programs

A collection of core Java programs covering **OOP concepts**, **Swing GUI**, and **JDBC database connectivity**.

---

## 📂 Project Structure

| Directory / File | Description |
|---|---|
| `FindArea.java` | Calculate area of shapes using method overloading |
| `Shapes.java` | Demonstrates inheritance with shape classes |
| `Interface.java` | Interface implementation example |
| `StudMain.java` | Student class with constructors & methods |
| `EmpMain.java` | Employee management using OOP |
| `StockMain.java` | Stock data handling program |
| `CircDisplay.java` | Circular display logic |
| `shapeSize/` | Circle & Rectangle classes (polymorphism) |
| `Swings/` | GUI apps — EvenOdd, Factorial, Gender selector, ListBox, RadioButton |
| `JDBC/` | Database programs — `StudentDB` & `EmployeeDB` using MySQL |

---

## 🛠️ Prerequisites

- **Java JDK** 8 or above
- **MySQL** (for JDBC programs)
- **MySQL Connector/J** (included in `JDBC/`)

## 🚀 How to Run

```bash
# Compile
javac FileName.java

# Run
java FileName
```

For JDBC programs:

```bash
javac -cp ".;JDBC/mysql-connector-j-9.6.0.jar" JDBC/StudentDB.java
java -cp ".;JDBC/mysql-connector-j-9.6.0.jar;JDBC" StudentDB
```

---

## 📜 License

This project is for educational purposes.
