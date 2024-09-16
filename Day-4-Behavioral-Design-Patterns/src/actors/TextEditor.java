package actors;

import observers.TextConsoleObserver;
import observers.TextEditorObserver;

import java.util.ArrayList;
import java.util.List;

public class TextEditor implements TextEditorSubject{

    List<TextEditorObserver> observersList = new ArrayList<>();

    private String currentText = "";

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }

    @Override
    public void registerObserver(TextEditorObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(TextConsoleObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TextEditorObserver observer: observersList){
            observer.update(this.currentText);
        }
    }
}
