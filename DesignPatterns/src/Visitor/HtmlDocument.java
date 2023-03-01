package Visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> htmlNodes = new ArrayList<>();

    public void addHtmlNode(HtmlNode newHtmlNode)
    {
        htmlNodes.add(newHtmlNode);
    }

    public void doOperation(Operation operation)
    {
        for(HtmlNode htmlNode:htmlNodes)
        {
            htmlNode.execute(operation);
        }
    }
}
