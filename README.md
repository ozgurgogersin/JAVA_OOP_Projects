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

---

# 2 - Cafe Application

A Java-based cafe application that offers a variety of international dishes, allowing users to explore and order their favorite foods.

## Table of Contents

- [Demo](#demo2)
- [Features](#features2)
- [Object-Oriented Programming (OOP) Methods](#object-oriented-programming-oop-methods2)
- [Error Handling and Bug Catching](#error-handling-and-bug-catching2)

## Demo

<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/cafeApp.gif" alt="Cafe App" width="500" height="400"/>

## Features

- Explore and order dishes from different international cuisines.
- Learn about the ingredients, cuisine, and taste of each dish.
- Manage your orders and view the total amount.
- Choose between different payment methods (credit card or cash).
- User-friendly command-line interface.

## Object-Oriented Programming (OOP) Methods

The Cafe App leverages OOP principles to maintain a structured and maintainable codebase. Key OOP concepts used include:

### Encapsulation

- Data (e.g., order details, prices) is encapsulated within classes, allowing controlled access through methods.

### Inheritance

- The application uses inheritance to create specialized food classes, such as `Borscht`, `Dosa`, `Donuts`, `Kebap`, and `Lasagna`, extending common functionality.

### Abstraction

- Abstraction is applied to represent and interact with food items and their properties, providing a simplified user experience.

### Polymorphism

- Polymorphism is used to allow different food items to be handled uniformly, ensuring flexibility and extensibility.

## Error Handling and Bug Catching

The Cafe App includes error handling mechanisms to enhance the user experience:

- Input validation: The application validates user inputs to prevent unexpected behavior and errors.
- Order management: Users can explore different foods and place orders with accurate pricing.
- Payment methods: The app handles different payment methods (credit card or cash) and ensures proper payment processing.

---




