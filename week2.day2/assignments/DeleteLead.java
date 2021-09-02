package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("521");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement firstLeads = driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div)[1]/a"));
		
		String firstLead = firstLeads.getText();
		System.out.println(firstLead);
		Thread.sleep(5000);
		
		firstLeads.click();
		
		driver.findElement(By.xpath("//a[text()= 'Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String confirmText = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		String actualText = "No records to display";
		
		if(confirmText.equals(actualText))
		{
			System.out.println("lead deleted successfully");
		}
		else
		{
			System.out.println("Lead not deleted successfully");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

}