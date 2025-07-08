# Hesham's Bookstore

A Java-based simulation of an online bookstore designed for the Fawry Internship Challenge. This project demonstrates object-oriented programming principles, inventory handling, and modular design using abstract classes and interfaces.

---

## Features

- Add multiple types of books to inventory:
  - PaperBook: has stock, can be shipped
  - EBook: has file type, sent via email
  - ShowcaseBook: not for sale (demo only)
- Remove outdated books based on publication year
- Buy books using ISBN and quantity
- Simulate delivery:
  - PaperBooks go to a shipping service
  - EBooks go to a mail service
- Error handling for:
  - Invalid ISBN
  - Out of stock
  - ShowcaseBook purchase attempt

---

## Project Structure

```
hesham-bookstore/
├── README.md
├── screenshot.png
└── src/
    ├── app/
    │   └── HeshamBookstoreTest.java
    ├── model/
    └── service/
```

---

## Getting Started

### Compile

```bash
javac -d bin src/app/HeshamBookstoreTest.java src/model/*.java src/service/*.java
```

### Run

```bash
java -cp bin app.HeshamBookstoreTest
```

---

## Sample Output (Screenshot)

![Console Screenshot](screenshot.png)

---

## Author

**Hesham Ebaid**  
