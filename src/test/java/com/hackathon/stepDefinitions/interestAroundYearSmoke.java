package com.hackathon.stepDefinitions;

import com.hackathon.factory.helperClass;
import com.hackathon.pageObjects.carLoanPage;
import com.hackathon.pageObjects.emiCalculatorPage;
import com.hackathon.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYearSmoke {
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	
	
	@Given("user navigates to homepage")
	public void user_navigates_to_homepage() {
		clp.originpage();
	}

	@When("user clicks on car loan")
	public void user_clicks_on_car_loan() {
	    clp.carClick();
	}

	@Then("verify car loan calculator opens")
	public void verify_car_loan_calculator_opens() {
	    clp.verifyCarLoanCalculator();
	}

	@When("user clicks on personal loan")
	public void user_clicks_on_personal_loan() {
	   clp.clickPersonalLaon();
	}

	@Then("verify personal loan calculator opens")
	public void verify_personal_loan_calculator_opens() {
	    clp.verifyPersonalLoanCalculator();
	}

	@When("user clicks on home loan calculator")
	public void user_clicks_on_home_loan_calculator() {
	    clp.clickHomeLaon();
	}

	@Then("verify home loan calculator opens")
	public void verify_home_loan_calculator_opens() {
	    clp.verifyHomeLoanCalculator();
	}

	@Given("user navugate to car loan emi calculator")
	public void user_navugate_to_car_loan_emi_calculator() {
		clp.originpage();
	    clp.carClick();
	}

	@Then("verify amount text box is working")
	public void verify_amount_text_box_is_working() {
	    clp.verifyCarLaonAmountTextBox();
	}

	@Then("verify interest text box is working")
	public void verify_interest_text_box_is_working() {
	    clp.verifyCarLaonInterestTextBox();
	}

	@Then("verify tenure text box is working")
	public void verify_tenure_text_box_is_working() {
	    clp.verifyCarLaonTenureTextBox();
	}

	@When("user enters the loan amount")
	public void user_enters_the_loan_amount() {
	    clp.setValeAmount();
	}

	@Then("verify loan slider is available")
	public void verify_loan_slider_is_available() {
	    clp.checkAmountSlider();
	}

	@When("user enters interest rate")
	public void user_enters_interest_rate() {
	    clp.setValeInterest();
	}

	@Then("verify interest slider is available")
	public void verify_interest_slider_is_available() {
	    clp.checkInterestSlider();
	}

	@When("user loan tenure")
	public void user_loan_tenure() {
	    clp.setValeTenure();
	}

	@Then("verify tenure slider is available")
	public void verify_tenure_slider_is_available() {
	    clp.checkTenureSlider();
	}

	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
	    clp.carClick();
	}

	@When("user enters valid data")
	public void user_enters_valid_data() {
	    clp.enterLoanAmount("1000000");
	    clp.interestRate("10.5");
	    clp.loanTenure("8");
	    ecp.emiSchemeClick();
	}

	@Then("verify scales are working")
	public void verify_scales_are_working() {
		clp.carLoanScaleCheck();
	}

	@Given("user user navugate to car loan emi calculator")
	public void user_user_navugate_to_car_loan_emi_calculator() {
	    clp.carClick();
	}

	@When("user emters car loan Amount")
	public void user_emters_car_loan_amount() {
	    clp.enterLoanAmount("175000");
	}

	@When("interest Rate")
	public void interest_rate() {
	    clp.interestRate("9.75");
	}

	@When("loan tenure")
	public void loan_tenure() {
	    clp.loanTenure("5");
	}

	@Then("verify monthly emi is displayed")
	public void verify_monthly_emi_is_displayed() {
	    clp.verifyEmi();
	}

	@Then("total interest is diplayed")
	public void total_interest_is_diplayed() {
		clp.verifyTotalInterest();
	}

	@Then("Total payment is displayed")
	public void total_payment_is_displayed() {
	    clp.verifyTotalPayable();
	}

	@When("user enters all details")
	public void user_enters_all_details() {
		clp.enterLoanAmount("1300000");
	    clp.interestRate("13.5");
	    clp.loanTenure("3");
	    ecp.emiSchemeClick();
	}

	@Then("verify year to year table is displayed")
	public void verify_year_to_year_table_is_displayed() {
		clp.checkTable();
	}

	@Given("user navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    clp.carClick();
	}

	@Then("verify Calculator Dropdown is available")
	public void verify_calculator_dropdown_is_available() {
	    ecp.checkDropDown(); 
	}

	@Given("user navigate to car loan calculator")
	public void user_navigate_to_car_loan_calculator() {
	    clp.carClick();
	}

	@When("user enter invalid  {string} ,{string} and {string}")
	public void user_enter_invalid_and(String string, String string2, String string3) {
		clp.enterLoanAmount(string);
	    clp.interestRate(string2);
	    clp.loanTenure(string3);
	    ecp.emiSchemeClick();
	}
	
	@Then("verify calculator output")
	public void verify_calculator_output() {
	    clp.invalidDataOutput();
	}
	@Given("user navigates to loan calculator")
	public void user_navigates_to_loan_calculator() {
	    ecp.loanCalculator();
	}

	@When("user clicks emi calculator")
	public void user_clicks_emi_calculator() {
	    ecp.clickEmiCalculator();
	}

	@Then("verify emi calculator opens")
	public void verify_emi_calculator_opens() {
	    ecp.checkEmiCalculator();
	}

	@When("user clicks loan amount calculator")
	public void user_clicks_loan_amount_calculator() {
	    ecp.clickLoanAmountCalculator();
	}

	@Then("verify loan amount calculator opens")
	public void verify_loan_amount_calculator_opens() {
	    ecp.checkLoanAmountCalculator();
	}

	@When("user clicks loan Tenure calculator")
	public void user_clicks_loan_tenure_calculator() {
	    ecp.clickLoanTenurCalculator();
	}

	@Then("verify loan Tenure calculator opens")
	public void verify_loan_tenure_calculator_opens() {
	    ecp.checkLoanTenureCalculator();
	}

	@When("user clicks interest rate calculator")
	public void user_clicks_interest_rate_calculator() {
	    ecp.clickInterestRateCalculator();
	}

	@Then("verify interest rate calculator opens")
	public void verify_interest_rate_calculator_opens() {
	   ecp.checkInterestRateCalculator();
	}

	@Given("user navigate to Home loan calculator")
	public void user_navigate_to_home_loan_calculator() {
		clp.originpage();
		hlp.homeLoanCalculator();
	}

	@Then("verify Home Loan Details text box working")
	public void verify_home_loan_details_text_box_working() {
	    hlp.allHomeLoanTextBox();
	}

	@Then("verify Homeowner Expenses text box working")
	public void verify_homeowner_expenses_text_box_working() {
	    hlp.allHomeownerExpensesTextBox();
	}

	@Then("verify pi char and graph visible")
	public void verify_pi_char_and_graph_visible() {
	    hlp.allchart();
	}
	@Given("user navigate to loan calculator")
	public void user_navigate_to_loan_calculator() {
		ecp.loanCalculator();
	}

	@When("user enters valid input {string},{string},{string}and{string}")
	public void user_enters_valid_input_and(String string, String string2, String string3, String string4) {
	    ecp.loanCalculatorPageAmount(string);
	    ecp.loanCalculatorPageInterest(string2);
	    ecp.loanCalculatorTenure(string3);
	    ecp.loanCalculatorFees(string4);
	}

	@Then("user verify all Text box")
	public void user_verify_all_text_box() {
	    ecp.loanCalculatorAmountBoxCheck();
	    ecp.loanCalculatorInterestBox();
	    ecp.loanClaculatorTenureBox();
	    ecp.loanClaculatorFeeBox();
	    System.out.println("All text box working...");
	}

	@Given("user navigate to emi loan calculator")
	public void user_navigate_to_emi_loan_calculator() {
	    ecp.loanCalculator();
	}

	@Then("user verify all Slider")
	public void user_verify_all_slider() {
	    ecp.loanCalculatorAmountSliderCheck();
	    ecp.loanCalculatorInterestSliderCheck();
	    ecp.loanCalculatorTenureSliderCheck();
	    ecp.loanCalculatorFeeSliderCheck();
	}

}
