package com.katas.ohce;

/**
 * Created by atassani on 03/06/16.
 */
public class Ohce {
    private static final String STOP_TEXT = "Stop!";
    private final Console console;
    private final Clock clock;

    public Ohce(Console console, Clock clock) {
        this.console = console;
        this.clock = clock;
    }

    public void run(String name) {
        Greeter greeter = new Greeter(console, clock, name);
        Reverser reverser = new Reverser();
        Notifier notifier = new Notifier(console);
        greeter.greetHello();
        String text = console.read();
        while (!STOP_TEXT.equals(text)) {
            String reversedText = reverser.reverse(text);
            notifier.notify(reversedText, text);
            text = console.read();
        }
        greeter.greetGoodBye(name);
    }
}
