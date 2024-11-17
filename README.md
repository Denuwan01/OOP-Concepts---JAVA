Object-Oriented Programming Concepts in Java
This repository contains examples of the four fundamental concepts of Object-Oriented Programming (OOP) in Java: Encapsulation, Inheritance, Polymorphism, and Abstraction. Each concept is demonstrated through a simple code example.

1. Encapsulation
Definition: Encapsulation is the technique of bundling data (variables) and methods that operate on the data into a single unit or class. It restricts direct access to some of an object's components, which is a means of preventing unintended interference and misuse of the data.

Code Example: The Box class demonstrates encapsulation by using private variables and public methods to control access to these variables.

2. Inheritance
Definition: Inheritance is a mechanism wherein a new class inherits properties and behavior (methods) from an existing class. This helps in reusability of code and establishing a natural hierarchy between classes.

Code Example: The B class extends the A class, showcasing how properties and methods of class A are inherited by class B.

3. Polymorphism
Definition: Polymorphism allows methods to do different things based on the object it is acting upon. It can be achieved through method overriding (runtime polymorphism) or method overloading (compile-time polymorphism).

Code Example: The B class overloads the show method, demonstrating compile-time polymorphism, and inherits the show method from the A class, demonstrating method overriding.

4. Abstraction
Definition: Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object. It allows focusing on what the object does instead of how it does it.

Code Example: The Shape abstract class, with subclasses Rectangle and Circle, demonstrates abstraction by defining an abstract method area that is implemented by the subclasses.
