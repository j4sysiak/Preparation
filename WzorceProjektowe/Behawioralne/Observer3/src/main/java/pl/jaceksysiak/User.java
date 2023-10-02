package pl.jaceksysiak;

public class User implements MailObserver {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void sendNewsletter(String mail) {
        System.out.println(name + " got email! " + mail);
    }
}
