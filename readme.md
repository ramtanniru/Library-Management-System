# Library Management System

A Java-based Library Management System that allows users to borrow, return, and manage books within a library. This application demonstrates Object-Oriented Programming (OOP) principles, including **inheritance**, **polymorphism**, **encapsulation**, and **abstraction**.

## Features

1. **Book Management**:
   - Add, update, and delete books.
   - Track book availability.
   
2. **User Management**:
   - Register and remove users.
   - Allow both **Student** and **Faculty** user types with different borrowing limits.
   
3. **Borrowing and Returning Books**:
   - Users can borrow and return books with restrictions based on user type.
   - Track the number of books borrowed by each user.

4. **OOP Principles**:
   - **Encapsulation**: Data like user details and book availability is managed privately within classes, accessed via public methods.
   - **Abstraction**: Common attributes and methods related to borrowing and returning are encapsulated within the `User` and `Book` classes.
   - **Inheritance and Polymorphism**: Although not applied to `User` subclasses in this version, it’s designed for extensibility to easily allow further user types with different borrowing policies.

## Class Structure

### 1. `Book`
   - Stores details about the book, including title, author, genre, and availability status.
   - Methods to check availability and update availability status when borrowed or returned.

### 2. `User`
   - Manages user details, including user ID, name, and user type (Student or Faculty).
   - Allows for different borrowing limits based on user type (3 books for students, 5 books for faculty).

### 3. `Library`
   - Maintains a collection of books and users.
   - Provides methods to add, update, and delete books and users.
   - Manages the borrowing and returning of books based on user restrictions.

### Example Code

Here's an example of how to use the system in the `Main.java` file:

```java
import library.Library;
public class Main
{
	public static void main(String[] args) {
		Library l = new Library();
		l.addUser(1,"Ram","student");
		l.addUser(2,"Sai","faculty");
		l.addBook("Java","Leela","Programming");
		l.borrowBook(1,"Java");
		l.borrowBook(2,"Java");
	}
}
```

## Requirements

- **Java**: Java Development Kit (JDK) 8 or above.
- **IDE**: Any Java IDE, such as IntelliJ IDEA, Eclipse, or NetBeans.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ramtanniru/Library-Management-System.git
   cd Library-Management-System
   ```

2. **Compile and run**:
   ```bash
   javac -d bin library/*.java
   java -cp bin Main
   ```

## Future Enhancements

- Add support for additional user roles with varying borrowing limits and restrictions.
- Integrate a database to manage book and user records persistently.
- Develop a GUI for a more user-friendly experience.

---

Thank you for using the Library Management System! Happy borrowing!