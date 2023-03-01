package Visitor;

public class HtmlHeading implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
