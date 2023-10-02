package pl.jaceksysiak.designpatternobserver;

public class Test {

    @org.junit.Test
    public void test() {

        Blog blog = new Blog();
        blog.subscribe(new User("Jacek"));
        blog.subscribe(new User("Adam"));
        blog.subscribe(new User("Wacek"));
        blog.startWork();
    }
}
