package creational.factory;

public class Email implements Message {
    @Override
    public void send() {
        System.out.println("Email send");
    }
}
