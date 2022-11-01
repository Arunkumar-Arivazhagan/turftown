package com.seleniumUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class miscAppiumActions {
/*
	
	public void swipeAction(Direction dir) {
	 * System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your
	 * actions
	 * 
	 * // Animation default time: // - Android: 300 ms // - iOS: 200 ms // final
	 * value depends on your app and could be greater final int ANIMATION_TIME =
	 * 200; // ms
	 * 
	 * final int PRESS_TIME = 200; // ms
	 * 
	 * int edgeBorder = 10; // better avoid edges PointOption pointOptionStart,
	 * pointOptionEnd;
	 * 
	 * // init screen variables Dimension dims = driver.manage().window().getSize();
	 * 
	 * // init start point = center of screen pointOptionStart =
	 * PointOption.point(dims.width / 2, dims.height / 2);
	 * 
	 * switch (dir) { case DOWN: // center of footer pointOptionEnd =
	 * PointOption.point(dims.width / 2, dims.height - edgeBorder); break; case UP:
	 * // center of header pointOptionEnd = PointOption.point(dims.width / 2,
	 * edgeBorder); break; case LEFT: // center of left side pointOptionEnd =
	 * PointOption.point(edgeBorder, dims.height / 2); break; case RIGHT: // center
	 * of right side pointOptionEnd = PointOption.point(dims.width - edgeBorder,
	 * dims.height / 2); break; default: throw new
	 * IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
	 * }
	 * 
	 * // execute swipe using TouchAction try { new
	 * TouchAction(driver).press(pointOptionStart) // a bit more reliable when we
	 * add small wait
	 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))).moveTo(
	 * pointOptionEnd).release() .perform(); } catch (Exception e) {
	 * System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
	 * return; }
	 * 
	 * // always allow swipe action to complete try { Thread.sleep(ANIMATION_TIME);
	 * } catch (InterruptedException e) { // ignore } }
	
	public Boolean waitForIsDisplayed(By locator) { try { wait = new
	 WebDriverWait(driver, timeOut);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); } catch
	 (Exception e) { return false; } return true; }
	 
	 public boolean waitForIsClickable(By locator) {
	 
	 try { wait = new WebDriverWait(driver, timeOut);
	 wait.until(ExpectedConditions.elementToBeClickable(locator)); } catch
	 (Exception e) { return false;
	 
	 } return true; }
	 
	 public IOSElement waitUntilClickable(By by, Integer timeout) { return
	 waitUntil(ExpectedConditions.elementToBeClickable(by), timeout); }
	 
	 //set your element and timeout you need //
	 waitUntilClickable(By.xpath("Your element"), 5);
	 
	
	public void verifyElementClickable(By locator) { //
	System.out.println("verifyElementClickable"); try { wait = new
	WebDriverWait(driver, Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.elementToBeClickable(locator)); } catch
	(Exception e) { e.printStackTrace(); Assert.fail(); } }

	 public void verifyElementClickable(By locator) {
	 //System.out.println("verifyElementClickable"); try { wait = new
	 WebDriverWait(driver, timeOut);
	 wait.until(ExpectedConditions.elementToBeClickable(locator)); } catch
	 (Exception e) { e.printStackTrace(); Assert.fail(); } }

	 public void verifyElementNotPresent(By locator) { //
	 System.out.println("verifyElementNotPresent"); try { wait = new
	 WebDriverWait(driver, null);
	 
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))); }
	 catch (Exception e) { e.printStackTrace(); Assert.fail();
	 } 
	}
	
	public void scrollDown() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void smallSwipe() {
		try {
			(new TouchAction(driver)).press(PointOption.point(558, 1284)).moveTo(PointOption.point(567, 602)).release()
					.perform();
		} catch (Exception e) {
			System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
			return;
		}
	}
	
	public static void scrollNClick(By locator, String Text) {

        while(true){
            try {
				for(WebElement el: AppDriver.getDriver().findElements(locator)){
				    if(el.getAttribute("text").equals(Text)){
				        el.click();
				        flag=true;
				        break;
				    }
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if(flag)
                break;
            else
                scrollDown();
        }
    }
	
	*/
}
