package com.katas.ohce;

/**
 * Created by toni.tassani on 13/06/2016.
 */
public class Notifier {
    private final Console console;

    public Notifier(Console console) {
        this.console = console;
    }

    public void notify(String reversedText, String originalText) {
        console.print(reversedText);
        if (originalText.equals(reversedText))
            console.print("¡Bonita palabra!");
    }
}
