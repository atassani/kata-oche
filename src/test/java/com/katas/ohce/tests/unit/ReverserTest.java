package com.katas.ohce.tests.unit;

import com.katas.ohce.Reverser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by toni.tassani on 09/06/2016.
 */
public class ReverserTest {
    private Reverser reverser;

    @Before
    public void init() {
        reverser = new Reverser();
    }

    @Test
    public void test_reverse_empty_string() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    public void test_reverse_string() {
        assertEquals("texto", reverser.reverse("otxet"));
    }

    @Test
    public void test_reverse_phrase() {
        assertEquals("one phrase", reverser.reverse("esarhp eno"));
    }

    @Test
    public void test_reverse_plaindrome () {
        assertEquals("sarabaras", reverser.reverse("sarabaras"));
    }
}
