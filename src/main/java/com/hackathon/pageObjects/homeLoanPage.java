package com.hackathon.pageObjects;

import java.io.IOException;
import java.util.*;

import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	

import com.hackathon.utils.excelUtils;

public class homeLoanPage extends BasePage {

	public homeLoanPage(WebDriver driver) {
		super(driver);
	}
	
	String fileName=System.getProperty("user.dir")+"/src/test/resources/homeLoan.xlsx";
	
	@FindBy(xpath = "//*[@id='menu-item-dropdown-2696']")
	WebElement calculator;
	
	@FindBy(xpath = "//*[@id='menu-item-3294']/a")
	WebElement homeLoan;
	
	@FindBy(id="homeprice" )
	WebElement homePrice;
	
	@FindBy(xpath = "//*[@id='onetimeexpenses']" )
	WebElement homeOneTimeExpence;
	
	@FindBy(xpath = "//*[@id='downpayment']")
	WebElement homeDownPayment;
	
	@FindBy(xpath = "//*[@id='propertytaxes']")
	WebElement homePropertytaxes;
	
	@FindBy(xpath = "//*[@id='homeloaninsuranceamount']")
	WebElement homeloaninsuranceamount;
	
	@FindBy(xpath = "//*[@id=\"homeinsurance\"]")
	WebElement homeinsurance;
	
	@FindBy(xpath = "//*[@id=\"homeloanamount\"]")
	WebElement homeloanamount;
	
	@FindBy(xpath = "//*[@id=\"maintenanceexpenses\"]")
	WebElement maintenanceexpenses;
	
	@FindBy(xpath = "//*[@id=\"homeloaninterest\"]")
	WebElement homeloaninterest;
	
	@FindBy(xpath = "//*[@id=\"homeloanterm\"]")
	WebElement homeloanterm;
	
	@FindBy(xpath = "//*[@id=\"loanfees\"]")
	WebElement homLloanfees;
	
	@FindBy(xpath = "//*[@id=\"startmonthyear\"]")
	WebElement homeStartmonthyear;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr/td/span[2]")
	WebElement homeFebMonth;
	
	@FindBy(xpath = "//*[@class='row no-margin yearlypaymentdetails']")
	List<WebElement> HomeExcelRow;
	
	@FindBy(xpath = "//*[@class='row no-margin yearlypaymentdetails']/td")
	List<WebElement> homeExcelElements;
	
	@FindBy(xpath = "//*[@class=\"highcharts-container \"]" )
	List<WebElement> chart;
	
	@FindBy(xpath = "//*[@class='btn-group btn-group-toggle']/label")
	List<WebElement> allScale;
	
	public void homeLoanCalculator() {
		calculator.click();
		homeLoan.click();
	}
	
	public void homeAmount(String Amount) {
		homePrice.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homePrice.sendKeys(Amount);
	}
	public void oneTimeExpence(String oneTime) {
		homeOneTimeExpence.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeOneTimeExpence.sendKeys(oneTime);
	}
	public void downPayment(String Dp) {
		homeDownPayment.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeDownPayment.sendKeys(Dp);
	}
	//sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	public void propertyTaxes(String taxes) {
		homePropertytaxes.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homePropertytaxes.sendKeys(taxes);
	}
	public void homeLoanInsuranceAmount(String insurance) {
		homeloaninsuranceamount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeloaninsuranceamount.sendKeys(insurance);
	}
	public void homeInsurance(String home) {
		homeinsurance.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeinsurance.sendKeys(home);
	}
	public void homeLoanAmount() {
		homeloanamount.click();
	}
	public void maintenanceExpenses(String maintenance) {
		maintenanceexpenses.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		maintenanceexpenses.sendKeys(maintenance);
	}
	public void homeLoanInterest(String interest) {
		homeloaninterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeloaninterest.sendKeys(interest);
	}
	public void homeLoanTerm(String term) {
		homeloanterm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeloanterm.sendKeys(term);
	}
	public void loanFees(String fees) {
		homLloanfees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homLloanfees.sendKeys(fees);
	}
	public void selectMonth() {
		homeStartmonthyear.click();
		homeFebMonth.click();
	}
	public void writeExcelSheet() throws IOException {
		int a=0;
		for(int i =1; i<HomeExcelRow.size()+1;i++) {
			for(int j=0;j<7;j++) {
				String celData = homeExcelElements.get(a).getText();
				excelUtils.setCellData(fileName, "Sheet1", i, j, celData);
				a++;
			}
		}
	}
	public void allHomeLoanTextBox() {
		boolean text1= homePrice.isEnabled();
		Assert.assertEquals(text1, true);
		boolean text2= homeDownPayment.isEnabled();
		Assert.assertEquals(text2, true);
		boolean text3= homeloaninsuranceamount.isEnabled();
		Assert.assertEquals(text3, true);
		boolean text4= homeloanamount.isEnabled();
		Assert.assertEquals(text4, true);
		boolean text5= homeloaninterest.isEnabled();
		Assert.assertEquals(text5, true);
		boolean text6= homeloanterm.isEnabled();
		Assert.assertEquals(text6, true);
		boolean text7= homLloanfees.isEnabled();
		Assert.assertEquals(text7, true);
		boolean text8= homeStartmonthyear.isEnabled();
		Assert.assertEquals(text8, true);
		System.out.println("All Text box working...........");
	}
	public void allHomeownerExpensesTextBox(){
		boolean text1= homeOneTimeExpence.isEnabled();
		Assert.assertEquals(text1, true);
		boolean text2= homePropertytaxes.isEnabled();
		Assert.assertEquals(text2, true);
		boolean text3= homeinsurance.isEnabled();
		Assert.assertEquals(text3, true);
		boolean text4= maintenanceexpenses.isEnabled();
		Assert.assertEquals(text4, true);
		System.out.println("All HomeownerExpenses Text Box Working..........");
	}
	public void allchart() {
		boolean text1= chart.get(0).isDisplayed();
		Assert.assertEquals(text1, true);
		boolean text2= chart.get(1).isDisplayed();
		Assert.assertEquals(text2, true);
		System.out.println("Both chart present");
	}
	public void verifyAllScale() {
		String value1 = allScale.get(1).getAttribute("value");
		allScale.get(1).click();
		String value2 = allScale.get(1).getAttribute("value");
		boolean result1=value1.equals(value2);
		Assert.assertEquals(result1, false);
		String value3 = allScale.get(3).getAttribute("value");
		allScale.get(3).click();
		String value4 = allScale.get(3).getAttribute("value");
		boolean result2=value3.equals(value4);
		Assert.assertEquals(result2, false);
		String value5 = allScale.get(5).getAttribute("value");
		allScale.get(5).click();
		String value6 = allScale.get(5).getAttribute("value");
		boolean result3=value5.equals(value6);
		Assert.assertEquals(result3, false);
		String value7 = allScale.get(7).getAttribute("value");
		allScale.get(7).click();
		String value8 = allScale.get(7).getAttribute("value");
		boolean result4=value7.equals(value8);
		Assert.assertEquals(result4, false);
		String value9 = allScale.get(9).getAttribute("value");
		allScale.get(9).click();
		String value10 = allScale.get(9).getAttribute("value");
		boolean result5=value9.equals(value10);
		Assert.assertEquals(result5, false);
		String value11 = allScale.get(11).getAttribute("value");
		allScale.get(11).click();
		String value12 = allScale.get(11).getAttribute("value");
		boolean result6=value11.equals(value12);
		Assert.assertEquals(result6, false);
		
	}
}
