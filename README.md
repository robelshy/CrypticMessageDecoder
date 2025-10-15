# Cryptic Message Decoder

A simple Java console program that decrypts a numeric message using a custom algorithm. The program extracts specific digits, performs calculations, and outputs a “decrypted code” based on the input number.

---

## Features

- Accepts a numeric input from the user.
- Extracts the **first, second, second-last, and last digits** of the input number.
- Computes:
  - **Product** of the first and last digits.
  - **Sum** of the second and second-last digits.
- Combines the results to generate the decrypted code.
- Handles single-digit numbers safely by squaring them.

---

## Requirements

- **Java Development Kit (JDK)** (any version)
- Console or terminal to run the program

---

## How to Run

1. Compile the Java program:

```bash
javac CrypticMessageDecoder.java
