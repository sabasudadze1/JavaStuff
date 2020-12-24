package ge.edu.btu.calculator;

import ge.edu.btu.services.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        System.out.println(calculatorService.sum(15,2.5));
        System.out.println(calculatorService.prod(5,1.5));
    }
}
