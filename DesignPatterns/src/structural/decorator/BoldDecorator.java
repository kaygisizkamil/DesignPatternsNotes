package structural.decorator;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(Text decorated) {
        super(decorated);
    }
    public String getContent(){
        return "<b>"+super.getContent()+"</b>";
    }
}
