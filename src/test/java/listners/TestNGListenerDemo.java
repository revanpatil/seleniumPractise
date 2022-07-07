package listners;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listners.TestNGListners.class)
public class TestNGListenerDemo {
	@Test
	public void test1(){
		System.out.println("I am in test1");
	}
	@Test
	public void test2(){
		System.out.println("I am in test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3(){
		System.out.println("I am in test3");
	}
	
}
