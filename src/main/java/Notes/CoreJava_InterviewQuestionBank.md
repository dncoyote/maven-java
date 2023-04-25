# **Core Java: Interview Question Bank**

[Abstract Class](#heading-3 "Goto Abstract Class")

### **Constructors**
 - Constructors in Java are special methods that are used to create objects of a class.
 -  They are called automatically when an object is created using the new keyword.
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

### **Interface**
 - An interface is a collection of abstract methods (methods without implementation) that can be used to define a contract that a class must adhere to. 
 - Interfaces are used to define common behavior that can be shared among multiple classes. 
 - They provide a way to achieve abstraction, multiple inheritance.
 - Constant variable, which is implicitly public, static, and final
 - `implements` keyword is used.
---

### **Abstract Class**
 - An abstract class is a class that cannot be instantiated directly, but can be extended by other classes. 
 - It serves as a blueprint for other classes to derive from and provides common functionality that can be inherited by its subclasses
---

### **Interface v/s Abstract Class**
| Interface        | Abstract Class           | 
| :------------- |:-------------| 
| col 3 is      | right-aligned | 
| Can have only abstract methods      | Can have both abstract methods and concrete methods      |  
| Constructors are not allowed. | Constructors are  allowed.      |    
| col 2 is      | centered      |  
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

### **Abstract Class**

---


