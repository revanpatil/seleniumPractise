package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	//@Test(dependsOnMethods = {"test2"} , priority =1)
	//@Test(dependsOnMethods = {"test2","test3"})
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1(){
		System.out.println("I am inside test1");
	}
	
	@Test(groups = {"sanity1"})
	public void test2(){
		System.out.println("I am inside test2");
	}
	
	@Test(groups ={"sanity2"})
	public void test3(){
		System.out.println("I am inside test3");
	}
}
