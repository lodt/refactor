package com.skplanet.refactorexample.step04;

// Refactor > Extract > Constant
// Refactor > Inline
// Refactor > Extract > Delegate
@SuppressWarnings({"unused"})
public class ExtractConstantComplete {

    private void stringExtractConstant() {
        System.out.println(Child.TDD);
        System.out.println(Child.TDD);
        System.out.println(Child.TDD);
    }

    private static class Child {

        public static final String TDD = "TDD";
    }

}
