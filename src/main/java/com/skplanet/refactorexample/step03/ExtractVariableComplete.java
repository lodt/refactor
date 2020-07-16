package com.skplanet.refactorexample.step03;

// Refactor > Introduce Variable
@SuppressWarnings({"unused"})
public class ExtractVariableComplete {

    private void stringExtractVariable() {
        String name = "abc";
        String nameUpper = name.toUpperCase();

        System.out.println(nameUpper);
        System.out.println(name);
        System.out.println(name);
    }

    private void objectExtractVariable() {
        Animal animal = new Dog();

        System.out.println(animal);
        System.out.println(animal.name());
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
