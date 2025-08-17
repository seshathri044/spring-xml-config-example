# Spring XML Config Example

A simple Java project demonstrating **Dependency Injection** in Spring using **XML-based bean configuration**.  
This example covers:

- **Constructor Injection**
- **Setter Injection**
- **Autowiring by Name**
- Working with Interfaces and their Implementations

## 📌 Overview
This project uses a `student` class that depends on a `Writer` interface (implemented by `Pen` and `Pencil`).  
Spring is configured to inject these dependencies via **XML** without manually creating objects in code.

## 🛠 Technologies Used
- Java 21
- Spring Framework (XML-based configuration)
- Maven
- IntelliJ IDEA Community Edition

## 📂 Project Structure
```bash
src/main/java/org/example/
App.java # Main class, loads Spring context
student.java # Dependent class (needs Writer)
Pen.java # Implements Writer
Pencil.java # Implements Writer
Writer.java # Interface
src/main/resources/
springconfig.xml # Spring bean configuration
```
## ⚙️ Spring Config (`springconfig.xml`)
Spring Context(New Version	7.0.0-M8)
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>7.0.0-M7</version>
</dependency>
```
Example bean configuration:
```xml
<bean id="st1" class="org.example.student">
    <!-- Constructor Injection -->
    <constructor-arg index="0" ref="p1"/>
    <constructor-arg index="1" value="25"/>
</bean>

<bean id="p1" class="org.example.Pen"/>
<bean id="pc1" class="org.example.Pencil"/>
```
### Injection Types Demonstrated:
- Constructor Injection
```xml
<constructor-arg index="0" ref="p1"/>
<constructor-arg index="1" value="25"/>
```
- Setter Injection (commented example in XML)
```xml
<property name="age" value="30"/>
<property name="writer" ref="p1"/>
```
- Autowiring by Name (commented example in XML)
```xml
<bean id="st1" class="org.example.student" autowire="byName"/>
```
### ▶️ How to Run
Clone this repository:
```bash
git clone https://github.com/your-username/spring-xml-config-example.git
cd spring-xml-config-example
```
Build and run using Maven:
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="org.example.App"
```
### 📖 Learning Points
- How to configure beans in springconfig.xml
- How to inject dependencies using constructor, setter, and autowire
- How Spring manages object creation (IoC)
- How interfaces and multiple implementations work with dependency injection
