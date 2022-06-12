package com.company;

public class Client {

    public static void main(String[] args) {

        
     var requestContext = RequestContext.builder()
             .request(Request.builder().entityId(101).userId(14).userRole("User").build())
             .response(Response.builder().build())
             .build();

        System.out.println("budujemy prosty łańcuch zależnoći");

        var resultHandler = ResultHandler.builder()
                .next(null)
                .build();

        var validationHandler = ValidationHandler.builder()
                .next(resultHandler)
                .build();

        var authorizationHandler = AuthorizationHandler.builder()
                .next(validationHandler)
                .build();

        System.out.println("wywołanie procesu zaczynamy od wywołania pierwszego handlera");
        authorizationHandler.handle(requestContext);

        System.out.println("IsSuccessful: " + requestContext.response.isSuccessful);
        System.out.println("Message: " + requestContext.response.message);
        System.out.println("Data: " + requestContext.response.data);
    }
}
