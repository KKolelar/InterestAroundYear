package com.hackathon.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class emiCalculatorPage extends BasePage {
	
	public emiCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='menu-item-dropdown-2696']")
	WebElement calculator;
	
	@FindBy(xpath = "//*[@id='menu-item-2423']/a")
	WebElement emiCalculator;
	
	@FindBy(xpath = "//*[@id='loan-amount-calc']/a[1]")
	WebElement loanAmountCalculator;
	
	@FindBy(xpath ="//*[@id=\"loan-tenure-calc\"]/a[1]")
	WebElement tenureLoanCalculator;
	
	@FindBy(xpath ="//*[@id=\"interest-rate-calc\"]/a[1]")
	WebElement interestRateLoanCalculator;
	
	@FindBy(xpath = "//*[@id='loanamount']")
	WebElement loanCalculatorAmount;
	
	@FindBy(id="loanemi")
	WebElement  loanCalculatorEmi;
	
	@FindBy(id="loaninterest")
	WebElement loanCalculatorInterest;
	
	@FindBy(id="loanterm")
	WebElement loanCalculatorTerm;
	
	@FindBy(id="loanfees")
	WebElement loanCalculatorFees;
	
	@FindBy(xpath = "(//*[@class=\"btn btn-secondary active\"])[2]")
	WebElement loanCalculatorScheme;
	
	@FindBy(xpath = "//*[@id='loanamountslider']/span")
	WebElement loanCalculatorAmountSlider;
	
	@FindBy(xpath = "//*[@id='loanemislider']/span")
	WebElement loanCalculatorEmiSlider;
	
	@FindBy(xpath = "//*[@id='loaninterestslider']/span")
	WebElement loanCalculatorInterestSlider;
	
	@FindBy(xpath = "//*[@id='loantermslider']/span")
	WebElement loanCalculatorTermSlider;
	
	@FindBy(xpath = "//*[@id='loanfeesslider']/span")
	WebElement loanCalculatorSliderFees;
	
	@FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
	WebElement loanCalculatorMonth;
	
	@FindBy(xpath = "//*[@id='loansummary-emi']/p/span")
	WebElement emiCalculatorMonthlyEmi;
	
	@FindBy(xpath = "//*[@id='loansummary-totalamount']/p/span")
	WebElement emiCalculatorTotalemi;
	
	
	@FindBy(xpath = "//*[@id=\"loansummary-loanamount\"]/p/span")
	WebElement loanAmountCalculatorAmount;
	
	@FindBy(xpath = "//*[@id=\"loansummary-totalamount\"]/p/span")
	WebElement loanAmountCalculatorTotal;
	
	@FindBy(xpath = "//*[@id=\"loansummary-tenure\"]/p")
	WebElement tenureLoanCalculatorTerm;
	
	@FindBy(xpath = "//*[@id=\"loansummary-totalamount\"]/p/span")
	WebElement tenureLoanCalculatorTotal;
	
	@FindBy(xpath = "//*[@id=\"emi-calc\"]/a[1]")
	WebElement emiLoanCalculator;
	
	@FindBy(xpath = "//*[@id='loansummary']/div/h4")
	List<WebElement> allCalText;
	
	
	Actions act = new Actions(driver);
	
	public void loanCalculator() {
		calculator.click();
		emiCalculator.click();
	}
	public void loanCalculatorAmountBoxCheck() {
		boolean loanCalculator= loanCalculatorAmount.isEnabled();
		Assert.assertEquals(true, loanCalculator);
		System.out.println("Loan Amount Text box working");
	}
	
	public void loanCalculatorAmountSliderCheck() {
		String amount1=loanCalculatorAmount.getAttribute("value");
		act.dragAndDropBy(loanCalculatorAmountSlider, 10, 0).build().perform();
		String amount2 = loanCalculatorAmount.getAttribute("value");
		boolean amount = amount1.equals(amount2);
		Assert.assertEquals(false, amount);
		System.out.println("Loan Amount slider working........... ");
	}
	public void loanCalculatorPageAmount(String amount1) {
		loanCalculatorAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanCalculatorAmount.sendKeys(amount1);
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
	public void emiSchemeClick() {
		loanCalculatorScheme.click();
	}
	public void scaleCheck() {
		String monthlyEmi1=emiCalculatorMonthlyEmi.getText();
		String monthlyTotalEmi1=emiCalculatorTotalemi.getText();
		loanCalculatorMonth.click();
		String monthlyEmi2 = emiCalculatorMonthlyEmi.getText();
		String monthlyTotalEmi2=emiCalculatorTotalemi.getText();
		Assert.assertEquals(monthlyEmi1, monthlyEmi2);
		Assert.assertEquals(monthlyTotalEmi1, monthlyTotalEmi2);
		System.out.println("Emi calculator scale check");
	}
	public void checkDropDown() {
		calculator.click();
		boolean drop=emiCalculator.isDisplayed();
		Assert.assertEquals(drop, true);
		System.out.println("Drop down working");
	}
	public void clickEmiCalculator() {
		emiLoanCalculator.click();
	}
	public void clickLoanAmountCalculator() {
		loanAmountCalculator.click();
	}
	public void clickLoanTenurCalculator() {
		tenureLoanCalculator.click();
	}
	public void clickInterestRateCalculator() {
		interestRateLoanCalculator.click();
	}
	public void checkEmiCalculator() {
		String calName=allCalText.get(1).getText();
		Assert.assertEquals(calName, "Loan EMI");
		System.out.println("Opened Emi calculator");
	}
	public void checkLoanAmountCalculator() {
		String calName=allCalText.get(0).getText();
		Assert.assertEquals(calName, "Principal Loan Amount");
		System.out.println("Opened Emi calculator");
	}
	public void checkLoanTenureCalculator() {
		String calName=allCalText.get(2).getText();
		Assert.assertEquals(calName, "Loan Tenure");
		System.out.println("Opened Emi calculator");
	}
	public void checkInterestRateCalculator() {
		String calName=allCalText.get(3).getText();
		Assert.assertEquals(calName, "Loan Interest Rate");
		System.out.println("Opened Emi calculator");
	}
}
