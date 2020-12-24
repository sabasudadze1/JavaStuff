import ge.edu.btu.services.CalculatorServiceImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorServiceTest {
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(13.0, calculatorService.sum(10,3.00), 0);
    }

    @Test
    public void prodTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(75.00, calculatorService.prod(15,5.00), 0);
    }
}
