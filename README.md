# JAVA_OOP_Projects

# 1 - Bank ATM Application

A simple Java-based Bank ATM Application that allows users to create accounts, log in, check balances, deposit money, and withdraw money.

## Table of Contents

- [Demo](#demo)
- [Features](#features)
- [Object-Oriented Programming (OOP) Methods](#object-oriented-programming-oop-methods)
- [Error Handling and Bug Catching](#error-handling-and-bug-catching)

## Demo

<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/bankATM.gif"  alt="BankATM" width="500" height="400"/>

## Features

- User registration and login.
- Account balance checking.
- Deposit and withdrawal of funds.
- User-friendly command-line interface.

The Bank ATM Application leverages OOP principles to organize the codebase, ensuring a structured and maintainable design. Key OOP concepts used include:

### Object-Oriented Programming (OOP) Methods

- **Encapsulation**: Data (e.g., username, password, and balance) is encapsulated within the `Account` class, allowing controlled access through getter and setter methods.

- **Inheritance**: The `Login` and `RunATM` classes extend the `Account` class to reuse common functionality and extend it with specialized features.

- **Abstraction**: The application abstracts user interactions through methods like `depositMoney` and `withdrawMoney`, simplifying the user experience.

- **Polymorphism**: Polymorphism is applied when different ATM operations are performed based on user input, providing flexibility and extensibility.

### Error Handling and Bug Catching

The Bank ATM Application includes error handling mechanisms to improve the user experience and address potential issues:

- **Invalid input handling**: The application validates user inputs to prevent unexpected behavior and errors.
- **Account locking**: After a certain number of unsuccessful login attempts, the application locks the account for security purposes.
- **Descriptive error messages**: The application provides informative error messages to guide users in case of invalid actions, such as entering negative deposit/withdraw amounts or incorrect login credentials.

