package Visitor;

public class HtmlAnchor implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
