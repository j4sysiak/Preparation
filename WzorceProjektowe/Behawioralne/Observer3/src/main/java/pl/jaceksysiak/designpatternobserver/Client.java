package pl.jaceksysiak.designpatternobserver;

import org.junit.Test;

public class Client {

    @Test
    public void test() {

        Blog blog = new Blog();
        blog.subscribe(new User("Jacek"));
        blog.subscribe(new User("Adam"));
        blog.subscribe(new User("Wacek"));
        blog.startWork();
    }
}
