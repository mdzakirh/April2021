package second.pack;

public class Marking {

	public static void main(String[] args) {

//		int mark = 50;
//		
//		if(mark >= 90) {
//			System.out.println("Grade A");
//		}else if(mark >= 80 && mark <=89){
//			System.out.println("Grade B");
//		}else if(mark >= 70 && mark <=79){
//			System.out.println("Grade c");
//		}else {
//			System.out.println("Failed");
//		}

		double basePrice = 30000;
		double interestRate = 0;
		double tax = 7 / 100;
		double creditScore = 800;
		double downPayment = 5000;
		double duration = 7;
		double actualPrice;
		double monthlyCarPayment = 0;
		double interestOnActualPrice = 0;
		double financingPrice; // I don't think this variable is needed
		
			actualPrice = (basePrice - downPayment);
			System.out.println(actualPrice);
			if (creditScore < 700) {
				interestRate = 3.5;
				// need to calculate the interest rate on actual price
				interestOnActualPrice = ((actualPrice * interestRate) / 100);  
				System.out.println(interestOnActualPrice);
				// calculating the tax on actual price
				tax = ((actualPrice * 7) / 100);
				System.out.println(tax);
				//monthly car payment should be 
				//summation of actual price + tax + interest rate 
				//and divided by months
				monthlyCarPayment = (( actualPrice + tax + interestOnActualPrice) / (duration * 12));
			}else {
				interestRate = 2.5;
				interestOnActualPrice = ((actualPrice * interestRate) / 100);
				System.out.println(interestOnActualPrice);
				tax = ((actualPrice * 7) / 100);
				System.out.println(tax);
				monthlyCarPayment = (( actualPrice + tax) / (duration * 12));
			}
			System.out.println(monthlyCarPayment);
		

	}

}
