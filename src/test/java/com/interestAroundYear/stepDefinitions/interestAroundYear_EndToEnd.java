package com.interestAroundYear.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interestAroundYear.factory.helperClass;
import com.interestAroundYear.pageObjects.carLoanPage;
import com.interestAroundYear.pageObjects.emiCalculatorPage;
import com.interestAroundYear.pageObjects.homeLoanPage;
import com.interestAroundYear.pageObjects.loanAmountCalculatorPage;
import com.interestAroundYear.pageObjects.loanTenureCalculatorPage;

import io.cucumber.java.en.*;

public class interestAroundYear_EndToEnd {
	carLoanPage cLP;
	homeLoanPage hlp = new homeLoanPage(helperClass.getDriver());
	emiCalculatorPage ecp = new emiCalculatorPage(helperClass.getDriver());
	loanAmountCalculatorPage lacp = new loanAmountCalculatorPage(helperClass.getDriver());
	loanTenureCalculatorPage ltc = new loanTenureCalculatorPage(helperClass.getDriver());
	public Logger logger=LogManager.getLogger(this.getClass());
	
	@Given("user navigate to car loan calculator in emi Web page")
	public void user_navigate_to_car_loan_calculator_in_emi_web_page() {
		logger.info("**** Starting End to End ****");
		cLP = new carLoanPage(helperClass.getDriver());
		cLP.carClick();
		logger.info("user navigated to the car loan calculator");
	}

	@When("user enters loan amount {string} in car loan in emi calculator")
	public void user_enters_loan_amount_in_car_loan_in_emi_calculator(String string) {
		cLP.enterLoanAmount(string);
		logger.info("user enters car loan amount");
	}

	@When("user enters loan interest rate {string} in car loan in emi calculator")
	public void user_enters_loan_interest_rate_in_car_loan_in_emi_calculator(String string) {
		cLP.interestRate(string);
		logger.info("user enters car loan interest rate");
	}
	@When("user enters loan tenure {string} in car loan in emi calculator")
	public void user_enters_loan_tenure_in_car_loan_in_emi_calculator(String string) {
		cLP.loanTenure(string);
		logger.info("user enters car loan tenure");
	}

	@Then("diplay monthly interest and principal from car loan calculatro")
	public void diplay_monthly_interest_and_principal_from_car_loan_calculatro() {
		cLP.yearClick();                                                     //user click on year 2024 in emi table
		System.out.println("Monthly Interest :" + cLP.getMonthInters());
		System.out.println("Monthly Principal :" + cLP.getMonthPrincipal());
		logger.info("Monthly Interest and Monthly Principal is displayed");
	}

	@Then("verify monthly emi is displayed in car loan calculator")
	public void verify_monthly_emi_is_displayed_in_car_loan_calculator() {
		cLP.verifyEmi();
		logger.info("verifies if emi is displayed");
	}

	@Then("verify Total interest payable is displayed in car loan calculator")
	public void verify_total_interest_payable_is_displayed_in_car_loan_calculator() {
		cLP.verifyTotalInterest();
		logger.info("verified total interest payable");
	}

	@Then("verify Total payable amount is displayed in car loan calculator")
	public void verify_total_payable_amount_is_displayed_in_car_loan_calculator() {
		cLP.verifyTotalPayable();
		logger.info("verifed total amount payable");
	}

	@Given("User navigate to home loan calculator in emi web application")
	public void user_navigate_to_home_loan_calculator_in_emi_web_application() {
		hlp.homeLoanCalculator();
		logger.info("user is navigated to the home loan calculator");
	}

	@When("user enters home vale {string} in home loan calculator")
	public void user_enters_home_vale_in_home_loan_calculator(String string) {
		hlp.homeAmount(string);
		logger.info("user enter home value ammount");
	}

	@When("user enters One Time Expenses {string} in home loan calculator")
	public void user_enters_one_time_expenses_in_home_loan_calculator(String string) {
		hlp.oneTimeExpence(string);
		logger.info("user enter owner one time expence");
	}

	@When("user enters Down Payment {string} in home loan calculator")
	public void user_enters_down_payment_in_home_loan_calculator(String string) {
		hlp.downPayment(string);
		logger.info("user enter home loan down payment");
	}

