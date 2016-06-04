package com.katas.ohce.tests.acceptance;

import com.katas.ohce.Clock;
import com.katas.ohce.Console;
import com.katas.ohce.Ohce;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

/**
 * Created by atassani on 03/06/16.
 */
public class AcceptanceTest {
    @Test
    public void test() {
        Mockery context = new Mockery();
        final Console console = context.mock(Console.class);
        final Clock clock = context.mock(Clock.class);
        Ohce ohce = new Ohce(console, clock);

        context.checking(new Expectations() {{
            oneOf(clock).hour();
            will(returnValue(10));

            exactly(4).of(console).read();
            will(onConsecutiveCalls(
                    returnValue("hola"),
                    returnValue("oto"),
                    returnValue("stop"),
                    returnValue("Stop!")
            ));

            oneOf(console).print("¡Buenos días Pedro!");
            oneOf(console).print("aloh");
            oneOf(console).print("oto");
            oneOf(console).print("¡Bonita palabra!");
            oneOf(console).print("pots");
            oneOf(console).print("Adios Pedro");
        }});

        ohce.run("Pedro");
        context.assertIsSatisfied();
    }
}
