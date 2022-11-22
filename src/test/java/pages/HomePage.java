package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	// Locators

	private By loginBtnXPATH = By.xpath("//a[@id='login2']");
	private By nameInputXPATH = By.xpath("//input[@id='loginusername']");
	private By passwordInputXPATH = By.xpath("//input[@id='loginpassword']");
	private By phoneCategory = By.xpath("//div[@id='contcont']//a[2]");
	private By signInBtn = By.xpath("//button[normalize-space()='Log in']");
	private By firstPhoneFromList = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]");

	// Constructors
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	// Page actions

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void enterUserName(String userName) {
		driver.findElement(nameInputXPATH).click();
		driver.findElement(nameInputXPATH).sendKeys(userName);
	}

	public void enterPassword(String userPassword) {
		driver.findElement(passwordInputXPATH).click();
		driver.findElement(passwordInputXPATH).sendKeys(userPassword);
	}

	public void clickOnLogin() {
		driver.findElement(loginBtnXPATH).click();
	}

	public void signIn() {
		driver.findElement(signInBtn).click();
	}

	public void phonesCategoryClick() {
		driver.navigate().refresh();
		driver.findElement(phoneCategory).click();
	}

	public void chooseFirstPhone() {
		driver.findElement(firstPhoneFromList).click();
	}

}
