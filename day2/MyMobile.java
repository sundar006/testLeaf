package week1.day2;

public class MyMobile {

	
	String brand = "Samsung";
	int price = 45000;
	
	
	public String setAlarm() 
	{
		String alarm = "Set alarm at 6AM";
		System.out.println("Set an alarm");
		return alarm;
	}
	
	public void makeCall() 
	{
		System.out.println("make calls");
	}
	
	private void payBills() 
	{
		System.out.println("Private method pay bills");
	}
	
	public void sendSMS(String sms) 
	{
		System.out.println("sms is " +sms);
	}
	
	public static String printString()
	{
		String band = null;
		
		System.out.println("Test string");
		
		return band;
	}
	
	
	
	public static void main(String[] args) {
		
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.payBills();
		obj.setAlarm();
		obj.sendSMS("Sundar");
		
		
		
	}
}
