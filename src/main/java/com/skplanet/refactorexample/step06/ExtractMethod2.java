package com.skplanet.refactorexample.step06;

// Refactor > Extract Method
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod2 {

    void extractMethod2() {
        int sum = 10;
        int size = 30;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("합계 : " + sum);
    }
}
