package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

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
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		Select currency = new Select(driver.findElement(By.id("currencyUomId")));
		currency.selectByValue("INR");
		
		driver.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("NRI Account");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Sundar");
		driver.findElement(By.name("officeSiteName")).sendKeys("Chennaite");
		driver.findElement(By.xpath("(//input[@class = 'inputBox'])[5]")).sendKeys("600000");
		
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByVisibleText("Computer Software");
		
		Select ownerShip = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownerShip.selectByVisibleText("S-Corporation");
		
		Select source = new Select(driver.findElement(By.id("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select market = new Select(driver.findElement(By.id("marketingCampaignId")));
		market.selectByIndex(6);
		
		Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String errText = driver.findElement(By.xpath("//ul[@class='errorList']/li")).getText();
		System.out.println(errText);

	}

}
