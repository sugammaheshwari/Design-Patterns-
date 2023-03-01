package Visitor;

public interface Operation {
    void apply(HtmlAnchor htmlAnchor);
    void apply(HtmlHeading htmlHeading);
}
