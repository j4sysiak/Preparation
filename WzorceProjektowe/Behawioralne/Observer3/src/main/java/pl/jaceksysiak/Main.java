package pl.jaceksysiak;

public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog();

        MailObserver user1 = new User("Jacek");
        blog.addToSubscribents(user1);

        MailObserver user2 = new User("Adam");
        blog.addToSubscribents(user2);

        MailObserver user3 = new User("Wacek");
        blog.addToSubscribents(user3);

        blog.startWork();
        blog.startWork2();
    }
}