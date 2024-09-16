package commands;

import actors.TextEditor;
import formattors.TextFormattingStrategy;

public class FormatTextCommand implements TextEditorCommand{

    private TextFormattingStrategy textFormattingStrategy;

    private TextEditor textEditor;

    private String textToFormat;

    public FormatTextCommand(TextEditor textEditor, TextFormattingStrategy textFormattingStrategy, String textToFormat) {
        this.textEditor = textEditor;
        this.textFormattingStrategy = textFormattingStrategy;
        this.textToFormat = textToFormat;
    }

    @Override
    public void execute() {
        System.out.println("Formatting the text");
        String formattedText = textFormattingStrategy.format(textToFormat);
        textEditor.setCurrentText(formattedText);
    }
}
