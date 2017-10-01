package com.company;

public class Main {

    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The second value is " + intValue2);
        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);
        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + longValue1);
    }
}
