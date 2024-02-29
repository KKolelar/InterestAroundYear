package com.interestAroundYear.stepDefinitions;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.emiCalculatorPage;
import com.interestAroundYear.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYearSmoke {
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	
	
//	@Given("user navigates to homepage")
//	public void user_navigates_to_homepage() {
//		clp.originpage();
//	}
//
//	@When("user clicks on car loan")
//	public void user_clicks_on_car_loan() {
//	    clp.carClick();
//	}
//
//	@Then("verify car loan calculator opens")
//	public void verify_car_loan_calculator_opens() {
//	    clp.verifyCarLoanCalculator();
//	}
//
//	@When("user clicks on personal loan")
//	public void user_clicks_on_personal_loan() {
//	   clp.clickPersonalLaon();
//	}
//
//	@Then("verify personal loan calculator opens")
//	public void verify_personal_loan_calculator_opens() {
//	    clp.verifyPersonalLoanCalculator();
//	}
//
//	@When("user clicks on home loan calculator")
//	public void user_clicks_on_home_loan_calculator() {
//	    clp.clickHomeLaon();
//	}
//
//	@Then("verify home loan calculator opens")
//	public void verify_home_loan_calculator_opens() {
//	    clp.verifyHomeLoanCalculator();
//	}
//	@Given("user navigates to loan calculator")
//	public void user_navigates_to_loan_calculator() {
//	    
//	}
//
//	@When("user clicks emi calculator")
//	public void user_clicks_emi_calculator() {
//	    
//	}
//
//	@Then("verify emi calculator opens")
//	public void verify_emi_calculator_opens() {
//	    
//	}
//
//	@When("user clicks loan amount calculator")
//	public void user_clicks_loan_amount_calculator() {
//	    
//	}
//
//	@Then("verify loan amount calculator opens")
//	public void verify_loan_amount_calculator_opens() {
//	    ecp.checkLoanAmountCalculator();
//	}
//
//	@When("user clicks loan Tenure calculator")
//	public void user_clicks_loan_tenure_calculator() {
//	    
//	}
//
//	@Then("verify loan Tenure calculator opens")
//	public void verify_loan_tenure_calculator_opens() {
//	    
//	}
//
//	@When("user clicks interest rate calculator")
//	public void user_clicks_interest_rate_calculator() {
//	    
//	}
//
//	@Then("verify interest rate calculator opens")
//	public void verify_interest_rate_calculator_opens() {
//	   
//	}
//
//	@Given("user navugate to car loan emi calculator")
//	public void user_navugate_to_car_loan_emi_calculator() {
//		
//	}
//
//	@Then("verify amount text box is working")
//	public void verify_amount_text_box_is_working() {
//	    
//	}
//
//	@Then("verify interest text box is working")
//	public void verify_interest_text_box_is_working() {
//	    
//	}
//
//	@Then("verify tenure text box is working")
//	public void verify_tenure_text_box_is_working() {
//	    
//	}
//
//	@When("user enters the loan amount")
//	public void user_enters_the_loan_amount() {
//	    
//	}
//
//	@Then("verify loan slider is available")
//	public void verify_loan_slider_is_available() {
//	    
//	}
//
//	@When("user enters interest rate")
//	public void user_enters_interest_rate() {
//	    
//	}
//
//	@Then("verify interest slider is available")
//	public void verify_interest_slider_is_available() {
//	    
//	}
//
//	@When("user loan tenure")
//	public void user_loan_tenure() {
//	    
//	}
//
//	@Then("verify tenure slider is available")
//	public void verify_tenure_slider_is_available() {
//	    
//	}
//
//	@Given("user navigates to the home page")
//	public void user_navigates_to_the_home_page() {
//	    
//	}
//
//	@When("user enters valid data")
//	public void user_enters_valid_data() {
//	    
//	}
//
//	@Then("verify scales are working")
//	public void verify_scales_are_working() {
//		
//	}
//
//	@Given("user user navugate to car loan emi calculator")
//	public void user_user_navugate_to_car_loan_emi_calculator() {
//	    
//	}
//
//	@When("user emters car loan Amount")
//	public void user_emters_car_loan_amount() {
//	    
//	}
//
//	@When("interest Rate")
//	public void interest_rate() {
//	    
//	}
//
//	@When("loan tenure")
//	public void loan_tenure() {
//	    
//	}
//
//	@Then("verify monthly emi is displayed")
//	public void verify_monthly_emi_is_displayed() {
//	    
//	}
//
//	@Then("total interest is diplayed")
//	public void total_interest_is_diplayed() {
//		
//	}
//
//	@Then("Total payment is displayed")
//	public void total_payment_is_displayed() {
//	    
//	}
//
//	@When("user enters all details")
//	public void user_enters_all_details() {
//		
//	}
//
//	@Then("verify year to year table is displayed")
//	public void verify_year_to_year_table_is_displayed() {
//		
//	}
//
//	@Given("user navigate to the home page")
//	public void user_navigate_to_the_home_page() {
//	    
//	}
//
//	@Then("verify Calculator Dropdown is available")
//	public void verify_calculator_dropdown_is_available() {
//	     
//	}
//
//	@Given("user navigate to car loan calculator")
//	public void user_navigate_to_car_loan_calculator() {
//	    
//	}
//
//	@When("user enter invalid  {string} ,{string} and {string}")
//	public void user_enter_invalid_and(String string, String string2, String string3) {
//		
//	}
//	
//	@Then("verify calculator output")
//	public void verify_calculator_output() {
//	    
//	}
//	
//
//	@Given("user navigate to Home loan calculator")
//	public void user_navigate_to_home_loan_calculator() {
//		
//	}
//
//	@Then("verify Home Loan Details text box working")
//	public void verify_home_loan_details_text_box_working() {
//	    
//	}
//
//	@Then("verify Homeowner Expenses text box working")
//	public void verify_homeowner_expenses_text_box_working() {
//	    
//	}
//
//	@Then("verify pi char and graph visible")
//	public void verify_pi_char_and_graph_visible() {
//	    
//	}
//	@Given("user navigate to loan calculator")
//	public void user_navigate_to_loan_calculator() {
//		
//	}
//
//	@When("user enters valid input {string},{string},{string}and{string}")
//	public void user_enters_valid_input_and(String string, String string2, String string3, String string4) {
//	    
//	}
//
//	@Then("user verify all Text box")
//	public void user_verify_all_text_box() {
//	    
//	}
//
//	@Given("user navigate to emi loan calculator")
//	public void user_navigate_to_emi_loan_calculator() {
//	    
//	}
//
//	@Then("user verify all Slider")
//	public void user_verify_all_slider() {
//	    
//	}
//
  }
