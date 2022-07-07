package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		Thread.sleep(1000);
		alert1.accept();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		if(driver.getPageSource().contains("You successfully clicked an alert")){
			System.out.println("You successfully clicked an alert");
		}
		System.out.println("==========================");
		
		driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']")).click();
		Thread.sleep(1000);
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		Thread.sleep(1000);
		alert2.accept();
		if(driver.getPageSource().contains("You successfully clicked an alert")){
			System.out.println("You successfully clicked an alert");
		}
		System.out.println("==========================");
		
		
		driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
		Thread.sleep(1000);
		
		Alert alert3 = driver.switchTo().alert();
		
		System.out.println(alert3.getText());
		Thread.sleep(5000);
		alert3.sendKeys("revan");
		Thread.sleep(5000);
		alert3.accept();
		Thread.sleep(3000);
		if(driver.getPageSource().contains("You entered revan"))
			Thread.sleep(5000);
			System.out.println("You successfully clicked an alert");
		
		System.out.println("==========================");
		driver.close();
		driver.quit();
	}

}
