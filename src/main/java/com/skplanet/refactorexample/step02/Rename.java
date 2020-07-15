package com.skplanet.refactorexample.step02;

// Refactor > Rename
// Refactor > Type Migration
@SuppressWarnings("unused")
public class Rename {

    // get file size
    private static long doSomething() {
        long val = 1024;
        System.out.println(val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(doSomething());
    }

}

