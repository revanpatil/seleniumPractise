package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://3dexperiencelab.3ds.com/en/submit-your-project/");

		
		driver.findElement(By.id("footer_tc_privacy_button_3")).click();
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.name("startup_name")).sendKeys("test");
		Thread.sleep(1000);
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.name("website")).sendKeys("https://www.w3schools.com/");
		Thread.sleep(500);
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.name("number_of_cofounders")).sendKeys("5");
		Thread.sleep(500);
		
		driver.findElement(By.name("number_of_employees")).sendKeys("100");
		Thread.sleep(500);
		
		driver.findElement(By.name("date_created")).sendKeys("01/06/1999");
		Thread.sleep(500);
		
		driver.findElement(By.name("legal_status")).sendKeys("ltd company");
		Thread.sleep(500);
		
		driver.findElement(By.name("project_description")).sendKeys("W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.");
		Thread.sleep(1000);
		
		driver.findElement(By.id("edit-project-status-radios-first-product")).click();
		
		driver.findElement(By.id("edit-project-theme-checkboxes-life")).click();
		Thread.sleep(500);
		
		driver.findElement(By.name("benefits")).sendKeys("W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.W3Schools is a freemium educational website for learning coding online. Developed in 1998, it derives its name from the World Wide Web but is not affiliated with the W3C. W3Schools offers courses covering all aspects of web development. It is run by Refsnes Data in Norway.");
		Thread.sleep(1000);
		
		driver.findElement(By.name("op")).click();
		Thread.sleep(1000);
		
		// second stage of form 
		driver.findElement(By.name("contact_name")).sendKeys("test_first_name");
		Thread.sleep(500);
		
		driver.findElement(By.name("contact_surname")).sendKeys("test_last_name");
		Thread.sleep(500);
		
		driver.findElement(By.name("contact_phone")).sendKeys("0123456789");
		Thread.sleep(500);
		
		driver.findElement(By.name("contact_address")).sendKeys("test address");
		Thread.sleep(500);
		
		driver.findElement(By.name("contact_country")).sendKeys("test_country");
		Thread.sleep(500);
		
		driver.findElement(By.name("contact_email")).sendKeys("test@test.test");
		Thread.sleep(500);
		
		driver.findElement(By.name("privacy_policy")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("newsletter_agreement")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(1000);
		
	
		
		driver.navigate().to("https://3dexperiencelab.3ds.com/en/submit-your-project/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().window(originalWindow);
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
		
		driver.switchTo().window(originalWindow);
		Thread.sleep(1000);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));
		
		//JavascriptExecutor
		
		driver.close();
		driver.quit();
		
		//https://stackoverflow.com/questions/42331659/how-to-pass-selenium-webdriver-instance-to-another-class

	}

}
