package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class LaunchChromeBrowser {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		//click on the link with the help of linkText.
	/*	WebElement link = driver.findElement(By.linkText("Forgotten password?")); */
		
		//click on the link with the help if partialLinkText.
		WebElement link = driver.findElement(By.partialLinkText("Forgot"));
		link.click();
		
	}

}
