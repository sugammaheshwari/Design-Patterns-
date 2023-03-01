package Visitor;

public class DeHighlightOperation implements Operation {
    @Override
    public void apply(HtmlAnchor htmlAnchor) {
        System.out.println("html anchor dehighlighted!!!!");
    }

    @Override
    public void apply(HtmlHeading htmlHeading) {
        System.out.println("html heading dehighlighted!!!");
    }
}
