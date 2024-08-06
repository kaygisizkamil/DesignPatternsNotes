package structural.decorator;

public class TextDecorator implements Text {
    protected Text decorated;

    public TextDecorator(Text decorated) {
        this.decorated = decorated;
    }

    @Override
    public String getContent() {
        return this.decorated.getContent();
    }
}
