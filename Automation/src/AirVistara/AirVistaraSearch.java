package AirVistara;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(6000);
		
		//Select the One-Way Radio Button
		driver.findElement(By.xpath("//span[text()='One Way']")).click();
		
		//Select the From Destinationl
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
		
		//Select the To Destination
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Goa International Airport']")).click();
		
		//Select the Departure Date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='  everymundo']")).click();
		
		//Select the Passengers
		driver.findElement(By.id("adds_adult")).click();
		
		for(int i=0;i<2;i++)
		{
		driver.findElement((By.id("adds_adult"))).click();
		}
		
		driver.findElement(By.xpath("(//button[text()='Done'])[2]")).click();
		
		//Click on Search button
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	}
	
}
