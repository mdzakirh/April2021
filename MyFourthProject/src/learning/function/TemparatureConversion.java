package learning.function;

public class TemparatureConversion {
	
	public double tempConvert(double farenhiteTemperature) {
		double celsiusTemparature;
		celsiusTemparature = ((farenhiteTemperature - 32)*5)/9;
		return celsiusTemparature;
	}
	
	public static int multOfTwoNumbers(int number1, int number2) {
		int mult = number1*number2;
		return mult;
	}
	
	
	
	public boolean isPassed(int input) {
		boolean result = true;		
		if(input>=50) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
}
