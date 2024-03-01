package com.interestAroundYear.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYear_Regression {
	
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());

	@Given("user navigate carLoan calculator in emi web application")
	public void user_navigate_car_loan_calculator_in_emi_web_application() {
		logger.info("**** Start of Regression Scenario ****");
		clp.originpage();
		logger.info("Navigeted to car loan calculator");
	}

	@Then("verify dashbord tab present in emi calculator web application")
	public void verify_dashbord_tab_present_in_emi_calculator_web_application() {
		clp.verifyAllElement();
		logger.info("Verified all tab on dash board");
	}

	@Then("verify link in car loan in emi web application")
	public void verify_link_in_car_loan_in_emi_web_application() {
		clp.verifyLinks();
		logger.info("Verified Link in car loan calcultor page");
	}

	@Given("User navigate to car loan calculator emi webapplication")
	public void user_navigate_to_car_loan_calculator_emi_webapplication() {
		clp.clickHomeLaon();
		logger.info("Navigated to car loan calculator");
	}

	@When("user scroll to print and share button in car loan calculator")
	public void user_scroll_to_print_and_share_button_in_car_loan_calculator() {
		clp.scrollToShare();
		logger.info("Scrolled to the share button");
	}

	@Then("verify Share button avalable in car loan calculator")
	public void verify_share_button_avalable_in_car_loan_calculator() {
		clp.verifyShare();
		logger.info("Verified Share button avalable");
	}

	@Then("verify print button available in car loan calculator")
	public void verify_print_button_available_in_car_loan_calculator() {
		clp.verifyPrint();
		logger.info("Verified print button available on car loan calculaor page");
	}

	@Given("user navigate to carloan calculator in emi webapplication")
	public void user_navigate_to_carloan_calculator_in_emi_webapplication() {
		clp.originpage();
	    clp.carClick();
	    logger.info("Navigated to the car loan calculator in emi web application");
	}

	@When("user enters valid data car loan calculator")
	public void user_enters_valid_data_car_loan_calculator() {
		clp.enterLoanAmount("750000");
	    clp.interestRate("7.75");
	    clp.loanTenure("5");
	    logger.info("Entered all valid input in car loan calculator");
	}

	@Then("verify pi chart available in car loan calculator")
	public void verify_pi_chart_available_in_car_loan_calculator() {
		clp.verifyPiChart();
		logger.info("Verified Pi chart in car loan calculator");
	}

	@Then("verify graph chart available in car loan calculator")
	public void verify_graph_chart_available_in_car_loan_calculator() {
		clp.verifyGraph();
		logger.info("Verified Graph in car loan calculator");
	}

	@Given("user navigate to home loan calculator in emi web application")
	public void user_navigate_to_home_loan_calculator_in_emi_web_application() {
		clp.originpage();
	    hlp.homeLoanCalculator();
	    logger.info("Navigated to Home loan calculator emi web application");
	}

	@Then("verify all scale are working in home loan calculator in emi web application")
	public void verify_all_scale_are_working_in_home_loan_calculator_in_emi_web_application() {
		hlp.verifyAllScale();
		logger.info("Verified Graph in car loan calculator");
	}

	@Given("user navigate to carloan in emi webapplication")
	public void user_navigate_to_carloan_in_emi_webapplication() {
		clp.originpage();
	    logger.info("Navigated to the car loan calculator in emi web application");
		
	}

	@Then("verify emi scheme in carloan calculator in emi web application")
	public void verify_emi_scheme_in_carloan_calculator_in_emi_web_application() {
		clp.schemeCheck();
		logger.info("Verified scheme section visible in car loan calculator");
	}

	@Then("verify emi advance and arrears button in carloan calculator in emi web application")
	public void verify_emi_advance_and_arrears_button_in_carloan_calculator_in_emi_web_application() {
		clp.schemeButton();
		logger.info("Verified both Emi in advanced and Arrears button available");
		logger.info("**** End of all regression scenario ****");
	}

}
