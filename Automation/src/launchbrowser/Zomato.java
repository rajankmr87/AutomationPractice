package launchbrowser;

import java.awt.Cursor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']"));
		//driver.findElement(By.className("sc-cfWELz")).sendKeys("Roti");
		search.sendKeys("Ladoo");
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='sc-hZeNU sc-hMjcWo jYMgZj']")).click();
		//WebElement link = driver.findElement(By.linkText("Roti - Delivery")); 
	//	link.click();
	}

}
