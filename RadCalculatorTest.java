import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import java.lang.Math;

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
        
        double a = 45.0;
        
        double testAnswer = Math.cos(a);
        
        double result = testCosObject.cos(a);
        
        assertEquals(testAnswer, result);
    }
    @Test
    public void testtan() {
    	RadCalculator testTanObject = new RadCalculator();
        
        double a = 45.0;
        
        double testAnswer = Math.tan(a);
        
        double result = testTanObject.tan(a);
        
        assertEquals(testAnswer, result);
    }
   

}
