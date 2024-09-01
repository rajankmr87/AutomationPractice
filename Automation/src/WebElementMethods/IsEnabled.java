package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userTextfield = driver.findElement(By.name("username"));
		if (userTextfield.isEnabled())
		{
			userTextfield.sendKeys("Admin");
		}
		else
		System.out.println("It is disabled.");
	
		WebElement logo = driver.findElement(By.cssSelector("img[alt='company-branding']"));
		if (logo.isDisplayed())
			System.out.println("Logo is displayed.");
		else
			System.out.println("It is not disabled.");
*/		
		///////////////2nd Program to Open new Web browser////////////////////////////////
		
	/*	WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		
		WebElement checkBox = driver2.findElement(By.id("domain1"));
		//checkBox.click();	//If this is not comment out then it satisfy the first If condition else it will click to select the Check box on the web page.
		if (checkBox.isSelected())
		{
			System.out.println("Checkbox is selected.");
		}
		else
		{
			checkBox.click();
			System.out.println("Checkbox was not selected, now selected");
		}
	*/	
		///////////////3rd Program to Open new Web browser////////////////////////////////
		
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement searchtextField = driver3.findElement(By.xpath("//input[@name='q']"));
		searchtextField.sendKeys("iphone");
		System.out.println(searchtextField.getTagName());
		
		WebElement searchButton = driver3.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
		searchButton.submit();
		
	
		
	}

}
