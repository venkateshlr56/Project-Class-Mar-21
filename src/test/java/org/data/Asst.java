package org.data;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asst {
	
	@Test
	public void tc1() {
		System.out.println("1");
	}
	
	@Test
	public void tc2() {
		System.out.println("2");
		//Soft Assert
		SoftAssert s=new SoftAssert();
		s.assertTrue(false);
		System.out.println("3");
		System.out.println("4");
		
		s.assertAll();
		System.out.println("5");
		
	}
	
	@Test
	public void tc3() {
		System.out.println("6");
	}
}
