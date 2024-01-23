package org.example.calculate;

public interface NewArtithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
