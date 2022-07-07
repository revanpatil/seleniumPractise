package test;

//import java.awt.List;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edrawings {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		deleteCookies();

	}
	
	public static void deleteCookies(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edrawingsviewer.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("footer_tc_privacy_button_2")).click();
		
		
		//driver.navigate().to("https://stackoverflow.com/questions/30192092/for-loop-for-checking-list-of-items-in-selenium-webdriver");
		List<WebElement> navigationElements = driver.findElements(By.className("ds-menu__links"));
		System.out.println(2);	
	}
	

		/*List<WebElement> navigationElements = driver.findElements(By.className("ds-menu__links"));
		
	//	String[] array = {"View","Share","Products","Support"};
		
		
		navigationElements.get(1).click();
		for(int i=1; i<=navigationElements.size(); i++){
			
			(navigationElements).click(i);
		}*/
		
		
	

}
