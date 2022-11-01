package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.ExploreUIPages;

public class ExploreUISteps {

	ExploreUIPages explorePage;
	private final String BASE_URL = "http://devstage.turftown.in/api/v3/coins/add";
	private Response response;
	private Scenario scenario;
	
	public ExploreUISteps() {

		explorePage = new ExploreUIPages();
	}

	@Given("^player navigates to explore ui$")
	public void player_navigates_to_explore_ui() {
		explorePage.loginInExplore("9952950784", "1010");
		explorePage.exploreUINav();
	}

	@When("^select preferred sport football$")
	public void select_preferred_sport_football() {
		explorePage.selectFootball();
	}
	
	@When("^select preferred sport badminton$")
	public void select_preferred_sport_badminton() {
		explorePage.selectBadminton();
	}
	
	@When("^select preferred sport cricket$")
	public void select_preferred_sport_cricket() {
		explorePage.selectCricket();
	}
	
	@When("^select preferred sport basketball$")
	public void select_preferred_sport_basketball() {
		explorePage.selectBasketball();
	}

	@And("^hosts a game in the venue$")
	public void hosts_a_game_in_the_venue() {
		explorePage.hostAGame();
	}
	
	@And("^add coins to the account$")
	public void add_coins_to_the_account() {
		RestAssured.baseURI = BASE_URL;
		RequestSpecification requestSpecification = RestAssured.given();
		response = requestSpecification.when().get();
	}

	@Then("^player picks the desired slot$")
	public void player_picks_the_desired_slot() {
		explorePage.slotPickerUI();
	}
	
	@Then("^player picks the desired slot for genric offer$")
	public void player_picks_the_desired_slot_for_genric_offer() {
		explorePage.slotPickerGenricOffer();
	}
	
	@Then("^player picks the desired slot for full payment$")
	public void player_picks_the_desired_slot_for_full_payment() {
		explorePage.slotPickerUIFullpayment();
	}
	
	@Then("^player picks the desired slot to book using coupons$")
	public void player_picks_the_desired_slot_to_book_using_coupons() {
		explorePage.slotPickerUIUsingCoupon();
	}
	
	@Then("^player picks the desired slot to book using coins$")
	public void player_picks_the_desired_slot_to_book_using_coins() {
		explorePage.slotPickerUIUsingCoin();
	}
	
	@Then("^player picks the desired slot for genric offer with coins and coupons$")
	public void player_picks_the_desired_slot_for_genric_offer_with_coins_and_coupons() {
		explorePage.slotPickerGenricOfferCC();
	}
	
	@Then("^taps on next button$")
	public void taps_on_next_button() {
		explorePage.proceedingToPayment();
	}
	
	@Then("^verify generic offer is applied for the venue$")
	public void verify_generic_offer_is_applied_for_the_venue() {
		explorePage.genericOffer();
	}
	
	@And("^verify coupon can be availed for the venue$")
	public void verify_coupon_can_be_availed_for_the_venue() {
		explorePage.applyCoupon();
	}
	
	@And("^verify coins can be availed for the venue$")
	public void verify_coins_can_be_availed_for_the_venue() {
		explorePage.applyCoins();
	}

	@Then("^taps on book now$")
	public void taps_on_book_now() {
		explorePage.bookNow();
	}
	
	@Then("^tap on full amount$")
	public void taps_on_full_amount() {
		explorePage.fullPayment();
	}
	
	@When("^select the game format$")
	public void select_the_game_format()
	{
		explorePage.formatSelection();
	}
	
	@Then("^taps on book later$")
	public void taps_on_book_later() {
		explorePage.bookLater();
	}

	@Then("^taps on Pay button$")
	public void taps_on_pay_button() {
		explorePage.yourHostedGameUI();
	}

	@Then("^completes payment using RazorPay$")
	public void completes_payment_using_razor_pay() {
		explorePage.razorPayUI();
		explorePage.editGameInfo();
	}
}
