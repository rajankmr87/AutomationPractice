package MyntraDynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Dynamic {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jeans",Keys.ENTER);
		WebElement p = driver.findElement(By.xpath("(//h4[text()='Men Yonk Skinny Fit Jeans']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice'])[1]"));
		System.out.println(p.getText());
}
}
