package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("zahra@yahoo.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement firstLeadName = driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]"));
		String name = firstLeadName.getText();
		firstLeadName.click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String titleHeader = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		String actualHeader = "Duplicate Lead";
		
		if(titleHeader.equals(actualHeader))
		{
			System.out.println("we are in correct duplicate lead page");
		}
		else
		{
			System.out.println("we are in wrong page");
		}

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		String firstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		if(name.equals(firstName))
		{
			System.out.println("both lead names are same");
		}
		
		else
		{
			System.out.println("Both lead names are different");
		}
		
		driver.close();
	}

}
