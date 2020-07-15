package com.skplanet.refactorexample.step01;

// All - Actions
// Presentation Assistant
// Show Context Actions (Command + Enter)
// Refactor This...

import java.util.List;

public class IntroComplete {

    public boolean test(final int a, final int b) {
        return a > b ? true : false;
    }

    public void test2(final String s) {
        int a = Integer.valueOf(s);
    }

    public void test3(final List<String> words) {
        words.forEach(System.out::println);
    }
}