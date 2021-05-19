package second.pack;

public class StringOperation {

	public static void main(String[] args) {
		
//		String firstName = "John";
//		String lastName = "Williams";
//		
//		String expectedHeader = "About";
//		
//		System.out.println("The header "+ expectedHeader + " is available");
//		
//		System.out.println(firstName+" "+lastName);
//		
//		System.out.println(50+20+firstName);
		
		StringOperation printName = new StringOperation();
		
		String name = printName.print("John");
		System.out.println(name);
		
		String lastName = StringOperation.print("Wills");
		System.out.println(lastName);
	}

	public static String print(String name) {
		return ("My name is "+name);
	}
}
