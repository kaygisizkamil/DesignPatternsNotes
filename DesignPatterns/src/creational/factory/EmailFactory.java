package creational.factory;

public class EmailFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new Email();
    }
}
