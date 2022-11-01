package com.driverUtils;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverManager {

	public static AndroidDriver driver;
	private static DesiredCapabilities dCap = new DesiredCapabilities();
	private static URL url = null;
	private static String APP = "/Users/arun/git/turftown/turftown/src/test/resources/lib/sprint_9_3.apk";
	private static String execution = "mobile";
	private static String DEVICE_ID = "d35898d8";
	//private String DEVICE_ID = "emulator-5554";
	//private String DEVICE_ID = "adb-d35898d8-bUZsJp._adb-tls-connect._tcp.";

	public AndroidDriver setUp() throws MalformedURLException {
		try {
			if (execution.equalsIgnoreCase("mobile")) {
				System.out.println("BEFORE...");
				/*
				dCap.setCapability("platformName", "Android");
				dCap.setCapability("appium:platformVersion", "12");
				dCap.setCapability("appium:deviceName", "OnePlus");
				dCap.setCapability("appium:automationName", "UiAutomator2");
				dCap.setCapability("appium:app", APP);
				dCap.setCapability("appium:udid", DEVICE_ID);
//				dCap.setCapability("noReset", "true");	//if already installed don't install again
				//dCap.setCapability("appPackage", "com.turftownapp");
				//dCap.setCapability("appActivity", "com.turftownapp.MainActivity");
//				dCap.setCapability("autoGrantPermissions", "true");
				*/
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("OnePlus")
						.setPlatformName("Android")
						.setPlatformVersion("12")
//						.setAppPackage()
//						.setAppActivity();
						.setApp("APP")
						.setNoReset(true);
				

				url = new URL("http://localhost:4724");

				driver = new AndroidDriver(url, dCap);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver = new AndroidDriver(url, options);
				
				System.out.println("Started...");
				
			} else if (execution.equalsIgnoreCase("emulator")) {
				System.out.println("BEFORE...");
				dCap.setCapability("platformName", "Android");
				dCap.setCapability("platformVersion", "12");
				dCap.setCapability("deviceName", "Android Emulator");
				dCap.setCapability("automationName", "UiAutomator2");
				dCap.setCapability("app", APP);
				dCap.setCapability("udid", DEVICE_ID);
				dCap.setCapability("noReset", "true");
				//dCap.setCapability("appPackage", "com.turftown");
				//dCap.setCapability("appActivity", "com.turftownapp.MainActivity");
				url = new URL("http://127.0.0.1:4724");

				driver = new AndroidDriver(url, dCap);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				System.out.println("Started...");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public AndroidDriver setUpDriver() throws Exception {
		DriverManager driverManager = new DriverManager();
		return driverManager.setUp();
	}

	public void quitDriver() {
		driver.quit();
	}
}
