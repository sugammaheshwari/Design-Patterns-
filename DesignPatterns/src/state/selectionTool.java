package state;

public class selectionTool implements tool {

    @Override
    public void mouseUp() {
        System.out.println("Selection Tool Mouse up action");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Tool Mouse down action");
    }
}
