# JAVA_OOP_Projects

- [Bank ATM Application](#bank-atm)
- [Cafe Application](#cafe-app)
- [Coffee Machine Application](#coffee-machine)
- [Greek Gods and Goddesses Game](#game)

# 1 - Bank ATM Application <a name="bank-atm"></a>

A simple Java-based Bank ATM Application that allows users to create accounts, log in, check balances, deposit money, and withdraw money.

## Table of Contents

- [Demo](#bank-atm-demo)
- [Features](#bank-atm-features)
- [Object-Oriented Programming (OOP) Methods](#bank-atm-object-oriented-programming-methods)
- [Error Handling and Bug Catching](#bank-atm-error-handling-and-bug-catching)


## Bank ATM Demo

<!-- Add a GIF or video demo here -->
<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/bankATM.gif"  alt="BankATM" width="500" height="400"/>

## Bank ATM Features

- User registration and login.
- Account balance checking.
- Deposit and withdrawal of funds.
- User-friendly command-line interface.

The Bank ATM Application leverages OOP principles to organize the codebase, ensuring a structured and maintainable design. Key OOP concepts used include:

### Bank ATM Object-Oriented Programming Methods

- **Encapsulation**: Data (e.g., username, password, and balance) is encapsulated within the `Account` class, allowing controlled access through getter and setter methods.

- **Inheritance**: The `Login` and `RunATM` classes extend the `Account` class to reuse common functionality and extend it with specialized features.

- **Abstraction**: The application abstracts user interactions through methods like `depositMoney` and `withdrawMoney`, simplifying the user experience.

- **Polymorphism**: Polymorphism is applied when different ATM operations are performed based on user input, providing flexibility and extensibility.

### Bank ATM Error Handling and Bug Catching

The Bank ATM Application includes error handling mechanisms to improve the user experience and address potential issues:

- **Invalid input handling**: The application validates user inputs to prevent unexpected behavior and errors.
- **Account locking**: After a certain number of unsuccessful login attempts, the application locks the account for security purposes.
- **Descriptive error messages**: The application provides informative error messages to guide users in case of invalid actions, such as entering negative deposit/withdraw amounts or incorrect login credentials.

---

# 2 - Cafe Application <a name="cafe-app"></a>

A Java-based cafe application that offers a variety of international dishes, allowing users to explore and order their favorite foods.

## Table of Contents

- [Demo](#cafe-app-demo)
- [Features](#cafe-app-features)
- [Object-Oriented Programming (OOP) Methods](#cafe-app-object-oriented-programming-methods)
- [Error Handling and Bug Catching](#cafe-app-error-handling-and-bug-catching)

## Cafe App Demo

<!-- Add a GIF or video demo here -->
<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/cafeApp.gif" alt="Cafe App" width="500" height="400"/>

## Cafe App Features

- Explore and order dishes from different international cuisines.
- Learn about the ingredients, cuisine, and taste of each dish.
- Manage your orders and view the total amount.
- Choose between different payment methods (credit card or cash).
- User-friendly command-line interface.

## Cafe App Object-Oriented Programming Methods

The Cafe App leverages OOP principles to maintain a structured and maintainable codebase. Key OOP concepts used include:

- **Encapsulation**: Data (e.g., order details, prices) is encapsulated within classes, allowing controlled access through methods.

- **Inheritance**: The application uses inheritance to create specialized food classes, such as `Borscht`, `Dosa`, `Donuts`, `Kebap`, and `Lasagna`, extending common functionality.

- **Abstraction**: Abstraction is applied to represent and interact with food items and their properties, providing a simplified user experience.

- **Polymorphism**: Polymorphism is used to allow different food items to be handled uniformly, ensuring flexibility and extensibility.

## Cafe App Error Handling and Bug Catching

The Cafe App includes error handling mechanisms to enhance the user experience:

- Input validation: The application validates user inputs to prevent unexpected behavior and errors.
- Order management: Users can explore different foods and place orders with accurate pricing.
- Payment methods: The app handles different payment methods (credit card or cash) and ensures proper payment processing.

---

# 3 - Coffee Machine Application <a name="coffee-machine"></a>

A simple Java-based Coffee Machine Application that allows users to select and customize coffee orders, including hot and cold coffee options.

## Table of Contents

- [Demo](#coffee-machine-demo)
- [Features](#coffee-machine-features)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Coffee Types](#coffee-types)
- [Object-Oriented Programming (OOP) Methods](#coffee-machine-object-oriented-programming-methods)
- [Error Handling](#error-handling)

## Coffee Machine Demo

<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/coffeemachine.gif" alt="Coffee Machine" width="500" height="400"/>

## Coffee Machine Features

- Select hot or cold coffee types.
- Customize coffee orders with milk and sugar even with sizes.
- Manage and display coffee orders.
- User-friendly command-line interface.

## Project Structure

- `CoffeeKitchen.java`: Handles coffee selection, customization, and order management.
- `ColdCoffies.java`: Manages specific cold coffee functionalities.
- `RunApp.java`: Entry point for the Coffee Machine application.
- `CoffeeTypes.java`: Enum representing different coffee types.
- `CoffeMachine.java`: Interface defining coffee-related methods.

## Usage

1. Select '1' to enter the Coffee Machine.
2. Choose a coffee from the menu.You can also choose the size.
3. Customize your coffee with milk and sugar.
4. Manage your order by adding more coffee or taking the order.
5. Exit the application by selecting '0'.

## Coffee Types

The Coffee Machine offers a variety of coffee types, including:
- Americano
- Espresso
- Cappuccino
- Latte
- Mocha
- Macchiato
- Affogato
- Iced Coffee (Cold coffee)
- Frappuccino (Cold coffee)
- Irish Coffee

## Coffee Machine Object-Oriented Programming Methods

The following key OOP principles are integrated into this project:

- **Encapsulation**: Data is enclosed within classes, offering controlled access and data integrity.
- **Inheritance**: Common functionality is inherited to reduce code redundancy and enhance organization.
- **Abstraction**: Complex processes are abstracted into intuitive methods, simplifying user interactions and improving usability.
- **Polymorphism**: Code is designed to adapt to different inputs, providing flexibility for handling various scenarios and expanding functionality.

## Error Handling

The application includes error handling mechanisms to improve the user experience and address potential issues, such as invalid input handling and descriptive error messages.

---

# 4 - Greek Gods and Goddesses Game <a name="game"></a>

## Table of Contents

- [Demo](#game-demo)
- [Features](#game-features)
- [Object-Oriented Programming (OOP) Methods](#game-object-oriented-programming-methods)
- [Error Handling and Bug Catching](#game-error-handling-and-bug-catching)

## Game Demo

<img src="https://github.com/ozgurgogersin/JAVA_OOP_Projects/blob/master/src/_Gifs/greekgodgodessgame.gif" alt="Game Demo" width="500" height="400"/>

## Game Features

- Explore the world of Greek mythology by interacting with powerful gods and goddesses.
- Choose from four iconic characters: Zeus, Apollo, Athena, and Hera.
- Learn about each character's unique attributes and abilities.
- Engage in battles, reveal secret powers, and uncover their strengths.
- Play the game and enjoy the rich stories and capabilities of these mythical beings.

## Game Object-Oriented Programming Methods

This game is built using Object-Oriented Programming (OOP) principles, including:

- **Inheritance**: Different gods and goddesses inherit common attributes and methods from a base class, making the code organized and efficient.

- **Polymorphism**: Each character has unique attack methods that showcase polymorphism, allowing flexibility in handling different characters' abilities.

- **Abstraction**: User interactions and game features are abstracted into intuitive methods, simplifying the player's experience.

- **Encapsulation**: Important data, such as character details, is encapsulated within classes to ensure controlled access and maintain data integrity.

## Game Error Handling and Bug Catching

The game includes error handling mechanisms to enhance the player experience and address potential issues:

- Invalid input handling: The game prompts players with clear instructions to choose from the available characters.
- Descriptive error messages: If a player enters incorrect commands, the game provides informative feedback to guide them.
- Graceful exit: Players can exit the game at any time with the 'q' command without unexpected errors.

---

