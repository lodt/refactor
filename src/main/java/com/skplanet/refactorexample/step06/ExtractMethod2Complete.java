package com.skplanet.refactorexample.step06;

// Refactor > Extract > ExtractMethod
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod2Complete {

    void extractMethod() {
        int sum = 10 + sum();
        System.out.println("합계 : " + sum);
    }

    private int sum() {
        int size = 30;
        int sum = 0;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        return sum;
    }

}
