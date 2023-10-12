# **Core Java: Interview Question Bank**

---

### **Java Virtual Machine Architecture**

#### "Write Once, Run anywhere"

- VM is a virtual representation of a physical computer
- Compile Languages
- Interpreted Languages
- JVM Components
  - Class Loader
  - Runtime Data Area
  - Execution Engine

#### Class Loader

- Loading : Bootstrap Class, Extension Class Loader, Application Class Loader
- Linking : Verification, Preparation, Resolution
- Initialization : calling constructors, executing static block, assigning values to static variables

#### Runtime Data Area

- Method Area
- Heap Area
- Stack Area
- PC(Program Counter) Register
- Native Method Stack

#### Execution Engine

- Interpreter
- JIT Compiler : Compiles bytecode to Machine code.
- GC (System.GC();)
- Java Native Interface : Is a bridge that permit supporting packages for other programming languages like C/C++.

#### JVM languages

- Scala
- Groovy
- Kotlin

---

### **public static void main**

- public
  - Access modifier of main class.
  - Makes the main function globally available.
- static
  - `main()` is static so that the compiler can call the method without the object of a class.
- void
  - Return type of method.
- String[] arg

  - Stores java command line arguments. It is used to pass command-line arguments to a java program when executed from the command line.

  ```
  public class HelloWorld {
   public static void main(String[] args) {
  	  System.out.println("Hello World!");
       }
   }

   *****************
   // Java 21
  void main(){
   System.out.println("Hello World!");
  }
  ```

---

### **Primitive**

- A primitive is a data type that represents a single value and is not an object.
- There are 8 primitive datatypes in java
  - boolean
  - byte
  - short
  - int
  - long
  - float
  - double
  - char
- Null cannot be assigned to a primitive data-type.
- They hold actual data and not the reference.
- They are immutable.

  ```
  int age = 30;
  double price = 49.99;
  char grade = 'A';
  boolean isJavaFun = true;

  ```

---

### **Wrapper Classes**

- Wrapper classes are classes that encapsulate Java's primitive types, allowing them to be treated as objects.
- This enables the programmer to use them in scenarios where objects need to be used instead of primitive types. ie Collections, Generics, API's etc.
- Wrapper classes provides a set of methods and constructors for converting between primitives and objects, and for performing various operation.
- There are 8 Wrapper classes in java

  - Integer- int
  - Long - long
  - Short - short
  - Byte - byte
  - Double - double
  - Float - float
  - Character - char
  - Boolean - boolean

  ```
  // Using Integer and int
  Integer wrappedInt = Integer.valueOf(42); // Wrapping an int
  int unwrappedInt = wrappedInt.intValue();   // Unwrapping to get the int value

  // Autoboxing and unboxing (Java automatically converts between primitive and wrapper)
  Integer num = 10; // Autoboxing - int to Integer
  int result = num; // Unboxing - Integer to int

  ```

---

### **Literals**

- literal is a representation of a fixed value that is expressed in the source code of a program
- Integer Literals: Used to represent whole numbers.
  Example: int num = 42;

- Floating-Point Literals: Used to represent decimal numbers.
  Example: double pi = 3.14159;

- Character Literals: Used to represent a single character enclosed in single quotes.
  Example: char letter = 'A';

- String Literals: Used to represent a sequence of characters enclosed in double quotes.
  Example: String name = "John";

- Boolean Literals: Used to represent boolean values (true or false).
  Example: boolean isStudent = true;

- Null Literal: Represents a special "null" value and is used to indicate that a reference does not refer to an object.
  Example: String str = null;

- Octal and Hexadecimal Literals: You can represent integers in octal (base 8) or hexadecimal (base 16) using prefixes.
  Octal Example: int octalValue = 075; (Note the leading '0' indicating octal).
  Hexadecimal Example: int hexValue = 0x1F; (Note the '0x' prefix indicating hexadecimal).

- Binary Literals (Java 7 and later): You can represent integers in binary using the 0b or 0B prefix.
  Example: int binaryValue = 0b1101;

- Underscores in Numeric Literals (Java 7 and later): You can use underscores to improve the readability of numeric literals.
  Example: long bigNumber = 1_000_000;

---

### **Constructors**

- Constructors in Java are special methods that are used to create objects of a class.
- They are called automatically when an object is created using the `new` keyword.
- They are used to initialize the state of the object.
- Constructors have the same name as the class and do not have a return type, not even void.
- The need for constructors in Java arises from the fact that objects of a class may require some initial setup or state initialization before they can be used

