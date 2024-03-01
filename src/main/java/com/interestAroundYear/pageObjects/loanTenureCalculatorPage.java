package com.interestAroundYear.pageObjects;

import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loanTenureCalculatorPage extends emiCalculatorPage {

	public loanTenureCalculatorPage(WebDriver driver) {
		super(driver);
	}
	//navigating to loan tenure calculator from home page
	public void loanTenureCalculator() {
		calculator.click();
		emiCalculator.click();
		tenureLoanCalculator.click();
	}
	//verifying loan amount text box in loan tenure calculator 
	public void loanTenureCalculatorAmountBoxCheck() {
		boolean loanCalculator= loanCalculatorAmount.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Amount Text box working");
	}
	//verifying loan amount slider in loan tenure calculator
	public void loanTenureCalculatorAmountSliderCheck() {
		String amount1=loanCalculatorAmount.getAttribute("value");
		act.dragAndDropBy(loanCalculatorAmountSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorAmount.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Amount emi slider working........... ");
	}
	//Entering loan amount in loan tenure calculator
	public void loanTenureCalculatorPageAmount(String amount1) {
		loanCalculatorAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorAmount.sendKeys(amount1);
	}
	//verifying loan emi text box in loan tenure calculator 
	public void loanTenureClaculatorEmiBox() {
		boolean loanCalculator= loanCalculatorEmi.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Tenure Text box working");
	}
	//verifying loan emi slider in loan tenure calculator
	public void loanTenureCalculatorEmiSliderCheck() {
		String amount1=loanCalculatorEmi.getAttribute("value");
		act.dragAndDropBy(loanCalculatorEmiSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorEmi.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Tenure slider working........... ");
	}
	//Entering loan emi in loan tenure calculator
	public void loanTenureCalculatorEmi(String tenure) {
		loanCalculatorEmi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorEmi.sendKeys(tenure);
	}
	//verifying loan interest text box in loan tenure calculator 
	public void loanTenureCalculatorInterestBox() {
		boolean loanCalculator= loanCalculatorInterest.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Interest Text box working");
	}
	//verifying loan interest slider in loan tenure calculator
	public void loanTenureCalculatorInterestSliderCheck() {
		String amount1=loanCalculatorInterest.getAttribute("value");
		act.dragAndDropBy(loanCalculatorInterestSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorInterest.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Interest slider working........... ");
	}
	//Entering loan interest in loan tenure calculator
	public void loanTenureCalculatorPageInterest(String interest1) {
		loanCalculatorInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorInterest.sendKeys(interest1);
	}
	//verifying loan fees text box in loan tenure calculator 
	public void loanTenureClaculatorFeeBox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", loanCalculatorSliderFees);
		boolean loanCalculator= loanCalculatorSliderFees.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Fees & Charges Text box working");
	}
	//verifying loan fees slider in loan tenure calculator
	public void loanTenureCalculatorFeeSliderCheck() {
		String amount1=loanCalculatorFees.getAttribute("value");
		act.dragAndDropBy(loanCalculatorSliderFees, 10, 0).build().perform();
		String amount2 = loanCalculatorFees.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Fees & Charges slider working........... ");
	}
	//Entering loan fees in loan tenure calculator
	public void loanTenureCalculatorFees(String fees1) {
		loanCalculatorFees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorFees.sendKeys(fees1);
	}
	//clicking on loan scheme button in loan tenure calcualtor
	public void loanTenureScheme() {
		loanCalculatorScheme.click();
	}	
}
