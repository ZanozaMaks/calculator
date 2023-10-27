package counting;

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
        if (num2 == 0) {
            throw new IllegalArgumentException( "Делить на 0 нельзя");
        }
        int answer = num1 / num2;
        return num1 + " / " + num2 + " = " + answer;
    }

    private String formatResult(int num1, int num2, String operation, String result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}
