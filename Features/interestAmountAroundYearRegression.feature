Feature: Interest Amount Around Year Regression

  @regression
  Scenario: verify navigation bar in emi calculator home page
    Given user navigate carLoan calculator in emi web application
    Then verify dashbord tab present in emi calculator web application

  @regression
  Scenario: verify the links are working in emi calculator home page
    Given user navigate to car loan in emi web application
    Then verify link in car loan in emi web application

  @regression
  Scenario: verify share and print button available in car loan calculator emi web application
    Given User navigate to car loan calculator emi webapplication
    When user scroll to print and share button in car loan calculator
    Then verify Share button avalable in car loan calculator
    And verify print button available in car loan calculator

  @regression
  Scenario: verify all chart present in car loan calculator in emi web application
    Given user navigate to carloan calculator in emi webapplication
    When user enters valid data car loan calculator
    Then verify pi chart available in car loan calculator
    And verify graph chart available in car loan calculator

  @regression
  Scenario Outline: verify all scale in Home Loan Calculator in emi web application
    Given user navigate to home loan calculator in emi web application
    Then verify all scale are working in home loan calculator in emi web application

  @regression
  Scenario: verify emi scheme in car loan calculator in emi web application
    Given user navigate to carloan in emi webapplication
    Then verify emi scheme in carloan calculator in emi web application
    And verify emi advance and arrears button in carloan calculator in emi web application
