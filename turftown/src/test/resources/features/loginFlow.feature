Feature: verify the login flow of the app

  @validflow
  Scenario Outline: valid login flow
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    Then perform valid otp flow with <otp>
    And perform valid fullname flow with <fullname>
    Then perform valid username flow with <username>
    And perform valid email flow with <emailid>
    Given user clicks on upload and selects an image
    When user can select preferences of sports
    And user allows the app to search your contact
    Then user allows the app to access the current location

    Examples: 
      | phonenumber | otp  | fullname  | username | emailid               |
      |  4444441004 | 1010 | Arunkumar | arunk03  | arunkumar04@gmail.com |

  @invalidflow @resend
  Scenario Outline: invalid otp login flow
    Given user is in login page
    When perform invalid phonenumber flow with phonenumber
    And perform valid phonenumber flow with <phonenumber>
    Then perform invalid otp flow with otp
    And click on resend link
    When user enters otp through phonenumber

    Examples: 
      | phonenumber |
      |  4444441001 |

  @existingresend
  Scenario Outline: resend otp flow already existing user email flow
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    Then perform invalid otp flow with otp
    And click on resend link
    When user gets both sms and mail option
    Then user enters otp through email
    And click on resend link

    Examples: 
      | phonenumber |
      |  9952950784 |

  #need to add one more digit at the end
  @invalidflow
  Scenario Outline: invalid fullname login flow
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    Then perform valid otp flow with <otp>
    And perform invalid fullname flow with fullname

    Examples: 
      | phonenumber | otp  |
      |  4444441001 | 1010 |

  @invalidflow
  Scenario Outline: invalid username login flow
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    Then perform valid otp flow with <otp>
    And perform valid fullname flow with <fullname>
    Then perform invalid username flow with username

    Examples: 
      | phonenumber | otp  | fullname  |
      |  4444441001 | 1010 | Arunkumar |

  @invalidflow
  Scenario Outline: invalid email login flow
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    Then perform valid otp flow with <otp>
    And perform valid fullname flow with <fullname>
    Then perform valid username flow with <username>
    Then perform invalid email flow with emailid
    And perform valid email flow with <emailid>
    When user clicks on upload and selects an image
    And user can skip by clicking on next without selection
    Then user selects not now button on contacts
    And user selects not now button on location

    Examples: 
      | phonenumber | otp  | fullname  | username | emailid               |
      |  4444441001 | 1010 | Arunkumar | arunk02  | arunkumar04@gmail.com |

  @resend
  Scenario Outline: resend otp flow fresh user
    Given user is in login page
    When perform valid phonenumber flow with <phonenumber>
    And perform invalid otp flow with otp
    Then click on resend link
    When user enters otp through phonenumber
    And click on resend link

    #fresh number
    Examples: 
      | phonenumber |
      |  4444410000 |
