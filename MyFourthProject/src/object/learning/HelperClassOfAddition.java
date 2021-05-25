package object.learning;

public class HelperClassOfAddition {
	
	int extraNumber = 10;
	
	public int addingTwoNumbers(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
	
	public int addingTwoNumbersWithExtraNumber10(int number1, int number2) {
		int sum = number1 + number2 + extraNumber;
		return sum;
	}
	
	public int addingThreeNumbers10(int number1, int number2, int number3) {
		int sum = number1 + number2 + number3 + extraNumber;
		return sum;
	}

}
