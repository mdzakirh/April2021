package example;

public class HelpingMethod {
	public static double tempConvert(double farenhiteTemperature) {
		double celsiusTemparature;
		celsiusTemparature = ((farenhiteTemperature - 32)*5)/9;
		return celsiusTemparature;
	}
	
	public static int doubleTheValue(int input) {
		int result = input * 2;
		return result;
	}
}
