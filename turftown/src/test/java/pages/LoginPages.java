package pages;

import org.openqa.selenium.By;
import com.seleniumUtils.SeleniumUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class LoginPages extends SeleniumUtils {
	By startPlayingButton = MobileBy.AccessibilityId("startPlayingButton");
	By phoneNumberTextbox = MobileBy.AccessibilityId("mobileTextBox");
	By nextButton = MobileBy.AccessibilityId("nextButton");
	By backButton = MobileBy.AccessibilityId("backButton");
	//By arrowButton2 = By.xpath("//*[@content-desc=\"nextButton\"]");
	// By resend = MobileBy.AccessibilityId("resendLink");

	By resend = By.xpath("//android.widget.TextView[@text=\"Tap to resend.\"]");
	By resendIn = By.xpath("//android.widget.TextView[contains(@text,\"Tap to resend in\")]");
	By sendButton = By.xpath("//android.widget.TextView[@text=\"Send\"]");
	By resendSms = MobileBy.AccessibilityId("rc_vyn_sms_next");
	By resendMail = MobileBy.AccessibilityId("rc_vyn_mailText");
	// By arrowButton2 = MobileBy.AccessibilityId("pnNextButton");

	By otpTextBox = MobileBy.AccessibilityId("otpInputBox");
	By otpError = MobileBy.AccessibilityId("otpInputBox");
	By successBox = MobileBy.AccessibilityId("successBox");

	By fullNameError = By.xpath(
			"android.widget.TextView[@text='Special characters and numbers are not allowed. Lets give it another go.']");// change
																															// code
	By nameTextBox = MobileBy.AccessibilityId("nameTextBox");

	By userNameTextBox = MobileBy.AccessibilityId("unTextBox");
	By usernameError = By.xpath("//android.view.ViewGroup[@content-desc=\"username_error\"]/android.widget.TextView");

	By emailTextBox = MobileBy.AccessibilityId("emailTextBox");

	By uploadButton = MobileBy.AccessibilityId("uploadButton");
	
	By downloads = By.xpath("//android.widget.TextView[@text=\"Download\"]");
	By emulatorImage = By.xpath("//android.view.ViewGroup[@index=\"1\"]");
	
	By oneplusall = By.xpath("//android.widget.TextView[@text=\"All\"]");
	By oneplusimage = By.xpath("//com.oplus.gallery.business_lib.ui.view.SlotView[@index=0]");
	By editUpload = By.xpath("android.widget.TextView[@text='Edit']");

	By nextButtonPreference = By.xpath("//android.widget.TextView[@text=\"Next\"]");
	By football = MobileBy.AccessibilityId("preferencefootball");
	By basketball = MobileBy.AccessibilityId("preferencebasketball");
	By badminton = MobileBy.AccessibilityId("preferencebadminton");
	By cricket = MobileBy.AccessibilityId("preferencecricket");
	// By allowContacts = MobileBy.AccessibilityId("syc_button");

	By allowContacts = By.xpath("(//android.view.ViewGroup[@content-desc=\"syc_button\"])[2]/android.view.View");
	By allowContactsSystemMessage = By.id("com.android.permissioncontroller:id/permission_allow_button");
	By allowContactsNextButton = By.xpath("//android.widget.TextView[@text=\"Next\"]");

	// By locationPermission = MobileBy.AccessibilityId("preferencecricket");
	By locationPermission = By.xpath("(//android.view.ViewGroup[@content-desc=\"syc_button\"])[2]/android.view.View");
	By notNow = MobileBy.AccessibilityId("syc_notNowButton");

	String profane[] = {};

	public void loginIn() {
		try {
			waitTime();
			click(startPlayingButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void phoneNumber(String number) {
		try {
			clear(phoneNumberTextbox);
			click(phoneNumberTextbox);
			enterText(phoneNumberTextbox, number); // 9347603013
			click(nextButton);
			if (isElementPresent(otpTextBox)) {
				System.out.println("Valid 10 Digit Phone number");
			} else
				System.out.println("Invalid entry, user needs to enter 10 Digit number");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nextButton() {
		try {
			if(isElementPresent(nextButton)) {
				click(nextButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nextButtonContacts() {
		try {
			if(isElementPresent(allowContactsNextButton)) {
				click(allowContactsNextButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nextButtonPreference() {
		try {
			if(isElementPresent(nextButtonPreference)) {
				click(nextButtonPreference);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterOtp(String otp) {
		try {
			clear(otpTextBox);
			click(otpTextBox);
			enterText(otpTextBox, otp);
			click(nextButton);
			if (getTextFrom(otpError).equals("The code you entered is invalid. Please try again")) {
				System.out.println("Invalid OTP error message matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resend() {
		try {
			if (getTextFrom(resend).equals("Tap to resend.")) {
				System.out.println("Clicked on Tap to resend");
				click(resend);
				click(sendButton);
				System.out.println(isElementPresent(successBox));
			} else if (getTextFrom(resendIn).contains("Tap to resend in")) {
				System.out.println("Clicked on disabled tap to resend");
				waitTime();
				click(resend);
				click(sendButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void profanityFullname() {
		for (int i = 0; i < profane.length; i++) {
			try {
				enterText(nameTextBox, profane[i]);
				getTextFrom(fullNameError)
						.equals("We do not allow names that are offensive or profane. Kindly pick one that isn't.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void profanityUsername() {
		for (int i = 0; i < profane.length; i++) {
			try {
				enterText(userNameTextBox, profane[i]);
				getTextFrom(usernameError)
						.equals("We do not allow usernames that are offensive or profane. Kindly pick one that isn't.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void enterName(String fullName) {
		try {
			click(nameTextBox);
			enterText(nameTextBox, fullName);
			click(nextButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterNameInvalid(String fullName) {
		try {
			click(nameTextBox);
			clear(nameTextBox);
			enterText(nameTextBox, fullName);
			click(nextButton);
			if(getTextFrom(fullNameError).equals("You can't have double spaces in your name. Please try again.")) {
				System.out.println("Space error message matches");
			} else if (getTextFrom(fullNameError)
					.equals("Special characters and numbers are not allowed. Lets give it another go.")) {
				System.out.println("Special character error message matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUserName(String userName) {
		try {
			click(userNameTextBox);
			clear(userNameTextBox);
			enterText(userNameTextBox, userName);
			click(nextButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterUserNameInvalid(String userName) {
		try {
			click(userNameTextBox);
			clear(userNameTextBox);
			enterText(userNameTextBox, userName);
			if (getTextFrom(usernameError).equals("You can't have spaces in your username. Please try again.")) {
				System.out.println("Space error message matches");
			} else if (getTextFrom(usernameError).equals("Special characters are not allowed. Try again.")) {
				System.out.println("Special characters error message matches");
			} else if (getTextFrom(usernameError).equals("This username already exists. Please pick another")) {
				System.out.println("Username already exists error message matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterEmail(String email) {
		try {
			click(emailTextBox);
			clear(emailTextBox);
			enterText(emailTextBox, email);
			click(nextButton);
			wait();
			if (isElementPresent(uploadButton)) {
				System.out.println("Valid Email ID");
			} else
				System.out.println("Invalid Email ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uploadClick() {
		try {
			click(uploadButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uploading() {
		try {
			click(downloads);
			click(emulatorImage);
			//click(oneplusall);
			//click(oneplusimage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void preferenceSelection() {
		try {
			click(football);
			click(cricket);
			click(basketball);
			click(badminton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editUpload() {
		try {
			click(editUpload);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void allowContacts() {
		try {
			click(allowContacts);
			click(allowContactsSystemMessage);
			click(allowContactsNextButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void locationPermission() {
		try {
			click(locationPermission);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void notNow() {
		try {
			click(notNow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resendSms() {
		try {
			click(resendSms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resendMail() {
		try {
			click(resendMail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendButtonClick() {
		try {
			click(sendButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void backButton() {
		try {
			click(backButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