Object Initialization:

```

public class Circle {
private double radius;

      public Circle(double radius) {
          this.radius = radius;
      }

}

```

<u>Overloading Constructors:</u>

- Refers to the practice of defining multiple constructors for a class with different parameter lists. Java allows you to have more than one constructor in a class, as long as they have different parameter lists.

```

public class Circle {
private double radius;

      public Circle() {
          this.radius = 0;
      }
      public Circle(double radius) {
          this.radius = radius;
      }

}

```

<u>Default Constructor:</u>

- A default constructor in Java is a constructor that is automatically provided by the Java compiler if a class does not explicitly define any constructors. It is also known as a no-argument constructor or the default no-arg constructor.

```

public class Circle {
private double radius;

public static void main(String[] args){
MyClass obj = new MyClass();
}

}

```

---

### **Control-flow statements**

- Conditional Statements:
  - if: Executes a block of code if a condition is true.
  - if-else: Executes one block of code if a condition is true and another block if it's false.
  - else-if: Allows you to check multiple conditions in sequence.
  - switch: Performs different actions based on the value of an expression.
- Looping Statements:
  - for: Repeats a block of code a specified number of times.
  - while: Repeats a block of code as long as a condition is true.
  - do-while: Repeats a block of code at least once and then as long as a condition is true.
  - for-each (Enhanced for loop): Simplifies iterating over collections (arrays, lists, etc.).
- Transfer Statements:
  - break: Exits the nearest loop or switch statement.
  - continue: Skips the current iteration of a loop and continues with the next.
  - return: Exits a method, optionally returning a value.
  - throw: Used for exception handling to raise an exception.
- Exception Handling:
  - try-catch: Used to catch and handle exceptions that occur within a try block.
  - try-finally: Ensures a block of code (in the finally block) is executed regardless of whether an exception occurred.

---

### **Iterator**

- Iterator is an interface that belongs to the Java Collections Framework. It provides a way to traverse or iterate over elements in a collection (such as a List, Set, or Map) without exposing the underlying data structure.
- Iterators are commonly used to access and manipulate the elements in a collection, and they are especially useful when you need to sequentially process the elements.

```
public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an iterator for the list
        Iterator<String> iterator = names.iterator();

        // Iterate over the list using the iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}

```

---

### **super**

- `super` can be used to refer immediate parent class instance variable.
- `super` can be used to invoke immediate parent class instance method.

```
class Parent{
    void display(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Parent");
    }
}

public class Main{
    public static void main(String args[]){
        Child child = new Child();
        child.display();
    }
}

Output
-----
Parent
Child
```

- `super` can be used to invoke immediate parent class constructor.

```

super.name;
super.getName();
super(name);

```

- `super` is essential to maintain the inheritance hierarchy and enabling to access the parent class members and constructors when necessary.

---

### **String**

- `String` is a class that represents a sequence of characters. Strings are widely used in Java programming, and they are used to store and manipulate text-based data such as names, addresses, and other textual information.
- `String` in Java are reference types, which means that they are actually objects that contain a reference to a memory location where the string's characters are stored. This is in contrast to primitive types (like int or char), which are not objects and are stored directly in memory.
- <u>Immutable</u>- Java strings are immutable, meaning their content cannot be changed after they are created. When you perform operations on a string that appear to modify it, such as concatenation or substring extraction, a new string is created with the modified content. This property makes `String` thread safe.

---

### **`==` operator v/s `equals()` method**

| `==` operator                                                                                                                                                                     | `equals()` method                                                                                                                                    |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| The `==` operator compares the references of two objects, including strings. It checks if two objects refer to the same memory location, i.e., if they are the exact same object. | The `equals()` method is a method defined in the Object class and overridden in the String class to compare the content of two objects for equality. |
| When used to compare strings, the == operator checks if two string variables refer to the same instance of the string object, not necessarily if their content is the same.       | When used to compare strings, the equals() method checks if the content (sequence of characters) of two string objects is the same.                  |

```
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

System.out.println(str1 == str2);   // true - both variables refer to the same "Hello" object in the string pool
System.out.println(str1 == str3);   // false - str3 refers to a different object created with the 'new' keyword

System.out.println(str1.equals(str2));   // true - both strings have the same content
System.out.println(str1.equals(str3));   // true - both strings have the same content
```

---

