package com.seleniumUtils;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import com.driverUtils.DriverManager;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class SeleniumUtils extends DriverManager {

	AndroidDriver wait;
	private final Duration timeOut = Duration.ofSeconds(5);
	
	/*
	public void apiTest(){
		String endpoint = "http://localhost:8888/api_testing/product/update.php";
        String body = """
                {
                "id": 19,
                "name": "Water Bottle",
                "description": "Blue water bottle. Holds 64 ounces",
                "price": 15,
                "category_id": 3
                }
                """;
        var response = given().body(body).when().put(endpoint).then();
        response.log().body();
    }
    */

	public void click(By locator) {

		try {
			//new WebDriverWait(AppDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(byEl)).click();
			driver.findElement(locator).click();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}

	public void clear(By locator) {

		try {
			driver.findElement(locator).clear();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}

	public String getTextFrom(By locator) {
		try {
			String message = driver.findElement(locator).getText();
			return message;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}

	public void waitTime() throws InterruptedException {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicit wait
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public static void scrollDown()
	{
		Dimension dimension = driver.manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
		
        new AndroidTouchAction((PerformsTouchActions) driver)
        .press(PointOption.point(0, scrollStart))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(0, scrollEnd))
        .release().perform();
	}
	
	public static void scrollUntilNClick(By locator){
        int retry = 0;
        while(retry <= 5){
            try{
            	driver.findElement(locator).click();
                break;
            }catch (org.openqa.selenium.NoSuchElementException e){
                scrollDown();
                retry++;
            }
        }
    }
	
	public void swipeW3C() {
	}
	
	public void swipeActionDemo() {
		//Scrollable Element
		
		WebElement ele01 = driver.findElement(AppiumBy.id("elementID"));

		int centerX = ele01.getRect().x + (ele01.getSize().width/2);

		double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);

		double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);
		//Type of Pointer Input
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		//Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger,1);
		//Move finger into starting position
		swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));
		//Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		//Finger moves to end position
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
		        PointerInput.Origin.viewport(),centerX, (int)endY));
		//Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		//Perform the actions
		driver.perform(Arrays.asList(swipe));
	}
	
	public void swipeAction() {

		// Animation default time:
		// - Android: 300 ms
		// - iOS: 200 ms
		// final value depends on your app and could be greater
		final int ANIMATION_TIME = 200; // ms

		final int PRESS_TIME = 200; // ms

		int edgeBorder = 10; // better avoid edges
		PointOption pointOptionStart, pointOptionEnd;

		// init screen variables
		Dimension dims = driver.manage().window().getSize();

		// init start point = center of screen
		pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
		pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);

		try {
			new AndroidTouchAction((PerformsTouchActions) driver).press(pointOptionStart)
					// a bit more reliable when we add small wait
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))).moveTo(pointOptionEnd).release()
					.perform();
		} catch (Exception e) {
			System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
			return;
		}
	}
	
	public static void scrollIntoView(String Text){
        //https://developer.android.com/reference/androidx/test/uiautomator/UiSelector

		/*
        String mySelector = "new UiSelector().text(\"" + Text + "\").instance(0)";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + mySelector + ");";
        ((AndroidDriver<?>) AppDriver.getDriver()).findElementByAndroidUIAutomator(command);

        ((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
                */
    }
	
	public void touchFunction(int x, int y) {
	        new TouchAction(driver)
	            .tap(point(x,y))
	            .waitAction(waitOptions(ofMillis(1000))).perform();
	    }
	
	public boolean isElementPresent(By locator) {
		return !driver.findElements(locator).isEmpty();
	}
	

	public void enterText(By locator, String[] text) {
		try {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterText(By locator, String text) {
		// System.out.println("enterText");
		try {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