	@When("user enters Taxes {string} in home loan calculator")
	public void user_enters_taxes_in_home_loan_calculator(String string) {
		hlp.propertyTaxes(string);
		logger.info("user enter property taxes");
	}

	@When("user enters loan Insurance {string} in home loan calculator")
	public void user_enters_loan_insurance_in_home_loan_calculator(String string) {
		hlp.homeLoanInsuranceAmount(string);
		logger.info("user enter home loan insurance");
	}

	@When("user enters home Insurance {string} in home loan calculator")
	public void user_enters_home_insurance_in_home_loan_calculator(String string) {
		hlp.homeInsurance(string);
		logger.info("user enter home insurance");
	}

	@When("user enters Loan Amount in home loan calculator")
	public void user_enters_loan_amount_in_home_loan_calculator() {
		hlp.homeLoanAmount();
		logger.info("user enter home loan amount");
	}

	@When("user enters maintenance {string} in home loan calculator")
	public void user_enters_maintenance_in_home_loan_calculator(String string) {
		hlp.maintenanceExpenses(string);
		logger.info("user enter home maintanance charges");
	}

	@When("user enters interest {string} in home loan calculator")
	public void user_enters_interest_in_home_loan_calculator(String string) {
		hlp.homeLoanInterest(string);
		logger.info("Home loan interest rate filled");
	}

	@When("user enters loan Tenure {string} in home loan calculator")
	public void user_enters_loan_tenure_in_home_loan_calculator(String string) {
		hlp.homeLoanTerm(string);
		logger.info("Home loan tenure filled");
	}

	@When("user enters Loan fees {string} in home loan calculator")
	public void user_enters_loan_fees_in_home_loan_calculator(String string) {
		hlp.loanFees(string);
		logger.info("Home loan fees and charges filled");
	}

	@When("user enters Start Month & Year in home loan calculator")
	public void user_enters_start_month_year_in_home_loan_calculator() {
		hlp.selectMonth();
		logger.info("loan stast month selected");
	}

	@When("user enters extract all the data from year on year table & store in excel")
	public void user_enters_extract_all_the_data_from_year_on_year_table_store_in_excel() throws IOException {
		hlp.writeExcelSheet();
		logger.info("Emi year to year table is stored to excel sheet");
	}

	@Given("user navigate to emi calculator in loan calculator from emi web application")
	public void user_navigate_to_emi_calculator_in_loan_calculator_from_emi_web_application() {
		ecp.loanCalculator();
		logger.info("Navigated to emi calculator");
	}

	@Then("verify amount text box in emi calculator")
	public void verify_amount_text_box_in_emi_calculator() {
		ecp.loanCalculatorAmountBoxCheck();
		logger.info("Emi text box verified");
	}

	@Then("verify amount slider working in emi calculator")
	public void verify_amount_slider_working_in_emi_calculator() {
		ecp.loanCalculatorAmountSliderCheck();
		logger.info("Emi slider in loan calculator verified");
	}

	@When("user enter Amount {string} in emi calculator")
	public void user_enter_amount_in_emi_calculator(String string) {
		ecp.loanCalculatorPageAmount(string);
		logger.info("Emi vale entered in emi loan calculator");
	}

	@Then("verify emi interest rate text box in emi calculator")
	public void verify_emi_interest_rate_text_box_in_emi_calculator() {
		ecp.loanCalculatorInterestBox();
		logger.info("Interest rate text box in emi loan calculator verified");
	}

	@Then("verify interest slider working in emi calculator")
	public void verify_interest_slider_working_in_emi_calculator() {
		ecp.loanCalculatorInterestSliderCheck();
		logger.info("Emi loan calculator interest slider verified");
	}

	@When("user enters Interest {string} in emi calculator")
	public void user_enters_interest_in_emi_calculator(String string) {
		ecp.loanCalculatorPageInterest(string);
		logger.info("Interest vale entered in emi loan calculator");
	}

	@Then("verify tenure text box in emi calculator")
	public void verify_tenure_text_box_in_emi_calculator() {
		ecp.loanClaculatorTenureBox();
		logger.info("Tenure text box in emi loan calculator verified");
	}

	@Then("verify tenure slider wroking in emi calculator")
	public void verify_tenure_slider_wroking_in_emi_calculator() {
		ecp.loanCalculatorTenureSliderCheck();
		logger.info("Emi loan calculator tenure slider verified");
	}