### `String str = "Hello"` v/s `String str = new String("Hello")`

| String str = "Hello"                                               | String str = new String("Hello")                                                                                         |
| ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| It references an existing string object in the pool if one exists. | It explicitly creates a new string object on the heap, regardless of whether an identical string is already in the pool. |
| More memory efficient.                                             | Less memory efficient.                                                                                                   |

---

### **String v/s String Builder v/s String Buffer**

| String                                                                                                                                                                                                            | String Builder                                                                                                 | String Buffer                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `String` objects are immutable, meaning that once a String object is created, its contents cannot be changed. Any modifications to a String object actually create a new String object with the modified content. | `StringBuilder` is a mutable class that allows you to modify a string's content without creating a new object. | `StringBuffer` is a mutable class that allows you to modify a string's content without creating a new object. |
| This makes String objects thread-safe and secure                                                                                                                                                                  | `StringBuilder` objects are not thread-safe and should not be used in a multi-threaded environment             | `StringBuffer` objects are thread-safe and can be used in a multi-threaded environment                        |
| Slow                                                                                                                                                                                                              | Faster than `String`                                                                                           | `StringBuffer` is thread-safe, making it ideal for multi-threaded environments                                |

---

### **static**

- `static` keyword is used to create variables, methods, and nested classes that belong to the class rather than to any specific instance of the class.

- Static variables: Also known as class variables, they are shared by all instances of a class. They are initialized only once when the class is loaded, and any changes to them are reflected across all instances of the class.

```

public class Counter {
private static int count = 0;

      public Counter() {
          count++;
      }

      public static int getCount() {
          return count;
      }

}

// Usage:
Counter c1 = new Counter();
Counter c2 = new Counter();
System.out.println(Counter.getCount()); // Prints 2
```

- Static methods: They belong to the class rather than to any instance of the class. They can be called without creating an object of the class and can access only static variables and methods of the class.

```

public class MathUtils {
public static int add(int a, int b) {
return a + b;
}

      public static double square(double x) {
          return x * x;
      }

}

// Usage:
int sum = MathUtils.add(2, 3);
double result = MathUtils.square(4.0);

```

- Static nested classes: They are declared as static when they are nested inside another class. They are like regular nested classes, but they do not have access to the instance variables of the enclosing class.

```

public class Person {
private String name;
private static class Address {
private String street;
private String city;
private String state;

          public Address(String street, String city, String state) {
              this.street = street;
              this.city = city;
              this.state = state;
          }

          public String getFullAddress() {
              return street + ", " + city + ", " + state;
          }
      }

      public Person(String name, String street, String city, String state) {
          this.name = name;
          this.address = new Address(street, city, state);
      }

      public String getFullAddress() {
          return address.getFullAddress();
      }

}

// Usage:
Person person = new Person("John Doe", "123 Main St", "Anytown", "CA");
System.out.println(person.getFullAddress()); // Prints "123 Main St, Anytown, CA"

```

- In Java `static` keyword is used in creating constants, utility methods, and factory methods.

---

### **static v/s instance**

| static                                                                                                | instance                                                                                                      |
| ----------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| Static members can be accessed using the class name.                                                  | Instance members can only be accessed through an instance of the class.                                       |
| Static members are allocated memory only once, regardless of the number of instances created.         | Instance members are allocated memory for each instance of the class.                                         |
| Static members have class-level scope.                                                                | Instance members have instance-level scope.                                                                   |
| Static members are used when you want to share data or functionality across all instances of a class. | Instance members are used when you want to have different data or functionality for each instance of a class. |

---

### **final**

- `final` keyword is used to declare entities that cannot be modified.
- When `final` is applied to a variable, the value of the variable cannot be changed once it is initialized.
- When `final` is applied to a method, the method cannot be overridden in the subclasses.
- When `final` is applied to a class, the class cannot be subclassed.

---

### **finally**

- `finally` keyword is used to define a block of code that will be executed after a try block, whether an exception is thrown or not. It is often used to perform cleanup operations like closing a file or releasing a resource that was opened in the try block.

---

### **finalize()**

- `finalize()` is a method in Java that is called by the garbage collector when an object is no longer being used and is about to be garbage collected.
- The purpose of `finalize()` is to give an object a chance to perform any necessary cleanup operations before it is destroyed.
- The `finalize()` method is defined in the Object class, so all classes in Java have a `finalize()` method inherited from Object. By default, the `finalize()` method does nothing, so if a class needs to perform cleanup operations, it should override this method.

