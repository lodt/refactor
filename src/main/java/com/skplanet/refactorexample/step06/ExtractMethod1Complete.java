package com.skplanet.refactorexample.step06;

// Refactor > Extract Method
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod1Complete {

    void extractMethod() {
        System.out.println("합계 : " + sum());
    }

    private int sum() {
        int sum = 0;
        int size = 30;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        return sum;
    }
}
