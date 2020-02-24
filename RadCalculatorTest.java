import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

class RadCalculatorTest {
	
	/*
	Test Case #1: Testing the sin(x) implementation
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
	Test Case #2: Testing the cos(x) implementation
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
	Test Case #3: Testing the tan(x) implementation
	*/
    @Test
    public void testtan() {
    	RadCalculator testTanObject = new RadCalculator();
        
        double a = 1.0; // test case
        
        double testAnswer = Math.tan(a); // real value of test case
        
        double result = testTanObject.tan(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
   
	/*
	Test Case #4: Testing the degToRad() implementation
	*/
    @Test
    public void testConvert() {
    	RadCalculator testConvertObject = new RadCalculator();
    	
    	double a = 180; // 180 degrees
    	
    	double testAnswer = Math.toRadians(a); // using Math.toRadians(a) to convert using the Math Java library
    	
    	double result = testConvertObject.degToRad(a);
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
	/*
	Test Case #5: Testing the power() implementation
	*/
    @Test
    public void testPower() {
    	RadCalculator testConvertObject = new RadCalculator();
    	
    	double a = 2;
    	double b = 4;
    	
    	double testAnswer = Math.pow(a, b); // using Math.toRadians(a) to convert using the Math Java library
    	
    	double result = testConvertObject.power(a, b);
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
	/*
	Test Case #6: Testing the factorial() implementation
	*/
    @Test
    public void testFactorial() {
    	RadCalculator testConvertObject = new RadCalculator();
    	
    	double a = 4;
    	
    	double testAnswer = factorialTest(a); // using Math.factorial(a) to calculate using a widely-known recursive factorial algorithm
    	
    	double result = testConvertObject.factorial(a);
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
    // Factorial (recursive) implementation used to compare the other implementation within RadCalculator class
    public static double factorialTest(double a) {
    	
    	if (a == 0) {
    		return 1;
    	}
    	
    	return a * factorialTest(a - 1);
    }
    
	/*
	Test Case #7: Testing the degSin(x) implementation
	*/
    @Test
    public void testDegSin() {
        RadCalculator testSinObject = new RadCalculator();
        
        double a = 180; // test case for 180 degrees
        
        double midResult = Math.toRadians(180);
        
        double testAnswer = Math.sin(midResult); // real value of test case
        
        double result = testSinObject.degSin(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
	/*
	Test Case #8: Testing the degCos(x) implementation
	*/
    @Test
    public void testDegCos() {
        RadCalculator testCosObject = new RadCalculator();
        
        double a = 180; // test case for 180 degrees
        
        double midResult = Math.toRadians(180);
        
        double testAnswer = Math.cos(midResult); // real value of test case
        
        double result = testCosObject.degCos(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }

	/*
	Test Case #9: Testing the degTan(x) implementation
	*/
    @Test
    public void testDegTan() {
        RadCalculator testTanObject = new RadCalculator();
        
        double a = 180; // test case for 180 degrees
        
        double midResult = Math.toRadians(180);
        
        double testAnswer = Math.tan(midResult); // real value of test case
        
        double result = testTanObject.degTan(a); // real result from implementation
        
        // Scaling accuracy to suit the test case
        
        BigDecimal testAnswer1 = new BigDecimal (testAnswer).setScale(15, RoundingMode.DOWN);
		
		testAnswer = (double) testAnswer1.doubleValue();
		
		BigDecimal result1 = new BigDecimal (result).setScale(15, RoundingMode.DOWN);
		
		result = (double) result1.doubleValue(); 
        
        assertEquals(testAnswer, result); // comparing test case with real result
    }
    
}
