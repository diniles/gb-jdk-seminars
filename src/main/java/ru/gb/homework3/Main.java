package ru.gb.homework3;

import static ru.gb.homework3.Calculator.*;
import static ru.gb.homework3.ArrayComparator.compareArrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum: " + sum(5, 3));
        System.out.println("Division: " + divide(10.0, 2.5));
        System.out.println("Multiply: " + multiply(10, 2.5));
        System.out.println("Subtract: " + subtract(10, 2));

        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};

        String[] strArray1 = {"Helloween", "Manowar", "Iron Maiden"};
        String[] strArray2 = {"Helloween", "Manowar", "Iron Maiden"};

        boolean intArraysEqual = compareArrays(intArray1, intArray2);
        boolean strArraysEqual = compareArrays(strArray1, strArray2);
        boolean intArraysNotEqual = compareArrays(intArray1, intArray3);

        System.out.println("intArray1 and intArray2 are the same: " + intArraysEqual); // true
        System.out.println("strArray1 and strArray2 are the same: " + strArraysEqual); // true
        System.out.println("intArray1 and intArray3 are the same: " + intArraysNotEqual); // false
    }
}

