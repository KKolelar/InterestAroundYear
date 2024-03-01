package com.interestAroundYear.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.emiCalculatorPage;
import com.interestAroundYear.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYear_smoke {
	
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());

	@Given("user navigates to emi calculator homepage")
	public void user_navigates_to_emi_calculator_homepage() {
		logger.info("**** Start of Smoke Scenario ****");
		clp.originpage();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user clicks on car loan tab in emi calculator")
	public void user_clicks_on_car_loan_tab_in_emi_calculator() {
		clp.carClick();
		logger.info("Clicked on car loan calculator emi web application");
	}

	@Then("verify car loan calculator opened")
	public void verify_car_loan_calculator_opened() {
		clp.verifyCarLoanCalculator();
		logger.info("Verified user navigated to car loan calculator");
	}

	@When("user clicks on personal loan in emi calculator")
	public void user_clicks_on_personal_loan_in_emi_calculator() {
		clp.clickPersonalLaon();
		logger.info("Clicked on personal loan calculator emi web application");
	}

	@Then("verify personal loan calculator opened")
	public void verify_personal_loan_calculator_opened() {
		clp.verifyPersonalLoanCalculator();
		logger.info("Verified user navigated to personal loan calculator");
	}

	@When("user clicks on home loan in emi calculator")
	public void user_clicks_on_home_loan_in_emi_calculator() {
		clp.clickHomeLaon();
		logger.info("Clicked on home loan calculator emi web application");
	}

	@Then("verify home loan calculator opened")
	public void verify_home_loan_calculator_opened() {
		clp.verifyHomeLoanCalculator();
		logger.info("Verified user navigated to home loan calculator");
	}

	@Given("user navigates to loan calculator in Emi web application")
	public void user_navigates_to_loan_calculator_in_emi_web_application() {
		ecp.loanCalculator();
		logger.info("Navigated to loan calculators in emi web application");
	}

	@When("user clicks emi calculator in loan calculator")
	public void user_clicks_emi_calculator_in_loan_calculator() {
		ecp.clickEmiCalculator();
		logger.info("Clicked on emi calculator in loan calculators");
	}

	@Then("verify emi calculator opend in loan calculator")
	public void verify_emi_calculator_opend_in_loan_calculator() {
		ecp.checkEmiCalculator();
		logger.info("verified user navigated to emi loan calculators in emi web application");
	}

	@When("user clicks loan amount calculator in loan calculator")
	public void user_clicks_loan_amount_calculator_in_loan_calculator() {
		ecp.clickLoanAmountCalculator();
		logger.info("Clicked on loan amount calculator in loan calculators");
	}

	@Then("verify loan amount calculator opend in loan calculator")
	public void verify_loan_amount_calculator_opend_in_loan_calculator() {
		ecp.checkLoanAmountCalculator();
		logger.info("verified user navigated to loan amount calculators in emi web application");
	}

	@When("user clicks loan Tenure calculator in loan calculator")
	public void user_clicks_loan_tenure_calculator_in_loan_calculator() {
		ecp.clickLoanTenurCalculator();
		logger.info("Clicked on tenure calculator in loan calculators");
	}

	@Then("verify loan Tenure calculator opend in loan calculator")
	public void verify_loan_tenure_calculator_opend_in_loan_calculator() {
		ecp.checkLoanTenureCalculator();
		logger.info("verified user navigated to loan tenure calculators in emi web application");
	}

	@When("user clicks interest rate calculator in loan calculator")
	public void user_clicks_interest_rate_calculator_in_loan_calculator() {
		ecp.clickInterestRateCalculator();
		logger.info("Clicked on interest rate calculator in loan calculators");
		
	}

	@Then("verify interest rate calculator opend in loan calculator")
	public void verify_interest_rate_calculator_opend_in_loan_calculator() {
		ecp.checkInterestRateCalculator();
		logger.info("verified user navigated to interest rate calculators in emi web application");
	}

	@Given("user navigate to car loan in emi web application")
	public void user_navigate_to_car_loan_in_emi_web_application() {
		clp.originpage();
	    clp.carClick();
		logger.info("verified user navigated to car loan calculator in emi web application");
	}

	@Then("verify amount text box is working in car loan calculator")
	public void verify_amount_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonAmountTextBox();
		logger.info("Verified Loan amount text box is working in car loan calculator");
	}

	@Then("verify interest text box is working in car loan calculator")
	public void verify_interest_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonInterestTextBox();
		logger.info("Verified Loan interest text box is working in car loan calculator");
	}

	@Then("verify tenure text box is working in car loan calculator")
	public void verify_tenure_text_box_is_working_in_car_loan_calculator() {
		clp.verifyCarLaonTenureTextBox();
		logger.info("Verified Loan tenure text box is working in car loan calculator");
	}

	@Given("user navigate to car loan calculator in emi web application")
	public void user_navigate_to_car_loan_calculator_in_emi_web_application() {
		clp.carClick();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user enters the loan amount in car loan calculator")
	public void user_enters_the_loan_amount_in_car_loan_calculator() {
		clp.setValeAmount();
		logger.info("Entered loan amount value in car loan calculator");
	}

	@Then("verify loan slider is available in car loan calculator")
	public void verify_loan_slider_is_available_in_car_loan_calculator() {
		clp.checkAmountSlider();
		logger.info("Verified Loan amount slider in car loan calculator");
	}

	@When("user enters interest rate in car loan calculator")
	public void user_enters_interest_rate_in_car_loan_calculator() {
		clp.setValeInterest();
		logger.info("Entered interest value in car loan calculator");
	}

	@Then("verify interest slider is available in car loan calculator")
	public void verify_interest_slider_is_available_in_car_loan_calculator() {
		clp.checkInterestSlider();
		logger.info("Verified interest slider in car loan calculator ");
	}

	@When("user enters loan tenure in car loan calculator")
	public void user_enters_loan_tenure_in_car_loan_calculator() {
		clp.setValeTenure();
		logger.info("Entered tenure value in car loan calculator");
	}

	@Then("verify tenure slider is available in car loan calculator")
	public void verify_tenure_slider_is_available_in_car_loan_calculator() {
		clp.checkTenureSlider();
		logger.info("Verified tenure slider in car loan calculator");
	}

	@Given("user navigates to car loan in emi Web application home page")
	public void user_navigates_to_car_loan_in_emi_web_application_home_page() {
		clp.carClick();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user enters valid data in car loan calculator")
	public void user_enters_valid_data_in_car_loan_calculator() {
		clp.enterLoanAmount("1000000");
	    clp.interestRate("10.5");
	    clp.loanTenure("8");
	    ecp.emiSchemeClick();
	    logger.info("Entered all required vale in car loan calculator");
	}

	@Then("verify scales are working in car loan calculator")
	public void verify_scales_are_working_in_car_loan_calculator() {
		clp.carLoanScaleCheck();
		logger.info("Verified scale in car loan calculator");
	}

	@Given("user user navigate to car loan calculator in homepage")
	public void user_user_navigate_to_car_loan_calculator_in_homepage() {
		clp.carClick();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user emters car loan Amount in car loan calculator")
	public void user_emters_car_loan_amount_in_car_loan_calculator() {
		clp.enterLoanAmount("175000");
		logger.info("Entered loan amount in car loan calculator");
	}

	@When("user emters interest Rate in car loan calculator")
	public void user_emters_interest_rate_in_car_loan_calculator() {
		clp.interestRate("9.75");
		logger.info("Entered inerest value is car loan calculator");
	}

	@When("user emters loan tenure in car loan calculator")
	public void user_emters_loan_tenure_in_car_loan_calculator() {
		clp.loanTenure("5");
		logger.info("Entered tenure value in car loan calculator");
	}

	@Then("verify Monthly Emi is displayed in car loan calculator")
	public void verify_monthly_emi_is_displayed_in_car_loan_calculator() {
		clp.verifyEmi();
		logger.info("Verified Monthly emi is displayed in car loan calculator");
	}

	@Then("total interest is diplayed in car loan calculator")
	public void total_interest_is_diplayed_in_car_loan_calculator() {
		clp.verifyTotalInterest();
		logger.info("Verifeid Tatal interest is displayed in car loan calculator");
	}

	@Then("Total payment is displayed in car loan calculator")
	public void total_payment_is_displayed_in_car_loan_calculator() {
		clp.verifyTotalPayable();
		logger.info("Verifeid Tatal payable is displayed in car loan calculator");
	}

	@Given("user navigate to car loan calculator in Emi calculator web application")
	public void user_navigate_to_car_loan_calculator_in_emi_calculator_web_application() {
		clp.carClick();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user enters all details in car loan calculator")
	public void user_enters_all_details_in_car_loan_calculator() {
		clp.enterLoanAmount("1300000");
	    clp.interestRate("13.5");
	    clp.loanTenure("3");
	    ecp.emiSchemeClick();
	    logger.info("Entered all required vale in car loan calculator");
	}

	@Then("verify year to year table is displayed in car loan calculator")
	public void verify_year_to_year_table_is_displayed_in_car_loan_calculator() {
		clp.checkTable();
		logger.info("Verified yera to year table displayed in car loan calculator");
	}

	@Given("user navigate to car loan calculator in emi calculator")
	public void user_navigate_to_car_loan_calculator_in_emi_calculator() {
		clp.carClick();
		logger.info("Navigated to car loan calculator in emi web application");
	}

	@When("user enter invalid in car loan calculator {string} ,{string} and {string}")
	public void user_enter_invalid_in_car_loan_calculator_and(String string, String string2, String string3) {
		clp.enterLoanAmount(string);
	    clp.interestRate(string2);
	    clp.loanTenure(string3);
	    ecp.emiSchemeClick();
	    logger.info("Entered all required value in car loan calculator");
	}

	@Then("verify calculator output in car loan calculator")
	public void verify_calculator_output_in_car_loan_calculator() {
		clp.invalidDataOutput();
		logger.info("Entered invalid data in car loan calculator");
	}

	@Given("user navigate to emi calculator home page")
	public void user_navigate_to_emi_calculator_home_page() {
	    clp.originpage();
	    logger.info("Navigated to car loan calculator in emi web application");
	    
	}
	@Then("verify Calculator Dropdown is available in emi web application homepage")
	public void verify_calculator_dropdown_is_available_in_emi_web_application_homepage() {
		ecp.checkDropDown();
		logger.info("Verified all element present in Calculator drop down menu");
	}

	@Given("user navigate to Home loan calculator from emi calculator homepage")
	public void user_navigate_to_home_loan_calculator_from_emi_calculator_homepage() {
		clp.originpage();
		hlp.homeLoanCalculator();
		logger.info("Navigated to Home loan calculator in emi web application");
	}

	@Then("verify Home Loan Details text box working in home loan calculator")
	public void verify_home_loan_details_text_box_working_in_home_loan_calculator() {
		hlp.allHomeLoanTextBox();
		logger.info("Verified all home loan detail text box in home loan calculator");
	}

	@Then("verify Homeowner Expenses text box working in home loan calculator")
	public void verify_homeowner_expenses_text_box_working_in_home_loan_calculator() {
		hlp.allHomeownerExpensesTextBox();
		logger.info("Verified all home owner expenses text box in home loan calculator");
	}

	@Then("verify pi char and graph visible in home loan calculator")
	public void verify_pi_char_and_graph_visible_in_home_loan_calculator() {
		hlp.allchart();
		logger.info("Verified pi chart and graph visible in home loan calculator");
	}

	@Given("user navigate to emi loan calculator in loan calculator")
	public void user_navigate_to_emi_loan_calculator_in_loan_calculator() {
		ecp.loanCalculator();
		logger.info("Naigated to emi calculator in emi web application");
	}

	@When("user enters valid input in emi loan calculator {string},{string},{string}and{string}")
	public void user_enters_valid_input_in_emi_loan_calculator_and(String string, String string2, String string3, String string4) {
		ecp.loanCalculatorPageAmount(string);
	    ecp.loanCalculatorPageInterest(string2);
	    ecp.loanCalculatorTenure(string3);
	    ecp.loanCalculatorFees(string4);
	    logger.info("Entered all value in emi calculator");
	}

	@Then("user verify all Text box in the emi loan calculator")
	public void user_verify_all_text_box_in_the_emi_loan_calculator() {
		ecp.loanCalculatorAmountBoxCheck();
	    ecp.loanCalculatorInterestBox();
	    ecp.loanClaculatorTenureBox();
	    ecp.loanClaculatorFeeBox();
	    System.out.println("All text box working...");
	    logger.info("verified all text box in emi calculator");
	}
	@Given("user navigate to emi calculator in Loan Calculator")
	public void user_navigate_to_emi_calculator_in_loan_calculator() {
	    ecp.loanCalculator();
	    logger.info("Naigated to emi calculator in emi web application");
	}
	@Then("user verify all Slider in emi loan calculator")
	public void user_verify_all_slider_in_emi_loan_calculator() {
		ecp.loanCalculatorAmountSliderCheck();
	    ecp.loanCalculatorInterestSliderCheck();
	    ecp.loanCalculatorTenureSliderCheck();
	    ecp.loanCalculatorFeeSliderCheck();
	    logger.info("verified all slider in emi calculator");
	    logger.info("**** End of all smoke scenario ****");
	}

}
