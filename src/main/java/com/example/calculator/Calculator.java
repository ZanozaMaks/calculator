package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.StyledEditorKit;
import java.awt.*;

@RestController

@RequestMapping("/calculator")

public class Calculator {

    private final CalculatorCounting calculatorCounting;

    public Calculator(CalculatorCounting calculatorCounting) {


        this.calculatorCounting = calculatorCounting;

    }

    @GetMapping
    public String calcs() {
        return calculatorCounting.calcs();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorCounting.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorCounting.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorCounting.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorCounting.divide(num1, num2);
    }
}
