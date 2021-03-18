package org.data;
n 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo {
	
	@BeforeSuite
	private void beforesuite() {
		System.out.println("beforesuite");
	}
	
	@AfterSuite
	private void aftersuite() {
		System.out.println("aftersuite");
	}
	
	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("afterClass");
	}
	
	@BeforeTest
	private void beforeTest() {
		System.out.println("before test");
	}
	
	@AfterTest
	private void afterTest() {
		System.out.println("after test");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before nethod");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("after nethod");
	}
	
	@Test
	private void test() {
		System.out.println("test");
	}
	

	@Test
	private void test1() {
		System.out.println("test1");
	}
	
	private void newMethod() {
		// TODO Auto-generated method stub

	}
}
