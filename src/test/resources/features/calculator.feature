Feature: Calculator

  Scenario: Addition
    Given a calculator
    When I add 2.0 and 3.5
    Then the result should be 5.5

  Scenario: Subtraction
    Given a calculator
    When I subtract 3.0 from 5.5
    Then the result should be 2.5

  Scenario: Multiplication
    Given a calculator
    When I multiply 4.0 and 2.5
    Then the result should be 10.0

  Scenario: Division
    Given a calculator
    When I divide 10.0 by 2.5
    Then the result should be 4.0

  Scenario: Power
    Given a calculator
    When I raise 2.0 to the power of 3.0
    Then the result should be 8.0

  Scenario: Fractional Power
    Given a calculator
    When I raise 8.0 to the power of 1/3
    Then the result should be 2.0

  Scenario: Negative Power
    Given a calculator
    When I raise 2.0 to the power of -2.0
    Then the result should be 0.25

  Scenario: Square Root of Positive Number
    Given a calculator
    When I calculate the square root of 25.0
    Then the result should be 5.0

  Scenario: Square Root of Negative Number
    Given a calculator
    When I calculate the square root of -25.0
    Then the calculator should throw an IllegalArgumentException with the message "Cannot calculate square root of negative number!"

  Scenario: Non-Negative Integer Function
    Given a calculator
    When I calculate the function of 5
    Then the result should be 120.0

  Scenario: Natural Logarithm
    Given a calculator
    When I calculate the natural logarithm of 2.71828
    Then the result should be 1.0

  Scenario: Common Logarithm
    Given a calculator
    When I calculate the common logarithm of 100.0
    Then the result should be 4.605
