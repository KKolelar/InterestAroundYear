package com.hackathon.stepDefinitions;

import com.hackathon.factory.helperClass;
import com.hackathon.pageObjects.carLoanPage;
import com.hackathon.pageObjects.homeLoanPage;

import io.cucumber.java.en.*;

public class interestAroundYearRegression {
	carLoanPage clp = new carLoanPage(helperClass.getDriver());
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	
	@Given("user navigate carLoan calculator page")
	public void user_navigate_car_loan_calculator_page() {
		clp.originpage();
	}

	@Then("verify dashbord obeject present")
	public void verify_dashbord_obeject_present() {
	    clp.verifyAllElement();
	}

	@Given("user navigates to car loan homepage")
	public void user_navigates_to_car_loan_homepage() {
	    clp.carClick();
	}

	@Then("verify link working")
	public void verify_link_working() {
	    clp.verifyLinks();
	}

	@Given("user navigates to homeLoan calculator")
	public void user_navigates_to_home_loan_calculator() {
	    clp.carClick();
	}

	@When("user scroll to print and share button")
	public void user_scroll_to_print_and_share_button() {
	    clp.scrollToShare();
	}

	@Then("verify Share button avalable")
	public void verify_share_button_avalable() {
	    clp.verifyShare();
	}

	@Then("verify print button available")
	public void verify_print_button_available() {
	    clp.verifyPrint();
	}

	@Given("user navigate to carloan page")
	public void user_navigate_to_carloan_page() {
	    clp.originpage();
	    clp.carClick();
	}

	@Then("verify pi chart available")
	public void verify_pi_chart_available() {
	    clp.verifyPiChart();
	}

	@Then("verify graph chart available")
	public void verify_graph_chart_available() {
		clp.verifyGraph();
	}
	@Given("user navigate to home loan calculator")
	public void user_navigate_to_home_loan_calculator() {
	    clp.originpage();
	    hlp.homeLoanCalculator();
	}

	@Then("verify all scale are working")
	public void verify_all_scale_are_working() {
	    
	}


}
