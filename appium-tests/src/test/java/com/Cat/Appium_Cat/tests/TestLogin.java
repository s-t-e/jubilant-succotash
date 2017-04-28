package com.Cat.Appium_Cat.tests;


import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;


public class TestLogin extends TestBase{

	@Test
	public void test() throws InterruptedException {
	//	List<MobileElement> menucategory = driver.findElementsById("design_menu_item_text");
	//	menucategory.get(5).click();
		
	driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(5000L);
		List<MobileElement> Reg =driver.findElementsByClassName("android.support.v7.widget.dg");
		Reg.get(7).click();
		
		Thread.sleep(5000L);
		
		System.out.println("before context swtich");
		// Switch to context 
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			if (contextName.contains("WEBVIEW")){
				// we need to understand which is the correct webview visible on the screen 
				System.out.println(contextName);
				driver.context(contextName);
				Thread.sleep(5000L);
//				break;
			}
		} 
		
	/*	Set contextNames = driver.getContextHandles();
		Iterator iter = contextNames.iterator();
		while (iter.hasNext()) {
		System.out.println(iter.next());
		}
		Thread.sleep(5000L);
*/
		
		
		// Now we should be in WEBVIEW mode 
				final WebElement inputField = driver.findElementById("j_username");
				inputField.sendKeys("abc");
	//	driver.findElementByXPath("//input[@id='j_username']").sendKeys("test"); 

	}

}
	
	

