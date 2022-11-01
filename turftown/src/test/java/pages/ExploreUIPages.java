package pages;

import org.openqa.selenium.By;


import com.seleniumUtils.SeleniumUtils;

import io.appium.java_client.AppiumBy;

public class ExploreUIPages extends SeleniumUtils {
	// By = AppiumBy.accessibilityId("");
	// By = By.xpath("//android.widget.TextView[@text=\"Tap to resend.\"]");
	// By = By.xpath("//android.widget.TextView[contains(@text,\"Tap to resend in\")]");
	
	String toggleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	
	By startPlayingButton = AppiumBy.accessibilityId("startPlayingButton");
	By phoneNumberTextbox = AppiumBy.accessibilityId("mobileTextBox");
	By otpTextBox = AppiumBy.accessibilityId("otpInputBox");
	By nextButton = AppiumBy.accessibilityId("nextButton");
	
	By dontAllow = By.xpath("//android.widget.Button[@text=\"Don’t allow\"]");
	By cancelButtonLocation = AppiumBy.accessibilityId("android:id/button2");
	
	By exploreFootball = AppiumBy.accessibilityId("explorefootball");
	By exploreBadminton = AppiumBy.accessibilityId("explorebadminton");
	By exploreCricket = AppiumBy.accessibilityId("explorecricket");
	By exploreBasketball = AppiumBy.accessibilityId("explorebasketball");
	
	By firstFootballVenue = By.xpath("//android.widget.TextView[@text=\"Tiki Taka\"]");
	By firstBasketballVenue = By.xpath("//android.widget.TextView[@text=\"Double Dribble\"]");
	By firstCricketVenue = By.xpath("//android.widget.TextView[@text=\"Hit N Run (AC)\"]");
	By firstBadmintonVenue = By.xpath("//android.widget.TextView[@text=\"Wicked Arena\"]");
	
	By hostAGame = By.xpath("//android.widget.TextView[@text=\"Host a game\"]");
	
	//By date = AppiumBy.accessibilityId("21 SepWed");
	
	By eveningSP = AppiumBy.accessibilityId("Evening");
	
	By timeGenric1 = AppiumBy.accessibilityId("test4.30 PM");
	By timeGenric2 = AppiumBy.accessibilityId("test5 PM");
	By timeGenric3 = AppiumBy.accessibilityId("test5.30 PM");
	By timeGenric4 = AppiumBy.accessibilityId("test6 PM");
	
	By timeFrom = AppiumBy.accessibilityId("test6.30 PM");
	By timeTo = AppiumBy.accessibilityId("test7 PM");
	
	By timeFromFullpayment = AppiumBy.accessibilityId("test7.30 PM");
	By timeToFullpayment = AppiumBy.accessibilityId("test8 PM");
	
	//By date = AppiumBy.accessibilityId("28 SepWed"); //comment out during execution
//	By eveningSP = AppiumBy.accessibilityId("Twilight");
//	By timeFromUsingCoin = AppiumBy.accessibilityId("test12 AM");
//	By timeToUsingCoin = AppiumBy.accessibilityId("test12.30 AM");
	
	By timeFromUsingCoin = AppiumBy.accessibilityId("test8.30 PM");
	By timeToUsingCoin = AppiumBy.accessibilityId("test9 PM");
	
	By timeFromUsingCoupon = AppiumBy.accessibilityId("test9.30 PM");
	By timeToUsingCoupon = AppiumBy.accessibilityId("test10 PM");
	
	By timeGenric1CC = AppiumBy.accessibilityId("test10.30 PM");
	By timeGenric2CC = AppiumBy.accessibilityId("test11 PM");
	By timeGenric3CC = AppiumBy.accessibilityId("test11.30 PM");
	By timeGenric4CC = AppiumBy.accessibilityId("test12 AM");
	
//	By timeFrom = AppiumBy.accessibilityId("test11 PM");
//	By timeTo = AppiumBy.accessibilityId("test11.30 PM");
	
	By offerApplied = AppiumBy.accessibilityId("test11.30 PM");
	
	By nextButtonSP = AppiumBy.accessibilityId("bookButton");
	By bookNow = AppiumBy.accessibilityId("Book now");
	By bookLater = AppiumBy.accessibilityId("Book later");
	
	By applyCouponButton = AppiumBy.accessibilityId("applyCouponButton");
	By applyButton = By.xpath("//android.widget.TextView[@text=\"Apply\"]");
	By appliedPopupCloseButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");

