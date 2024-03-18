package com.appium_assignment.Appium_Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class open_realdevice {
	@Test 
	public void lpress() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung-sm_m315f-RZ8NA25XZNE");
		cap.setCapability("udid","RZ8NA25XZNE");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		URL url=new URL("http://127.0.0.1:4723");
		AppiumDriver driver=new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    Thread.sleep(2000);
}
	}