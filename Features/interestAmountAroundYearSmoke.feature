Feature: Loan Interest Smoke

  @smoke
  Scenario: verify Emiproduct tabe
    Given user navigates to homepage
    When user clicks on car loan
    Then verify car loan calculator opens
    When user clicks on personal loan
    Then verify personal loan calculator opens
    When user clicks on home loan calculator
    Then verify home loan calculator opens

  @smoke
  Scenario: verify all loan calculator in loan calculator
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
  Scenario: verify the text box
    Given user navugate to car loan emi calculator
    Then verify amount text box is working
    And verify interest text box is working
    And verify tenure text box is working

  @smoke
  Scenario: verify slider present
    Given user navugate to car loan emi calculator
    When user enters the loan amount
    Then verify loan slider is available
    When user enters interest rate
    Then verify interest slider is available
    When user loan tenure
    Then verify tenure slider is available

  @smoke
  Scenario: verify tenure scale are woeking
    Given user navigates to the home page
    When user enters valid data
    Then verify scales are working

  @smoke
  Scenario: verify relavent info is diplayed
    Given user user navugate to car loan emi calculator
    When user emters car loan Amount
    And interest Rate
    And loan tenure
    Then verify monthly emi is displayed
    And total interest is diplayed
    And Total payment is displayed

  @smoke
  Scenario: verify yearly emi table is diplayed
    Given user user navugate to car loan emi calculator
    When user enters all details
    Then verify year to year table is displayed

  @smoke
  Scenario Outline: invalid input
    Given user navigate to car loan calculator
    When user enter invalid  "<amount>" ,"<interest>" and "<tenure>"
    Then verify calculator output

    Examples: 
      | amount | interest | tenure |
      | xyz    |      9.5 |      1 |

  @smoke
  Scenario: verify drop down manue
    Given user navigate to the home page
    Then verify Calculator Dropdown is available

  @smoke
  Scenario Outline: Verify all box in Home loan calculator
    Given user navigate to Home loan calculator
    Then verify Home Loan Details text box working
    And verify Homeowner Expenses text box working
    And verify pi char and graph visible
