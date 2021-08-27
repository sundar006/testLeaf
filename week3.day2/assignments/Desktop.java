package week3.day2.assignments;

public class Desktop implements Hardware, Software {
	
	

	public void softwareResources() {
		System.out.println("This is method from Software interface");
		
	}

	public void hardwareResources() {
		System.out.println("This is method from Hardware interface");
		
	}
	
	public void ownMethod()
	{
		System.out.println("This is own method implemented in execution class");
	}
	
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.hardwareResources();
		obj.softwareResources();
		obj.ownMethod();
	}

}
