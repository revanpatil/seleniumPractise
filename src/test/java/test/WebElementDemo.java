package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	//	WebDriver driver = new ChromeDriver();
		//findElement();
		//findElements();
		//findElemetswithinElements();
		//getActiveElement();
		//findName();
		checkEnabledDisabled();
		
	}
	
	public static void findElement() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Automation step by step" + Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}
	
	public static void findElements(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for(WebElement element : elements){
			System.out.println(element.getText());
		}
		
		driver.close();
		driver.quit();
		
	}
	
	public static void findElemetswithinElements() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("ABCD" + Keys.ENTER);
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
	
	public static void getActiveElement() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
	
	public static void findName() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.name("q"));
		String name = searchBox.getTagName();
		String text = searchBox.getText();
		String cssValue = searchBox.getCssValue("color");
		
		System.out.println(name + "|" + text + "|" + cssValue);
		
		Thread.sleep(1000);
		driver.quit();
		driver.close();
		
	}
	
	public static void checkEnabledDisabled(){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox'][2]"));
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		driver.close();
		driver.quit();
	}

}
