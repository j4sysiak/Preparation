package com.company;

import org.junit.jupiter.api.Test;

public class TestClient {


    @Test
    public void test() {
     var requestContext = RequestContext.builder()
             .request(Request.builder().entityId(101).userId(14).userRole("User").build())
             .response(Response.builder().build())
             .build();

        System.out.println("budujemy prosty łańcuch zależnoći");

        //definiujemy łańcuch 1
        var resultHandler = ResultHandler.builder()
                .next(null)  // na początku nic nie wstrzykujemy do next (IHandler)
                .build();

        //definiujemy łańcuch 2
        var validationHandler = ValidationHandler.builder()
                .next(resultHandler)  // wstrzykujemy kolejne ogniwo resultHandler do next (IHandler)
                .build();

        //definiujemy łańcuch 3
        var authorizationHandler = AuthorizationHandler.builder()
                .next(validationHandler)  // wstrzykujemy kolejne ogniwo validationHandler do next (IHandler)
                .build();

        // Start proces
        System.out.println("wywołanie procesu zaczynamy od wywołania pierwszego handlera");
        authorizationHandler.handle(requestContext);

        System.out.println("IsSuccessful: " + requestContext.response.isSuccessful);
        System.out.println("Message: " + requestContext.response.message);
        System.out.println("Data: " + requestContext.response.data);
    }
}
