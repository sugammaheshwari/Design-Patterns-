package commandUndo;

public class Main {

    public static void main(String[] args)
    {
        HtmlDocument document= new HtmlDocument();
        History history = new History();
        BoldCommand boldCommand = new BoldCommand(history,document);
        UndoingCommand undo = new UndoingCommand(history);

        document.setContent("Hello world!");
        System.out.println(document.getContent());
        boldCommand.execute();
        System.out.println(document.getContent());
        undo.execute();
        System.out.println(document.getContent());
    }
}
