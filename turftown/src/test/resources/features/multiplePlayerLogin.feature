Feature: multiplayer login

  @validflow
  Scenario Outline: valid login flow
    Given user is in login page
    When login as abi
    Then perform valid otp flow with <otp>

    Examples: 
      | otp  |
      | 1010 |