Feature: Interest around the year

  @EndToEnd
  Scenario Outline: user retrive monthy principel amount and interest  for Car Loan from emi calculator web application
    Given user navigate to car loan calculator in emi Web page
    When user enters loan amount "<amount>" in car loan in emi calculator 
    And user enters loan interest rate "<interest>" in car loan in emi calculator 
    And user enters loan tenure "<tenure>" in car loan in emi calculator 
    Then diplay monthly interest and principal from car loan calculatro
    And verify monthly emi is displayed in car loan calculator
    And verify Total interest payable is displayed in car loan calculator
    And verify Total payable amount is displayed in car loan calculator

    Examples: 
      | amount  | interest | tenure |
      | 1500000 |      9.5 |      1 |

  @EndToEnd
  Scenario Outline: User gives input and retrive year to year table from Home Loan calculater in emi web application
    Given User navigate to home loan calculator in emi web application
    When user enters home vale "<homeVale>" in home loan calculator 
    And user enters One Time Expenses "<OneTimeExpenses>" in home loan calculator 
    And user enters Down Payment "<DownPayment>" in home loan calculator 
    And user enters Taxes "<Taxes>" in home loan calculator 
    And user enters loan Insurance "<loanInsurance>" in home loan calculator 
    And user enters home Insurance "<homeInsurance>" in home loan calculator 
    And user enters Loan Amount in home loan calculator
    And user enters maintenance "<maintenance>" in home loan calculator 
    And user enters interest "<interest>" in home loan calculator 
    And user enters loan Tenure "<loanTenure>" in home loan calculator 
    And user enters Loan fees "<fees>" in home loan calculator 
    And user enters Start Month & Year in home loan calculator
    And user enters extract all the data from year on year table & store in excel

    Examples: 
      | homeVale | OneTimeExpenses | DownPayment | Taxes | loanInsurance | homeInsurance | maintenance | interest | loanTenure | fees |
      |  4000000 |              20 |          25 |   0.5 |        500000 |          0.05 |        3500 |      9.5 |         15 |    1 |

  @EndToEnd
  Scenario Outline: UI checks in Loan Emi Calculator in emi web application
    Given user navigate to emi calculator in loan calculator from emi web application 
    Then verify amount text box in emi calculator
    And verify amount slider working in emi calculator
    When user enter Amount "<Amount>" in emi calculator 
    Then verify emi interest rate text box in emi calculator
    And verify interest slider working in emi calculator
    When user enters Interest "<Interest>" in emi calculator 
    Then verify tenure text box in emi calculator
    And verify tenure slider wroking in emi calculator
    When user enters Tenure "<Tenure>" in emi calculator 
    Then verify Fees and Charges text box in emi calculator
    And verify Fees and Charges slider in emi calculator
    When user enters Fees and Charges "<Fees>" in emi calculator
    Then verify scale in emi calculator

    Examples: 
      | Amount  | Interest | Tenure | Fees  |
      | 1000000 |     11.5 |     15 | 25000 |

  @EndToEnd
  Scenario Outline: UI checks in  Loan Amount Calculator in emi web application
    Given user navigate to loan Amount calculator in loan calculator from emi web application
    Then verify loan emi text box in loan amount calculator
    And verify loan emi slider is working in loan amount calculator
    When user enter loan emi "<emi>" in loan amount calculator
    Then verify loan interest rate text box in loan amount calculator
    And verify loan interest slider is working in loan amount calculator
    When user enters loan Interest "<Interest>" in loan amount calculator
    Then verify loan tenure text box in loan amount calculator
    And verify loan tenure slider is working in loan amount calculator
    When user enters loan Tenure "<Tenure>" in loan amount calculator
    Then verify loan Fees and Charges text box in loan amount calculator
    And verifyloan loan Fees and Charges slider is working in loan amount calculator
    When user enters loan Fees and Charges "<Fees>" in loan amount calculator
    Then verify scales in loan amount calculator

    Examples: 
      | emi      | Interest | Tenure | Fees  |
      | 11681.90 |     11.5 |     15 | 25000 |

  @EndToEnd
  Scenario Outline: UI checks in  Loan Tenure Calculator in emi web application
    Given user navigate to loan tenure calculator in loan calculator from emi web application 
    Then verify amount text box in loan tenure calculator
    And verify loan tenure calculator amount slider in loan tenure calculator
    When user enters loan Amount "<Amount>" in loan tenure calculator 
    Then verify emi text box in loan tenure calculator
    And verify emi slider is working in loan tenure calculator
    When user enter emi "<emi>" in loan tenure calculator
    Then verify interest rate text box in loan tenure calculator
    And verify interest slider in loan tenure calculator
    When user enters Interest "<Interest>" rate in loan tenure calculator 
    Then verify Fees and Charges text box in loan tenure calculator
    And verify Fees and Charges slider in loan tenure calculator
    When user enters Fees and Charges "<Fees>" in loan tenure calculator 
    Then verify loan Tenure calculator scale in loan tenure calculator

    Examples: 
      | emi      | Interest | Amount  | Fees  |
      | 11681.90 |     11.5 | 1000000 | 25000 |