---

### **Exception handling**

- Exception handling in Java is a mechanism to handle runtime errors and exceptional situations that may occur during the execution of a program.
- It is a way to gracefully recover from errors and prevent the program from crashing.
- Java provides a built-in mechanism to handle exceptions using the try-catch block.
- The try block contains the code that may cause an exception, and the catch block handles the exception if it occurs.

```

try {
    // Code that may cause an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Exception handling code
    System.out.println("An exception occurred: " + e.getMessage());
} finally {
    // Code that will always be executed
    System.out.println("Done!");
}

```

---

### **ClassNotFoundException v/s NoClassDefFoundError**

| ClassNotFoundException                                                                                                                                                                       | NoClassDefFoundError                                                                                                                                     |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ClassNotFoundException` is a <u>checked exception</u> that occurs at runtime when the Java ClassLoader is unable to find a class at the time of dynamic class loading.                      | `NoClassDefFoundError` is an <u>error</u> (not an exception) that occurs when a class that was present during compilation is no longer found at runtime. |
| This exception is typically thrown when you attempt to load a class using methods like Class.forName() or ClassLoader.loadClass(), and the specified class cannot be found in the classpath. | This error typically occurs when the JVM tries to load a class that was available during compilation but is missing during runtime execution.            |
| It often indicates a missing or incorrect class name or a missing dependency that the class depends on.                                                                                      | It indicates that the class definition was found during compilation, but at runtime, the class file is not present or cannot be located.                 |

---

### **Custom Exception**

- Custom exceptions can be created by extending the Exception class or one of its subclasses like RuntimeException.
- By creating custom exceptions, developers can define their own exceptions for specific use cases, improving code clarity and allowing for more targeted exception handling.

```

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

```

---

### **Throw**

- `throw` is a keyword used to throw an exception explicitly. It is used to throw a custom or predefined exception explicitly within a method or block of code.

```

public void divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
    }
    int result = a / b;
    System.out.println("Result: " + result);
}

```

---

### **Throws**

- `throws` keyword is used in method signatures to declare that a method might throw certain types of checked exceptions.
- When a method declares that it throws an exception, it means that the method might encounter a situation that could cause an exception to be thrown, and that the method is not able to handle that exception on its own. Instead, the method declares that it might throw the exception, and it is the responsibility of the calling code to handle the exception.

```

public void readFromFile(String filename) throws IOException {
// code to read from the file
}

```

---

### **Collection**

- "Collection" refers to a framework or a group of classes and interfaces that are used to store, manipulate, and manage groups of objects.
- Collections provide a convenient and efficient way to work with groups of data, such as lists of items, sets of unique elements, and mappings of key-value pairs.
- Interfaces in Collection

  - `Collection`: The root interface for all collections. It defines common methods like add, remove, contains, and iterator.

  - `List`: Represents an ordered collection of elements with duplicate values. Class implementations include ArrayList and LinkedList.

  - `Set`: Represents an unordered collection of unique elements. Class implementations include HashSet, LinkedHashSet, and TreeSet.

  - `Map`: Represents a collection of key-value pairs, where each key is associated with a unique value. Class implementations include HashMap, LinkedHashMap, and TreeMap.
  - `Queue`: Represents a data structure for managing elements in a First-In-First-Out (FIFO) order, where elements are processed in the order they are added. Class implementations include PriorityQueue, ArrayDeque, and LinkedList.

---

### **Collection v/s Collections**

| Collection                                                                                                                                                                                                                       | Collections                                                                                                                                                                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `Collection` is an interface that is part of the Java Collections Framework. It's a fundamental interface that represents a group of objects, or elements, and provides a common set of methods for working with these elements. | `Collections` is a utility class in the java.util package. It contains a set of static methods that operate on or provide utility for objects that implement the Collection interface. These methods are used for common collection-related tasks, such as sorting, searching, shuffling, and synchronizing collections. |

```
Collection<Integer> myCollection = new ArrayList<>();
myCollection.add(3);
myCollection.add(1);
myCollection.add(7);

