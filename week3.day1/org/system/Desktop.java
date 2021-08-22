package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("desktop size");
	}
	
	public void computerName()
	{
		System.out.println("computer name");
	}
	
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		
		obj.computerModel();
		obj.desktopSize();
		int i = obj.i;
		System.out.println(i);
		
	}
}
