
import behavioural.strategy.CreditCard;
import behavioural.strategy.PaymentContext;
import behavioural.strategy.Paypal;
import creational.factory.EmailFactory;
import creational.factory.Message;
import creational.factory.MessageFactory;
import creational.factory.TextMessageFactory;
import creational.singleton.Singleton;
import structural.adapter.Shape;
import structural.adapter.Square;
import structural.adapter.SquareAdapter;
import structural.decorator.BoldDecorator;
import structural.decorator.PlainText;
import structural.decorator.Text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       creationalTests();
       structuralTests();
       behaviouralTest();
    }
    public static void creationalTests(){
        singletonTest();
        factoryTest();
    }
    public static void singletonTest(){
        //ensure a class has only one instance used for database connection ,configuration etc.
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
    public static void factoryTest(){
        //define an interface for creating  an object but let the subclass alter the type of
        //the object to be created
        //abstract factory is also interface for creating objects for related or dependent objects
        //for real life e.g we have db as abstract product ,plsql and oracle are concrete products
        //connection factory is the creator with the create method
        MessageFactory messageFactory=new TextMessageFactory();
        Message message=messageFactory.createMessage();
        message.send();

        messageFactory=new EmailFactory();
        message=messageFactory.createMessage();
        message.send();

    }
    public static void structuralTests(){
        adapterTest();
        decoratorTests();
    }
    public static void adapterTest(){
        //allow incompatible interfaces to work together by providing a bridge
        //used in legacy system integration third party library integrations
        Square square=new Square();
        Shape shape=new SquareAdapter(square);
        shape.draw();

    }
    public static void decoratorTests(){
        //Dynamically add behavior to objects without modifying their structure useful for extending functionality
        //and reusable way
        Text text=new PlainText("By bye world");
        Text textBold =new BoldDecorator(text);
        System.out.println(textBold.getContent());
    }
    public static void behaviouralTest(){
        strategyTest();
    }
    public static void strategyTest(){
        //To be able to switch between algorithms dynamically make the code flexible
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setPayment(new CreditCard());
        paymentContext.executePayment(200);
        paymentContext.setPayment(new Paypal());
        paymentContext.executePayment(300);
    }

}