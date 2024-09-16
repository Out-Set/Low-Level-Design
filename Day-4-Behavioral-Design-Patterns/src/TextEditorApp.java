import actors.TextEditor;
import commands.FormatTextCommand;
import commands.TextEditorCommand;
import formattors.TextFormattingStrategy;
import formattors.UpperCaseStrategy;
import observers.TextConsoleObserver;
import observers.TextEditorObserver;

public class TextEditorApp {

    public static void main(String[] args) {

        // Need to create the Text Editor
        TextEditor textEditor = new TextEditor();

        // Text Editor observers
        TextEditorObserver observer = new TextConsoleObserver();

        // Register all the observers with the Text Editor
        textEditor.registerObserver(observer);

        textEditor.setCurrentText("Hello Students");

        // Formatters
        TextFormattingStrategy upperCaseStrategy = new UpperCaseStrategy();

        // Command to create the text
        TextEditorCommand command = new FormatTextCommand(textEditor, upperCaseStrategy, "Hello Students");

        command.execute();

        textEditor.notifyObservers();
    }
}
