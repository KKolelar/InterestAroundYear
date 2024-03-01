Feature: Loan Interest Smoke

  @smoke
  Scenario: verify Emiproduct tabe in emi calculator
    Given user navigates to emi calculator homepage
    When user clicks on car loan tab in emi calculator
    Then verify car loan calculator opened
    When user clicks on personal loan in emi calculator
    Then verify personal loan calculator opened
    When user clicks on home loan in emi calculator
    Then verify home loan calculator opened

  @smoke
  Scenario: verify all type of loan calculator in emi calculator
    Given user navigates to loan calculator in Emi web application
    When user clicks emi calculator in loan calculator
    Then verify emi calculator opend in loan calculator
    When user clicks loan amount calculator in loan calculator
    Then verify loan amount calculator opend in loan calculator
    When user clicks loan Tenure calculator in loan calculator
    Then verify loan Tenure calculator opend in loan calculator
    When user clicks interest rate calculator in loan calculator
    Then verify interest rate calculator opend in loan calculator

  @smoke
  Scenario: verify text boxs in car loan calculator in emi calculator
    Given user navigate to car loan in emi web application
    Then verify amount text box is working in car loan calculator
    And verify interest text box is working in car loan calculator
    And verify tenure text box is working in car loan calculator

  @smoke
  Scenario: verify slider present in car loan calculator in emi web application
    Given user navigate to car loan calculator in emi web application
    When user enters the loan amount in car loan calculator
    Then verify loan slider is available in car loan calculator
    When user enters interest rate in car loan calculator
    Then verify interest slider is available in car loan calculator
    When user enters loan tenure in car loan calculator
    Then verify tenure slider is available in car loan calculator

  @smoke
  Scenario: verify tenure scale are working in car loan calculator
    Given user navigates to car loan in emi Web application home page
    When user enters valid data in car loan calculator
    Then verify scales are working in car loan calculator

  @smoke
  Scenario: verify relavent info is diplayed in car loan calculator
    Given user user navigate to car loan calculator in homepage
    When user emters car loan Amount in car loan calculator
    And user emters interest Rate in car loan calculator
    And user emters loan tenure in car loan calculator
    Then verify Monthly Emi is displayed in car loan calculator
    And total interest is diplayed in car loan calculator
    And Total payment is displayed in car loan calculator

  @smoke
  Scenario: verify yearly emi table is diplayed in car loan calculator in emi calculator home page
    Given user navigate to car loan calculator in Emi calculator web application
    When user enters all details in car loan calculator
    Then verify year to year table is displayed in car loan calculator

  @smoke
  Scenario Outline: Verifying output for invalid input in car loan calculator
    Given user navigate to car loan calculator in emi calculator
    When user enter invalid in car loan calculator "<amount>" ,"<interest>" and "<tenure>"
    Then verify calculator output in car loan calculator

    Examples: 
      | amount | interest | tenure |
      | xyz    |      9.5 |      1 |

  @smoke
  Scenario: verify drop down manue in emi calculator
    Given user navigate to emi calculator home page
    Then verify Calculator Dropdown is available in emi web application homepage

  @smoke
  Scenario Outline: Verify all box in Home loan calculator in loan calculatro from emi web application
    Given user navigate to Home loan calculator from emi calculator homepage
    Then verify Home Loan Details text box working in home loan calculator
    And verify Homeowner Expenses text box working in home loan calculator
    And verify pi char and graph visible in home loan calculator

  @smoke
  Scenario Outline: verify emi loan calculator text box in loan calculator from emi web application
    Given user navigate to emi loan calculator in loan calculator
    When user enters valid input in emi loan calculator "<amount>","<interest>","<tenure>"and"<fees>"
    Then user verify all Text box in the emi loan calculator

    Examples: 
      | amount | interest | tenure | fees |
      | 500000 |      9.5 |      1 | 2500 |

  @smoke
  Scenario: verify all loan calculator slider emi calculator in loan calculator in emi web application
    Given user navigate to emi calculator in Loan Calculator
    Then user verify all Slider in emi loan calculator
