package counting;

import com.example.calculator.TestUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorCountingParameterizedTest {

    private final CalculatorCounting calculatorCounting = new CalculatorCounting();

    public static Stream<Arguments> ParameterizedPlus() {
       return Stream.of(
               Arguments.of("10", "5", TestUtils.formatResult(10, 5, "+", String.valueOf(15))),
               Arguments.of("16", "4", TestUtils.formatResult(16, 4, "+", String.valueOf(20))));
    }

    @ParameterizedTest
    @MethodSource("ParameterizedPlus")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorCounting.plus(num1,num2));
    }

    public static Stream<Arguments> ParameterizedMinus() {
        return Stream.of(
                Arguments.of("10", "5", TestUtils.formatResult(10, 5, "-", String.valueOf(5))),
                Arguments.of("16", "4", TestUtils.formatResult(16, 4, "-", String.valueOf(12))));
    }
    @ParameterizedTest
    @MethodSource("ParameterizedMinus")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorCounting.minus(num1, num2));
    }

    public static Stream<Arguments> ParameterizedMultiply() {
        return Stream.of(
                Arguments.of("10", "5", TestUtils.formatResult(10, 5, "*", String.valueOf(50))),
                Arguments.of("16", "4", TestUtils.formatResult(16, 4, "*", String.valueOf(64))));
    }
    @ParameterizedTest
    @MethodSource("ParameterizedMultiply")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorCounting.multiply(num1, num2));

    }


    public static Stream<Arguments> ParameterizedDivide() {
        return Stream.of(
                Arguments.of("10", "5", TestUtils.formatResult(10, 5, "/", String.valueOf(2))),
                Arguments.of("16", "4", TestUtils.formatResult(16, 4, "/", String.valueOf(4))));
    }
    @ParameterizedTest
    @MethodSource("ParameterizedDivide")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorCounting.divide(num1, num2));

    }
}