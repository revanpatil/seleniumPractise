package test;

public class SecondAssignment {
	public static void main(String[] args){
		
	//	Sakshi = 4
	//	Revan  = 3
	// Assignment : https://www.edrawingsviewer.com/ (Check navigation menu links for all navigation, and use back, forward and refresh keys for each navigations)
	// Use waits 
		
  // Assignment : Complete session 5 and 6 Assignment
	
	// notes  : create functions in same class three  metohds 
		
	// *****Method 1 :************************************************
		/*public class snapdeal {

		    static WebDriver driver= new FirefoxDriver();

		    @Test
		    public void test() {
		        //Method1 for Opening Browser.
		        openBrowser();
		        // Method2 for searching     
		        searchElement();
		    }

		    public static void openBrowser(){
		        driver.get("http://amazon.in");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    }

		    public static void searchElement(){

		        driver.findElement(By.xpath("//li[@id='nav_cat_2']")).click(); 

		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");

		        driver.findElement(By.xpath("//input[@class='nav-submit-input']")).click();

		        driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline s-access-title a-text-normal' and contains(text(), \"Fbt Men's 8876 Casual Shoes\")]")).click();
		    }

		}*/
	
	// ********Method 2 :*************************************************************************
	
		/*import java.util.concurrent.TimeUnit;
		import org.junit.Before;
		import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.safari.SafariDriver;

		public class snapdeal {

		    public WebDriver driver;

		    @Before
		    public void setUP()
		    {
		        // I want open browser in function 1
		        driver= new SafariDriver();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.get("http://amazon.in");
		        driver.manage().window().maximize();
		    }

		    @Test
		    public void test() {



		        // Function 2 for searching     
		        //driver.findElement(By.xpath("//li[@id='nav_cat_2")).click(); //element not needed      
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		        driver.findElement(By.xpath("//input[@class='nav-submit-input']")).click();
		        driver.findElement(By.xpath("//*[@title=\"Fbt Men's 8876 Casual Shoes\"]//h2")).click();
		    }
		}	
	*/
		
	// Method 3 : test ng ************************************************************************	
	}
}
