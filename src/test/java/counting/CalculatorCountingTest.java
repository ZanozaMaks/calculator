package counting;

import com.example.calculator.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorCountingTest {

    private final CalculatorCounting calculatorCounting = new CalculatorCounting();
    @Test
    void calcs_success() {
        String expectedMessage = "Добро пожаловать в калькулятор";
        String actualMessage = calculatorCounting.calcs();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void plus_success() {
        int num1 = 10;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf( num1 + num2));

        String actualResult = calculatorCounting.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success2() {
        int num1 = 16;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf( num1 + num2));

        String actualResult = calculatorCounting.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        int num1 = 10;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "-" ,String.valueOf(num1 - num2));
        String actualResult = calculatorCounting.minus(num1, num2);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void minus_success2() {
        int num1 = 16;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "-" ,String.valueOf(num1 - num2));
        String actualResult = calculatorCounting.minus(num1, num2);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void multiply_success() {
        int num1 = 10;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "*" ,String.valueOf(num1 * num2));
        String actualResult = calculatorCounting.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success2() {
        int num1 = 16;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "*" ,String.valueOf(num1 * num2));
        String actualResult = calculatorCounting.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        int num1 = 10;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "/" ,String.valueOf(num1 / num2));
        String actualResult = calculatorCounting.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success2() {
        int num1 = 16;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "/" ,String.valueOf(num1 / num2));
        String actualResult = calculatorCounting.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        int num1 = 10;
        int num2 = 0;

        String expectedMessage = "Делить на 0 нельзя";

        Exception exception = assertThrows(IllegalArgumentException.class,() -> calculatorCounting.divide(num1,num2));

        assertEquals(expectedMessage, exception.getMessage());
    }
}


