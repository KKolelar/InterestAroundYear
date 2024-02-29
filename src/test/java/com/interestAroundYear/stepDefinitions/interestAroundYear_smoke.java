package com.interestAroundYear.stepDefinitions;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.emiCalculatorPage;
import com.interestAroundYear.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYear_smoke {
	
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());

	@Given("user navigates to emi calculator homepage")
	public void user_navigates_to_emi_calculator_homepage() {
		clp.originpage();
	}

	@When("user clicks on car loan tab in emi calculator")
	public void user_clicks_on_car_loan_tab_in_emi_calculator() {
		clp.carClick();
	}

	@Then("verify car loan calculator opened")
	public void verify_car_loan_calculator_opened() {
		clp.verifyCarLoanCalculator();
	}

	@When("user clicks on personal loan in emi calculator")
	public void user_clicks_on_personal_loan_in_emi_calculator() {
		clp.clickPersonalLaon();
	}

	@Then("verify personal loan calculator opened")
	public void verify_personal_loan_calculator_opened() {
		clp.verifyPersonalLoanCalculator();
	}

	@When("user clicks on home loan in emi calculator")
	public void user_clicks_on_home_loan_in_emi_calculator() {
		clp.clickHomeLaon();
	}

	@Then("verify home loan calculator opened")
	public void verify_home_loan_calculator_opened() {
		clp.verifyHomeLoanCalculator();
	}

	@Given("user navigates to loan calculator in Emi web application")
	public void user_navigates_to_loan_calculator_in_emi_web_application() {
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

	@Given("user navigate to car loan in emi web application")
	public void user_navigate_to_car_loan_in_emi_web_application() {
		clp.originpage();
	    clp.carClick();
	}

	@Then("verify amount text box is working in car loan calculator")
	public void verify_amount_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonAmountTextBox();
	}

	@Then("verify interest text box is working in car loan calculator")
	public void verify_interest_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonInterestTextBox();
	}

	@Then("verify tenure text box is working in car loan calculator")
	public void verify_tenure_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonTenureTextBox();
	}

	@Given("user navigate to car loan calculator in emi web application")
	public void user_navigate_to_car_loan_calculator_in_emi_web_application() {
		clp.carClick();
	}

	@When("user enters the loan amount in car loan calculator")
	public void user_enters_the_loan_amount_in_car_loan_calculator() {
		clp.setValeAmount();
	}

	@Then("verify loan slider is available in car loan calculator")
	public void verify_loan_slider_is_available_in_car_loan_calculator() {
		clp.checkAmountSlider();
	}

	@When("user enters interest rate in car loan calculator")
	public void user_enters_interest_rate_in_car_loan_calculator() {
		clp.setValeInterest();
	}

	@Then("verify interest slider is available in car loan calculator")
	public void verify_interest_slider_is_available_in_car_loan_calculator() {
		clp.checkInterestSlider();
	}

	@When("user enters loan tenure in car loan calculator")
	public void user_enters_loan_tenure_in_car_loan_calculator() {
		clp.setValeTenure();
	}

	@Then("verify tenure slider is available in car loan calculator")
	public void verify_tenure_slider_is_available_in_car_loan_calculator() {
		clp.checkTenureSlider();
	}

	@Given("user navigates to car loan in emi Web application home page")
	public void user_navigates_to_car_loan_in_emi_web_application_home_page() {
		clp.carClick();
	}

	@When("user enters valid data in car loan calculator")
	public void user_enters_valid_data_in_car_loan_calculator() {
		clp.enterLoanAmount("1000000");
	    clp.interestRate("10.5");
	    clp.loanTenure("8");
	    ecp.emiSchemeClick();
	}

	@Then("verify scales are working in car loan calculator")
	public void verify_scales_are_working_in_car_loan_calculator() {
		clp.carLoanScaleCheck();
	}

	@Given("user user navigate to car loan calculator in homepage")
	public void user_user_navigate_to_car_loan_calculator_in_homepage() {
		clp.carClick();
	}

	@When("user emters car loan Amount in car loan calculator")
	public void user_emters_car_loan_amount_in_car_loan_calculator() {
		clp.enterLoanAmount("175000");
	}

	@When("user emters interest Rate in car loan calculator")
	public void user_emters_interest_rate_in_car_loan_calculator() {
		clp.interestRate("9.75");
	}

	@When("user emters loan tenure in car loan calculator")
	public void user_emters_loan_tenure_in_car_loan_calculator() {
		clp.loanTenure("5");
	}

	@Then("verify Monthly Emi is displayed in car loan calculator")
	public void verify_monthly_emi_is_displayed_in_car_loan_calculator() {
		clp.verifyEmi();
	}

	@Then("total interest is diplayed in car loan calculator")
	public void total_interest_is_diplayed_in_car_loan_calculator() {
		clp.verifyTotalInterest();
	}

	@Then("Total payment is displayed in car loan calculator")
	public void total_payment_is_displayed_in_car_loan_calculator() {
		clp.verifyTotalPayable();
	}

	@Given("user navigate to car loan calculator in Emi calculator web application")
	public void user_navigate_to_car_loan_calculator_in_emi_calculator_web_application() {
		clp.carClick();
	}

	@When("user enters all details in car loan calculator")
	public void user_enters_all_details_in_car_loan_calculator() {
		clp.enterLoanAmount("1300000");
	    clp.interestRate("13.5");
	    clp.loanTenure("3");
	    ecp.emiSchemeClick();
	}

	@Then("verify year to year table is displayed in car loan calculator")
	public void verify_year_to_year_table_is_displayed_in_car_loan_calculator() {
		clp.checkTable();
	}

	@Given("user navigate to car loan calculator in emi calculator")
	public void user_navigate_to_car_loan_calculator_in_emi_calculator() {
		clp.carClick();
	}

	@When("user enter invalid in car loan calculator {string} ,{string} and {string}")
	public void user_enter_invalid_in_car_loan_calculator_and(String string, String string2, String string3) {
		clp.enterLoanAmount(string);
	    clp.interestRate(string2);
	    clp.loanTenure(string3);
	    ecp.emiSchemeClick();
	}

	@Then("verify calculator output in car loan calculator")
	public void verify_calculator_output_in_car_loan_calculator() {
		clp.invalidDataOutput();
	}

	@Given("user navigate to emi calculator home page")
	public void user_navigate_to_emi_calculator_home_page() {
	    clp.originpage();
	}
