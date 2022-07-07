package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//mouseAction();
		dragAndDrop();

	}
	
	public static void mouseAction() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxB = driver.findElement(By.xpath("//li[text()='D']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxB);
		actions.contextClick(boxB);
		actions.doubleClick(boxB);
		actions.release().perform();
		
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Done");
		
		
	}
	
	public static void dragAndDrop(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(ele1, ele2);
		actions.build().perform();
		
		driver.quit();
		
	}

}
