# **Core Java: Interview Question Bank**

# Table of Contents
- [public static void main](#publicstaticvoidmain)
- [Constructors
](#Constructors)
- [super](#super)
- [Section 2](#section-2)
- [Section 3](#section-3)
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
---

### **String v/s String Builder v/s String Builder**
---

### **static**
---

### **final**
---

### **finally**
---

### **finalize**
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

### **Abstract Class**

---


