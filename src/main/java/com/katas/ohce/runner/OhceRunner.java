package com.katas.ohce.runner;

import com.katas.ohce.Clock;
import com.katas.ohce.Console;
import com.katas.ohce.Ohce;

/**
 * Created by atassani on 05/06/16.
 */
public class OhceRunner {
    public static void main(String args[]) {
        Clock clock = new ClockImpl();
        Console console = new ConsoleImpl();
        Ohce ohce = new Ohce(console, clock);
        ohce.run(args[0]);
    }
}
