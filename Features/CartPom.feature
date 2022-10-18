Feature: Place order functionality is working fine or not

  Scenario: Place order from the begin
    Given user is on the HomePage
    And user click on the signin tab
    When user enters the user_name and pass_word
    And user click the loginbutton
    And user enters the hompage
    And user clicks AddtoCart for any product
    And user gets the price
    And user clicks contiue shoppingg
    And user clicks the checkout options
    And user compares the Actuall price and Cart values
    Then place the order