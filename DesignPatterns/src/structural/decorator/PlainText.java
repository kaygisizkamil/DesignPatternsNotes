package structural.decorator;

public class PlainText implements Text {
    String content;
    public PlainText(String content) {
        this.content=content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