Collections.sort(myCollection);
```

---

### **List**

- List is an interface that represents an ordered collection of elements.
- Elements in a List can be accessed by their index, and a List can contain duplicate elements.
- List interface implementations
  - ArrayList
  - LinkedList
  - Vector
  - CopyOnWriteArrayList

---

### **Set**

- Set is an interface in the Java Collections Framework that represents a collection of unique elements, where each element can occur at most once.
- Set implementations provide a way to store, retrieve, and manipulate elements without duplicates.
- Set interface implementations
  - HashSet
  - LinkedHashSet
  - TreeSet
  - EnumSet

---

### **Map**

- Map is an interface in the Java Collections Framework that represents a collection of key-value pairs.
- Each key in a Map is associated with a corresponding value, and you can use the key to retrieve its associated value.
- Map implementations provide efficient means to store, retrieve, and manipulate key-value pairs.
- Map interface implementations
  - HashMap
  - TreeMap
  - LinkedHashMap
  - HashTable

---

### **Concurrent Hashmap**

- ConcurrentHashMap is a class in Java's that provides a thread-safe implementation of the Map interface.
- It is designed to be used in concurrent (multi-threaded) environments where multiple threads can access and modify the map concurrently.

---

### **Synchronized Hashmap**

---

### **Queue**

---

### **Comparable**

---

### **Comparator**

- Comparator is an interface in Java is an interface that defines a way to compare two objects for ordering or sorting purposes. It allows you to define custom comparison logic for objects that may not have a natural ordering or for cases where you want to sort objects based on criteria other than their natural order.

```
Comparator<MonthlyStatement> comparator = null;

        switch (sortBy.toLowerCase()) {
            case "category":
                comparator = Comparator.comparing(MonthlyStatement::getCategory);
                break;
            case "type":
                comparator = Comparator.comparing(MonthlyStatement::getType);
                break;
            case "amount":
                comparator = Comparator.comparing(MonthlyStatement::getAmount);
                break;
            case "date":
                comparator = Comparator.comparing(MonthlyStatement::getDate);
                break;
            default:
                comparator = Comparator.comparing(MonthlyStatement::getDate);
                break;
        }

        if (sortOrder.equalsIgnoreCase("desc")) {
            comparator.reversed();
        }
        Collections.sort(expenses, comparator);
```

---

### **Which collection should we use during multithreading?**

- ConcurrentHashMap
- ConcurrentLinkedQueue
- CopyOnWriteArrayList
- Synchronized Collections
  - You can make existing non-thread-safe collections thread-safe by wrapping them using Collections.synchronizedCollection, Collections.synchronizedList, Collections.synchronizedSet, etc.

---

### **Generics**

- Generics allows you to write classes, methods, and interfaces in a way that can work with different data types while providing compile-time type safety. Generics enable you to create reusable and type-safe code by parameterizing types.

```
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Box to hold an Integer
        Box<Integer> integerBox = new Box<>(42);
        int intValue = integerBox.getValue();
        System.out.println("Integer Value: " + intValue);

        // Create a Box to hold a String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        String stringValue = stringBox.getValue();
        System.out.println("String Value: " + stringValue);

        // Create a Box to hold a Double
        Box<Double> doubleBox = new Box<>(3.14159);
        double doubleValue = doubleBox.getValue();
        System.out.println("Double Value: " + doubleValue);
    }
}
```

---

### **Interface**

- An interface is a collection of abstract methods (methods without implementation) that can be used to define a contract that a class must adhere to.
- Interfaces are used to define common behavior that can be shared among multiple classes.
- They provide a way to achieve abstraction, multiple inheritance.
- Constant variable, which is implicitly public, static, and final
- The `implements` keyword is used.

---

### **Abstract Class**

- An abstract class is a class that cannot be instantiated directly, but can be extended by other classes. It serves as a blueprint for other classes to derive from and provides common functionality that can be inherited by its subclasses.
- An abstract class cannot be instantiated, meaning we cannot create objects of it, but we can use it as a template for creating other classes that extend it.

---

### **Interface v/s Abstract Class**

| Interface                                   | Abstract Class                                       |
| ------------------------------------------- | ---------------------------------------------------- |
| Classes can implement multiple interfaces.  | Classes can implement only one abstract class.       |
| Can have only abstract methods.             | Can have both abstract methods and concrete methods. |
| Methods are by default public and abstract. | Methods can have any access modifiers.               |
| Constructors are not allowed.               | Constructors are allowed.                            |
| Instance variables are not allowed.         | Instance variables are allowed.                      |

---

### **Runnable Interface**

- The Runnable interface is a functional interface in Java that defines a single abstract method run(). It is commonly used to define the code that should be executed in a new thread.

```

public class MyTask implements Runnable {
    private String message;

