package Mediator;

public class Main {

    public static void main(String[] args)
    {
        DialogBox dialogBox = new DialogBox();
        dialogBox.mimickTextBoxUpdatedAction("Hello world!!!");
        dialogBox.mimickTextBoxUpdatedAction("");
    }
}