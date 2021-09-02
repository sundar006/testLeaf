package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstNameField")).sendKeys("sundar");
		driver.findElement(By.id("lastNameField")).sendKeys("k");
//		driver.findElement(By.name("firstName")).sendKeys("Sundar");
//		driver.findElement(By.name("lastName")).sendKeys("K");
		
		driver.findElement(By.xpath("//input[contains(@id, 'firstNameLocal')]")).sendKeys("suns");
		driver.findElement(By.name("lastNameLocal")).sendKeys("smart");
		driver.findElement(By.name("departmentName")).sendKeys("sun dept");
		driver.findElement(By.xpath("//textarea[contains(@id, 'description')]")).sendKeys("test desc");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//textarea[contains(@id, 'description')]")).clear();
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.className("smallSubmit")).click();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		

	}

}
