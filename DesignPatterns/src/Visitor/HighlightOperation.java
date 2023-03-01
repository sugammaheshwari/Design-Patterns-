package Visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HtmlAnchor htmlAnchor) {
        System.out.println("html anchor highlighted!");
    }

    @Override
    public void apply(HtmlHeading htmlHeading) {
        System.out.println("html heading highlighted!!");
    }
}
