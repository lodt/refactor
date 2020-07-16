package com.skplanet.refactorexample.step05;

// Refactor > Extract > ExtractField
// 1. Current ExtractMethod
// 2. ExtractField Declaration
// 3. Constructor

// Refactor > Extract > Parameter
// Delegate via overloading method

@SuppressWarnings({"unused"})
public class ExtractField {

    private static void stringExtractConstant() {
        System.out.println(3 - 1);
    }

    public static void main(String[] args) {
        stringExtractConstant();
    }

}
