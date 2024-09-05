# Representational State Transfer

## Table of Contents
1. [Introduction](#introduction)
2. [RESTful Web Services](#restful-web-services)
3. [RESTful API](#restful-api)
4. [RESTful Methods](#restful-methods)
5. [RESTful Endpoints](#restful-endpoints)
6. [RESTful Status Codes](#restful-status-codes)
7. [RESTful Security](#restful-security)
8. [RESTful Best Practices](#restful-best-practices)


## Introduction

REST (Representational State Transfer) is an architectural style that defines a set of constraints to be used for creating web services. Web services that conform to the REST architectural style are known as RESTful web services.


## RESTful Web Services

RESTful web services are built to work best on the web. Representational State Transfer (REST) is an architectural style that specifies constraints, such as the uniform interface, that if applied to a web service induce desirable properties, such as performance, scalability, and modifiability, that enable services to work best on the Web.


## RESTful API

A RESTful API is an application program interface (API) that uses HTTP requests to GET, PUT, POST, and DELETE data. A RESTful API -- also referred to as a RESTful web service -- is based on representational state transfer (REST) technology, an architectural style and approach to communications often used in web services development.


## RESTful Methods

The following are the most commonly used RESTful methods:

1. GET: Retrieve information about the REST API's resources.
2. POST: Create a new resource.
3. PUT: Update a resource.
4. DELETE: Remove a resource.
5. PATCH: Update partial resources.
6. HEAD: Retrieve headers only.
7. OPTIONS: Retrieve the supported operations in the REST API.
8. TRACE: Retrieve the path of the request.
9. CONNECT: Convert the request connection to a transparent TCP/IP tunnel.


## RESTful Endpoints

A RESTful endpoint is a URL pattern that identifies a resource. The following are examples of RESTful endpoints:

1. /users
2. /users/{id}
3. /users/{id}/orders
4. /users/{id}/orders/{order_id}


## RESTful Status Codes

The following are the most commonly used RESTful status codes:

1. 200 OK: The request has succeeded.
2. 201 Created: The request has been fulfilled and has resulted in one or more new resources being created.
3. 204 No Content: The server successfully processed the request and is not returning any content.
4. 400 Bad Request: The server could not understand the request due to invalid syntax.
5. 401 Unauthorized: The client must authenticate itself to get the requested response.
6. 403 Forbidden: The client does not have access rights to the content.
7. 404 Not Found: The server can not find the requested resource.
8. 405 Method Not Allowed: The method specified in the request is not allowed.
9. 500 Internal Server Error: The server has encountered a situation it doesn't know how to handle.
10. 503 Service Unavailable: The server is not ready to handle the request.
11. 504 Gateway Timeout: The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server.
12. 505 HTTP Version Not Supported: The server does not support the HTTP protocol version used in the request.


## RESTful Security

The following are the most commonly used RESTful security mechanisms:

1. Basic Authentication: The client sends a base64-encoded username and password in the Authorization header.
2. Token-Based Authentication: The client sends a token in the Authorization header.
3. OAuth: The client sends an access token in the Authorization header.
4. JWT (JSON Web Token): The client sends a JWT in the Authorization header.
5. CORS (Cross-Origin Resource Sharing): The client sends an Origin header.
6. HTTPS: The client sends requests over a secure HTTPS connection.
7. CSRF (Cross-Site Request Forgery): The server sends a CSRF token in the request body.
8. SQL Injection: The server validates and sanitizes the input data.
9. XSS (Cross-Site Scripting): The server validates and sanitizes the input data.


## RESTful Best Practices

The following are the best practices for building RESTful web services:

1. Use nouns instead of verbs in the URL.
2. Use plural nouns in the URL.
3. Use sub-resources for relations.
4. Use query parameters for filtering.
5. Use HTTP headers for serialization formats.
6. Use HTTP status codes to indicate the result of the request.
7. Use API versioning.
8. Use HATEOAS (Hypermedia as the Engine of Application State).
9. Use HTTPS for secure communication.
10. Use OAuth for authentication.
11. Use JWT for authorization.
12. Use CORS for cross-origin requests.
13. Use CSRF tokens for cross-site request forgery protection.
14. Use SQL injection protection.
15. Use XSS protection.
16. Use rate limiting to prevent abuse.
17. Use caching to improve performance.
18. Use logging and monitoring to track usage.
19. Use error handling to provide feedback.

