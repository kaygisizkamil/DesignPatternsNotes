package creational.factory;

public class TextMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending text message");
    }
}
