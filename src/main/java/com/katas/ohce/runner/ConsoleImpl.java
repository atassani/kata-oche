package com.katas.ohce.runner;

import com.katas.ohce.Console;

/**
 * Created by atassani on 05/06/16.
 */
public class ConsoleImpl implements Console {
    public void print(String text) {
        System.out.println(text);
    }

    public String read() {
        return System.console().readLine();
    }
}
