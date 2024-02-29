Feature: Loan Interest Smoke

  @smoke
  Scenario: verify Emiproduct tabe in emi calculator
    Given user navigates to homepage
    When user clicks on car loan
    Then verify car loan calculator opens
    When user clicks on personal loan
    Then verify personal loan calculator opens
    When user clicks on home loan calculator
    Then verify home loan calculator opens

  @smoke
  Scenario: verify all type of loan calculator in emi calculator
    Given user navigates to loan calculator
    When user clicks emi calculator
    Then verify emi calculator opens
    When user clicks loan amount calculator
    Then verify loan amount calculator opens
    When user clicks loan Tenure calculator
    Then verify loan Tenure calculator opens
    When user clicks interest rate calculator
    Then verify interest rate calculator opens

  @smoke
  Scenario: verify the text box car loan calculator in emi calculator
    Given user navugate to car loan emi calculator
    Then verify amount text box is working
    And verify interest text box is working
    And verify tenure text box is working

  @smoke
  Scenario: verify slider present in car loan calculator in emi calculator
    Given user navugate to car loan emi calculator
    When user enters the loan amount
    Then verify loan slider is available
    When user enters interest rate
    Then verify interest slider is available
    When user loan tenure
    Then verify tenure slider is available

  @smoke
  Scenario: verify tenure scale are working in car loan calculator
    Given user navigates to the home page
    When user enters valid data
    Then verify scales are working

  @smoke
  Scenario: verify relavent info is diplayed in car loan calculator
    Given user user navugate to car loan emi calculator
    When user emters car loan Amount
    And interest Rate
    And loan tenure
    Then verify monthly emi is displayed
    And total interest is diplayed
    And Total payment is displayed

  @smoke
  Scenario: verify yearly emi table is diplayed in car loan calculator
    Given user user navugate to car loan emi calculator
    When user enters all details
    Then verify year to year table is displayed

  @smoke
  Scenario Outline: Verifying output for invalid input in car loan calculator
    Given user navigate to car loan calculator
    When user enter invalid  "<amount>" ,"<interest>" and "<tenure>"
    Then verify calculator output

    Examples: 
      | amount | interest | tenure |
      | xyz    |      9.5 |      1 |

  @smoke 
  Scenario: verify drop down manue in emi calculator
    Given user navigate to the home page
    Then verify Calculator Dropdown is available

  @smoke
  Scenario Outline: Verify all box in Home loan calculator
    Given user navigate to Home loan calculator
    Then verify Home Loan Details text box working
    And verify Homeowner Expenses text box working
    And verify pi char and graph visible

  @smoke
  Scenario Outline: verify loan calculator text box in car loan calculator
    Given user navigate to loan calculator
    When user enters valid input "<amount>","<interest>","<tenure>"and"<fees>"
    Then user verify all Text box

    Examples: 
      | amount | interest | tenure | fees |
      | 500000 |      9.5 |      1 | 2500 |
      
    @smoke
    Scenario: verify all loan calculator slider emi calculator
    	Given user navigate to emi loan calculator
    	Then user verify all Slider 
