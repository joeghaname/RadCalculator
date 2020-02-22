import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

class RadCalculatorTest {

    @Test
    public void testsin() {
        RadCalculator testSinObject = new RadCalculator();
        
        double a = 1.0;
        
        double testAnswer = Math.sin(a);
        
        double result = testSinObject.sin(a);
        
        assertEquals(testAnswer, result);
    }
     
    @Test
    public void testcos() {
    	RadCalculator testCosObject = new RadCalculator();
        
        double a = 1.0;
        
        double testAnswer = Math.cos(a);
        
        double result = testCosObject.cos(a);
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue();
        
        assertEquals(testAnswer, result);
    }
    @Test
    public void testtan() {
    	RadCalculator testTanObject = new RadCalculator();
        
        double a = 1.0;
        
        double testAnswer = Math.tan(a);
        
        double result = testTanObject.tan(a);
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(1, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(1, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue();
        
        assertEquals(testAnswer, result);
    }
   

}
