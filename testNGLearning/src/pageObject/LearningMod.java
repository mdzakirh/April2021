package pageObject;

import testscripts.LearningAccessModifiers;

public class LearningMod extends LearningModifiers{
	public int x = 1223;
	private int y;
	
	public static void main(String[] args){
		LearningModifiers lm1 = new LearningModifiers();
		lm1.z = 234;
		lm1.a = 121;
		lm1.x =12;	
//		System.out.println(lm1.x);
		
		LearningAccessModifiers lam = new LearningAccessModifiers();
//		lam.sample(200);
//		lam.sample2();
//		lam.accessForPrivateMethods();
		lam.setTheValueOfB(100);
		int valueOfB = lam.getTheValueOfB();
		System.out.println(valueOfB);
		
	}
	
	

}
