package com.katas.ohce;

/**
 * Created by toni.tassani on 09/06/2016.
 */
public class Reverser {
    public String reverse(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}
