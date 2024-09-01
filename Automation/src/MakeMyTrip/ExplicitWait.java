package MakeMyTrip;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ExplicitWait {

		
		public static void main(String[] args) {
			
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.shoppersstack.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.findElement(By.xpath("//span[text()=' FAIR AND HANDSOME']")).click();
			driver.findElement(By.id("Check Delivery")).sendKeys("144901");
			
		
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
		  
		  

		  //elementToBeClickable just like this we need to explore more methods 
			
					
			
		}
	}
	