	By sixVsix = AppiumBy.accessibilityId("6 v 6");
	
	By fullAmountValue = AppiumBy.accessibilityId("fullAmountValue");
	
	//By toggleCoins = AppiumBy.accessibilityId("turfCoinToggle");
	
	By toggleCoins = By.xpath(toggleXpath);
	
	By payButton = AppiumBy.accessibilityId("payButton");
	
	By netBanking = By.xpath("//android.view.View[@text=\"Netbanking All Indian banks\"]");
	By kotak = By.xpath("//android.widget.TextView[@text=\"Kotak\"]");
	By razorPayPayButton = AppiumBy.accessibilityId("footer");
	By successButton = By.xpath("//android.widget.Button[@text=\"Success\"]");
	
	By customizeYourGame = AppiumBy.accessibilityId("editGame");

	/*
	public void () { 
		try {
			click(); 
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	 
	 */
	
	public void loginInExplore(String number, String otp) {
		try {
			waitTime();
			click(startPlayingButton);
			enterText(phoneNumberTextbox, number);
			click(nextButton);
			enterText(otpTextBox, otp);
			click(nextButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exploreUINav() {
		try {
			waitTime();
			click(dontAllow);
			//click(cancelButtonLocation);
			touchFunction(407, 2246);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectFootball() {
		try {
			click(exploreFootball);
			waitTime();
			click(firstFootballVenue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectBasketball() {
		try {
			waitTime();
			click(exploreBasketball);
			waitTime();
			click(firstBasketballVenue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectCricket() {
		try {
			waitTime();
			click(exploreCricket);
			waitTime();
			click(firstCricketVenue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectBadminton() {
		try {
			waitTime();
			click(exploreBadminton);
			waitTime();
			click(firstBadmintonVenue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void hostAGame() {
		try {
			waitTime();
			click(hostAGame);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void slotPickerUI() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			Thread.sleep(1000);
			scrollDown();
			click(timeFrom);
			click(timeTo);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void slotPickerUIFullpayment() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			Thread.sleep(1000);
			scrollDown();
			click(timeFromFullpayment);
			click(timeToFullpayment);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void slotPickerUIUsingCoin() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			Thread.sleep(1000);
			scrollDown();
			click(timeFromUsingCoin);
			click(timeToUsingCoin);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void slotPickerUIUsingCoupon() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			Thread.sleep(1000);
			scrollDown();
			click(timeFromUsingCoupon);
			click(timeToUsingCoupon);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void slotPickerGenricOffer() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			//swipeAction();
			Thread.sleep(1000);
			scrollDown();
			click(timeGenric1);
			click(timeGenric2);
			click(timeGenric3);
			click(timeGenric4);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void slotPickerGenricOfferCC() { 
		try { 
			//click(date);
			waitTime();
			click(eveningSP);
			//swipeAction();
			Thread.sleep(1000);
			scrollDown();
			click(timeGenric1CC);
			click(timeGenric2CC);
			click(timeGenric3CC);
			click(timeGenric4CC);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void proceedingToPayment() { 
		try { 
			click(nextButtonSP);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void genericOffer() { 
		try { 
			//add some code to validate if the offer applied or not
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void applyCoupon() { 
		try { 
			click(applyCouponButton);
			click(applyButton);
			click(appliedPopupCloseButton);
			Thread.sleep(1000);
			swipeAction();
			click(payButton);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void applyCoins() { 
		try { 
			Thread.sleep(1000);
			swipeAction();
			click(toggleCoins);
	} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void bookNow() { 
		try {
			click(bookNow); 
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void bookLater() { 
		try {
			click(bookLater); 
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void formatSelection() { 
		try {
			Thread.sleep(1000);
			scrollDown();
			click(sixVsix);
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void fullPayment() { 
		try {
			Thread.sleep(1000);
			scrollDown();
			click(fullAmountValue);
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void yourHostedGameUI() { 
		try {
			Thread.sleep(1000);
			swipeAction();
			click(payButton);
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void razorPayUI() { 
		try {
			waitTime();
			click(netBanking);
			click(kotak);
			waitTime();
			Thread.sleep(1000);
			touchFunction(397, 2215);
			//click(razorPayPayButton);
			click(successButton);
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
	
	public void editGameInfo() {
		try {
			Thread.sleep(1000);
			click(customizeYourGame);
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}
}
