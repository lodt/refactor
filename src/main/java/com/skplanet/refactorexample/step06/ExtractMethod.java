package com.skplanet.refactorexample.step06;

// Refactor > Extract > ExtractMethod
// Refactor > Change Signature
// Refactor > Inline
@SuppressWarnings("unused")
public class ExtractMethod {

    void extractMethod() {
        int sum = 0;
        int size = 30;
        for (int i = 0; i <= size; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("합계 : " + sum);
    }

}