	@When("user enters Tenure {string} in emi calculator")
	public void user_enters_tenure_in_emi_calculator(String string) {
		ecp.loanCalculatorTenure(string);
		logger.info("Tenure vale entered in emi loan calculator");
	}

	@Then("verify Fees and Charges text box in emi calculator")
	public void verify_fees_and_charges_text_box_in_emi_calculator() {
		ecp.loanClaculatorFeeBox();
		logger.info("Fees and Charges text box in emi loan calculator verified");
	}

	@Then("verify Fees and Charges slider in emi calculator")
	public void verify_fees_and_charges_slider_in_emi_calculator() {
		ecp.loanCalculatorFeeSliderCheck();
		logger.info("Emi loan calculator fees and charges slider verified");
	}

	@When("user enters Fees and Charges {string} in emi calculator")
	public void user_enters_fees_and_charges_in_emi_calculator(String string) {
		ecp.loanCalculatorFees(string);
		ecp.emiSchemeClick();
		logger.info("Fees and Charges vale entered in emi loan calculator");
	}
	@Then("verify scale in emi calculator")
	public void verify_scale_in_emi_calculator() {
		ecp.scaleCheck();
		logger.info("Emi loan calculator Scale verified");
	}
	@Given("user navigate to loan Amount calculator in loan calculator from emi web application")
	public void user_navigate_to_loan_amount_calculator_in_loan_calculator_from_emi_web_application() {
		lacp.loanCalculator();
		logger.info("Navigated to the emi loan calculator");
	}

	@Then("verify loan emi text box in loan amount calculator")
	public void verify_loan_emi_text_box_in_loan_amount_calculator() {
		lacp.loanCalculatorEmiBoxCheck();
		logger.info("Emi text box in loan amount calculator verified");
	}

	@Then("verify loan emi slider is working in loan amount calculator")
	public void verify_loan_emi_slider_is_working_in_loan_amount_calculator() {
		lacp.loanCalculatorEmiSliderCheck();
		logger.info("Loan amount calculator emi slider verified");
	}

	@When("user enter loan emi {string} in loan amount calculator")
	public void user_enter_loan_emi_in_loan_amount_calculator(String string) {
		lacp.loanCalculatorAmount(string);
		logger.info("Emi value entered in loan amount calculator");
	}

	@Then("verify loan interest rate text box in loan amount calculator")
	public void verify_loan_interest_rate_text_box_in_loan_amount_calculator() {
		lacp.loanCalculatorInterestBox();
		logger.info("Interest rate text box in loan amount calculator verified");
	}

	@Then("verify loan interest slider is working in loan amount calculator")
	public void verify_loan_interest_slider_is_working_in_loan_amount_calculator() {
		lacp.loanCalculatorInterestSliderCheck();
		logger.info("Loan amount calculator interest slider verified");
	}

	@When("user enters loan Interest {string} in loan amount calculator")
	public void user_enters_loan_interest_in_loan_amount_calculator(String string) {
		lacp.loanCalculatorPageInterest(string);
		logger.info("Interest rate value entered in loan amount calculator");
	}

	@Then("verify loan tenure text box in loan amount calculator")
	public void verify_loan_tenure_text_box_in_loan_amount_calculator() {
		lacp.loanClaculatorTenureBox();
		logger.info("Tenure text box in loan amount calculator verified");
	}

	@Then("verify loan tenure slider is working in loan amount calculator")
	public void verify_loan_tenure_slider_is_working_in_loan_amount_calculator() {
		lacp.loanCalculatorTenureSliderCheck();
		logger.info("Loan amount calculator tenure slider verified");
	}

	@When("user enters loan Tenure {string} in loan amount calculator")
	public void user_enters_loan_tenure_in_loan_amount_calculator(String string) {
		lacp.loanCalculatorTenure(string);
		logger.info("Tenure value entered in loan amount calculator");
	}

	@Then("verify loan Fees and Charges text box in loan amount calculator")
	public void verify_loan_fees_and_charges_text_box_in_loan_amount_calculator() {
		lacp.loanClaculatorFeeBox();
		logger.info("Fees and Charges text box in loan amount calculator verified");
	}

