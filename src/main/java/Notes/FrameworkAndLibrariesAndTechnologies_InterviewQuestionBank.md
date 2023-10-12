# **Framework, Libraries and Technologies: Interview Question Bank**

### **HTTP Requests**

- HTTP is the protocol used by web browsers and servers to communicate and exchange information.
- An HTTP request is a message sent by a client, typically a web browser or an application, to request data from a server.
- HTTP request typically consists of the following components:

  - HTTP Method: This indicates the type of request being made, such as GET, POST, PUT, DELETE, etc. Each HTTP method has a specific purpose, such as retrieving data (GET), submitting data (POST), updating data (PUT), or deleting data (DELETE).
  - URL (Uniform Resource Locator): This specifies the web address of the resource being requested. It includes the protocol (e.g., http:// or https://), the domain name (e.g., www.example.com), and the path to the resource (e.g., /images/pic.jpg).
  - Headers: These are key-value pairs that provide additional information about the request, such as the type of data being sent, the language preference, caching settings, and more. Headers are used to convey meta-information about the request to the server.
  - Body (optional): This is the data, such as form data or JSON, that is sent as part of the request. It is typically used in POST, PUT, and DELETE requests to send data to the server.

- Once the HTTP request is sent to the server, the server processes the request and generates an HTTP response, which is sent back to the client with the requested data. The response typically contains a response status code indicating the outcome of the request (e.g., 200 OK, 404 Not Found, etc.), headers with additional information, and optionally, a response body with the requested data.

---

### **REST API**

- A REST API (Representational State Transfer Application Programming Interface) is a type of web API that uses HTTP requests to perform operations on data.

---

### **Authentication v/s Authorization**

- Authentication : Authentication is the process of verifying the identity of a user, system, or entity to ensure they are who they claim to be.
- Authorization : Authorization, also known as access control, is the process of determining what actions or operations an authenticated user or entity is allowed to perform on a system or resource.

---

### **REST API Authentication**

- Basic Authentication:
  - Clients send a username and password with each request.
  - Typically used with HTTPS for security.
  - Simple but not the most secure option.
- Token-Based Authentication:
  - Clients receive a token (e.g., JWT) upon successful login.
  - The token is included in the request headers for subsequent API calls.
  - Tokens can carry user-related information and have expiration times.
- OAuth 2.0:
  - An authorization framework used for delegating access to a third-party application without exposing the user's credentials.
  - Provides various grant types (authorization code, client credentials, implicit, resource owner password credentials).
  - Popular for securing APIs used by mobile and web applications.
- API Keys:
  - Clients include an API key in the request headers to authenticate.
  - Simple and commonly used for rate limiting and access control.
  - Typically not suitable for user authentication.
- Bearer Token:
  - Similar to token-based authentication, but the token is referred to as a "bearer token."
  - Clients include the token in the request headers with the "Bearer" prefix.
- OpenID Connect (OIDC):
  - An extension of OAuth 2.0 that provides identity information about the user in addition to authentication.
  - Often used for single sign-on (SSO) and user identity management.
- HMAC (Hash-based Message Authentication Code):
  - Clients generate a hash of the request data and a secret key, which is included in the request headers.
  - Requires a shared secret between the client and server.
- Session-Based Authentication:
  - Clients authenticate once (e.g., using a username and password) and receive a session token.
  - The session token is stored on the server, and a session ID or cookie is sent to the client.
  - Commonly used in web applications but less common in pure REST APIs.
- Client Certificates (Mutual SSL):
  - Both the client and server have SSL certificates, and mutual authentication is performed during the SSL handshake.
  - Used in scenarios where server-to-client trust is important.
- Custom Authentication:
  - Implement custom authentication mechanisms tailored to specific application requirements.
  - Can include multi-factor authentication (MFA), biometric authentication, or any other unique methods.

---

### **Basic Auth in HTTP**

- Create HTTPS connection.
- Set up Basic Authentication Header
  - By encoding username and password, and add it to a Basic Authentication Header.
- Send the Authentication header as request.
- Characteristics
  - Security: Basic Authentication transmits credentials with every request, so it's crucial to use it over HTTPS to ensure the confidentiality of the credentials during transmission.
  - Statelessness: Basic Authentication is stateless. Each request should contain the necessary authentication information, and the server does not maintain session or user state between requests.
  - Efficiency: Basic Authentication is efficient for simple authentication needs but may not be suitable for more complex scenarios. For improved performance, you might consider using tokens or sessions once the user's identity is confirmed.
  - Authentication Overhead: Authenticating with each request can create additional overhead, especially if the authentication process is time-consuming or resource-intensive. Caching or using stateful sessions can help mitigate this.

---

### **JWT**

- JSON Web Token is a standard that defines a compact and self-contained way to transmit information between parties as a JSON object. JWTs are commonly used for authentication and authorization in web applications and APIs.
- Authentication and authorization is performed by sending them in the HTTP Authorization header of a request to an API. The JWT is then verified on the server-side to ensure that it is valid and that the user has the necessary permissions to access the requested resource.
- A JWT is composed of three parts:
  - Header: The header contains metadata about the JWT, such as the type of token and the hashing algorithm used to generate the signature.
  - Payload: The payload contains claims, which are statements about an entity (typically the user) and additional metadata. Claims can be used to provide information such as the user's identity, role, or permissions.
  - Signature: The signature is used to verify that the message has not been tampered with and that the sender is who they claim to be.
- Characteristics
  - Token-Based: JWT is a token-based authentication method. Instead of sending the username and password with each request, the server issues a JWT token to the client upon successful login. The client includes this token in the request headers for subsequent API calls.
  - Stateless or Stateful: JWT can be used in both stateless and stateful scenarios. In a stateless setup, the server can verify the token without needing to maintain session data. In a stateful setup, the server may validate the token and maintain session information on the server side.
  - Transmission: JWTs are typically transmitted over HTTPS, but the data contained within a JWT is digitally signed (and optionally encrypted) to ensure its integrity and confidentiality.
  - Versatile: JWTs can carry additional claims (metadata) about the user or client, making them versatile for various authentication and authorization scenarios. These claims can be used to convey information such as user roles, permissions, and expiration time.
  - Scalable: JWTs are commonly used in distributed and microservices architectures, as they allow for authentication across different services or applications without the need to maintain shared sessions.

---

### **Bearer Token**

- A bearer token is a type of access token used in OAuth 2.0 authentication. It is a security token that is used to grant access to a protected resource, such as a REST API.
- A bearer token is essentially a string of characters that is generated by the authorization server after the user has provided their credentials. The token is then sent to the client (such as a web or mobile application) and included in the header of each subsequent API request to access the protected resource.
- Bearer tokens are typically short-lived and can be invalidated by the authorization server if they are compromised or stolen.

---

### **Spring Boot Actuator**

- Spring Boot Actuator is a sub-project of Spring Boot that provides endpoints and tools for monitoring and managing a Spring Boot application. Spring Boot Actuator provides several features, including:
  - Health checks
  - Metrics
  - Auditing
  - Environment and configuration
  - Endpoints

---

### **ControllerAdvice**

- `@ControllerAdvice` is an annotation used to define global exception handlers that are applied to all controllers in an application.
- When an exception occurs during the execution of a controller method, Spring Boot looks for an appropriate exception handler to handle the exception. If no specific exception handler is found, Spring Boot looks for a global exception handler defined using the `@ControllerAdvice` annotation.
- This can be useful for handling common exceptions such as NullPointerException, IllegalArgumentException, or IllegalStateException.

  ```
  @ControllerAdvice
  public class GlobalExceptionHandler {

    @ExceptionHandler(value = {NullPointerException.class, IllegalArgumentException.class})
    public ResponseEntity<Object> handleException(Exception ex) {
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  ```

---

### **Spring Stereotype annotation**

---

### **OAuth 2.0**

---

### **OIDC**

---

### **IAM**

---

### **Keycloak**

- Keycloak is an open-source identity and access management (IAM) solution that provides authentication, authorization, and single sign-on capabilities for web applications, mobile apps, and services. It allows organizations to secure their applications and APIs by managing user identities, enforcing access policies, and handling user authentication and authorization.

---

### **JPA**

---

### **Hibernate**

---

### **Hibernate Interfaces**

---

### **Hibernate Caches**

- Hibernate provides several caching mechanisms to improve the performance of database operations. These caching mechanisms help reduce the number of trips to the database and minimize the time required to fetch or store data

  - First-level Cache (Session Cache): Also known as the session cache, it is the default and most basic cache provided by Hibernate. It operates at the session level and stores entities and their associated data within the context of a single Hibernate session. It helps in reducing database round trips by caching and reusing the retrieved entities during the session.

  - Second-level Cache: The second-level cache is a shared cache that operates at the session factory level. It caches objects across multiple sessions, allowing data to be shared among different sessions and reducing the need for repeated database queries. Hibernate supports various second-level cache providers, such as Ehcache, Infinispan, Hazelcast, and more.

  - Query Cache: The query cache is used to cache the results of queries. When enabled, the query results are stored in the cache based on the query parameters. Subsequent executions of the same query with the same parameters can be served from the cache without hitting the database.

  - Collection Cache: Hibernate also provides a cache for collections, such as one-to-many or many-to-many associations. It allows caching of the associated collection elements, improving the performance of fetching related entities.

---

### **Hibernate Locks**

---

### **Hibernate v/s JPA**

---

### **JPA Repository**

---

### **DispatcherServlet**

- DispatcherServlet plays a crucial role as the front controller for handling requests and managing the overall request-response workflow. It acts as a central entry point for incoming requests and delegates the request processing to specific handler components within the application.
- It provides a structured approach to handle and process web requests and promotes the separation of concerns by routing requests to appropriate handlers, integrating with view technologies, and supporting various web application features through configuration and customization.

---

### **Dependency Injection**

- Dependency Injection (DI) is a design pattern and a software development technique used in object-oriented programming to achieve Inversion of Control (IoC) and enhance the modularity, testability, and maintainability of software applications.
- DI involves providing an object with the dependencies it needs (i.e., other objects or services) rather than having it create or manage those dependencies itself. This inversion of control shifts the responsibility of managing dependencies from the object to an external entity (usually a DI container or framework).

---

### **Inversion of Control**

- Inversion of Control (IoC) is a design principle and architectural concept in software development where the control over the flow of a program's execution is shifted from the program itself to an external framework or container.
- It is a way of inverting the traditional flow of control in a software application.

---

### **Spring Boot**

---

### **Beans in Spring Boot**

- In Spring Boot, beans are created using a process called "dependency injection". Dependency injection is a design pattern in which objects are passed their dependencies instead of creating them themselves. This pattern is implemented by the Spring framework, and it allows for loosely-coupled and easily testable code.
- When a Spring Boot application starts up, the Spring framework scans the project for classes that are annotated with @Component, @Service, @Controller, @Repository, or @Configuration. These annotations indicate that a class should be treated as a bean, and Spring creates an instance of the class and registers it in its container.

---

### **Controller v/s RestController**

| Controller                                                                                                                                                                                                                                                           | RestController                                                                                                                                                                                                                                                                                                                                                                                                                     |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `@Controller` annotation is used to define a controller class in Spring MVC. Controllers are primarily used for handling traditional web-based applications where the response can be in various forms, such as HTML pages, JSON/XML responses, file downloads, etc. | `@RestController` annotation is a specialized version of the Controller annotation that combines @Controller and @ResponseBody. It is used to define controllers specifically for building RESTful APIs where the response is typically in JSON/XML format. The @ResponseBody annotation is applied to the methods within a RestController to indicate that the return value should be serialized directly into the response body. |

---

### **Profile in Spring Boot**

- Profiles are a feature that allows you to configure and customize your application based on different environments or deployment scenarios. Profiles provide a way to have multiple sets of configuration properties and beans within a single codebase, enabling you to switch between different configurations easily.

---

### **Qualifiers in Spring Boot**

- Qualifiers are used to differentiate between beans of the same type when multiple instances of a bean exist in the application context.

  ```
  @Component
  @Qualifier("fooQualifier")
  public class FooBean implements MyInterface {
      // ...
  }

  @Component
  @Qualifier("barQualifier")
  public class BarBean implements MyInterface {
      // ...
  }
  ------------
  @Service
  public class MyService {

  private final MyInterface myInterface;

  public MyService(@Qualifier("fooQualifier") MyInterface myInterface) {
      this.myInterface = myInterface;
  }
  }

  ```

---

### **@Autowired**

---

### **Microservices**

---

### **API Gateway**

- API Gateway is a server or service that acts as an entry point for a collection of microservices or backend services in a distributed computing environment.

---

### **Load Balancing in API Gateway**

---

### **Service Discovery**

---

### **Eureka Server**

---

### **@FeignClient**

---

### **Transactional**

---

### **Docker**

---

### **Docker file contents**

---

### **Kubernetes**

---

### **Queueing Libraries**

- Queueing libraries, also known as message queuing libraries or message broker libraries, are software components or frameworks that provide functionalities for implementing message queues, message brokering, and asynchronous communication patterns in distributed systems.
- These libraries play a crucial role in building scalable, resilient, and decoupled architectures by enabling various components of a system to communicate asynchronously through messages

---

### **Apache Kafka**

---

### **Rabbit MQ**

---

### **MQTT/Mosquito**

---

### **Redis**

- Redis is an open-source, in-memory data store and caching system that can be used as a database, message broker, and cache.

---

### **hystrix**

---

### **Swagger**

---

### **EC2**

---

### **Amplify**

---

### **DynamoDB**

---

### **Lambda**

---

### **HTTP Requests**

---

### **Lazy Loading**

- Lazy loading is a technique in which related data is loaded from the database only when it is explicitly requested

---

### **Eager Loading**

- Eager Loading is the strategy of fetching and loading related data from the database in a single query, along with the main object, at the time the main object is retrieved.

---

### **Singleton**

- Singleton pattern is a creational design pattern that restricts the instantiation of a class to ensure that there is only one instance of that class in the entire application.
- It guarantees that a class has only one instance and provides a global point of access to that instance
- Singleton pattern is often used to control access to a resource, manage a shared resource, or maintain a single point of control, such as a configuration manager or a connection pool.
- Key characteristics

  - Private Constructor: The Singleton class has a private constructor, preventing external code from creating instances of the class directly.
  - Private Static Instance: It typically contains a private static instance of the class itself.
  - Public Static Method: It provides a public static method that allows access to the unique instance. This method creates the instance if it doesn't exist or returns the existing instance

  ```
  public class Singleton {
    // Private static instance
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        // Initialization code, if needed
    }

    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the Singleton
  }
  ```

---

### **Ways to prevent SQL Injection**

- <u>Use Parameterized Queries (Prepared Statements)</u>: Instead of concatenating user input directly into SQL statements, use parameterized queries or prepared statements provided by your programming language or database framework.
- <u>Input Validation and Sanitization</u>: Validate and sanitize user input to ensure it adheres to expected formats and patterns. Perform input validation both on the client side (using JavaScript or HTML input attributes) and on the server side.
- <u>Avoid Dynamic SQL</u>: Avoid dynamically constructing SQL queries using string concatenation, especially when incorporating user input. Instead, use query builders or Object-Relational Mapping (ORM) frameworks that provide safe and automated methods for building and executing SQL queries.
- <u>Least Privilege Principle</u>: Ensure that database users used by your application have the least privileges necessary to perform their tasks. Restrict the permissions granted to database accounts to only the required operations and limit access to sensitive data or system functionality.

---

### **SOLID principles**

- SOLID is an acronym representing a set of five design principles that are widely used in object-oriented programming to create maintainable, flexible, and understandable software
- They are are considered fundamental guidelines for writing clean and well-structured code.

#### Single Responsibility Principle (SRP)

- A class should have only one reason to change or only one responsibility

#### Open/Closed Principle (OCP)

- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification

#### Liskov Substitution Principle (LSP)

- LSP states that derived class must be completely substitutable for their base classes. i.e., if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behaviour of the program.
- Derived classes should adhere to the contract established by their base classes and should not change the expected behavior.

#### Interface Segregation Principle (ISP)

- Do not force client to use methods that they do not want to use.

#### Dependency Inversion Principle (DIP)

- High-level modules should not depend on low-level modules. Both should depend on abstractions.

---

### **Design Patterns**

---

### **Microservices Architecture**

- Event driven architecture

---

### **Categories of Design Patterns**

- Creational Patterns
- Structural Patterns
- Behavioral Patterns
- Architectural Patterns
- Concurrency Patterns

---
