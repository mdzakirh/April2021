package learning.function;

public class LearningMethods {

	public static void main(String[] args) {
//		addTwoNumbers(10, 20);
//		subTwoNumbers(100, 50);
//		multTwoNumbers(5, 20);
//		divTwoNumbers(50, 2);
		
		
		int resultOfAddition = addTwoNumbersWithReturn(20, 50);
		System.out.println(resultOfAddition);
		
		int resultOfSubstraction = subTwoNumbersWithReturn(10, 5);
		System.out.println(resultOfSubstraction);
		
		int result = resultOfAddition*resultOfSubstraction;
		System.out.println(result);
	}
	public static void addTwoNumbers(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}
	
	public static int addTwoNumbersWithReturn(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	public static int subTwoNumbersWithReturn(int num1, int num2) {
		int sub = num1-num2;
		return sub;
	}
	
	
	
	
	
	
	
	
	public static void addTenNumbers(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void subTwoNumbers(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(sub);
	}
	public static void multTwoNumbers(int num1, int num2) {
		int multiplication = num1*num2;
		System.out.println(multiplication);
	}
	public static void divTwoNumbers(int num1, int num2) {
		int div = num1/num2;
		System.out.println(div);
	}
	
	
}
