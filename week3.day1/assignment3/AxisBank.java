package week3.assignment3;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("axis bank deposit");
	}
	
	public static void main(String[] args) {
		
	
	AxisBank obj = new AxisBank();
	obj.deposit();
	obj.fixed();
	obj.savings();
	
}

}