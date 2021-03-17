package org.data;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(groups="rerun")
	public void tc11() {
		
		System.out.println("TC 11");
	}
	
	@Test(groups="retesting")
	public void tc22() {
		
		System.out.println("TC 22");
	}
	
	@Test(groups="sanity")
	public void tc33() {
		
		System.out.println("TC 33");
	}


}
