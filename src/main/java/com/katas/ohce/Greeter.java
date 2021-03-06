package com.katas.ohce;

/**
 * Created by toni.tassani on 08/06/2016.
 */
public class Greeter {
    private static final String MORNING_GREETING = "¡Buenos días %s!";
    private static final String AFTERNOON_GREETING = "¡Buenas tardes %s!";
    private static final String NIGHT_GREETING = "¡Buenas noches %s!";
    private static final String GOODBYE_GREETING = "Adios %s";

    private final Console console;
    private final Clock clock;
    private final String name;

    public Greeter(Console console, Clock clock, String name) {
        this.console = console;
        this.clock = clock;
        this.name= name;
    }

    public void greetHello() {
        int hour = clock.hour();
        String greeting = null;
        if (hour > 6 && hour <= 12)
            greeting = MORNING_GREETING;
        else if (hour > 12 && hour <= 20)
            greeting = AFTERNOON_GREETING;
        else if ((hour > 20 && hour <= 24) || (hour >=0 && hour <= 6))
            greeting = NIGHT_GREETING;
        console.print(String.format(greeting, name));
    }

    public void greetGoodBye(String name) {
        console.print(String.format(GOODBYE_GREETING, name));
    }
}
