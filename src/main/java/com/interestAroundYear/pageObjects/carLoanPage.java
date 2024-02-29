package com.interestAroundYear.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class carLoanPage extends BasePage{

	public carLoanPage(WebDriver driver) {
		super(driver);
	}
	Actions act = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String valueBefore;
	String valueAfter;
	
	@FindBy(xpath="//*[normalize-space()='Car Loan']")
	WebElement carLoan;
	
	@FindBy(id ="personal-loan")
	WebElement personalLoan;
	
	@FindBy(id="home-loan")
	WebElement homeLoan1;
	
	@FindBy(id="loanamount")
	WebElement carLoanAmount;
	
	@FindBy(id = "loaninterest")
	WebElement carInterest;
	
	@FindBy(id ="loanterm")
	WebElement carLoanTerm;
	
	@FindBy(xpath = "//*[@id=\"emiamount\"]/p/span")
	WebElement carMonthlyEMI;
	
	@FindBy(xpath = "//*[@id=\"emitotalinterest\"]/p/span")
	WebElement carTotalInterest;
	
	@FindBy(xpath = "//*[@id=\"emitotalamount\"]/p/span")
	WebElement carTotalPayble;
	
	@FindBy(xpath = "//*[@id=\"year2024\"]")
	WebElement carFirstYear;
	
	@FindBy(xpath = "//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[2]")
	WebElement carMonthlyPrincipal;
	
	@FindBy(xpath = "//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[3]")
	WebElement carMonthlyInterest;
	
	@FindBy(xpath = "(//*[@class='col-lg-4 control-label'])[1]")
	WebElement calName;
	
	@FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
	WebElement monthScale;
	
	@FindBy(xpath = "//*[@id=\"emipaymenttable\"]/table/tbody")
	WebElement table;
	
	@FindBy(xpath = "//*[@id='menu-main-menu']/li")
	List<WebElement> dashBoredElement;
	
	@FindBy(xpath = "//*[@id='menu-featured-calculators-articles']/li[1]/a[1]")
	WebElement Link1;
	
	@FindBy(xpath = "//*[@id=\"menu-item-3293\"]/a")
	WebElement Link2;
	
	@FindBy(xpath = "/html/body/div/div/main/article/div[1]/h1")
	WebElement header;
	
	@FindBy(xpath = "//*[@id=\"ecalprintandshare\"]/a")
	List<WebElement> button;
	
	@FindBy(xpath = "//*[@class=\"highcharts-container \"]" )
	List<WebElement> chart;
	
	@FindBy(xpath = "//*[@id=\"leschemewrapper\"]/div/label")
	WebElement emiSection;
	
	@FindBy(xpath = "//*[@class='btn-group btn-group-toggle add-check']/label")
	List<WebElement> schemeButton;
	
	//opening the emi calaulator page
	public void originpage() {
		driver.get("https://emicalculator.net/");
	}
	//clicking on car loan tab in emi calculator
	public void carClick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		carLoan.click();
	}
	//taking input to loan amount in car loan calculator
	public void enterLoanAmount(String amount) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		carLoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carLoanAmount.sendKeys(amount);
	}
	//taking input to loan interest rate in car loan calculator
	public void interestRate(String interest) {
		carInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carInterest.sendKeys(interest);
	}
	//taking input to loan tenure in car loan calculator
	public void loanTenure(String tenure) {
		carLoanTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carLoanTerm.sendKeys(tenure);
	}
	//clicking on year 2024 in year to year table
	public void yearClick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("arguments[0].scrollIntoView();", carFirstYear);
		carFirstYear.click();
	}
	//capturing the monthly interest from table
	public String getMonthInters() {
		return carMonthlyInterest.getText();
	}
	//capturing the monthly principal from table
	public String getMonthPrincipal() {
		return carMonthlyPrincipal.getText();	
	}
	//Verifying monthly emi displayed 
	public void verifyEmi() {
		js.executeScript("arguments[0].scrollIntoView();", carMonthlyEMI);
		System.out.println(carMonthlyEMI.getText());
		boolean emi = carMonthlyEMI.isDisplayed();
		Assert.assertEquals(emi, true);
		System.out.println("Emi Section Verified");
	}
	//Verifying total interest displayed
	public void verifyTotalInterest() {
		js.executeScript("arguments[0].scrollIntoView();", carTotalInterest);
		System.out.println(carTotalInterest.getText());
		boolean interest = carTotalInterest.isDisplayed();
		Assert.assertEquals(interest, true);
		System.out.println("Total Interest Section Verified");
		
	}
	//verifying total payable amount
	public void verifyTotalPayable() {
		js.executeScript("arguments[0].scrollIntoView();", carTotalPayble);
		System.out.println(carTotalPayble.getText());
		boolean payable = carTotalPayble.isDisplayed();
		Assert.assertEquals(payable, true);
		System.out.println("Total Payable Section Verified");
	}
	//Verifying user navigated to Car loan calculator
	public void verifyCarLoanCalculator() {
		String exp_Name = "Car Loan Amount";
		String act_Name = calName.getText();
		boolean result = exp_Name.equals(act_Name);
		Assert.assertEquals(result, true);
	}
	//Clicking personal loan tab
	public void clickPersonalLaon() {
		personalLoan.click();
	}
	//Verifying user navigated to Car loan calculator
	public void verifyPersonalLoanCalculator() {
		String exp_Name = "Personal Loan Amount";
		String act_Name = calName.getText();
		boolean result = exp_Name.equals(act_Name);
		Assert.assertEquals(result, true);
	}
	//Navigated to home loan calculator
	public void clickHomeLaon() {
		homeLoan1.click();
	}
	//Verifying user navigated to Home loan calculator
	public void verifyHomeLoanCalculator() {
		String exp_Name = "Home Loan Amount";
		String act_Name = calName.getText();
		boolean result = exp_Name.equals(act_Name);
		Assert.assertEquals(result, true);
	}
	//verifying amount text box in home loan calculator
	public void verifyCarLaonAmountTextBox() {
		boolean textBox =carLoanAmount.isEnabled();
		Assert.assertEquals(textBox, true);
		System.out.println("Loan Amount Box Working-------");
	}
	//verifying interest text box in home loan calculator
	public void verifyCarLaonInterestTextBox() {
		boolean textBox =carInterest.isEnabled();
		Assert.assertEquals(textBox, true);
		System.out.println("Loan Interest Box Working-------");
	}
	//verifying tenure text box in home loan calculator
	public void verifyCarLaonTenureTextBox() {
		boolean textBox =carLoanTerm.isEnabled();
		Assert.assertEquals(textBox, true);
		System.out.println("Loan Tenure Box Working-------");
	}
	//Getting initial value from amount text box
	public void setValeAmount() {
		valueBefore = carLoanAmount.getAttribute("value");
		carLoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carLoanAmount.sendKeys("4000000");
	}
	//verifying the amount slider 
	public void checkAmountSlider() {
		valueAfter = carLoanAmount.getAttribute("value");
		boolean result = valueBefore.equals(valueAfter);
		Assert.assertEquals(result, false);
		System.out.println("Loan Amount Slider Working .......");
	}
	//Getting initial value from interest text box
	public void setValeInterest() {
		valueBefore = carInterest.getAttribute("value");
		carInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carInterest.sendKeys("12.5");
	}
	//verifying the interest slider
	public void checkInterestSlider() {
		valueAfter = carInterest.getAttribute("value");
		boolean result = valueBefore.equals(valueAfter);
		Assert.assertEquals(result, false);
		System.out.println("Loan Interest Slider Working .......");
	}
	//Getting initial value from tenure text box
	public void setValeTenure() {
		valueBefore = carLoanTerm.getAttribute("value");
		carLoanTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		carLoanTerm.sendKeys("15");
	}
	//verifying the tenure slider
	public void checkTenureSlider() {
		valueAfter = carLoanTerm.getAttribute("value");
		boolean result = valueBefore.equals(valueAfter);
		Assert.assertEquals(result, false);
		System.out.println("Loan Tenure Slider Working .......");
	}
	//verifying scale in carloan calculator
	public void carLoanScaleCheck() {
		String beforeMonth=carMonthlyEMI.getText();
		monthScale.click();
		String afterMonth = carMonthlyEMI.getText();
		Assert.assertEquals(beforeMonth, afterMonth);
		System.out.println("Sacle change working .........");
	}
	//Checking table in carloan calculator
	public void checkTable() {
		boolean Table=table.isDisplayed();
		Assert.assertEquals(Table, true);
		System.out.println("Table is Diaplayed");
	}
	//verifying invalid data output
	public void invalidDataOutput() {
		String emi=carMonthlyEMI.getText();
		boolean result = emi.equals("0");
		Assert.assertEquals(result, true);
		System.out.println("Invalid Data Input-------");
	}
	//verifying all element in dash board 
	public void verifyAllElement() {
		String dash1=dashBoredElement.get(0).getText();
		Assert.assertEquals(dash1, "CALCULATORS");
		String dash2=dashBoredElement.get(1).getText();
		Assert.assertEquals(dash2, "EMI CALCULATOR WIDGET");
		String dash3=dashBoredElement.get(2).getText();
		Assert.assertEquals(dash3, "ARTICLES");
		String dash4=dashBoredElement.get(3).getText();
		Assert.assertEquals(dash4, "PRODUCT REVIEWS");
		String dash5=dashBoredElement.get(4).getText();
		Assert.assertEquals(dash5, "NEWS & OPINION");
		System.out.println("All Elements Present");
	}
	//verifying if links are working
	public void verifyLinks() {
		String link1 =Link1.getText();
		Link1.click();
		String pageHeader= header.getText();
		boolean result = link1.equals(pageHeader);
		Assert.assertEquals(result, true);
		driver.navigate().back();//driver.get("https://emicalculator.net/");
		String link2 =Link2.getText();
		Link2.click();
		String pageHeader2= header.getText();
		boolean result2 = link2.equals(pageHeader2);
		Assert.assertEquals(result2, true);
		driver.navigate().back();//driver.get("https://emicalculator.net/");
		System.out.println("Links Verified");
	}
	//scrolling to the button
	public void scrollToShare() {
		js.executeScript("arguments[0].scrollIntoView();", button.get(0));
	}
	//verifying the share button 
	public void verifyShare() {
		boolean result1=button.get(0).isDisplayed();
		Assert.assertEquals(result1, true);
		System.out.println("Share button present");
	}
	//verifying the print button
	public void verifyPrint() {
		boolean result2=button.get(1).isDisplayed();
		Assert.assertEquals(result2, true);
		System.out.println("Print button present");
	}
	//verifying the pi chart
	public void verifyPiChart() {
		js.executeScript("arguments[0].scrollIntoView();", chart.get(0));
		boolean result = chart.get(0).isDisplayed();
		Assert.assertEquals(result, true);
		System.out.println("Pi chart present..........");
	}
	//verifying the graph
	public void verifyGraph() {
		js.executeScript("arguments[0].scrollIntoView();", chart.get(1));
		boolean result = chart.get(1).isDisplayed();
		Assert.assertEquals(result, true);
		System.out.println("Pi chart present..........");
	}
	//verifying if emi scheme available
	public void schemeCheck() {
		carClick();
		boolean result = emiSection.isDisplayed();
		Assert.assertEquals(result, true);
		System.out.println("Emi scheme availabele");
	}
	//verifying scheme button present
	public void schemeButton() {
		boolean result1 = schemeButton.get(0).isDisplayed();
		Assert.assertEquals(result1, true);
		boolean result2 = schemeButton.get(1).isDisplayed();
		Assert.assertEquals(result2, true);
		System.out.println("Both emi scheme button working....");
	}
}
