package second.pack;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ASK FOR THE PRINCIPAL & GET THE PRINCIPAL:

        System.out.println("Enter the Principal in US$:");

        double Principal = scan.nextDouble();

        // ASK FOR THE AMMOUNT OF YEARS & GET THE NUMBER OF YEARS:

        System.out.println("Enter the number of Years:");

        double Number_Of_Years = scan.nextInt();

        // ASK FOR FOR THE FICO SCORE & GET THE FICO SCORE:

        System.out.println("Enter your FICO SCORE:");

        double Fico_Score = scan.nextInt();

        // ASK FOR DOWN PAYMENT & GET THE DOWN PAYMENT:

        System.out.println("Enter your Down Paymnet in US$:");

        double Down_Payment = scan.nextDouble();
        
        System.out.println(Principal+ " "+Number_Of_Years + " " +Fico_Score+ " "+ Down_Payment);
	}

}
