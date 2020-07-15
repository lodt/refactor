package com.skplanet.refactorexample.step03;

// Refactor > Extract > Variable
@SuppressWarnings({"unused"})
public class ExtractVariable {

    private void stringExtractVariable() {
        System.out.println("abc");
        System.out.println("abc".toUpperCase());
        System.out.println("abc");
    }

    private void objectExtractVariable() {
        System.out.println(new Dog());
        System.out.println(new Dog().name());
    }

    private interface Animal {

        String name();
    }

    private static class Dog implements Animal {

        @Override
        public String name() {
            return "dog";
        }
    }
}
