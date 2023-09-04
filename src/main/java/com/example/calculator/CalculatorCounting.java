package com.example.calculator;

public class CalculatorCounting {

    public String calcs() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int answer = num1 + num2;
        return num1 + " + " + num2 + " = " + answer;
    }

    public String minus(int num1, int num2) {
        int answer = num1 - num2;
        return num1 + " - " + num2 + " = " + answer;
    }

    public String multiply(int num1, int num2) {
        int answer = num1 * num2;
        return num1 + " * " + num2 + " = " + answer;
    }

    public String divide(int num1, int num2) {
        int answer = num1 / num2;
        return num1 + " / " + num2 + " = " + answer;
    }

    public String divisionTest(int num1, int num2) {
        if (num2 == 0) {
            return "Нельзя делить на 0";
        }

        return divisionTest(num1,num2);
    }
}


