package com.skplanet.refactorexample.step02;

// Refactor > Rename
// Refactor > Type Migration
@SuppressWarnings("unused")
public class RenameComplete {

    // get file size
    private static int getFileSize() {
        int fileSize = 1024;
        System.out.println(fileSize);
        return fileSize;
    }

    public static void main(String[] args) {
        System.out.println(getFileSize());
    }

}

