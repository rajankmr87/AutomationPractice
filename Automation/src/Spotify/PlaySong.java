package Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySong {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("rajan.kmr.87@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//span[contains(@class, 'Text__TextElement-sc-if376j-0 hMjkY encore-text-body-medium-bold sc-jSUZER sc-gKPRtg hJfy')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='LegacyChipInner__ChipInnerComponent-sc-1qguixk-0 eJmJgo'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='CardButton-sc-g9vf2u-0 doNNoL'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hKFGwn encore-bright-accent-set'")).click();
		
	}

}
