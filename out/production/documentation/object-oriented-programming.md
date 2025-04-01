# Object-oriented programming (OOP)

## Table of Contents

1. [Introduction](#introduction)
2. [Class](#class)
3. [Object](#object)
4. [Unified Modeling Language (UML)](#unified-modeling-language-uml)
5. [Inheritance](#inheritance)
6. [Data Abstraction and Encapsulation](#data-abstraction-and-encapsulation)
7. [Interface](#interface)
8. [Polymorphism](#polymorphism)
9. [Class Associations](#class-associations)
10. [Design Patterns](#design-patterns)
11. [SOLID](#unified-modeling-language-uml)

## Introduction

Object-oriented programming (OOP) is a programming paradigm based on the concept of **objects**,
which can contain data, in the form of fields (often known as attributes or properties),
and code, in the form of procedures (often known as methods).

## Class

A class is a blueprint for creating objects (a particular data structure),
providing initial values for state (member variables or attributes),
and implementations of behavior (member functions or methods).

### Example

```java

public class Car {
    // fields
    private String color;
    private int maxSpeed;

    // methods
    void display() {
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + maxSpeed);
    }
    // getters and setters
}
```

## Object

An object is a data structure or abstract data type containing fields (state variables containing data)
and methods (subroutines or procedures defining the object's behavior in code).
Fields may also be known as members, attributes, or properties.
Objects are typically stored as contiguous regions of memory.
Objects are accessed somewhat like variables with complex internal structures,
and in many languages are effectively pointers, serving as actual references to a
single instance of a said object in memory within a heap or stack.

```java

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.maxSpeed = 200;
        car1.display();
    }
}
```

## Unified Modeling Language (UML)

UML (Unified Modeling Language) is a modeling language used for concisely describing a system.
UML diagrams are widely used in the software engineering field.

- Class Diagram: Represents the static view of a system, showing the classes, attributes, methods, and relationships
  between classes.
- Object Diagram: Represents the instances of classes and their relationships at a point in time.
- Use Case Diagram: Represents the interactions between a system and its users.
- Sequence Diagram: Represents the interactions between objects in a sequential order.
- Activity Diagram: Represents the flow of control in a system.
- State Diagram: Represents the states of an object and the transitions between states.
- Component Diagram: Represents the components of a system and their relationships.
- Deployment Diagram: Represents the physical deployment of artifacts on nodes.

![example UML](./img/class-diagram-example.png)

## Inheritance

Inheritance is a mechanism in which one class acquires the property of another class.
For example, a child inherits the traits of his/her parents.
One class can only inherit from one superclass.
OOP languages are diverse, but typically OOP languages allow inheritance for code reuse
and extensibility in the form of either classes or prototypes.
These forms of inheritance are significantly different, but analogous terminology is used
to define the concepts of object and instance.

```java

public class Vehicle {
    int maxSpeed = 100;
}

public class Car extends Vehicle {
    int maxSpeed = 200;

    void display() {
        System.out.println("Vehicle MaxSpeed: " + super.maxSpeed);
        System.out.println("Car MaxSpeed: " + maxSpeed);
    }
}
```

## Data Abstraction and Encapsulation

- Data Abstraction: Data abstraction is the process of hiding the implementation details
  and showing only the essential features of the object.
  It helps reduce programming complexity and effort.
  In Java, abstraction is achieved using abstract classes and interfaces.
  The **abstract** keyword is a **non-access modifier**, used for classes (cannot be used to create objects to access
  it, must be inherited from another class)
  and methods (only be used in an abstract class, and it does not have a body)

```java
abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}
```

- Encapsulation: prevents external code from being concerned with the internal workings of an object.
  This facilitates code refactoring, for example, allowing the author of the class to change
  how objects of that class represent their data internally without changing any external code.
  In Java, encapsulation is achieved using access modifiers (private, protected, public).

```java
public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
```

- Access Modifiers Java:
    - **Private**: The code is only accessible within the declared class.
    - **Default (no modifier)**: The code is only accessible within the package.
    - **Protected**: The code is accessible in the same package and subclasses.
    - **Public**: The code is accessible from any class.

- Non-Access Modifiers Java:
    - **Static**: The code belongs to the class, not an instance of the class.
    - **Final**: The code cannot be modified.
    - **Abstract**: The code does not have a body and must be implemented in a subclass.
    - **Synchronized**: One thread can only access the code at a time.
    - **Transient**: The code is not part of the persistent state of an object.
    - **Volatile**: The code value will never be cached thread locally.

## Interface

An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods.
A class implements an interface, thereby inheriting the abstract methods of the interface.
***A class can implement multiple interfaces.***

```java

public interface Car {
    void display();
}

public class Audi implements Car {

    public void display() {
        System.out.println("Audi Car");
    }
}
```

## Polymorphism

- Polymorphism means **many forms,** and it occurs when we have many classes that are related
  to each other by inheritance. Like we specified in the previous chapter;
  **Inheritance** lets us inherit attributes and methods from another class.
  **Polymorphism** uses those methods to perform different tasks.
  This allows us to perform a single action in different ways.
    - Overloading: When a class has multiple methods by the same name but different parameters, it is known as method
      overloading.
    - Overriding: When a method in a subclass has the same name, same parameters or signature, and same return type as a
      method in its super-class, then the method in the subclass is said to override the method in the super-class.

```java
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
```

## Class Associations

- Association is the cardinal concept in object-oriented programming that describes the relationship between two
  independent classes.
- Types of relationships: one-to-one, one-to-many, many-to-one, and many-to-many.
- Association is a relationship where all objects have their lifecycle, and there is no owner.
- Bidirectional association: Both classes have a relationship with each other.
- Uni-directional association: Only one class has a relationship with the other.

Association Types:

- One-to-One: A person has exactly one passport, and a passport belongs to exactly one person.
- One-to-Many: A bank has many employees, but an employee works at only one bank.
- Many-to-One: Many students study at one school, but a school has many students.
- Many-to-Many: Many students study at many schools, and many schools have many students.

Relationships Types:

- Is-a Relationship: Inheritance relationship between classes (keyword: **extends**).
- Has-a Relationship: Composition and aggregation relationships between classes.
  Composition implies a strong relationship where the contained object cannot exist without
  the container object, while aggregation implies a weaker relationship where the contained
  object can exist independently.
- Uses-a Relationship: Dependency relationship between classes.

Aggregation example:

```java
class Book {
    private String title;
    private String author;

    // ... constructors, getters, and setters
}

class Library {
    private List<Book> books = new ArrayList<>();

    // ... methods to add, remove, and search books
}
```

Composition example:

```java
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}
```

## Design Patterns

One way to address the challenges of object-oriented design is via design patterns 
that are solution patterns to commonly occurring problems in software design. 
Some of these commonly occurring problems have implications and solutions particular 
to object-oriented development.

- **Creational design patterns** provide various object creation mechanisms, which increase flexibility and reuse of existing code.

1. Singleton Pattern is a creation design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
2. Factory Method Pattern is a creation design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
3. Abstract Factory Pattern is a creation design pattern that lets you produce families of related objects without specifying their concrete classes.
4. Builder Pattern is a creation design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
5. Prototype Pattern is a creation design pattern that lets you copy existing objects without making your code dependent on their classes.

- **Structural design patterns** explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

1. Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.
2. Bridge Pattern is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
3. Composite Pattern is a structural design pattern that lets you compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
4. Decorator Pattern is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the new behaviors.
5. Facade Pattern is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
6. Flyweight Pattern is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.
7. Proxy Pattern is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

- **Behavioral design patterns** focus on communication between objects, how objects interact, and how they are assigned responsibilities.

1. Chain of Responsibility Pattern is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it along the chain.
2. Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method argument, delay or queue a request’s execution, and support undoable operations.
3. Iterator Pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).
4. Mediator Pattern is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
5. Memento Pattern is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
6. Observer Pattern is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
7. State Pattern is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
8. Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
9. Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
10. Visitor Pattern is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

## SOLID

- SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin.
  - Single-responsibility principle: A class should have one and only one reason to change, meaning that a class should have only one job.
  - Open-closed principle: Objects or entities should be open for extension but closed for modification.
  - Liskov substitution principle: Objects of a superclass shall be replaceable with objects of its subclasses without affecting the functionality of the program.
  - Interface segregation principle: A client should never be forced to implement an interface that it doesn't use, or clients shouldn't be forced to depend on methods they do not use.
  - Dependency inversion principle: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.