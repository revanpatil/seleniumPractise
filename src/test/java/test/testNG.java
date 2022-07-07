package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() throws InterruptedException{
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("ABCD");
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		
	}
}
