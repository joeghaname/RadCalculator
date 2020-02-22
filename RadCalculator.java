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

    	// Taylor series implementation for tan(x)
		double result = a + (power(a, 3)/3) + ((2 * power(a, 5))/15) + ((17 * power(a, 7))/315) + ((62 * power(a, 9))/2835);
		
        return result;
    }

}
