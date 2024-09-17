# Parenthesis Checker

## Overview
The Parenthesis Checker is a simple Java program that verifies whether a given set of parentheses in an expression is balanced. It supports three types of brackets: round `()`, curly `{}`, and square `[]`. The program uses a stack data structure to ensure that the parentheses are properly matched and balanced.

## Features
- Checks if parentheses are balanced in an expression.
- Supports multiple types of parentheses: `()`, `{}`, and `[]`.
- Provides real-time feedback by allowing user input.

## How it Works
The program works by:
1. Reading an input string from the user.
2. Scanning the string character by character:
   - If an opening parenthesis `(`, `{`, or `[` is encountered, it is pushed onto a stack.
   - If a closing parenthesis `)`, `}`, or `]` is encountered, the program checks if it matches the top of the stack. If it matches, the top element is popped off; if it doesn't match or the stack is empty, the expression is deemed unbalanced.
3. After scanning, if the stack is empty, the expression is balanced. If the stack still contains items, it is unbalanced.

## Prerequisites
- Java Development Kit (JDK) installed (version 8 or above).
- A code editor or IDE to run Java programs (e.g., IntelliJ IDEA, Eclipse, VS Code).

## How to Run the Program

1. Clone the repository or download the `ParenthesisChecker.java` file.
2. Open the file in your preferred Java IDE or text editor.
3. Compile the program using the command:
   ```bash
   javac ParenthesisChecker.java