    public MyTask(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}

---

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask("Hello, world!");
        Thread thread = new Thread(task);
        thread.start();
    }
}

```

---

### **Callable Interface**

- The Callable interface is similar to the Runnable interface, but it allows a task to return a result and throw a checked exception. The Callable interface defines a single call() method that returns a generic type V.

---

### **Abstract Method**

- An abstract method is a method that is declared in an abstract class or an interface but does not have an implementation.
- It serves as a template or a contract for the derived classes or implementing classes to provide their own implementation.

---

### **Marker Interface**

- A marker interface is an empty interface that does not contain any methods.
- It is used to mark or tag classes that implement it, indicating that they possess a certain behavior or characteristic.
- Examples of marker interfaces in Java include `Serializable`, `Cloneable`, and `Remote`.

---

### **Cloneable Interface**

- The Cloneable interface in Java is a marker interface.
- It is used to indicate that an object can be cloned using the `clone()` method.
- `clone()` method in Java creates a shallow copy of the object, which means that the cloned object will share references with the original object for its non-primitive fields. If you need to create a deep copy of an object, you would need to implement custom logic in the `clone()` method to create a completely independent copy of the object, including its non-primitive fields.

---

### **Serializable Interface**

- The Serializable interface in Java is a marker interface.
- Serializable interface in Java is used to indicate that an object's state can be converted into a stream of bytes and then be restored back into an object again.
- This process is known as serialization and deserialization, respectively

---

### **Functional Interface**

- Functional interface is an interface that has exactly one abstract method.
- Functional interfaces are also known as single abstract method (SAM) interfaces.
- They can have any number of default methods or static methods

---

### **Anonymous Class**

- An anonymous class is a type of inner class that is defined and instantiated at the same time without explicitly declaring a class name.
- Anonymous classes are typically used for creating short, one-time-use classes with limited functionality.
- They cannot define constructors or static members, and not being able to implement multiple interfaces.
- They are best suited for use cases where a full-fledged named inner class or a separate standalone class may be unnecessary.

```

interface MyNewInterface {
    void doSomething();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous class that implements MyInterface
        MyNewInterface myObj = new MyNewInterface() {

        @Override
        public void doSomething() {
            System.out.println("Anonymous class implementing doSomething()");
        }
};

          // Invoking the method of the anonymous class
          myObj.doSomething();
      }

}

```

---

### **Inheritance**

- Inheritance allows one class to inherit properties and methods from another class.
- The class that is being inherited from is called the superclass or parent class, and the class that inherits is called the subclass or child class.
- Inheritance is achieved using the keyword `extends` and then the subclass can access the non-private fields and methods of its superclass as if they were its own.

```

class Animal {
protected String name;

      public Animal(String name) {
          this.name = name;
      }

      public void speak() {
          System.out.println("I am an animal.");
      }

}

class Cat extends Animal {
    public Cat(String name) {
    super(name);
}

      public void speak() {
          System.out.println("I am a cat.");
      }

}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Generic Animal");
        Animal cat1 = new Cat("Fluffy");

          animal1.speak(); // Output: I am an animal.
          cat1.speak(); // Output: I am a cat.
          dog1.speak(); // Output: I am a dog.
      }

}

```

---

### **public**

- `public` is an access modifier that can be applied to classes, methods, and fields.
- `public` members can be accessed from any other class or package.
- `public` members can be inherited by subclasses.
- `public` members are visible to all other classes and packages.
- `public` members have no access restrictions.

---

### **private**

- `private` is an access modifier that can be applied to classes, methods, and fields. When a class, method, or field is marked as private, it can only be accessed within the same class in which it is declared.
- `private` members can only be accessed within the same class in which they are declared.
- `private` members cannot be inherited by subclasses.
- `private` members are not visible to other classes or packages.
- `private` members have the most restrictive access.

---

### **protected**

- `protected` is an access modifier that can be applied to classes, methods, and fields. When a class, method, or field is marked as protected, it can be accessed within the same class, within subclasses, and within the same package.
- `protected` members can be accessed within the same class, within subclasses, and within the same package.
- `protected` members can be inherited by subclasses.
- `protected` members are not visible to other classes or packages.
- `protected` members have more access than private members, but less access than public members.

---

### **Default**

- Default method
- It is a method defined within an interface that provides a default implementation

```

public interface MyInterface {
    default void myMethod() {
        System.out.println("This is a default method.");
    }
}

