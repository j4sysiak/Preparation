package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPIv2;
import co.devfoundry.adapter.api.LibraryAPIv2Impl;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        User user = new User("Paweł","Cwik","32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user,apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}
