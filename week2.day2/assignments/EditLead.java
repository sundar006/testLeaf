package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		String firstName = driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]")).getText();
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement firstLeads = driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div)[1]/a"));
		firstLeads.click();
		
		String pageTitle = driver.getTitle();
		String actualTitle = "View Lead | opentaps CRM";
		
		if(pageTitle.equals(actualTitle))
		{
			System.out.println("page title matches");
		}
		else
		{
			System.out.println("page title doesn't match");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement compName = driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]"));
		compName.clear();
		compName.sendKeys("sundar");
		driver.findElement(By.xpath("(//input[@name = 'submitButton'])[1]")).click();
		driver.close();
		

	}

}
