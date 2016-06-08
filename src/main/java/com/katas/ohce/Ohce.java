package com.katas.ohce;

/**
 * Created by atassani on 03/06/16.
 */
public class Ohce {
    private final Console console;
    private final Clock clock;

    public Ohce(Console console, Clock clock) {
        this.console = console;
        this.clock = clock;
    }

    public void run(String name) {
        Greeter greeter = new Greeter(console, clock, name);
        greeter.greetHello();
    }
}
