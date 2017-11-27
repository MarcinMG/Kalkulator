package com.kalkulator;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subAFromB(int a, int b) {
        return a - b;
    }

    public int testAB(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.addAToB(1,2));
        System.out.println(calculator.subAFromB(11,2));

    }
}
