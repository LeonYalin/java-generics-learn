package com.leony.app;

import com.leony.home.*;

public class Main {

    public static void main(String[] args) {
        introductionToGenerics();
        genericCollections();
        genericClassesAndInterfaces();
        genericMethods();
        wildcards();
        rawTypesAndCompatibility();
        reflection();
    }

    private static void introductionToGenerics() {
        IntroductionToGenerics introductionToGenerics = new IntroductionToGenerics();

        printMessage("IntroductionToGenerics: use simple generics");
        introductionToGenerics.useSimpleGenerics();
    }

    private static void genericCollections() {
        GenericCollections genericCollections = new GenericCollections();

        printMessage("GenericCollections: play with generic collections");
        genericCollections.playWithGenericCollections();
    }

    private static void genericClassesAndInterfaces() {
        GenericClassesAndInterfaces genericClassesAndInterfaces = new GenericClassesAndInterfaces();

        printMessage("GenericClassesAndInterfaces: implementing a generic type");
        genericClassesAndInterfaces.implementingAGenericType();

        printMessage("GenericClassesAndInterfaces: passing a parameter to a generic type");
        genericClassesAndInterfaces.passingAParameterToAGenericType();

        printMessage("GenericClassesAndInterfaces: type bounds");
        genericClassesAndInterfaces.typeBounds();
    }

    private static void genericMethods() {
        GenericMethods genericMethods = new GenericMethods();

        printMessage("GenericMethods: play with generic methods");
        genericMethods.playWithGenericMethods();
    }

    private static void wildcards() {
        Wildcards wildcards = new Wildcards();

        printMessage("GenericMethods: play with wildcards");
        wildcards.playWithWildcards();
    }

    private static void rawTypesAndCompatibility() {
        RawTypesAndCompatibility rawTypesAndCompatibility = new RawTypesAndCompatibility();

        printMessage("RawTypesAndCompatibility: raw types");
        rawTypesAndCompatibility.rawTypes();

        printMessage("RawTypesAndCompatibility: implications of erasure");
        rawTypesAndCompatibility.implicationsOfErasure();
    }

    private static void reflection() {
        Reflection reflection = new Reflection();

        printMessage("Reflection: class literals");
        reflection.classLiterals();

        printMessage("Reflection: reflecting types");
        reflection.reflectingTypes();

        printMessage("Reflection: reflecting generic information");
        reflection.reflectingGenericInformation();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
