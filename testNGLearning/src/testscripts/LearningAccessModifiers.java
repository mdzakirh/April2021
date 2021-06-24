package testscripts;

import pageObject.LearningModifiers;

public class LearningAccessModifiers extends LearningModifiers {
	
	private int b;
	public int s;

	public void setTheValueOfB(int bValue) {
		this.b = bValue;
	}
	
	public int getTheValueOfB() {
		return b;
	}
	
	public void sample() {

	}

	public void sample(int x) {
		System.out.println(x);
	}

	public void sample(String x) {

	}
	
	public void sample(String x, String y) {

	}
	
	public void sample2() {
		System.out.println("This is a child method");
	}
	
	private void sample1000() {
		System.out.println("something");
	}
	
	public void accessForPrivateMethods() {
		sample1000();
		System.out.println();
		
	}
}
