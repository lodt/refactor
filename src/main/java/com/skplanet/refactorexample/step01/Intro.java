package com.skplanet.refactorexample.step01;

// Presentation Assistant
// Search EveryWhere - All - Actions (Presentation Mode)
// Show Context Actions (Option + Enter)
// Refactor This...

import java.util.List;

@SuppressWarnings("unused")
public class Intro {

    public boolean test(final int a, final int b) {
        return a > b ? true : false;
    }

    public void test2(final String s) {
        int a = Integer.valueOf(s);
    }

    public void test3(final List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.println(word);
        }
    }

}
