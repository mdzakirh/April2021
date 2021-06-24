package pageObject;

public class LearningModifiers {
	
	public int x;
	
	private int y;
	
	
	protected int z;
	
	int a;

	
	public void sample12() {
		y = 12;
		System.out.println(y);
		
	}
	protected void sample2() {
		System.out.println("Parent method");
	}
	
	private void sample10() {
		System.out.println("sample10");
	}
}
