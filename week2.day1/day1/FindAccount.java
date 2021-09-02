package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		String accName = driver.findElement(By.xpath("(//td[@class='titleCell']/span[text()='Account Name']/following::td/span)[1]")).getText();
		String actualText = "Credit Limited Account  (accountlimit100)";
		
		if(accName.equals(actualText))
		{
			System.out.println("Account name matched");
		}
		
		//print decription text
		System.out.println("description text is " + driver.findElement(By.xpath("(//td[@class='titleCell']/span[text()='Description']/following::td)[1]")).getText());
		
		

	}

}
