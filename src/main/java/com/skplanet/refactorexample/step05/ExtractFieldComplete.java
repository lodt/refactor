package com.skplanet.refactorexample.step05;

// Refactor > Introduce Field
// 1. Current ExtractMethod
// 2. ExtractField Declaration
// 3. Constructor

// Refactor > Introduce Parameter
// Delegate via overloading method

@SuppressWarnings({"unused"})
public class ExtractFieldComplete {

    public int anInt;

    public ExtractFieldComplete() {
        anInt = 3;
    }

    private void stringExtractConstant() {
        System.out.println(anInt - 1);
    }

}
