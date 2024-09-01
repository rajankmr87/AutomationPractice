package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTextField = driver.findElement(By.id("small-searchterms"));
		searchTextField.sendKeys("books");
		Thread.sleep(2000);
		searchTextField.clear();
		//Thread.sleep(2000);
		searchTextField.sendKeys("computers");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		String color = logo.getCssValue("color");
		System.out.println(color);
		
		String font = logo.getCssValue("font-size");
		System.out.println(font);
		
		System.out.println(logo.getAttribute("src"));
		
		Dimension size = searchTextField.getSize();
		System.out.println(size);
		
		Point cordinates = searchTextField.getLocation();
		System.out.println(cordinates);
		
		Rectangle rect = searchTextField.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
	}

}
