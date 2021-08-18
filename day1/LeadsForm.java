package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsForm {
	
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

	/*
	 * //Verify page title String expectTitle = "My Home | opentaps CRM"; String
	 * actualTitle = driver.getTitle();
	 * 
	 * if(actualTitle.equals(expectTitle)) {
	 * System.out.println("Page title is correct"); } else {
	 * System.out.println("Incorrect page title"); }
	 */

	//Leads
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundar");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	countryCode.clear();
	countryCode.sendKeys("6");
	
	//Source
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drpdwn = new Select(source);
	drpdwn.selectByIndex(2);
	
	driver.findElement(By.name("firstNameLocal")).sendKeys("smart");
	driver.findElement(By.name("lastNameLocal")).sendKeys("s");
	driver.findElement(By.id("createLeadForm_personalTitle"));
	driver.findElement(By.name("birthDate")).sendKeys("08/4/21");
	
	
	Select country = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	country.selectByVisibleText("Alaska");
	
	driver.findElement(By.name("submitButton")).click();
	
	String expectTitle = "View Lead | opentaps CRM";
	if(driver.getTitle().equals(expectTitle))
	{
		System.out.println("landed to the page");
	}
	else
	{
		System.out.println("page title is different");
	}
	

}

}