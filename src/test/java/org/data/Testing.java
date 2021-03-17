package org.data;

import org.testng.annotations.Test;

public class Testing {
	
	
	@Test(enabled=false)
	public void tcA() {
		System.out.println("TC 1");
	}
	
	@Test(invocationCount=4,priority=2)
	public void tcC() {
		System.out.println("TC 3");
	}
	
	@Test(priority=-1)
	public void tcD() {
		System.out.println("TC 4");
	}
	
	@Test(priority=1)
	public void tcB() {
		System.out.println("TC 2");
	}
}
