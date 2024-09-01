package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopList {

	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop",Keys.ENTER);
	/*List<WebElement> alllaptoplist = driver.findElements(By.xpath("//div[@class='tUxRFH']"));
	
	for(int i=0;i<=alllaptoplist.size();i++)
	{
		System.out.println(alllaptoplist.get(i).getText());
		System.out.println("==========================");
		
	}*/ // This code is also fine when to take the list of all Laptop product with all details.
	
	//below code is if we want only the list of name and price or similarly we can try for any specific details from the search list 
	List<WebElement> productname = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	List<WebElement> productprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	
	for(int i=0;i<productprice.size();i++)
	{
		for(int x=i;x<=i;x++)
		{
		System.out.println(productname.get(x).getText()+"===>"+productprice.get(i).getText());
		//System.out.println(productprice.get(i).getText());
		//System.out.println("==========================");
		}
		//System.out.println(productprice.get(i).getText());
		//System.out.println("==========================");
	}
	
	
	
}
}