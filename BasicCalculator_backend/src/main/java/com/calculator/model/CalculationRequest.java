package com.calculator.model;

public class CalculationRequest {
    private double num1;
    private double num2;
    private String operation;

    public double getNum1() { return num1; }
    public void setNum1(double num1) { this.num1 = num1; }

    public double getNum2() { return num2; }
    public void setNum2(double num2) { this.num2 = num2; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
}