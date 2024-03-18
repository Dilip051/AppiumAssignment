package com.appium_assignment.Appium_Assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class basefor_long {
	 public AndroidDriver driver;
	public void longPressAction(WebElement ele) throws InterruptedException
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
//		implicit wait
		
		Thread.sleep(5000);
	}
}
