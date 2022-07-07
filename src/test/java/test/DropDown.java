package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//dropDown();
		dropDownList();
	}
	
	public static void dropDown() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement dropDown = driver.findElement(By.id("option"));
		
		Select selectObject = new Select(dropDown);
		selectObject.selectByIndex(1);
		Thread.sleep(1000);
		selectObject.selectByValue("option 2");
		Thread.sleep(2000);
		selectObject.selectByVisibleText("Option 3");
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	public static void dropDownList() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropDown = driver.findElement(By.id("option"));
		
		Select selectObject = new Select(dropDown);
		List<WebElement> allOptions = 	selectObject.getOptions();
		
		for(WebElement option : allOptions){
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option 2"))
				Thread.sleep(4000);
				option.click();
				Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