	@Then("verifyloan loan Fees and Charges slider is working in loan amount calculator")
	public void verifyloan_loan_fees_and_charges_slider_is_working_in_loan_amount_calculator() {
		lacp.loanCalculatorFeeSliderCheck();
		logger.info("Loan amount calculator fees and charges slider verified");
	}

	@When("user enters loan Fees and Charges {string} in loan amount calculator")
	public void user_enters_loan_fees_and_charges_in_loan_amount_calculator(String string) {
		lacp.loanCalculatorFees(string);
		lacp.emiClick();
		logger.info("Fees and Charges value entered in loan amount calculator");
	}

	@Then("verify scales in loan amount calculator")
	public void verify_scales_in_loan_amount_calculator() {
		lacp.scaleCheck();
		logger.info("Loan Amount loan calculator Scale verified");
	}

	@Given("user navigate to loan tenure calculator in loan calculator from emi web application")
	public void user_navigate_to_loan_tenure_calculator_in_loan_calculator_from_emi_web_application() {
		ltc.loanTenureCalculator();
		logger.info("Navigated to the Tenure loan calculator");
	}

	@Then("verify amount text box in loan tenure calculator")
	public void verify_amount_text_box_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorAmountBoxCheck();
		logger.info("Loan Amount text box in loan tenure calculator verified");
	}

	@Then("verify loan tenure calculator amount slider in loan tenure calculator")
	public void verify_loan_tenure_calculator_amount_slider_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorAmountSliderCheck();
		logger.info("Loan tenure calculator amount slider verified");
	}

	@When("user enters loan Amount {string} in loan tenure calculator")
	public void user_enters_loan_amount_in_loan_tenure_calculator(String string) {
		ltc.loanTenureCalculatorPageAmount(string);
		logger.info("Loan amount value entered in loan tenure calculator");
	}

	@Then("verify emi text box in loan tenure calculator")
	public void verify_emi_text_box_in_loan_tenure_calculator() {
		ltc.loanTenureClaculatorEmiBox();
		logger.info("Loan emi text box in loan tenure calculator verified");
	}

	@Then("verify emi slider is working in loan tenure calculator")
	public void verify_emi_slider_is_working_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorEmiSliderCheck();
		logger.info("Loan tenure calculator emi slider verified");
	}

	@When("user enter emi {string} in loan tenure calculator")
	public void user_enter_emi_in_loan_tenure_calculator(String string) {
		ltc.loanTenureCalculatorEmi(string);
		logger.info("Loan emi value entered in loan tenure calculator");
	}

	@Then("verify interest rate text box in loan tenure calculator")
	public void verify_interest_rate_text_box_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorInterestBox();
		logger.info("Interest rate text box in loan tenure calculator verified");
	}

	@Then("verify interest slider in loan tenure calculator")
	public void verify_interest_slider_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorInterestSliderCheck();
		logger.info("Loan tenure calculator interest slider verified");
	}

	@When("user enters Interest {string} rate in loan tenure calculator")
	public void user_enters_interest_rate_in_loan_tenure_calculator(String string) {
		ltc.loanTenureCalculatorPageInterest(string);
		logger.info("Loan interest value entered in loan tenure calculator");
	}

	@Then("verify Fees and Charges text box in loan tenure calculator")
	public void verify_fees_and_charges_text_box_in_loan_tenure_calculator() {
		ltc.loanTenureClaculatorFeeBox();
		logger.info("Fees and Charges text box in loan tenure calculator verified");
	}

	@Then("verify Fees and Charges slider in loan tenure calculator")
	public void verify_fees_and_charges_slider_in_loan_tenure_calculator() {
		ltc.loanTenureCalculatorFeeSliderCheck();
		logger.info("Loan tenure calculator fees and charges slider verified");
	}

	@When("user enters Fees and Charges {string} in loan tenure calculator")
	public void user_enters_fees_and_charges_in_loan_tenure_calculator(String string) {
		ltc.loanTenureCalculatorFees(string);
		logger.info("Loan Fees and Charges value entered in loan tenure calculator");
	}

	@Then("verify loan Tenure calculator scale in loan tenure calculator")
	public void verify_loan_tenure_calculator_scale_in_loan_tenure_calculator() {
		System.out.println("Different Scale Not Available");
		logger.info("**** End of End to End");
	}

}
