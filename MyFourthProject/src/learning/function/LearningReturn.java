package learning.function;

public class LearningReturn {

	public static void main(String[] args) {
		
		
//		int sumOfNumbers = AddingMethods.addingTwoNumbers(25, 30);
//		System.out.println(sumOfNumbers);
		
		
//		int sum = AddingMethods.addingTwoNumbers(50, 20);
//		System.out.println(sum);
//		
//		int sum2 = AddingMethods.addingThreeNumbers(100, 200, 300);
//		System.out.println(sum2);
		
		
//		String personsName = PersonsInformation.myName("John", "Wills");
//		System.out.println(personsName);
//		
//		String emailAndPhone = PersonsInformation.emailIdAndPhoneNumber("asd@gmail.com", "57135512");
//		System.out.println(emailAndPhone);
		
		
//		for(int i=91; i<=100; i++) {
//			double result = TemparatureConversion.tempConvert(i);
//			
//			System.out.println(result);
//		}
		
		TemparatureConversion obj1 = new TemparatureConversion();
		
		boolean finalResult = obj1.isPassed(75);
		System.out.println(finalResult);
		
		double result = obj1.tempConvert(90.00);
		double number = 100;
		
		double sum = result + number;
		
		System.out.println(sum);
		
		
		
		
	}
}
