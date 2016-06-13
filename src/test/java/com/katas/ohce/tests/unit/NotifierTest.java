package com.katas.ohce.tests.unit;

import com.katas.ohce.Console;
import com.katas.ohce.Notifier;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by toni.tassani on 13/06/2016.
 */
public class NotifierTest {

    private Notifier notifier;
    private Console console;
    private Mockery context;

    @Before
    public void init() {
        context = new Mockery();
        console = context.mock(Console.class);
        notifier = new Notifier(console);
    }

    @Test
    public void testNotifier_not_palindrome() {
        context.checking(new Expectations() {{
            oneOf(console).print("aloh");
        }});

        notifier.notify("aloh", "hola");

        context.assertIsSatisfied();
    }

    @Test
    public void testNotifier_palindrome() {
        context.checking(new Expectations() {{
            oneOf(console).print("oto");
            oneOf(console).print("¡Bonita palabra!");
        }});

        notifier.notify("oto", "oto");

        context.assertIsSatisfied();
    }
}
