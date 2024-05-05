package JavaDesignPatterns.State;

public class Canvas {
    private  Tool currentTool;

    public  void mouseDown () {
        currentTool.mouseDown();
//    if (currentTool == ToolType.SELETION)
//        System.out.println("Selection Icon");
//        else if (currentTool == ToolType.BRUSH)
//            System.out.println("Brush Icon");
//        else if (currentTool == ToolType.ERASER)
//        System.out.println("Eraser Icon ");
    }

    public void mouseUp() {
        currentTool.mouseUp();
//        if (currentTool == ToolType.SELETION)
//            System.out.println("Draw dashed rectangle");
//        else if (currentTool == ToolType.BRUSH)
//            System.out.println("Draw a line");
//        else if (currentTool == ToolType.ERASER)
//            System.out.println("Erase Something");

    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
