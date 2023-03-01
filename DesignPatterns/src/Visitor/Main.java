package Visitor;
public class Main {

    public static void main(String[] args)
    {
        var htmlDoc = new HtmlDocument();
        htmlDoc.addHtmlNode(new HtmlHeading());
        htmlDoc.addHtmlNode(new HtmlAnchor());

        Operation highlightOperation = new DeHighlightOperation();

        htmlDoc.doOperation(highlightOperation);
    }
}
