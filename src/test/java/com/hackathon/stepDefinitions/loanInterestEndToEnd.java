package com.hackathon.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	loanAmountCalculatorPage lacp = new loanAmountCalculatorPage(helperClass.getDriver());
	loanTenureCalculatorPage ltc = new loanTenureCalculatorPage(helperClass.getDriver());
	public Logger logger=LogManager.getLogger(this.getClass());

	@Given("user launches the app")
	public void user_launches_the_browser() {
		logger.info("**** Starting End to End ****");
		cLP = new carLoanPage(helperClass.getDriver());
		cLP.carClick();
		logger.info("user navigated to the car loan calculator");
	}

	@When("user enters loan amount {string}")
	public void user_enters_loan_amount(String string) {
		cLP.enterLoanAmount(string);
		logger.info("user enters car loan amount");
	}

	@When("enters loan interst rate {string}")
	public void enters_loan_interst_rate(String string) {
		cLP.interestRate(string);
		logger.info("user enters car loan interest rate");
	}

	@When("enters loan term {string}")
	public void enters_loan_term(String string) {
		cLP.loanTenure(string);
		logger.info("user enters car loan tenure");
	}

	@Then("diplay monthly interest and principal amount")
	public void diplay_monthly_interest_and_principal_amount() {
		cLP.yearClick();                                                     //user click on year 2024 in emi table
		System.out.println("Monthly Interest :" + cLP.getMonthInters());
		System.out.println("Monthly Principal :" + cLP.getMonthPrincipal());
		logger.info("Monthly Interest and Monthly Principal is displayed");
	}

	@Then("the emi is displayed")
	public void the_emi_is_displayed() {
		cLP.verifyEmi();
		logger.info("verifies if emi is displayed");
	}

	@Then("Total interest payable")
	public void total_interest_payable() {
		cLP.verifyTotalInterest();
		logger.info("verified total interest payable");
	}

	@Then("Total payable amount")
	public void total_payable_amount() {
		cLP.verifyTotalPayable();
		logger.info("verifed total amount payable");
	}

	@Given("opens Home loan calculator")
	public void opens_home_loan_calculator() {
		hlp.homeLoanCalculator();
		logger.info("user is navigated to the home loan calculator");
	}

	@When("user enters Home Value {string}")
	public void user_enters_home_value(String string) {
		hlp.homeAmount(string);
		logger.info("user enter home value ammount");
	}

	@When("One-time Expenses {string}")
	public void one_time_expenses(String string) {
		hlp.oneTimeExpence(string);
		logger.info("user enter owner one time expence");
	}

	@When("Margin OR Down Payment {string}")
	public void margin_or_down_payment(String string) {
		hlp.downPayment(string);
		logger.info("user enter home loan down payment");
	}

	@When("Property Taxes {string}")
	public void property_taxes(String string) {
		hlp.propertyTaxes(string);
		logger.info("user enter property taxes");
	}

	@When("Loan Insurance {string}")
	public void loan_insurance(String string) {
		hlp.homeLoanInsuranceAmount(string);
		logger.info("user enter home loan insurance");
	}

	@When("Home Insurance {string}")
	public void home_insurance(String string) {
		hlp.homeInsurance(string);
		logger.info("user enter home insurance");
	}

	@When("Loan Amount")
	public void loan_amount() {
		hlp.homeLoanAmount();
		logger.info("user enter home loan amount");
	}

	@When("Maintenance Expenses {string}")
	public void maintenance_expenses(String string) {
		hlp.maintenanceExpenses(string);
		logger.info("user enter home maintanance charges");
	}

	@When("Interest Rate {string}")
	public void interest_rate(String string) {
		hlp.homeLoanInterest(string);
		logger.info("Home loan interest rate filled");
	}

	@When("Loan Tenure {string}")
	public void loan_tenure(String string) {
		hlp.homeLoanTerm(string);
		logger.info("Home loan tenure filled");
	}

	@When("Loan Fees & Charges {string}")
	public void loan_fees_charges(String string) {
		hlp.loanFees(string);
		logger.info("Home loan fees and charges filled");
	}

	@When("Start Month & Year")
	public void start_month_year() {
		hlp.selectMonth();
		logger.info("loan month is selected");
	}

	@When("extract all the data from year on year table & store in excel")
	public void extract_all_the_data_from_year_on_year_table_store_in_excel() throws IOException {
		hlp.writeExcelSheet();
		logger.info("Emi year to year table is stored to excel sheet");
	}

	@Given("user navigate emi calculator")
	public void user_navigate_emi_calculator() {
		ecp.loanCalculator();
		logger.info("Navigated to emi calculator");
	}

	@Then("verify emi amount text box")
	public void verify_emi_amount_text_box() {
		ecp.loanCalculatorAmountBoxCheck();
		logger.info("");
	}

	@Then("emi slider is working")
	public void emi_slider_is_working() {
		ecp.loanCalculatorAmountSliderCheck();
		logger.info("");
	}

	@When("user enter emi amount {string}")
	public void user_enter_emi_amount(String string) {
		ecp.loanCalculatorPageAmount(string);
		logger.info("");
	}

	@Then("verify emi interest rate text box")
	public void verify_emi_interest_rate_text_box() {
		ecp.loanCalculatorInterestBox();
		logger.info("");
	}

	@Then("emi interest slider")
	public void emi_interest_slider() {
		ecp.loanCalculatorInterestSliderCheck();
		logger.info("");
	}

	@When("user enters emi interest rate {string}")
	public void user_enters_emi_interest_rate(String string) {
		ecp.loanCalculatorPageInterest(string);
		logger.info("");
	}

	@Then("verify emi tenure text box")
	public void verify_emi_tenure_text_box() {
		ecp.loanClaculatorTenureBox();
		logger.info("");
	}

	@Then("emi tenure slider")
	public void emi_tenure_slider() {
		ecp.loanCalculatorTenureSliderCheck();
		logger.info("");
	}

	@When("user enters emi Tenure {string}")
	public void user_enters_emi_tenure(String string) {
		ecp.loanCalculatorTenure(string);
		logger.info("");
	}

	@Then("verify Fees and Charges text box")
	public void verify_fees_and_charges_text_box() {
		ecp.loanClaculatorFeeBox();
		logger.info("");
	}

	@Then("emi Fees and Charges slider")
	public void emi_fees_and_charges_slider() {
		ecp.loanCalculatorFeeSliderCheck();
		logger.info("");
	}

	@When("user enters emi Fees and Charges {string}")
	public void user_enters_emi_fees_and_charges(String string) {
		ecp.loanCalculatorFees(string);
		ecp.emiSchemeClick();
		logger.info("");
	}

	@Then("verify scale")
	public void verify_scale() {
		ecp.scaleCheck();
		logger.info("");
	}

	@Given("user navigate to loan emi calculator")
	public void user_navigate_to_loan_emi_calculator() {
		lacp.loanCalculator();
		logger.info("");
	}

	@Then("verify loan emi text box")
	public void verify_loan_emi_text_box() {
		lacp.loanCalculatorEmiBoxCheck();
		logger.info("");
	}

	@Then("loan emi slider is working")
	public void loan_emi_slider_is_working() {
		lacp.loanCalculatorEmiSliderCheck();
		logger.info("");
	}

	@When("user enter loan emi {string}")
	public void user_enter_loan_emi(String string) {
		lacp.loanCalculatorAmount(string);
		logger.info("");
	}

	@Then("verify loan interest rate text box")
	public void verify_loan_interest_rate_text_box() {
		lacp.loanCalculatorInterestBox();
		logger.info("");
	}

	@Then("loan interest slider")
	public void loan_interest_slider() {
		lacp.loanCalculatorInterestSliderCheck();
		logger.info("");
	}

	@When("user enters loan interest rate {string}")
	public void user_enters_loan_interest_rate(String string) {
		lacp.loanCalculatorPageInterest(string);
		logger.info("");
	}

	@Then("verify loan tenure text box")
	public void verify_loan_tenure_text_box() {
		lacp.loanClaculatorTenureBox();
		logger.info("");
	}

	@Then("loan amount calculator tenure slider")
	public void loan_amount_calculator_tenure_slider() {
		lacp.loanCalculatorTenureSliderCheck();
		logger.info("");
	}

	@When("user enters loan Tenure {string}")
	public void user_enters_loan_tenure(String string) {
		lacp.loanCalculatorTenure(string);
		logger.info("");
	}

	@Then("verify loan amount calculator Fees and Charges text box")
	public void verify_loan_amount_calculator_fees_and_charges_text_box() {
		lacp.loanClaculatorFeeBox();
		logger.info("");
	}

	@Then("loan loan amount calculator Fees and Charges slider")
	public void loan_loan_amount_calculator_fees_and_charges_slider() {
		lacp.loanCalculatorFeeSliderCheck();
		logger.info("");
	}

	@When("user enters loan amount calculator Fees and Charges {string}")
	public void user_enters_loan_amount_calculator_fees_and_charges(String string) {
		lacp.loanCalculatorFees(string);
		lacp.emiClick();
		logger.info("");
	}

	@Then("verify loan amount calculator scale")
	public void verify_loan_amount_calculator_scale() {
		lacp.scaleCheck();
		logger.info("");
	}

	@Given("user navigate to loan tenure calculator")
	public void user_navigate_to_loan_tenure_calculator() {
		ltc.loanTenureCalculator();
		logger.info("");
	}

	@Then("verify tenure loan amount text box")
	public void verify_tenure_loan_amount_text_box() {
		ltc.loanTenureCalculatorAmountBoxCheck();
		logger.info("");
	}

	@Then("loan tenure calculator amount slider")
	public void loan_tenure_calculator_amount_slider() {
		ltc.loanTenureCalculatorAmountSliderCheck();
		logger.info("");
	}

	@When("user enters Tenure loan amount  {string}")
	public void user_enters_tenure_loan_amount(String string) {
		ltc.loanTenureCalculatorPageAmount(string);
		logger.info("");
	}

	@Then("verify Tenureloan emi text box")
	public void verify_tenureloan_emi_text_box() {
		ltc.loanTenureClaculatorEmiBox();
		logger.info("");
	}

	@Then("Tenureloan emi slider is working")
	public void tenureloan_emi_slider_is_working() {
		ltc.loanTenureCalculatorEmiSliderCheck();
		logger.info("");
	}

	@When("user enter Tenureloan emi {string}")
	public void user_enter_tenureloan_emi(String string) {
		ltc.loanTenureCalculatorEmi(string);
		logger.info("");
	}

	@Then("verify Tenureloan interest rate text box")
	public void verify_tenureloan_interest_rate_text_box() {
		ltc.loanTenureCalculatorInterestBox();
		logger.info("");
	}

	@Then("Tenureloan interest slider")
	public void tenureloan_interest_slider() {
		ltc.loanTenureCalculatorInterestSliderCheck();
		logger.info("");
	}

	@When("user enters Tenureloan interest rate {string}")
	public void user_enters_tenureloan_interest_rate(String string) {
		ltc.loanTenureCalculatorPageInterest(string);
		logger.info("");
	}

	@Then("verify Tenureloan amount calculator Fees and Charges text box")
	public void verify_tenureloan_amount_calculator_fees_and_charges_text_box() {
		ltc.loanTenureClaculatorFeeBox();
		logger.info("");
	}

	@Then("loan Tenure amount calculator Fees and Charges slider")
	public void loan_tenure_amount_calculator_fees_and_charges_slider() {
		ltc.loanTenureCalculatorFeeSliderCheck();
		logger.info("");
	}

	@When("user enters loan Tenure calculator Fees and Charges {string}")
	public void user_enters_loan_tenure_calculator_fees_and_charges(String string) {
		ltc.loanTenureCalculatorFees(string);
		logger.info("");
	}

	@Then("verify loan Tenure calculator scale")
	public void verify_loan_tenure_calculator_scale() {
		System.out.println("Different Scale Not Available");
		logger.info("**** End of End to End");
	}

}
