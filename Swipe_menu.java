package com.appium_assignment.Appium_Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Swipe_menu extends Baseclass {
	@Test
public void Swipemenu() throws InterruptedException {
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Dilip");
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
	Thread.sleep(3000);

	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	Thread.sleep(2000);
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"));")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(2000);
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(2000); 
	
}
}
