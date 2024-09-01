package Paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/flights/");
		Thread.sleep(5000);
		
		//select mumbai
		driver.findElement(By.xpath("//span[@class='srdCode']")).click();
		driver.findElement(By.xpath("//img[@class='srdCode']")).click();
		
		
		driver.findElement(By.id("srcCode")).click();
		driver.findElement(By.id("srcCode")).clear();
		driver.findElement(By.id("srcCode")).sendKeys("DEL");
		driver.findElement(By.id("destCode")).click();
		driver.findElement(By.id("destCode")).clear();
		driver.findElement(By.id("destCode")).sendKeys("GOI");
		

		
	}

	
}
