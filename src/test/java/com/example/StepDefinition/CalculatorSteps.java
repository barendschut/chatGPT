package com.example.StepDefinition;

import com.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private double result;
    private Exception exception;

    @Given("a calculator")
    public void givenCalculator() {
        calculator = new Calculator();
    }

    @When("I add {double} and {double}")
    public void whenIAdd(double num1, double num2) {
        result = calculator.add(num1, num2);
    }

    @When("I subtract {double} from {double}")
    public void whenISubtract(double num1, double num2) {
        result = calculator.subtract(num1, num2);
    }

    @When("I multiply {double} and {double}")
    public void whenIMultiply(double num1, double num2) {
        result = calculator.multiply(num1, num2);
    }

    @When("I divide {double} by {double}")
    public void whenIDivide(double num1, double num2) {
        result = calculator.divide(num1, num2);
    }

    @When("I raise {double} to the power of {double}")
    public void whenIRaise(double num1, double num2) {
        result = calculator.power(num1, num2);
    }

    @When("I raise {double} to the power of {double}\\/{double}")
    public void whenIRaise(double num1, double num2, double num3) {
        result = calculator.power(num1, num2/num3);
    }

    @When("I calculate the square root of {double}")
    public void whenICalculateSquareRoot(double num) {
        try {
            result = calculator.squareRoot(num);
        } catch (Exception e) {
            exception = e;
        }
    }

    @When("I calculate the function of {int}")
    public void whenICalculateFunction(int num) {
        result = calculator.functionOfNumber(num);
    }

    @When("I calculate the natural logarithm of {double}")
    public void whenICalculateNaturalLog(double num) {
        result = calculator.naturalLogarithm(num);
    }

    @When("I calculate the common logarithm of {double}")
    public void whenICalculateCommonLog(double num) {
        result = calculator.naturalLogarithm(num);
    }

    @Then("the result should be {double}")
    public void thenTheResultShouldBe(double expectedResult) {
        assertEquals(expectedResult, result, 0.001);
    }

    @Then("the calculator should throw an IllegalArgumentException with the message {string}")
    public void thenTheCalculatorShouldThrowAnIllegalArgumentExceptionWithTheMessage(String errorMessage) {
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals(errorMessage, exception.getMessage());
    }
}
