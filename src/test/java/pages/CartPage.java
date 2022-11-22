package pages;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	private WebDriver driver;

	private By placeOrderBtn = By.xpath("//button[normalize-space()='Place Order']");
	private By fullNameInput = By.xpath("//input[@id='name']");
	private By countryInput = By.xpath("//input[@id='name']");
	private By cityInput = By.xpath("//input[@id='city']");
	private By ccNumberInput = By.xpath("//input[@id='card']");
	private By ccMonthInput = By.xpath("//input[@id='month']");
	private By ccYearInput = By.xpath("//input[@id='year']");
	private By purchaseBtn = By.xpath("//button[normalize-space()='Purchase']");
	private By purchaseSuccess = By.xpath("//h2[normalize-space()='Thank you for your purchase!']");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPlaceOrderBtn() {
		driver.findElement(placeOrderBtn).click();
	}

	public void typeFullName(String fullName) {
		driver.findElement(fullNameInput).sendKeys(fullName);
	}

	public void typeCountry(String Country) {
		driver.findElement(countryInput).sendKeys(Country);

	}

	public void typeCity(String City) {
		driver.findElement(cityInput).sendKeys(City);

	}

	public void typeCCNumber(String ccNumber) {
		driver.findElement(ccNumberInput).sendKeys(ccNumber);

	}

	public void typeMonth(String ccMonth) {
		driver.findElement(ccMonthInput).sendKeys(ccMonth);
		
	}

	public void typeYear(String ccYear) {
		driver.findElement(ccYearInput).sendKeys(ccYear);
	}

	public void clickPurchaseBtn() {
		driver.findElement(purchaseBtn).click();
	}
	
	public void purchaseConfirmation() {
		String purchaseConfirmation = driver.findElement(purchaseSuccess).getText();
		Assert.assertTrue(purchaseConfirmation.contains("Thank you for your purchase"));
		System.out.println(purchaseConfirmation);
	}

}
