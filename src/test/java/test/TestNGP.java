package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGP {
WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch(){
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		
	}
}
