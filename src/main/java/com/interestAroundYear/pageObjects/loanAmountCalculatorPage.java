package com.interestAroundYear.pageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loanAmountCalculatorPage extends emiCalculatorPage {

	public loanAmountCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	public void loanCalculator() {
		calculator.click();
		emiCalculator.click();
		loanAmountCalculator.click();
	}
	public void loanCalculatorEmiBoxCheck() {
		boolean loanCalculator= loanCalculatorEmi.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Amount Text box working");
	}
	
	public void loanCalculatorEmiSliderCheck() {
		String amount1=loanCalculatorEmi.getAttribute("value");
		act.dragAndDropBy(loanCalculatorEmiSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorEmi.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Amount emi slider working........... ");
	}
	public void loanCalculatorAmount(String amount1) {
		loanCalculatorEmi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorEmi.sendKeys(amount1);
	}
	public void loanCalculatorInterestBox() {
		boolean loanCalculator= loanCalculatorInterest.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Interest Text box working");
	}
	
	public void loanCalculatorInterestSliderCheck() {
		String amount1=loanCalculatorInterest.getAttribute("value");
		act.dragAndDropBy(loanCalculatorInterestSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorInterest.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Interest slider working........... ");
	}
	
	public void loanCalculatorPageInterest(String interest1) {
		loanCalculatorInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorInterest.sendKeys(interest1);
	}
	public void loanClaculatorTenureBox() {
		boolean loanCalculator= loanCalculatorTerm.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Tenure Text box working");
	}
	
	public void loanCalculatorTenureSliderCheck() {
		String amount1=loanCalculatorTerm.getAttribute("value");
		act.dragAndDropBy(loanCalculatorTermSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorTerm.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Tenure slider working........... ");
	}
	public void loanCalculatorTenure(String tenure) {
		loanCalculatorTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorTerm.sendKeys(tenure);
	}
	public void loanClaculatorFeeBox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", loanCalculatorSliderFees);
		boolean loanCalculator= loanCalculatorFees.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Fees & Charges Text box working");
	}
	
	public void loanCalculatorFeeSliderCheck() {
		String amount1=loanCalculatorFees.getAttribute("value");
		act.dragAndDropBy(loanCalculatorSliderFees, 10, 0).build().perform();
		String amount2 = loanCalculatorFees.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Fees & Charges slider working........... ");
	}
	public void loanCalculatorFees(String fees1) {
		loanCalculatorFees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorFees.sendKeys(fees1);
	}
	public void emiClick() {
		loanCalculatorScheme.click();
	}
	public void scaleCheck() {
		String monthlyEmi1=loanAmountCalculatorAmount.getText();
		String monthlyTotalEmi1=loanAmountCalculatorTotal.getText();
		loanCalculatorMonth.click();
		String monthlyEmi2 = loanAmountCalculatorAmount.getText();
		String monthlyTotalEmi2=loanAmountCalculatorTotal.getText();
		Assert.assertEquals(monthlyEmi1, monthlyEmi2);
		Assert.assertEquals(monthlyTotalEmi1, monthlyTotalEmi2);
		System.out.println("Loan Amount calculator scale check");
	}
	
	
}

