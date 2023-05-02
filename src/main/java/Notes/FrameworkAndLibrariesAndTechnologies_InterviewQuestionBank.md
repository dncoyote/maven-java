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
---

### **REST API Authentication**
---

### **JWT**
 - JSON Web Token is a standard that defines a compact and self-contained way to transmit information between parties as a JSON object. JWTs are commonly used for authentication and authorization in web applications and APIs.
 - Authentication and authorization is performed by sending them in the HTTP Authorization header of a request to an API. The JWT is then verified on the server-side to ensure that it is valid and that the user has the necessary permissions to access the requested resource.
 - A JWT is composed of three parts: 
   - Header: The header contains metadata about the JWT, such as the type of token and the hashing algorithm used to generate the signature. 
   - Payload: The payload contains claims, which are statements about an entity (typically the user) and additional metadata. Claims can be used to provide information such as the user's identity, role, or permissions.
   - Signature: The signature is used to verify that the message has not been tampered with and that the sender is who they claim to be.
---

### **Bearer Token**
---

### **Spring Boot Actuator**
 - Spring Boot Actuator is a sub-project of Spring Boot that provides endpoints and tools for monitoring and managing a Spring Boot application. Spring Boot Actuator provides several features, including:
   - Health checks
   - Metrics
   - Auditing
   - Environment and configuration
   - Endpoints
  
---

### **Spring Stereotype annotation**
---

### **IAM**
---

### **Keycloak**
---

### **JPA**
---

### **Hibernate**
---

### **Hibernate v/s JPA**
---

### **JPA Repository**
---

### **Spring Boot**
---

### **@Autowired**
---

### **Microservices**
---

### **API Gateway**
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
---

### **Apache Kafka**
---

### **Message Queueing**
---

### **Rabbit MQ**
---

### **MQTT/Mosquito**
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

### **REST**
---

### **HTTP Requests**
---