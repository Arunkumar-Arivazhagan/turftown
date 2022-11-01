Feature: Full booking flow

  @football @booklater
  Scenario: Verify booking flow with book later flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book later

  @football @booknow @advance @gameformat
  Scenario: verify player is able to book football by making advance payment with book now
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book now
    When select the game format
    Then taps on Pay button
    And completes payment using RazorPay
		#Then use edit game info to edit football game
		
  @football @booknow @fullpayment
  Scenario: Verify booking flow with making full payment with book now flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot for full payment
    Then taps on next button
    And taps on book now
    Then tap on full amount
    Then taps on Pay button
    And completes payment using RazorPay

  @football @genericoffer
  Scenario: Verify booking slot with venue generic offer flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot for genric offer
    And verify generic offer is applied for the venue
    Then taps on next button
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay

  @football @usingcoupon
  Scenario: Verify booking slot with venue generic offer flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot to book using coupons
    Then taps on next button
    And taps on book now
    And verify coupon can be availed for the venue
    Then taps on Pay button
    And completes payment using RazorPay
    
  @football @usingcoins
  Scenario: Verify booking slot with venue generic offer flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot to book using coins
    Then taps on next button
    And taps on book now
    And verify coins can be availed for the venue
    Then taps on Pay button
    And completes payment using RazorPay
    
  @football @usingcoins @usingcoupons
  Scenario: Verify booking slot with venue coins coupons and generic flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot for genric offer with coins and coupons
    Then taps on next button
    And taps on book now
    And verify coupon can be availed for the venue
    And verify coins can be availed for the venue
    Then taps on Pay button
    And completes payment using RazorPay

  @badminton @booknow @advance
  Scenario: verify player is able to book badminton by making advance payment with book now
    Given player navigates to explore ui
    When select preferred sport badminton
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay
  	#Then use edit game info to edit badminton game
  
  @cricket @booknow @advance
  Scenario: verify player is able to book cricket by making advance payment with book now
    Given player navigates to explore ui
    When select preferred sport cricket
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay
  	#Then use edit game info to edit cricket game
  
  @basketball @booknow @advance
  Scenario: verify player is able to book basketball by making advance payment with book now
    Given player navigates to explore ui
    When select preferred sport basketball
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay
    #Then use edit game info to edit basketball game
