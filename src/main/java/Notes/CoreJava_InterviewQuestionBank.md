# **Core Java: Interview Question Bank**

# Table of Contents
- [public static void main](#publicstaticvoidmain)
- [Primitive](#Primitive)
- [Constructors](#Constructors)
- [super](#super)
- [String](#String)
- [String v/s StringBuilder v/s StringBuffer](#Stringv/sStringBuilderv/sStringBuffer)
- [Section 2](#section-2)
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
   - Stores java command line arguments.     
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
---

### **Constructors**
 - Constructors in Java are special methods that are used to create objects of a class.
 -  They are called automatically when an object is created using the `new` keyword.
 -  They are used to initialize the state of the object. 
 -  Constructors have the same name as the class and do not have a return type, not even void.
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

    Overloading Constructors:
    
---

### **super**
 - `super` can be used to refer immediate parent class instance variable.
 - `super` can be used to invoke immediate parent class instance method.
 - `super` can be used to invoke immediate parent class constructor.

    ```
    super.name;
    super.getName();
    super(name);
    ```  
---

### **String**
 - `String` is a class that represents a sequence of characters. Strings are widely used in Java programming, and they are used to store and manipulate text-based data such as names, addresses, and other textual information.
 - `String` in Java are reference types, which means that they are actually objects that contain a reference to a memory location where the string's characters are stored. This is in contrast to primitive types (like int or char), which are not objects and are stored directly in memory.
---

### **String v/s String Builder v/s String Buffer**
| String | String Builder | String Buffer |
| --------------- | --------------- | --------------- |
| `String` objects are immutable, meaning that once a String object is created, its contents cannot be changed. Any modifications to a String object actually create a new String object with the modified content. | `StringBuilder` is a mutable class that allows you to modify a string's content without creating a new object. | `StringBuffer` is a mutable class that allows you to modify a string's content without creating a new object. |
| This makes String objects thread-safe and secure  | StringBuilder objects are not thread-safe and should not be used in a multi-threaded environment  | `StringBuffer` objects are thread-safe and can be used in a multi-threaded environment  |
| Slow  | Faster than `String`  |  `StringBuffer` is thread-safe, making it ideal for multi-threaded environments  |
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
| static  | instance |
|----------|----------|
| Static members can be accessed using the class name. | Instance members can only be accessed through an instance of the class. |
| Static members are allocated memory only once, regardless of the number of instances created. | Instance members are allocated memory for each instance of the class. |
| Static members have class-level scope. | Instance members have instance-level scope. |
| Static members are used when you want to share data or functionality across all instances of a class. | Instance members are used when you want to have different data or functionality for each instance of a class. |

---

### **final**
 - `final` keyword is used to declare entities that cannot be modified.
 -  When `final` is applied to a variable, the value of the variable cannot be changed once it is initialized.
 - When `final` is applied to a method, the method cannot be overridden in the subclasses.  
 - When `final` is applied to a class, the class cannot be subclassed.
---

### **finally**
 -  `finally` keyword is used to define a block of code that will be executed after a try block, whether an exception is thrown or not. It is often used to perform cleanup operations like closing a file or releasing a resource that was opened in the try block.
---

### **finalize()**
 - `finalize()` is a method in Java that is called by the garbage collector when an object is no longer being used and is about to be garbage collected. 
 - The purpose of `finalize()` is to give an object a chance to perform any necessary cleanup operations before it is destroyed.
 - The `finalize()` method is defined in the Object class, so all classes in Java have a `finalize()` method inherited from Object. By default, the `finalize()` method does nothing, so if a class needs to perform cleanup operations, it should override this method.
---

### **Exception handling**
---

### **Custom Exception**
---

### **Throw**
---

### **Throws**
---

### **Wrapper Classes**
 - Wrapper classes are classes that provide a way to use primitive data types as objects.
 - Wrapper classes provide several useful methods for working with primitive data types.
 - Each primitive data type has a corresponding wrapper class.
---

### **Collection**
---

### **Collection v/s Collections**
---

### **List**
---

### **Set**
---

### **Map**
---

### **Queue**
---

### **Threads**
---

### **Comparable**
---

### **Comparator**
---

### **Transient**
---

### **Generics**
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
---

### **Interface v/s Abstract Class**
| Interface  | Abstract Class |
|----------|----------|
| Classes can implement multiple interfaces. | Classes can implement only one abstract class. |
| Can have only abstract methods. | Can have both abstract methods and concrete methods. |
| Methods are by default public and abstract. | Methods can have any access modifiers. |
| Constructors are not allowed. | Constructors are  allowed. |
| Instance variables are not allowed. | Instance variables are  allowed. |

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
    -------------------

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
   -  It is a method defined within an interface that provides a default implementation
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

    // map the filtered stream to uppercase strings
    Stream<String> mappedStream = filteredStream.map(String::toUpperCase);

    // print the mapped stream to the console
    mappedStream.forEach(System.out::println);
    ```
---

### **Lambda**

---


