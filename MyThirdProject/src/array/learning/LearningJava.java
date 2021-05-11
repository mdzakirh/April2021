package array.learning;

public class LearningJava {
	
	public static void main(String args[]) {
		
		String[] expectedDropDownMenu = {"Choose", "Morning", "Evening", "Afternoon"};
		
//		System.out.println(expectedDropDownMenu.length);
		boolean isPassed = true;
		for(int i=0; i<expectedDropDownMenu.length;i++) {
			if(expectedDropDownMenu[i] == "Evening") {
				isPassed = true;
			}else {
				isPassed= false;
			}
		}
		
		if(isPassed == true) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
		
	}

}