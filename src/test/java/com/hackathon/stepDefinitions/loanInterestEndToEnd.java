package com.hackathon.stepDefinitions;

import java.io.IOException;

import com.hackathon.factory.helperClass;
import com.hackathon.pageObjects.carLoanPage;
import com.hackathon.pageObjects.emiCalculatorPage;
import com.hackathon.pageObjects.homeLoanPage;
import com.hackathon.pageObjects.loanAmountCalculatorPage;
import com.hackathon.pageObjects.loanTenureCalculatorPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loanInterestEndToEnd {

carLoanPage cLP;
homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
emiCalculatorPage ecp= new emiCalculatorPage(helperClass.getDriver());
loanAmountCalculatorPage lacp = new loanAmountCalculatorPage(helperClass.getDriver());
loanTenureCalculatorPage ltc = new loanTenureCalculatorPage(helperClass.getDriver());
	
	@Given("user launches the app")
	public void user_launches_the_browser() {
		cLP = new carLoanPage(helperClass.getDriver());
		cLP.carClick();
	}
	
	@When("user enters loan amount {string}")
	public void user_enters_loan_amount(String string) {
		cLP.enterLoanAmount(string);
	}

	@When("enters loan interst rate {string}")
	public void enters_loan_interst_rate(String string) {
		cLP.interestRate(string);
	}

	@When("enters loan term {string}")
	public void enters_loan_term(String string) {
		cLP.loanTenure(string);
	}
	@Then("diplay monthly interest and principal amount")
	public void diplay_monthly_interest_and_principal_amount() {
		cLP.yearClick();
		System.out.println("Monthly Interest :"+cLP.getMonthInters());
		System.out.println("Monthly Principal :"+cLP.getMonthPrincipal());
	}


	@Then("the emi is displayed")
	public void the_emi_is_displayed() {
		cLP.verifyEmi();
	}

	@Then("Total interest payable")
	public void total_interest_payable() {
		cLP.verifyTotalInterest();
	}

	@Then("Total payable amount")
	public void total_payable_amount() {
		cLP.verifyTotalPayable();
	}
	
	@Given("opens Home loan calculator")
	public void opens_home_loan_calculator() {
		hlp.homeLoanCalculator();
	}

	@When("user enters Home Value {string}")
	public void user_enters_home_value(String string) {
		hlp.homeAmount(string);
	}

	@When("One-time Expenses {string}")
	public void one_time_expenses(String string) {
		hlp.oneTimeExpence(string);
	}

	@When("Margin OR Down Payment {string}")
	public void margin_or_down_payment(String string) {
		hlp.downPayment(string);
	}

	@When("Property Taxes {string}")
	public void property_taxes(String string) {
		hlp.propertyTaxes(string);
	}

	@When("Loan Insurance {string}")
	public void loan_insurance(String string) {
		hlp.homeLoanInsuranceAmount(string);
	}

	@When("Home Insurance {string}")
	public void home_insurance(String string) {
		hlp.homeInsurance(string);
	}

	@When("Loan Amount")
	public void loan_amount() {
		hlp.homeLoanAmount();
	}

	@When("Maintenance Expenses {string}")
	public void maintenance_expenses(String string) {
		hlp.maintenanceExpenses(string);
	}

	@When("Interest Rate {string}")
	public void interest_rate(String string) {
		hlp.homeLoanInterest(string);
	}

	@When("Loan Tenure {string}")
	public void loan_tenure(String string) {
		hlp.homeLoanTerm(string);
	}

	@When("Loan Fees & Charges {string}")
	public void loan_fees_charges(String string) {
		hlp.loanFees(string);
	}

	@When("Start Month & Year")
	public void start_month_year() {
		hlp.selectMonth();
	}

	@When("extract all the data from year on year table & store in excel")
	public void extract_all_the_data_from_year_on_year_table_store_in_excel() throws IOException {
		hlp.writeExcelSheet();
	}
	
	@Given("user navigate emi calculator")
	public void user_navigate_emi_calculator() {
		ecp.loanCalculator();
	}

	@Then("verify emi amount text box")
	public void verify_emi_amount_text_box() {
		ecp.loanCalculatorAmountBoxCheck();
	}

	@Then("emi slider is working")
	public void emi_slider_is_working() {
		ecp.loanCalculatorAmountSliderCheck();
	}

	@When("user enter emi amount {string}")
	public void user_enter_emi_amount(String string) {
		ecp.loanCalculatorPageAmount(string);
	}

	@Then("verify emi interest rate text box")
	public void verify_emi_interest_rate_text_box() {
		ecp.loanCalculatorInterestBox();
	}

	@Then("emi interest slider")
	public void emi_interest_slider() {
		ecp.loanCalculatorInterestSliderCheck();
	}

	@When("user enters emi interest rate {string}")
	public void user_enters_emi_interest_rate(String string) {
		ecp.loanCalculatorPageInterest(string);
	}

	@Then("verify emi tenure text box")
	public void verify_emi_tenure_text_box() {
		ecp.loanClaculatorTenureBox();
	}

	@Then("emi tenure slider")
	public void emi_tenure_slider() {
		ecp.loanCalculatorTenureSliderCheck();
	}

	@When("user enters emi Tenure {string}")
	public void user_enters_emi_tenure(String string) {
		ecp.loanCalculatorTenure(string);
	}
	
	@Then("verify Fees and Charges text box")
	public void verify_fees_and_charges_text_box() {
		ecp.loanClaculatorFeeBox();
	}
	
	@Then("emi Fees and Charges slider")
	public void emi_fees_and_charges_slider() {
		ecp.loanCalculatorFeeSliderCheck();
	}
	@When("user enters emi Fees and Charges {string}")
	public void user_enters_emi_fees_and_charges(String string) {
		ecp.loanCalculatorFees(string);
		ecp.emiSchemeClick();
	}

	@Then("verify scale")
	public void verify_scale() {
		ecp.scaleCheck();
	}
	
	@Given("user navigate to loan emi calculator")
	public void user_navigate_to_loan_emi_calculator() {
		lacp.loanCalculator();
	}

	@Then("verify loan emi text box")
	public void verify_loan_emi_text_box() {
		lacp.loanCalculatorEmiBoxCheck();
	}
	
	@Then("loan emi slider is working")
	public void loan_emi_slider_is_working() {
		lacp.loanCalculatorEmiSliderCheck();
	}

	@When("user enter loan emi {string}")
	public void user_enter_loan_emi(String string) {
		lacp.loanCalculatorAmount(string);
	}

	@Then("verify loan interest rate text box")
	public void verify_loan_interest_rate_text_box() {
		lacp.loanCalculatorInterestBox();
	}

	@Then("loan interest slider")
	public void loan_interest_slider() {
		lacp.loanCalculatorInterestSliderCheck();
	}

	@When("user enters loan interest rate {string}")
	public void user_enters_loan_interest_rate(String string) {
		lacp.loanCalculatorPageInterest(string);
	}

	@Then("verify loan tenure text box")
	public void verify_loan_tenure_text_box() {
		lacp.loanClaculatorTenureBox();
	}

	@Then("loan amount calculator tenure slider")
	public void loan_amount_calculator_tenure_slider() {
		lacp.loanCalculatorTenureSliderCheck();
	}

	@When("user enters loan Tenure {string}")
	public void user_enters_loan_tenure(String string) {
		lacp.loanCalculatorTenure(string);
	}

	@Then("verify loan amount calculator Fees and Charges text box")
	public void verify_loan_amount_calculator_fees_and_charges_text_box() {
		lacp.loanClaculatorFeeBox();
	}

	@Then("loan loan amount calculator Fees and Charges slider")
	public void loan_loan_amount_calculator_fees_and_charges_slider() {
		lacp.loanCalculatorFeeSliderCheck();
	}

	@When("user enters loan amount calculator Fees and Charges {string}")
	public void user_enters_loan_amount_calculator_fees_and_charges(String string) {
		lacp.loanCalculatorFees(string);
		lacp.emiClick();
	}

	@Then("verify loan amount calculator scale")
	public void verify_loan_amount_calculator_scale() {
		lacp.scaleCheck();
	}
	
	@Given("user navigate to loan tenure calculator")
	public void user_navigate_to_loan_tenure_calculator() {
		ltc.loanTenureCalculator();
	}
	
	@Then("verify tenure loan amount text box")
	public void verify_tenure_loan_amount_text_box() {
		ltc.loanTenureCalculatorAmountBoxCheck();
	}

	@Then("loan tenure calculator amount slider")
	public void loan_tenure_calculator_amount_slider() {
		ltc.loanTenureCalculatorAmountSliderCheck();
	}

	@When("user enters Tenure loan amount  {string}")
	public void user_enters_tenure_loan_amount(String string) {
		ltc.loanTenureCalculatorPageAmount(string);
	}

	@Then("verify Tenureloan emi text box")
	public void verify_tenureloan_emi_text_box() {
		ltc.loanTenureClaculatorEmiBox();
	}

	@Then("Tenureloan emi slider is working")
	public void tenureloan_emi_slider_is_working() {
		ltc.loanTenureCalculatorEmiSliderCheck();
	}

	@When("user enter Tenureloan emi {string}")
	public void user_enter_tenureloan_emi(String string) {
		ltc.loanTenureCalculatorEmi(string);
	}

	@Then("verify Tenureloan interest rate text box")
	public void verify_tenureloan_interest_rate_text_box() {
		ltc.loanTenureCalculatorInterestBox();
	}

	@Then("Tenureloan interest slider")
	public void tenureloan_interest_slider() {
		ltc.loanTenureCalculatorInterestSliderCheck();
	}

	@When("user enters Tenureloan interest rate {string}")
	public void user_enters_tenureloan_interest_rate(String string) {
		ltc.loanTenureCalculatorPageInterest(string);
	}

	@Then("verify Tenureloan amount calculator Fees and Charges text box")
	public void verify_tenureloan_amount_calculator_fees_and_charges_text_box() {
		ltc.loanTenureClaculatorFeeBox();
	}

	@Then("loan Tenure amount calculator Fees and Charges slider")
	public void loan_tenure_amount_calculator_fees_and_charges_slider() {
		ltc.loanTenureCalculatorFeeSliderCheck();
	}

	@When("user enters loan Tenure calculator Fees and Charges {string}")
	public void user_enters_loan_tenure_calculator_fees_and_charges(String string) {
		ltc.loanTenureCalculatorFees(string);
	}

	@Then("verify loan Tenure calculator scale")
	public void verify_loan_tenure_calculator_scale() {
	    System.out.println("Different Scale Not Available");
	}

}
