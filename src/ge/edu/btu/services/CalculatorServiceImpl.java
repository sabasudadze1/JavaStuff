package ge.edu.btu.services;
import ge.edu.btu.interfaces.CalculatorService;
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double sum(double first_number, double second_number) {
        return first_number + second_number;
    }
    @Override
    public double prod(double first_number, double second_number) {
        return first_number * second_number;
    }
}
