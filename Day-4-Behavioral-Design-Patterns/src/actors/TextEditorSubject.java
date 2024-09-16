package actors;

import observers.TextConsoleObserver;
import observers.TextEditorObserver;

public interface TextEditorSubject {

    // Register the observers
    void registerObserver(TextEditorObserver observer);

    // Remove the observers
    void removeObserver(TextConsoleObserver observer);

    // Notify the observers
    void notifyObservers();
}
