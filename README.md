# DataStructuresAndAlogrithms

http://www.java2blog.com/2016/09/data-structure-and-algorithm-interview-questions-in-java.html
http://www.java2blog.com/2015/08/java-interview-programs.html

Implement BST - Binary Search Tree

REST founder - Roy Fielding also the author of HTTP Spec

Service Definition
-For SOAP - WSDL
-For REST - Nothing but used something like WADL,HATEOAS

SOAP follows SOAP Web service specification
REST(REpresentational State Transfer) - No Spec but there are Guidelines - 

REST - 

1. RESOURCE LOCATION
Example of Resource based URI(nouns not verbs)
weatherapp.com/zipcode/12345
For filtering and pagination use query params
/messages?offset=10&limit=30

2 types of resource URIs 1. Instance resource URIs ex: /messages/{messageId} 2. Collection resource URIs ex :  /messages

2. HTTP Methods
GET(get info),POST(save new),PUT(update),DELETE(delete info),[head,options(rare)]

Repeatable Operations - GET,DELETE,PUT
Non-Repeatable Operations - POST

3. HTTP Status Codes(metadata)
200 - Ok , 201 Created(Post rescource created), 204 No Content (DELETED resource)

4XX - are client screwsup something when sending a request
404 - Not found ,  400 Bad Request (Server unable to understand request[wrong format/data]), 401 - Unauthorized, 403 Forbidden,
415 - Unsupported Media Type(Client speaks in a format that cannot be understood by the Server)

5XX - are server screwsup something when sending a response
500 - Server Error, 

4. Http Headers (metadata)
Content Types : text/xml,application/json

Guidelines for naming Resource URI
Video 3 & 4.


JAX-RS
------


@Path("/url")
@GET,@POST - http methods annotated with methods
@Produces(MediaType.*) - send back the response in the sepcified format





