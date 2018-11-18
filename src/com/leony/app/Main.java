package com.leony.app;

import com.leony.home.IntroductionToGenerics;

public class Main {

    public static void main(String[] args) {
        introductionToGenerics();
    }

    private static void introductionToGenerics() {
        IntroductionToGenerics introductionToGenerics = new IntroductionToGenerics();

        printMessage("IntroductionToGenerics: use simple generics");
        introductionToGenerics.useSimpleGenerics();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
