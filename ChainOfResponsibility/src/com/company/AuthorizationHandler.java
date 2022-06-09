package com.company;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class AuthorizationHandler extends BaseHandler {

    // słownik jaki zasób dostępny dla danego usera
    // creating a My HashTable Dictionary
    static Map<Integer, Integer> entityOwners = new Hashtable() {};
    static {
        entityOwners.put(100, 13);
        entityOwners.put(101, 14);
    }

    public AuthorizationHandler(IHandler next) {
        super(next);
    }

    @Override
    public void handle(RequestContext requestContext) {
        if (requestContext.request.userRole == "Admin") {
            next.handle(requestContext);
        }
        // sprawdzamy, czy w słowniku istnieje taki obiekt
        if (Objects.equals(entityOwners.get(requestContext.request.entityId), requestContext.request.userId)) {
               next.handle(requestContext);
        }
        requestContext.response.isSuccessful = false;
        requestContext.response.message = "User is not authorized";
    }
}
