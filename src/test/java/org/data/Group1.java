package org.data;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups="Regression")
	public void tc1() {
		
		System.out.println("TC 1");
	}
	
	@Test(groups="sanity")
	public void tc2() {
		
		System.out.println("TC 2");
	}
	
	@Test(groups="smoke")
	public void tc3() {
		
		System.out.println("TC 3");
	}

}
