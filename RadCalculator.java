public class RadCalculator {

	public static double power(double a, double b) {
		double result = a;
		for(int i = 1; i < b; i++) {
			result *= a;
		}
		return result;
	}

	public static double factorial(double a) {
		double result = a;

		for(double i = a - 1; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	public static double sin(double a) {
		double result = a; 
		int sign = -1;
		for(int i = 3; i < 500; i = i + 2) {
			result += (sign *((power(a,i)) / factorial(i)));
			sign *= -1;
		}
		
        return result;
    }

    public static double cos(double a) {
		double result = 1; 
		int sign = -1;
		for(int i = 2; i < 500; i = i + 2) {
			result += (sign *((power(a,i)) / factorial(i)));
			sign *= -1;
		}

        return result;
    }

    public static double tan(double a) {

        return a;
    }

}