//
	@Then("verify Calculator Dropdown is available in emi web application homepage")
	public void verify_calculator_dropdown_is_available_in_emi_web_application_homepage() {
		ecp.checkDropDown();
	}

	@Given("user navigate to Home loan calculator from emi calculator homepage")
	public void user_navigate_to_home_loan_calculator_from_emi_calculator_homepage() {
		clp.originpage();
		hlp.homeLoanCalculator();
	}

	@Then("verify Home Loan Details text box working in home loan calculator")
	public void verify_home_loan_details_text_box_working_in_home_loan_calculator() {
		hlp.allHomeLoanTextBox();
	}

	@Then("verify Homeowner Expenses text box working in home loan calculator")
	public void verify_homeowner_expenses_text_box_working_in_home_loan_calculator() {
		hlp.allHomeownerExpensesTextBox();
	}

	@Then("verify pi char and graph visible in home loan calculator")
	public void verify_pi_char_and_graph_visible_in_home_loan_calculator() {
		hlp.allchart();
	}

	@Given("user navigate to emi loan calculator in loan calculator")
	public void user_navigate_to_emi_loan_calculator_in_loan_calculator() {
		ecp.loanCalculator();
	}

	@When("user enters valid input in emi loan calculator {string},{string},{string}and{string}")
	public void user_enters_valid_input_in_emi_loan_calculator_and(String string, String string2, String string3, String string4) {
		ecp.loanCalculatorPageAmount(string);
	    ecp.loanCalculatorPageInterest(string2);
	    ecp.loanCalculatorTenure(string3);
	    ecp.loanCalculatorFees(string4);
	}

	@Then("user verify all Text box in the emi loan calculator")
	public void user_verify_all_text_box_in_the_emi_loan_calculator() {
		ecp.loanCalculatorAmountBoxCheck();
	    ecp.loanCalculatorInterestBox();
	    ecp.loanClaculatorTenureBox();
	    ecp.loanClaculatorFeeBox();
	    System.out.println("All text box working...");
	}
	@Given("user navigate to emi calculator in Loan Calculator")
	public void user_navigate_to_emi_calculator_in_loan_calculator() {
	    ecp.loanCalculator();
	}
	@Then("user verify all Slider in emi loan calculator")
	public void user_verify_all_slider_in_emi_loan_calculator() {
		ecp.loanCalculatorAmountSliderCheck();
	    ecp.loanCalculatorInterestSliderCheck();
	    ecp.loanCalculatorTenureSliderCheck();
	    ecp.loanCalculatorFeeSliderCheck();
	}

}
