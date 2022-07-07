package demo;

import org.testng.annotations.Test;

public class TestNGpriorityDemo {
	
	@Test
	public void one(){
		System.out.println(" I am inside test1");
	}

	@Test(priority = 1)
	public void two(){
		System.out.println(" I am inside test1");
	}
	
	@Test(priority = 1)
	public void three(){
		System.out.println(" I am inside test1");
	}

}