```

- Default access modifier
- When a class, method, or variable is declared with no access modifier, it has "default" or "package-private" access. This means that it can only be accessed by classes within the same package.

```

class MyClass {
    int myVariable; // default access modifier
}

```

---

### **Predicate**

- `Predicate` is a functional interface introduced in the Java 8 release as part of the java.util.function package. It represents a single argument function that takes an input and returns a boolean value, indicating whether the input satisfies a certain condition.
- The Predicate interface is commonly used for filtering or testing elements based on a specific criterion.

```

public class PredicateExample {
public static void main(String[] args) {
List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "watermelon");

      // Create a Predicate to filter words with length greater than 5
      Predicate<String> lengthGreaterThan5 = word -> word.length() > 5;

      // Filter the list based on the Predicate
      List<String> filteredList = filterList(words, lengthGreaterThan5);

      System.out.println("Filtered List: " + filteredList); // [banana, orange, watermelon]

}

public static List<String> filterList(List<String> list, Predicate<String> predicate) {
// Create a new list to store the filtered elements
List<String> filteredList = new ArrayList<>();

      // Iterate over the list and apply the Predicate to each element
      for (String element : list) {
          if (predicate.test(element)) {
              filteredList.add(element);
          }
      }

      return filteredList;

    }
}

```

---

### **StreamAPI**

- Stream API in Java provides a way to process collections of objects in a declarative and functional style.
- It is part of the Java Collections Framework.
- It provides a set of operations that can be performed on streams, such as filtering, mapping, sorting, and reducing.

```

List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

// create a stream from the list
Stream<String> stream = list.stream();

// filter the stream to only include elements starting with "a"
Stream<String> filteredStream = stream.filter(s -> s.startsWith("a"));
//find element using filter
String firstLongFruit = fruits.stream()
.filter(fruit -> fruit.length() > 6)
.findFirst()
.orElse("No long fruit found");

// map the filtered stream to uppercase strings
Stream<String> mappedStream = filteredStream.map(String::toUpperCase);
// Map elements
List<Integer> fruitLengths = fruits.stream()
.map(String::length)
.toList();
System.out.println("Fruit lengths: " + fruitLengths); // Output: [5, 6, 6, 4, 10]

//Reduce elements
int sum = fruits.stream()
.mapToInt(String::length)
.sum();
System.out.println("Total length: " + sum); // Output: 31

// print the mapped stream to the console
mappedStream.forEach(System.out::println);

```

---

### **Lambda Expression**

- Lambda Expression provide a concise way to express functionality that can be passed around like data.
- A lambda expression is a compact piece of code that is used to represent an anonymous function (a function without a name) that can be passed as an argument to a method or stored as a variable. It consists of parameters, the arrow operator, and a body.

```

public class HelloWorld {
    public static void main(String[] args) {
        Runnable hello = () -> System.out.println("Hello, world!");
        hello.run();
    }
}

---

public class HelloWorld {
    public static void main(String[] args) {
        IntBinaryOperator add = (a, b) -> a + b;
        int result = add.applyAsInt(3, 5);
        System.out.println("3 + 5 = " + result);
    }
}

---

public class HelloWorld {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        int stringLength = length.apply("Hello, world!");
        System.out.println("Length of string: " + stringLength);
    }
}

---

public class HelloWorld {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "!");
        List<Integer> lengths = strings.stream()
        .map(s -> s.length())
        .collect(Collectors.toList());
        System.out.println("Lengths: " + lengths);
    }
}

---

public class HelloWorld {
    public static void main(String[] args) {
        Runnable hello = System.out::println;
        hello.run("Hello, world!");
    }
}

