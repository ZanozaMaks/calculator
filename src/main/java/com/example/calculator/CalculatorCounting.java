package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
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
        if (num2 == 0)
            return "Делить на 0 нельзя";
        return num1 + " / " + num2 + " = " + answer;
    }

}


