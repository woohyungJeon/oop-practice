package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {

    private static final List<NewArtithmeticOperator> newArtithmeticOperators = List.of(new AddictionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(int operan1, String operator, int operand2){
        return newArtithmeticOperators.stream()
                .filter(newArtithmeticOperator -> newArtithmeticOperator.supports(operator))
                .map(newArtithmeticOperator -> newArtithmeticOperator.calculate(new PositiveNumber(operan1), new PositiveNumber(operand2)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }

}
