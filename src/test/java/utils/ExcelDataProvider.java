package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider = "test1Data")
	public void test1(String username, String password) throws InterruptedException{
		System.out.println(username+ " |" +password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}

	@DataProvider(name = "test1Data")
	public Object[][] getData(){
		String excelPath = "C:/Users/RPL21/automation/Selenium4Project/excel/data.xlsx";
		Object data[][] = testData(excelPath,"sheet1");
		return data;
	}
	public Object[][] testData(String excelPath, String sheetName){

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];
		for(int i =1; i<rowCount ; i++ ){
			for(int j =0; j<colCount; j++ ){

				String CellData = excel.getCellDataString(i, j);

				System.out.print(CellData+ "|");

				data[i-1][j] = CellData;
			}
			System.out.println();
		}
		return data;
	}

}
