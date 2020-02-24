import java.lang.Math;

public class RadCalculator {
	
	// Power function used to calculate taylor series of sin(x), cos(x), and tan(x) formulas
	public static double power(double a, double b) {
		double result = a;
		for(int i = 1; i < b; i++) {
			result *= a;
		}
		return result;
	}

	// Factorial function used to calculate taylor series of sin(x) and cos(x) formulas 
	public static double factorial(double a) {
		double result = a;
		for(double i = a - 1; i > 0; i--) {
			result *= i;
		}
		return result;
	}

    // Implementation of sin(x)
	public static double sin(double a) {
		double result = a; 
		
		// Taylor series implemenation for sin(x)
		int sign = -1;
		for(int i = 3; i < 500; i = i + 2) {
			result += (sign *((power(a,i)) / factorial(i)));
			sign *= -1;
		}
		
        return result;
    }

    // Implementation of cos(x)
    public static double cos(double a) {
		double result = 1;
		
		// Taylor series implementation for cos(x)
		int sign = -1;
		for(int i = 2; i < 500; i = i + 2) {
			result += (sign *((power(a,i)) / factorial(i)));
			sign *= -1;
		}

        return result;
    }

    // Implementation of tan(x)
    public static double tan(double a) {
    	
    	double result = sin(a)/cos(a);
    	
        return result;
    }
    
    // Implementation of degToRad(x)
    public static double degToRad(double a) {
		
    	final double pi = 3.1415926535897932;
    	
    	a = a * (pi/180);
    	
    	return a;
    }
    
    // Implementation of degSin()
    public static double degSin(double a) {
    	
    	double radValue = degToRad(a); 
    	
    	double result = sin(radValue);
    	
    	return result;
    }
    
    // Implementation of degCos()
    public static double degCos(double a) {
    	
    	double radValue = degToRad(a); 
    	
    	double result = cos(radValue);
    	
    	return result;
    }
    
    // FOR TESTING PURPOSES ONLY
    public static void main(String[] args) {
    	//System.out.println(tan(1));
    	//System.out.println(Math.tan(1));

    	System.out.println(degSin(1));
    	System.out.println(Math.sin(Math.toRadians(1)));

    }
    
    
}