```

---

### **Transient**

- `transient` keyword is used to mark a class variable as not being serialized during object serialization. Serialization is the process of converting an object into a stream of bytes, so that it can be saved to a file or sent over a network.
- When a variable is marked as transient, its value will not be saved as part of the serialization process. Instead, when the object is deserialized (i.e., converted back from a stream of bytes into an object), the transient variable will be set to its default value (i.e., null for object types, 0 for numeric types, and false for boolean types).
- Some fields of an object may not be suitable for serialization. For example, fields that contain temporary or sensitive data, or fields that are derived from other fields and can be calculated when needed, may not need to be serialized.

```
class MyClass implements Serializable {
    private transient String myTransientString;
    private String nonTransientField;
}
```

---

### **volatile**

- `volatile` keyword is used as a modifier for a variable to indicate that the variable's value may be changed by multiple threads simultaneously.
- It ensures certain visibility and ordering guarantees for that variable's access.
- Key properties

  - Visibility: When a variable is declared as volatile, any read or write operation on that variable is guaranteed to be visible to all threads. This means that changes made by one thread to a volatile variable are immediately visible to other threads without the need for explicit synchronization.
  - Atomicity: The volatile keyword guarantees atomic reads and writes for the variable. This ensures that, when a thread reads a volatile variable, it sees a complete value, and when a thread writes to a volatile variable, it writes the complete value without being interrupted by other threads.

- It's important to note that volatile does not provide a general-purpose replacement for all synchronization mechanisms. It's primarily used for simple scenarios where variables are read and written independently and not involved in compound operations that need atomicity. For more complex synchronization requirements, other mechanisms like synchronized blocks or classes from the java.util.concurrent package are typically used.

---

### **Enum**

- Enums are used to define collections of values that are treated as distinct types.

```
enum AnimalType {
    MAMMAL,
    REPTILE,
    BIRD,
    AMPHIBIAN,
    FISH
}

class Animal {
    private String name;
    private AnimalType type;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }
}
```

---

### **Garbage Collection**

- Garbage Collection is the process of automatically reclaiming unused memory by destroying unused objects.
- Garbage Collection is an automated process of managing the memory in Java. It helps to free up the memory space occupied by the objects that are no longer being used by the program.
- Garbage Collection is one of the key features of Java that helps to make Java a memory-safe language.
- In c/c++ programmer is responsible for both creation and destruction of objects, forgetting to destroy can cause memory leaks and ultimately lead to out of memory errors
- When an object is created, it takes up a certain amount of memory on the heap. When the object is no longer being used, it becomes eligible for garbage collection. The garbage collector then frees up the memory space occupied by the object, making it available for other objects to use.
- Java provides automatic garbage collection, which means that the programmer does not have to explicitly free up memory. The garbage collector runs periodically, or when the heap becomes full, and identifies objects that are no longer being used by the program. It then frees up the memory space occupied by these objects.
- Java programs are compiled into byte code that can run in the JVM, objects are created in the heap space.
- Heap space will have Dead & Alive objects
  - Dead - objects that are no longer referenced will the detected by the GC and deleted.
  - Alive -

#### Phases in Garbage Collection

- Three phases
  - Mark : During this phase, the garbage collector traverses all objects in the heap and marks those that are still in use. It typically starts with the root objects (objects directly accessible by the program) and recursively marks all reachable objects.
  - Sweep : In this phase, the garbage collector scans the entire heap and reclaims memory occupied by unmarked (unreachable) objects. These unmarked objects are considered garbage and are removed from memory.
  - Compact : In this phase, the garbage collector compacts the memory by moving all live (marked) objects to one contiguous block of memory, eliminating or reducing fragmentation.

#### Types of GC

- Serial GC
- Concurrent Mark Sweep GC
- Garbage First GC (default)
- Epsilon GC
- Shenandoah GC
- ZGC

---

### **Garbage Collection in Java 11**

- One of the major changes in Java 11 is the introduction of a new garbage collector called the Z Garbage Collector (ZGC).
- ZGC is a low-latency garbage collector that can handle heaps ranging from a few hundred megabytes to several terabytes in size, with a maximum pause time of 10ms. It is designed to reduce the impact of garbage collection on the application's performance and improve overall throughput.
- Another change in Java 11 is the introduction of the Epsilon garbage collector. The Epsilon garbage collector is a no-op garbage collector that is intended for use in scenarios where the application does not need any garbage collection. It is designed to eliminate the overhead of garbage collection and improve the performance of applications that do not generate garbage.

---

### **Threads**

- Threads are a fundamental concept for concurrent programming.
- Threads are lightweight processes within a Java application that allow it to perform multiple tasks concurrently.
- You can create threads in Java by extending the Thread class or by implementing the Runnable interface.
- Multithreading in Java refers to the concurrent execution of multiple threads within a single Java program.

```
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Message " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getId() + " interrupted.");
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}

O/P
---
Thread 11: Message 0
Thread 12: Message 0
Thread 11: Message 1
Thread 12: Message 1
Thread 11: Message 2
Thread 12: Message 2
Thread 11: Message 3
Thread 12: Message 3
Thread 11: Message 4
Thread 12: Message 4

```

---
