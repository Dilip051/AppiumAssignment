package com.appium_assignment.Appium_Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class First_launch_emulator {
@Test
	public void test() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Dilip");
		options.setApp("C:\\Appium\\apk file-20240209T045039Z-001\\apk file\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
}
}
