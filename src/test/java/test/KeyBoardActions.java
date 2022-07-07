package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		//sendKeys();
		//selectAll();
		releasePressedKeys();
	}
	
	public static void sendKeys(){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium step by step" + Keys.ENTER);
		
		driver.close();
		driver.quit();
		
	}
	
	//KEYDOWN()
	
	public static void selectAll() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("ABCD" + Keys.ENTER);
		
		Actions actionProvider = new Actions(driver);
		Action key = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		key.perform();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
	//KEYUP 
	
	public static void releasePressedKeys() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBox = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium").keyUp(Keys.SHIFT).sendKeys(searchBox,"selenium").perform();
		
		Thread.sleep(2000);
		searchBox.clear();
		driver.quit();
		driver.close();
	}
}
