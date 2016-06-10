package com.katas.ohce.tests.unit;

import com.katas.ohce.Clock;
import com.katas.ohce.Console;
import com.katas.ohce.Greeter;
import com.katas.ohce.Ohce;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

/**
 * Created by atassani on 05/06/16.
 */
public class GreetingTest {
    @Test
    public void testGreetingName() {
        Mockery context = new Mockery();
        final Console console = context.mock(Console.class);
        final Clock clock = context.mock(Clock.class);

        context.checking(new Expectations() {{
            oneOf(clock).hour();
            will(returnValue(10));
            oneOf(console).print("¡Buenos días Un nombre raro!");
        }});

        Greeter greeter = new Greeter(console, clock, "Un nombre raro");
        greeter.greetHello();

        context.assertIsSatisfied();
    }

    @Test
    public void testGreetingMorning() {
        Mockery context = new Mockery();
        final Console console = context.mock(Console.class);
        final Clock clock = context.mock(Clock.class);

        context.checking(new Expectations() {{
            oneOf(clock).hour();
            will(returnValue(10));

            oneOf(console).print("¡Buenos días Toni!");
        }});
        Greeter greeter = new Greeter(console, clock, "Toni");

        greeter.greetHello();

        context.assertIsSatisfied();
    }

    @Test
    public void testGreetingAfternoon() {
        Mockery context = new Mockery();
        final Console console = context.mock(Console.class);
        final Clock clock = context.mock(Clock.class);
        context.checking(new Expectations() {{
            oneOf(clock).hour();
            will(returnValue(16));

            oneOf(console).print("¡Buenas tardes Toni!");

        }});

        Greeter greeter = new Greeter(console, clock, "Toni");

        greeter.greetHello();

        context.assertIsSatisfied();
    }

}
