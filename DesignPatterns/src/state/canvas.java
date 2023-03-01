package state;

public class canvas {
    private tool toolType;

    public void setToolType(tool t)
    {
        toolType=t;
    }

    public void mouseUpCanvas()
    {
        System.out.println("Mouse Up on canvas");
        toolType.mouseUp();
    }

    public void mouseDownCanvas()
    {
        System.out.println("Mouse down on canvas");
        toolType.mouseDown();
    }
}
