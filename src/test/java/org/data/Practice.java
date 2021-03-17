package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice extends LibGlobal{
	
	public static void main(String[] args) {

	//Browser configuration
	browserConfig();
	
	//Launching the url
	openBrowser("https://www.facebook.com/");
	
	//maximizing the browser
	maximizeWindow();
	
	Login l=new Login();
	
	type(l.getTxtEmail(), "welcome");
	type(l.getTxtPass(), "test");
	click(l.getBtnLogin());
	
	}
}
