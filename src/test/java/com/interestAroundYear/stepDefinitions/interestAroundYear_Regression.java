package com.interestAroundYear.stepDefinitions;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYear_Regression {
	
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());

	@Given("user navigate carLoan calculator in emi web application")
	public void user_navigate_car_loan_calculator_in_emi_web_application() {
		clp.originpage();
	}

	@Then("verify dashbord tab present in emi calculator web application")
	public void verify_dashbord_tab_present_in_emi_calculator_web_application() {
		clp.verifyAllElement();
	}

	@Then("verify link in car loan in emi web application")
	public void verify_link_in_car_loan_in_emi_web_application() {
		clp.verifyLinks();
	}

	@Given("User navigate to car loan calculator emi webapplication")
	public void user_navigate_to_car_loan_calculator_emi_webapplication() {
		clp.clickHomeLaon();
	}

	@When("user scroll to print and share button in car loan calculator")
	public void user_scroll_to_print_and_share_button_in_car_loan_calculator() {
		clp.scrollToShare();
	}

	@Then("verify Share button avalable in car loan calculator")
	public void verify_share_button_avalable_in_car_loan_calculator() {
		clp.verifyShare();
	}

	@Then("verify print button available in car loan calculator")
	public void verify_print_button_available_in_car_loan_calculator() {
		clp.verifyPrint();
	}

	@Given("user navigate to carloan calculator in emi webapplication")
	public void user_navigate_to_carloan_calculator_in_emi_webapplication() {
		clp.originpage();
	    clp.carClick();
	}

	@When("user enters valid data car loan calculator")
	public void user_enters_valid_data_car_loan_calculator() {
		clp.enterLoanAmount("750000");
	    clp.interestRate("7.75");
	    clp.loanTenure("5");
	}

	@Then("verify pi chart available in car loan calculator")
	public void verify_pi_chart_available_in_car_loan_calculator() {
		clp.verifyPiChart();
	}

	@Then("verify graph chart available in car loan calculator")
	public void verify_graph_chart_available_in_car_loan_calculator() {
		clp.verifyGraph();
	}

	@Given("user navigate to home loan calculator in emi web application")
	public void user_navigate_to_home_loan_calculator_in_emi_web_application() {
		clp.originpage();
	    hlp.homeLoanCalculator();
	}

	@Then("verify all scale are working in home loan calculator in emi web application")
	public void verify_all_scale_are_working_in_home_loan_calculator_in_emi_web_application() {
		hlp.verifyAllScale();
	}

	@Given("user navigate to carloan in emi webapplication")
	public void user_navigate_to_carloan_in_emi_webapplication() {
		clp.originpage();
	}

	@Then("verify emi scheme in carloan calculator in emi web application")
	public void verify_emi_scheme_in_carloan_calculator_in_emi_web_application() {
		clp.schemeCheck();
	}

	@Then("verify emi advance and arrears button in carloan calculator in emi web application")
	public void verify_emi_advance_and_arrears_button_in_carloan_calculator_in_emi_web_application() {
		clp.schemeButton();
	}

}
