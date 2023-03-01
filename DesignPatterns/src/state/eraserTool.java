package state;

public class eraserTool implements tool {

    @Override
    public void mouseUp() {
        System.out.println("Eraser Tool Mouse up action");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Tool Mouse down action");
    }
}
