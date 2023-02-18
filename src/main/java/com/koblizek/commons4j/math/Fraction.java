package com.koblizek.commons4j.math;

public class Fraction extends MathExpression {

    private final double v1;
    private final double v2;

    public Fraction(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;

        this.actualValue = v1/v2;
    }

    @Override
    public double calculate() {
        return actualValue;
    }
}
