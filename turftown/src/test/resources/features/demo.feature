Feature: Full booking flow

  @booklater @advancepayment
  Scenario Outline: verify book later flow for every sporting venue
    Given player navigates to explore ui
    When serach for a <sport> venue in search box
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    And taps on book later

    Examples: 
      | sport      |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |

  @booknow @advancepayment
  Scenario Outline: verify player is able make advance payment and book every sporting venue
    Given player navigates to explore ui
    When serach for a <sport> venue in search box
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    When select the game format
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay
    Then use edit game info to edit <sport> game

    Examples: 
      | sport      | venue | format | Date
      | football   |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |

  @booknow @fullpayment
  Scenario Outline: verify player is able make full payment and book every sporting venue
    Given player navigates to explore ui
    When serach for a <sport> venue in search box
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    And taps on book now
    Then taps on full payment button
    Then taps on Pay button
    And completes payment using RazorPay
    Then use edit game info to edit <sport> game

    Examples: 
      | sport      |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |

  #Then check integration of coupon and coins
  #And generic offer setup by venue
  @offer
  Scenario Outline: Verify booking slot with venue generic offer flow
    Given player navigates to explore ui
    When serach for a <sport> venue in search box
    Then verify if the venue has any generic offer
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    And verify generic offer is applied for the venue
    And taps on book now
    Then taps on Pay button
    And completes payment using RazorPay

    Examples: 
      | sport      |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |

  @coupon
  Scenario Outline: Verify booking slot with venue generic offer flow
    Given player navigates to explore ui
    When serach for a <sport> venue in search box
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    And verify coupon is applied in the booking page

    Examples: 
      | sport      |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |

  @coin
  Scenario Outline: Verify booking slot with venue generic offer flow
    Given player has coins in his inventory
    Then player navigates to explore ui
    When serach for a <sport> venue in search box
    And hosts a game in the venue
    Then player picks the desired slot and taps on next button
    And taps on book now
    Then verify user coin balance reflects in the booking page
		#2 player booking at the same time

    Examples: 
      | sport      |
      | football   |
      | basketball |
      | cricket    |
      | badminton  |
      
      @coin @coupon
      
      
      
      
