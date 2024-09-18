# Spring Framework

## Table of Contents

1. [Introduction](#introduction)
2. [Why Spring](#why-spring)
3. [Spring Architecture](#spring-architecture)
4. [Spring Terminology](#spring-terminology)
5. [Spring Bean Scopes](#spring-bean-scopes)
6. [Spring Annotations](#spring-annotations)
7. [Spring IOC](#spring-ioc)
8. [Spring AOP](#spring-aop)
9. [Spring Profiles](#spring-profiles)
10. [Spring Command Line Runner](#spring-command-line-runner)
11. [Spring MVC](#spring-mvc)
12. [Spring Web](#spring-web)
13. [Spring Data](#spring-data)
14. [Spring Security](#spring-security)
15. [Spring Microservices](#spring-microservices)
16. [Spring Testing](#spring-testing)

## Introduction

Spring Framework is an open-source framework for building enterprise applications in Java. It provides a comprehensive
programming and configuration model for modern Java-based enterprise applications.

Spring Framework is widely used in the industry for developing web applications, microservices, and enterprise
applications. It provides a wide range of features and capabilities for building robust, scalable, and maintainable
applications.

## Why Spring

Spring Framework provides a number of benefits that make it a popular choice for building enterprise applications:

1. Embedded Application Server
2. Automatic Configuration
3. Pre-configured Starters
4. Ease of Packaging and Distribution
5. Ease of monitoring through built-in health check endpoint and the ability to customize the management endpoint.

Additionally, it comes with a lot of best practices and conventions baked in, which reduces the amount of work and
boilerplate code developers need to write.

## Spring Architecture

Spring Boot follows a layered architecture in which each layer communicates with the layer directly below or above (hierarchical structure) it.
There are four layers in Spring Boot are as follows:

- Presentation Layer: handles the HTTP requests, translates the JSON parameter to object, and authenticates the request
  and transfers it to the business layer.
- Business Layer: The business layer handles all the business logic. It consists of service classes and uses services
  provided by data access layers. It also performs authorization and validation.
- Persistence Layer: The persistence layer contains all the storage logic and translates business objects from and to
  database rows.
- Database Layer: In the database layer, CRUD (create, retrieve, update, delete) operations are performed.

We can use the following annotations to define the layers in Spring Boot:

- **@Repository**: It is used to indicate that the class provides the mechanism for storage, retrieval, search, update,
  and delete operation on objects.
- **@Service**: It is used to indicate that the class provides some business functionalities.
- **@Controller**: It is used to indicate that the class serves the incoming HTTP requests.
- **@Component**: It is a generic stereotype for any Spring-managed component.
- **@Configuration**: It is used to define the configuration classes in Spring Boot.

These animations indicate that the class should be initialized, configured and managed (dependency injection) by
Spring.

## Spring Terminology

Spring Core is the foundation of the Spring Framework, which provides a comprehensive programming
and configuration model for Java-based applications. Here are some key terms and
concepts related to Spring Core:

- **_Beans_**: an object managed by the Spring IoC container. It is an instance of a Java class that is
  configured in the Spring configuration file or using annotations. Spring IoC container is responsible for managing the
  lifecycle of Spring Beans, such as creating, initializing,
  configuring, and destroying them.
- **_Inversion of Control (IoC)_**: One of the main principles of Spring is Inversion of Control (IoC), which means that
  the
  Spring container is responsible for managing the lifecycle of beans and injecting their dependencies.
- **_Dependency Injection (DI)_**: Spring uses Dependency Injection (DI) to manage the dependencies between beans. In
  DI, an
  object’s dependencies are provided to it by the container, rather than the object creating or looking up its own
  dependencies.
- **_Container_**: The Spring container is the core part of the Spring Framework, which creates and manages beans and
  their
  dependencies.
- **_ApplicationContext_**: An ApplicationContext is an implementation of the Spring container. It is responsible for
  loading
  and managing the configuration metadata and creating the beans defined in that metadata.
- **_Aspect-Oriented Programming (AOP)_**: Spring supports Aspect-Oriented Programming (AOP), which allows you to
  separate
  cross-cutting concerns, such as logging or security, from the business logic of your application.
- **_Events_**: Spring provides an event model that allows beans to send and receive events. This is used to decouple
  the
  beans from each other, making the application more loosely coupled.
- **_ApplicationEvent and listener_**: Spring support publish a subscribed model for event handling, ApplicationEvent
  defines
  an event object, and the listener is a class that implements ApplicationListener interface, listening for the specific
  event and take the necessary action.
- **_Data Access_**: Spring provides a consistent, high-level abstraction for data access using various frameworks like
  JDBC,
  Hibernate, and JPA.
- **_Transactions_**: Spring provides a flexible, consistent and easy way to declaratively manage transactions with
  different
  underlying technologies such as JPA, JDBC, and Hibernate.
- **_Task Execution and Scheduling_**: Spring provides a TaskExecutor and TaskScheduler, providing a convenient way to
  run
  tasks concurrently, on a scheduled basis or asynchronously.
- **_Validation and Data Binding_**: Spring provides a powerful data binding mechanism that can bind request parameters
  to
  Java objects and validate the data using JSR-303 annotations.
- **_Internationalization and Localization_**: Spring provides support for internationalization and localization,
  allowing
  you to develop applications that can be easily localized for different languages and regions.
- **_Messaging_**: Spring provides support for messaging, allowing you to send and receive messages using various
  messaging
  technologies such as JMS, AMQP, and STOMP.
- **_Web_**: Spring provides a comprehensive web framework that can be used to develop web applications, RESTFul web
  services,
  and WebSocket applications.
- **_Security_**: Spring Security is a powerful and highly customizable authentication and access control framework for
  securing Spring-based applications.
- **_Testing_**: Spring provides support for testing Spring-based applications, including unit testing, integration
  testing,
  and end-to-end testing.
- **_Monitoring and Management_**: Spring provides support for monitoring and managing Spring-based applications,
  including
  health checks, metrics, and tracing.

## Spring Bean Scopes

In the Spring Framework, a bean is an object that is instantiated, assembled, and managed by the Spring IoC container.
One of the key features of the Spring container is its ability to manage the lifecycle of beans, which includes
creating, configuring, and destroying beans as necessary. One way the container can control the lifecycle of a bean is
by specifying its scope.

The scope of a bean determines the lifecycle and visibility of the bean within the container and to other objects in the
application. Spring provides several different bean scopes, including:

- **_singleton_**: This is the default scope for a bean. A singleton bean is instantiated only once by the container and
  shared by all objects that request it.
- **_prototype_**: This scope means that the container creates a new instance of the bean every time a request is made
  for it.
- **_request_**: This scope is only applicable to web applications and means that the container creates a new instance
  of the bean for each HTTP request.
- **_session_**: Similar to the request scope, but the instance of the bean is created for each HTTP session,
- **_application_**: This scope is for global application-level data, and only valid in a web-aware Spring
  ApplicationContext.
- **_websocket_**: This scope is for global WebSocket-level data, and also only valid in a web-aware Spring
  ApplicationContext.

## Spring Annotations

One of the key features of Spring Boot is its use of annotations, which are used to configure various aspects of the
application and to enable certain features.

Some of the most commonly used annotations in Spring Boot include:

- **@SpringBootApplication**: This annotation is used to mark the main class of a Spring
- **@Controller**: This annotation is used to mark a class as a controller in a Spring MVC application.
- **@RestController**: This annotation is used to mark a class as a RESTFul controller in a Spring MVC application.
- **@Service**: This annotation is used to mark a class as a service in a Spring application.
- **@Repository**: This annotation is used to mark a class as a repository in a Spring application.
- **@Component**: This annotation is used to mark a class as a Spring component.
- **@Configuration**: This annotation is used to mark a class as a configuration class in a Spring application.
- **@Bean**: This annotation is used to mark a method as a bean definition method in a Spring configuration class.
- **@Value**: This annotation is used to inject a value from a property file into a Spring bean.
- **@Autowired**: This annotation is used to inject a bean into another bean in a Spring application.
- **@Qualifier**: This annotation is used to specify which bean to inject when multiple beans of the same type are
  available.
- **@Profile**: This annotation is used to specify which beans should be loaded based on the active profile.
- **@PostConstruct**: This annotation is used to specify a method that should be executed after the bean has been
  initialized.
- **@PreDestroy**: This annotation is used to specify a method that should be executed before the bean is destroyed.
- **@RequestMapping**: This annotation is used to map a URL to a method in a Spring MVC controller.
- **@GetMapping**: This annotation is used to map a GET request to a method in a Spring MVC controller.
- **@PostMapping**: This annotation is used to map a POST request to a method in a Spring MVC controller.
- **@PutMapping**: This annotation is used to map a PUT request to a method in a Spring MVC controller.
- **@DeleteMapping**: This annotation is used to map a DELETE request to a method in a Spring MVC controller.
- **@PathVariable**: This annotation is used to extract a variable from the URL in a Spring MVC controller.
- **@RequestParam**: This annotation is used to extract a parameter from a request in a Spring MVC controller.
- **@RequestBody**: This annotation is used to extract the body of a request in a Spring MVC controller.
- **@ResponseBody**: This annotation is used to return the response body in a Spring MVC controller.
- **@ResponseStatus**: This annotation is used to set the HTTP status code of a response in a Spring MVC controller.
- **Environment**: This annotation is used to access the environment in a Spring application.
- **@ExceptionHandler**: This annotation is used to handle exceptions in a Spring MVC controller.
- **@EnableAutoConfiguration**: This annotation is used to enable Spring Boot's autoconfiguration feature.
- **@EnableConfigurationProperties**: This annotation is used to enable configuration properties binding in a Spring
  Boot application.
- **@EnableWebMvc**: This annotation is used to enable Spring MVC in a Spring Boot application.
- **@EnableJpaRepositories**: This annotation is used to enable JPA repositories in a Spring Boot application.
- **@EnableTransactionManagement**: This annotation is used to enable transaction management in a Spring Boot
  application.
- **@EnableCaching**: This annotation is used to enable caching in a Spring Boot application.
- **@EnableScheduling**: This annotation is used to enable scheduling in a Spring Boot application.
- **@EnableAsync**: This annotation is used to enable asynchronous processing in a Spring Boot application.
- **@EnableAspectJAutoProxy**: This annotation is used to enable AspectJ auto-proxying in a Spring Boot application.
- **@EnableGlobalMethodSecurity**: This annotation is used to enable global method security in a Spring Boot
  application.
- **@EnableResourceServer**: This annotation is used to enable a resource server in a Spring Boot application.
- **@EnableAuthorizationServer**: This annotation is used to enable an authorization server in a Spring Boot
  application.
- **PropertySource**: This annotation is used to specify the location of a property file in a Spring application.
  ...

## Spring IOC

Inversion of Control (IoC) is a design pattern often used in conjunction with the Dependency Injection (DI) pattern.
The basic idea behind the IoC is to invert the flow of control in a program,
so that instead of the program controlling the flow of logic and the creation of objects,
the objects themselves control the flow of logic and the creation of other objects.

The Spring IoC container creates objects, wires them together, configures them, and manages their complete lifecycle
from creation till destruction. This removes the burden of instantiating and configuring objects from the application
code, and allows the application code to focus on the business logic rather than on infrastructure concerns.

Spring IoC container provides two ways to configure the objects:

- XML based configuration
- Annotation based configuration (`@Configuration`, `@Bean`)

### Dependency Injection

Dependency Injection is a design pattern that allows decoupling the components of an application and managing their
dependencies. It is a fundamental concept in Spring Framework that helps to build modular, maintainable, and testable
applications.

There are some types of Dependency Injection:

1. **Constructor Injection**: Dependencies are injected through the constructor of a class.
2. **Setter Injection**: Dependencies are injected through setter methods of a class.
3. **Field Injection**: Dependencies are injected through fields of a class.
4. **Configuration Injection**: Dependencies are injected through configuration files.

## Spring AOP

Spring AOP (Aspect-Oriented Programming) is a feature of the Spring Framework
that allows developers to define certain behaviors (i.e., “aspects”)
that cut across multiple classes, such as logging or transaction management.
These behaviors, which are called “advices,” can be applied to specific “join points”
(i.e., points in the execution of a program) in the application, using “pointcuts” to determine where the advices should
be applied.

AOP Concepts:

- Aspect: A module that encapsulates behaviors affecting multiple classes into reusable modules.
- Join Point: A point during the execution of a program, such as the execution of a method or the handling of an
  exception.
- Advice: Action taken by an aspect at a particular join point.
- Pointcut: A predicate that matches join points.

Most Common Use Case of Advice:

1. Logging
2. Security
3. Transaction Management
4. Exception Handling
5. Performance Monitoring
6. Caching

Types of Advice:

- Before Advice: Run before the method execution
- After Returning Advice: Run after the method returns a result
- After Throwing Advice: Run after the method throws an exception
- After Advice: Run regardless of the method outcome
- Around Advice: Run around the method execution

## Spring Profiles

Allowing us to map our beans to different profiles, for example, dev, test, and prod.
The property needed to activate the environment is: spring.profiles.active
To mark the beans with the profile related to: `@Profile("test")` this can be set
in class level or even method level.

## Spring Command Line Runner

Spring Boot provides a convenient way to run code when the application starts up using the `CommandLineRunner`
interface. This interface provides a single `run` method that is called when the application starts up.

The `CommandLineRunner` interface is typically used to perform tasks such as initializing the application, loading
data, or running background tasks.

To create a `CommandLineRunner`, you can implement the `run` method and annotate the class with `@Component` or
`@Bean`.

```java

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Executing command line runner");
        for (int i = 0; i < 50; i++) {
            Faker faker = new Faker();
            Author author = Author.builder()
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .email(faker.internet().emailAddress())
                    .age(faker.number().numberBetween(19, 65))
                    .createdAt(LocalDateTime.now())
                    .createdBy("John Doe")
                    .build();
            repo.save(author);
        }
        List<Author> authors = repo.findAllByFirstNameStartsWithIgnoreCase("f");
        authors.forEach(System.out::println);
    }
}
```

## Spring MVC

Spring MVC is a framework for building web applications in Java. It is part of the Spring Framework, which is a larger
ecosystem of tools for building Java applications. Spring MVC is built on the Model-View-Controller (MVC) design
pattern, which helps to separate the concerns of the application into three distinct parts: the Model, the View,
and the Controller.

The Model represents the data of the application, the View represents the user interface, and the Controller
handles the user input and updates the Model and View accordingly.

Spring MVC provides a powerful and flexible way to build web applications, and it integrates well with other parts of
the Spring ecosystem, such as Spring Security for authentication and authorization, and Spring Data for data access.

A Spring MVC provides an elegant solution to use MVC in a spring framework with the help of DispatcherServlet. Here,
DispatcherServlet is a class that receives the incoming request and maps it to the right resource such as controllers,
models, and views.

Spring MVC Components:

1. **DispatcherServlet**: Front controller in Spring MVC that handles all the incoming requests and routes them to the
   appropriate controllers.
2. **Controller**: Handles the user input and updates the model and view accordingly.
3. **Model**: Represents the data of the application.
4. **View**: Represents the user interface.
5. **Handler Mapping**: Maps the incoming requests to the appropriate controller.
6. **View Resolver**: Resolves the view name to the actual view.

Advantages of Spring MVC:

- Separate roles: The Spring MVC separates each role, where the model object, controller, command object, view
  resolver, DispatcherServlet, validator, etc. can be fulfilled by a specialized object.
- Light-weight: It uses light-weight servlet container to develop and deploy your application.
- Powerful Configuration: It provides a robust configuration for both framework and application classes that includes
  easy referencing across contexts, such as from web controllers to business objects and validators.
- Rapid development: The Spring MVC facilitates fast and parallel development.
- Reusable business code: Instead of creating new objects, it allows us to use the existing business objects.
- Easy to test: In Spring, generally we create JavaBeans classes that enable you to inject test data using the setter
  methods.
- Flexible Mapping: It provides the specific annotations that easily redirect the page.

Example of a simple Spring MVC Controller:

```java

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
```

In this example, the `@Controller` annotation marks the class as a Spring MVC controller, and the `@GetMapping`
annotation
maps the `home` method to the root URL `/`. The method returns the name of the view `home`, which is resolved by the
view resolver.

Example of a simple Spring MVC View:

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<h1>Welcome to Spring MVC</h1>
</body>
</html>
```

In this example, the view `home.html` displays a welcome message using HTML.

## Spring Web

Stands for Representational State Transfer. It's an architectural style for designing networked applications. The REST
is about treating network resources as an object that can be accessed using standard HTTP

    Client-Server Architecture -> should both act independently
    Stateless -> each request from client to server must contain all the information needed to understand the request
    Cacheable -> server responses must define themselves as cacheable or not
    Uniform Interface -> Identification of resources, manipulation of resources through representations, Self-descriptive messages, Hypermedia As The Engine Of Application State (HATEOS)

Handling Exceptions

    @ExceptionHandler: Controller Exception Handler
    @ExceptionHandler with @ControllerAdvice: Global Exception Handler
    ResponseStatusException: We can create an instance of it providing an HttpStatus and optionally a reason and a cause
    HandlerExceptionResolver: define HandlerExceptionResolver. This will resolve any exception thrown by the application.

## Spring Data

## Spring Security

Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto
standard for securing Spring-based applications.
There are many ways to achieve authentication in Spring, such as:

    Basic Authentication: Basic authentication is a simple authentication method that involves sending a user’s credentials (username and password) in plain text with each request
    Form-based Authentication: Form-based authentication is a more secure authentication method that uses a login form to collect user credentials. The user enters their username and password into the form, which is then sent to the server for verification
    OAuth 2.0: is an open standard for authentication and authorization that allows users to grant third-party applications access to their resources without giving away their credentials
    JWT: Token-based authentication is a popular authentication method that involves generating a token (usually a JSON web token or JWT) that is sent to the client after successful authentication. The client includes the token with each later request to access protected resources. This method is stateless, scalable, and secure
    LDAP

## Spring Microservices

- Config Server, Service Registry, Circuit Breaker, API Gateway, Sleuth, Metrics, Databases and Message Brokers.

## Spring Testing

Spring provides a comprehensive testing support for unit testing, integration testing, and end-to-end testing.
Testing is an essential part of the software development process, as it helps to ensure that the application works
as expected and meets the requirements.

There are several types of testing that can be performed:

1. Unit Testing
2. Integration Testing
3. End-to-End Testing

### Unit Testing

Testing individual units or components of the application in isolation.
Unit is the smallest testable part of an application, such as a method or a class. The purpose of unit testing is to
verify that each unit of the application works correctly. **_Mocks_** are commonly used in unit testing.

- ***Mock***: In the development of tests, It is necessary to create an object of the component that we want to
  test, and for that,
  it is important to use mock objects to simulate the components.is an important concept in testing, as it allows
  creating a fake object that simulates the behavior of a real
  object.This is useful for testing the interactions between different components of the application. Using mock
  objects,
  we can test the component in an isolated environment, without depending on external services, resources or other
  dependencies.

Benefits of Unit Testing:

1. Automated Tests: Unit tests can be automated and run as part of the build process, ensuring that the code works as
   expected.
2. Better code design: Writing unit tests forces developers to write modular and testable code, which leads to better
   code design.
3. Fewer bugs and higher reliability: Unit tests help to identify bugs early in the development process, reducing the
   number of bugs in the code and increasing the reliability of the application.
4. DevOps and Continuous Integration: Unit tests are an essential part of the DevOps and Continuous Integration process,
   as they help to ensure that the application is working correctly after each code change.

Life Cycle of a Unit Test:

1. **Setup**: Prepare the test environment, such as creating mock objects or initializing the test data.
2. **Execution**: Run the test method to verify the behavior of the component.
3. **Assertion**: Verify the expected results of the test by using assertions.
4. **Teardown**: Clean up the test environment, such as releasing resources or closing connections.
5. **Repeat**: Repeat the process for each unit test in the test suite.

### Integration Testing

Testing the integration between different components of the application. These tests do not
require **mocks** because these tests propose is to test the interactions between the application layers.

Benefits of Integration Testing:

1. Test multiple components together: Integration tests verify that different components of the application work
   together correctly.
2. Identify integration issues: Integration tests help to identify issues that may arise when integrating different
   components of the application.

### Technologies

In Spring Framework, **Mockito** and **JUnit** are commonly used to write **unit tests**:

- ***JUnit***: is a popular testing framework for Java applications. It provides annotations to define test methods and
  test classes, as well as assertions to verify the expected results of the tests.
- ***Mockito*** is a mocking framework that allows creating mock objects for testing.
  It provides methods to define the behavior of the mock objects and verify the interactions with them.

For end-to-end testing, **Selenium** is an open-source tool for automating web browsers. It provides a set of APIs to
interact with web
elements and perform actions such as clicking buttons, entering text, and verifying the content of web pages.

### JUnit

JUnit is a popular testing framework for Java applications. It provides annotations to define test methods and test
classes, as well as assertions to verify the expected results of the tests.

JUnit Annotations:

1. **@Test**: Indicates that the method is a test method.
2. **@BeforeAll**: Executed before any test methods in the test class.
3. **@BeforeEach**: Executed before each test method.
4. **@AfterEach**: Executed after each test method.
5. **@AfterAll**: Executed after all test methods in the test class.
6. **@DisplayName**: Specify a custom display name for the test method or test class.
7. **@Disabled**: Indicates that the test method or test class is disabled and should not be executed.
8. **@EnabledOnOs**: Indicates that the test method or test class should be enabled on a specific operating system.
9. **@EnabledOnJre**: Indicates that the test method or test class should be enabled on a specific Java Runtime
   Environment.
10. **EnableForJreRange**: Indicates that the test method or test class should be enabled for a specific range of Java
    Runtime Environment versions.
11. **EnableIfEnvironmentVariable**: Indicates that the test method or test class should be enabled if a specific
    environment variable is set.
12. **@DisplayNameGeneration**: Specify a custom display name generator for the test class.
    - Simple: It generates a display name by replacing camel-case names with spaces.
    - ReplaceUnderscores: It generates a display name by replacing underscores with spaces.
    - IndicativeSentences: It generates a display name by converting camel-case names into sentences.
13. **Order**: Specify the order in which test methods should be executed.
14. **@TestMethodOrder**: Specify the order in which test methods should be executed.
15. **@ParameterizedTest**: Indicates that the method is a parameterized test method.
    - @CsvSource: Provides a CSV source for the parameterized test.
    - @CsvFileSource: Provides a CSV file source for the parameterized test.

JUnit Assertions:

1. **assertEquals(expected, actual)**: Asserts that the expected value is equal to the actual value.
2. **assertNotEquals(expected, actual)**: Asserts that the expected value is not equal to the actual value.
3. **assertTrue(condition)**: Asserts that the condition is true.
4. **assertFalse(condition)**: Asserts that the condition is false.
5. **assertNull(actual)**: Asserts that the actual value is null.
6. **assertNotNull(actual)**: Asserts that the actual value is not null.
7. **assertArrayEquals(expected, actual)**: Asserts that the expected array is equal to the actual array.
8. **assertIterableEquals(expected, actual)**: Asserts that the expected iterable is equal to the actual iterable.
9. **assertLinesMatch(expected, actual)**: Asserts that the expected lines match the actual lines.
10. **assertThrows(exceptionType, executable)**: Asserts that the executable throws the specified exception.
11. **assertTimeout(duration, executable)**: Asserts that the executable completes within the specified duration.
12. **assertTimeoutPreemptively(duration, executable)**: Asserts that the executable completes within the specified
    duration, preemptively interrupting it if it takes too long.

### Test Driven Development (TDD)

Test-Driven Development (TDD) is a software development process that involves writing tests before writing the code.
Instead of wiring the code first and then writing tests to verify its behavior, TDD reverses the process by writing
tests first and then writing the code to make the tests pass.

The TDD process typically involves the following steps:

1. Write a failing test: Write a test that verifies the behavior of the code you are about to write. The test should
   fail because the code does not exist yet.
2. Write the code: Write the code that makes the test pass. The code should be written to satisfy the requirements of
   the test.
3. Refactor the code: Refactor the code to improve its design, readability, and maintainability. The code should be
   refactored without changing its behavior.
4. Repeat: Repeat the process for each new feature or change in the code.

TDD Benefits:

1. Improved code quality: TDD helps to improve the quality of the code by ensuring that it is tested thoroughly.
2. Faster development: TDD can lead to faster development because it helps to identify issues early in the development
   process.
3. Better design: TDD encourages better design by focusing on the requirements of the code and writing tests to verify
   its behavior.
4. Increased confidence: TDD increases confidence in the code by providing a suite of tests that verify its behavior.
5. Reduced bugs: TDD helps to reduce bugs by identifying issues early in the development process.
6. Better documentation: TDD provides a form of documentation by describing the behavior of the code through tests.
7. Easier maintenance: TDD makes it easier to maintain the code by providing a suite of tests that can be run to verify
   its behavior.

### Testing Support in Spring

Spring provides a comprehensive testing support for unit testing, integration testing, and end-to-end testing. Spring
Testing Framework provides the following features:

1. **@SpringBootTest**: Annotation to test Spring Boot applications.
    - Loads the Spring ApplicationContext
    - Support for Spring dependency injection
    - You can access data from Spring `application.properties`
2. **@WebMvcTest**: Annotation to test Spring MVC controllers.
3. **@DataJpaTest**: Annotation to test JPA repositories.
4. **@MockBean**: Annotation to mock a bean in a Spring application context.
5. **@AutoConfigureMockMvc**: Annotation to auto-configure the MockMvc instance.