# Minimum RESTful Web Service
> Spring Framework, Spring Boot, Maven, Jetty, Java 1.8  
> Open ResTfulWebServiceApplication Java Class in:  
> src->main->java->com.dido.mrws and then run the Class

##### in your browser, put this url:
- http://localhost:8080/person

##### for chrome you need open: 
> chrome://extensions/  
> and add -> "JSON Formatter" to format the json result  

Now you see something like that:  
> {  
> "id": 1,  
> "name": "Hello, enter param -> ?name=value",  
> "lastName": "enter param -> ?lastName=value",  
> "age": null,  
> "address": "enter param -> ?address=value",  
> "example": "http://localhost:8080/person?name=Adam&lastName=Hall&age=26&address=Seattle, Washington"  
> }  

Click in "example" url, and feel free to modify @RequestParam

### Bibliography:
- https://spring.io/guides/gs/rest-service/
