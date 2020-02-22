import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

class RadCalculatorTest {

	
	/*
	Test Case #1: Testing the sin(x) implementation with maximum accuracy
	*/
    @Test
    public void testsin() {
        RadCalculator testSinObject = new RadCalculator();
        
        double a = 1.0; // test case
        
        double testAnswer = Math.sin(a); // real value of test case
        
        double result = testSinObject.sin(a); // real result from implementation
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
     
	/*
	Test Case #2: Testing the cos(x) implementation with limited accuracy
	*/
    @Test
    public void testcos() {
    	RadCalculator testCosObject = new RadCalculator();
        
        double a = 1.0; // test case
        
        double testAnswer = Math.cos(a); // real value of test case
        
        double result = testCosObject.cos(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue(); 
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
	/*
	Test Case #3: Testing the tan(x) implementation with limited accuracy
	*/
    @Test
    public void testtan() {
    	RadCalculator testTanObject = new RadCalculator();
        
        double a = 1.0; // test case
        
        double testAnswer = Math.tan(a); // real value of test case
        
        double result = testTanObject.tan(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(1, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(1, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
   

}
