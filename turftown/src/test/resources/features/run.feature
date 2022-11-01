Feature: Full booking flow

  @football @booklater
  Scenario: Verify booking flow with book later flow
    Given player navigates to explore ui
    When select preferred sport football
    And hosts a game in the venue
    Then player picks the desired slot
    Then taps on next button
    And taps on book later
