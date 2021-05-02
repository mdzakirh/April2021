package second.pack;

public class SecondClass {

	public static void main(String[] args) {
		
		int rent;
		rent = 1000;
		int carPayment = 100;
		int utilities = 200;
		int carInsurance = 200;
		
		int myMonthlyExpenses;
		
		myMonthlyExpenses = rent+carPayment+utilities+carInsurance;
		
		System.out.println(myMonthlyExpenses);
		
		int celsiusTemparature;
		int farenhiteTemperature = 90;
		
		celsiusTemparature = ((farenhiteTemperature - 32)*5)/9;
		
		System.out.println(farenhiteTemperature);

	}

}
