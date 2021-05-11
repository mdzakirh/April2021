package array.learning;

import java.util.Arrays;

public class LearningArraysWithLoop {

	public static void main(String[] args) {

		int[] number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
				
		boolean result = true;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]==2000) {
				result = true;
				break;
			}else {
				result = false;
			}	
		}
		
		if(result == true) {
			System.out.println("Test Passed");
		}else {
			System.out.println("test failed");
		}
	}

}
