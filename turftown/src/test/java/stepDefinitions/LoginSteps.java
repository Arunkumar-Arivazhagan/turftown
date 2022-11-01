package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPages;

public class LoginSteps {

	LoginPages loginPage;

	public LoginSteps() {

		loginPage = new LoginPages();
	}

	@Given("^user is in login page$")
	public void login_page() {
		loginPage.loginIn();
	}
	
	@When("^login as ([^\"]*)$")
	public void login_as(String user) {
		switch (user) {
	       case "abi":
	    	   loginPage.phoneNumber("");
	          break;  
	       case "kumar":  
	    	   loginPage.phoneNumber("");
	          break;
	       case "arun":
	    	   loginPage.phoneNumber("");
	          break;  
	       case "prahlad":  
	    	   loginPage.phoneNumber("");
	          break;
		}
	}

	@When("^perform valid phonenumber flow with (.+)$")
	public void user_enters_valid_phone(String phone) {
		loginPage.phoneNumber(phone);
	}

	@When("^perform invalid phonenumber flow with phonenumber$")
	public void user_try_to_login_in() {
		loginPage.phoneNumber("99529507");
	}

	@Then("^perform valid otp flow with (.+)$")
	public void user_enters_otp(String otp) {
		loginPage.enterOtp(otp);
	}

	@Then("^perform invalid otp flow with otp$")
	public void user_enters_invalid_otp() {
		loginPage.enterOtp("1011");
	}

	@And("^perform invalid fullname flow with fullname$")
	public void user_enters_fullname() {
		loginPage.enterNameInvalid("@#$");
		loginPage.enterNameInvalid("Arun  Kumar");
		loginPage.enterNameInvalid("Ar");
		loginPage.profanityFullname();
	}

	@And("^perform valid fullname flow with (.+)$")
	public void user_enters_valid_fullname(String fullname) {
		loginPage.enterName(fullname);
	}

	@Then("^perform invalid username flow with username$")
	public void user_enters_invalid_username() {
		loginPage.enterUserNameInvalid("  ");
		loginPage.enterUserNameInvalid("@#$");
		loginPage.enterUserNameInvalid("Arun");
		loginPage.profanityUsername();
	}

	@Then("^perform valid username flow with (.+)$")
	public void user_enters_valid_username(String username) {
		loginPage.enterUserName(username);
	}

	@Then("^perform invalid email flow with emailid$")
	public void user_enters_invalid_email() {
		loginPage.enterEmail("a@g.com");
		// loginPage.enterEmail("");
		// loginPage.enterEmail("");
	}

	@Then("^perform valid email flow with (.+)$")
	public void user_enters_valid_email(String email) {
		loginPage.enterEmail(email);
	}

	@Given("^user clicks on upload and selects an image$")
	public void user_uploading_picture() {
		loginPage.uploadClick();
		loginPage.uploading();
		loginPage.nextButton();
	}

	@Then("^user can edit the picture after uploading$")
	public void user_edit_after_uploading_picture() {
		loginPage.editUpload();
		loginPage.nextButton();
	}

	@When("^user can skip by clicking on next without selection$")
	public void skip_to_next_without_selection() {
		loginPage.nextButton();
	}

	@When("^user clicks on back button$")
	public void user_clicks_on_back_button() {
		loginPage.backButton();
	}

	@Then("^user can select preferences of sports$")
	public void user_can_select_preferences_of_sports() {
		loginPage.preferenceSelection();
		loginPage.nextButtonPreference();
	}

	@And("^user allows the app to search your contact$")
	public void user_allows_the_app_to_search_your_contact() {
		loginPage.allowContacts();
		loginPage.nextButtonContacts();
	}

	@Then("^user allows the app to access the current location$")
	public void user_allows_the_app_to_access_the_current_location() {
		loginPage.locationPermission();
	}

	@Then("^user selects not now button on (.+)$")
	public void user_selects_not_now_button_on_contacts() {
		loginPage.notNow();
	}

	@And("^click on resend link$")
	public void click_on_resend_link() {
		loginPage.resend();
	}

	@Then("^user enters otp through (.+)$")
	public void user_enters_otp_through(String type) {
		if (type.equalsIgnoreCase("phonenumber")) {
			loginPage.enterOtp("1010");
		} else if (type.equalsIgnoreCase("email")) {
			loginPage.enterOtp("1010");
		}
	}

	@Then("^user gets both sms and mail option$")
	public void user_gets_both_sms_and_mail_option() {
		loginPage.resend();
		loginPage.resendSms();
		loginPage.sendButtonClick();
		loginPage.resendMail();
		loginPage.sendButtonClick();
	}
}
