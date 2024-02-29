Feature: Interest around the year

  @EndToEnd
  Scenario Outline: Capturing Data from Car Loan 
    Given user launches the app
    When user enters loan amount "<amount>"
    And enters loan interst rate "<interest>"
    And enters loan term "<tenure>"
    Then diplay monthly interest and principal amount
    And the emi is displayed
    And Total interest payable
    And Total payable amount

    Examples: 
      | amount  | interest | tenure |
      | 1500000 |      9.5 |      1 |

  @EndToEnd
  Scenario Outline: Giving input to Home Loan and capturing year to year table
    Given opens Home loan calculator
    When user enters Home Value "<homeVale>"
    And One-time Expenses "<OneTimeExpenses>"
    And Margin OR Down Payment "<Dp>"
    And Property Taxes "<Taxes>"
    And Loan Insurance "<loanInsurance>"
    And Home Insurance "<homeInsurance>"
    And Loan Amount
    And Maintenance Expenses "<maintenance>"
    And Interest Rate "<interest>"
    And Loan Tenure "<loanTenure>"
    And Loan Fees & Charges "<fees>"
    And Start Month & Year
    And extract all the data from year on year table & store in excel

    Examples: 
      | homeVale | OneTimeExpenses | Dp | Taxes | loanInsurance | homeInsurance | maintenance | interest | loanTenure | fees |
      |  4000000 |              20 | 25 |   0.5 |        500000 |          0.05 |        3500 |      9.5 |         15 |    1 |

  @EndToEnd
  Scenario Outline: UI check in Loan Emi Calculator
    Given user navigate emi calculator
    Then verify emi amount text box
    And emi slider is working
    When user enter emi amount "<Amount>"
    Then verify emi interest rate text box
    And emi interest slider
    When user enters emi interest rate "<Interest>"
    Then verify emi tenure text box
    And emi tenure slider
    When user enters emi Tenure "<Tenure>"
    Then verify Fees and Charges text box
    And emi Fees and Charges slider
    When user enters emi Fees and Charges "<Fees>"
    Then verify scale

    Examples: 
      | Amount  | Interest | Tenure | Fees  |
      | 1000000 |     11.5 |     15 | 25000 |

  @EndToEnd
  Scenario Outline: UI check in  Loan Amount Calculator
    Given user navigate to loan emi calculator
    Then verify loan emi text box
    And loan emi slider is working
    When user enter loan emi "<emi>"
    Then verify loan interest rate text box
    And loan interest slider
    When user enters loan interest rate "<Interest>"
    Then verify loan tenure text box
    And loan amount calculator tenure slider
    When user enters loan Tenure "<Tenure>"
    Then verify loan amount calculator Fees and Charges text box
    And loan loan amount calculator Fees and Charges slider
    When user enters loan amount calculator Fees and Charges "<Fees>"
    Then verify loan amount calculator scale

    Examples: 
      | emi      | Interest | Tenure | Fees  |
      | 11681.90 |     11.5 |     15 | 25000 |

  @EndToEnd
  Scenario Outline: UI check in  Loan Tenure Calculator
    Given user navigate to loan tenure calculator
    Then verify tenure loan amount text box
    And loan tenure calculator amount slider
    When user enters Tenure loan amount  "<Amount>"
    Then verify Tenureloan emi text box
    And Tenureloan emi slider is working
    When user enter Tenureloan emi "<emi>"
    Then verify Tenureloan interest rate text box
    And Tenureloan interest slider
    When user enters Tenureloan interest rate "<Interest>"
    Then verify Tenureloan amount calculator Fees and Charges text box
    And loan Tenure amount calculator Fees and Charges slider
    When user enters loan Tenure calculator Fees and Charges "<Fees>"
    Then verify loan Tenure calculator scale

    Examples: 
      | emi      | Interest | Amount  | Fees  |
      | 11681.90 |     11.5 | 1000000 | 25000 |
