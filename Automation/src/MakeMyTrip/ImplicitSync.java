package MakeMyTrip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitSync {
	
	
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Using Implicitly wait here to load the page and wait until the page fully loaded before to go next step. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
	
		driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText']/ancestor::ul[@class='makeFlex font12 headerIconsGap']")).click();

		WebElement path = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		path.click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("NDLS");
		
		driver.findElement(By.xpath("//span[@class='sr_city blackText']/ancestor::ul[@class='react-autosuggest__suggestions-list']/descendant::span[text()='Delhi']")).click();

		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Mon Sep 02 2024']")).click();
		driver.findElement(By.xpath("//li[text()='First AC']")).click();
		
	driver.findElement(By.xpath("//a[@data-cy='submit']")).click();
	
		List<WebElement> allTrains = driver.findElements(By.xpath("//div[@class='train-name']"));
		
		for(int i=0;i<allTrains.size();i++) {
			
			System.out.println(allTrains.get(i).getText());
			
			System.out.println("===========================");
		}
		
		
		//driver.close();
		
	}

	

}
