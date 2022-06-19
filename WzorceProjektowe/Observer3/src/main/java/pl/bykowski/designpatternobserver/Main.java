package pl.bykowski.designpatternobserver;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.subscribe(new User("Przemysław"));
        blog.subscribe(new User("Adam"));
        blog.startWork();
    }
}
