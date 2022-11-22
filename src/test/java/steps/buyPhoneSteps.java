package steps;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.PhonePage;

public class buyPhoneSteps {

	private static String title;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private PhonePage phonePage = new PhonePage(DriverFactory.getDriver());
	private CartPage cartPage = new CartPage(DriverFactory.getDriver());


	@Given("user is on home page.")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://www.demoblaze.com/index.html");

	}

	@When("title should be {string}")
	public void user_is_on_home_page(String expectedTitleName) {
		title = homePage.getHomePageTitle();
		System.out.print("Home Page Title is " + title);
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@And("he clicks login button")
	public void he_clicks_login_button() {
		homePage.clickOnLogin();

	}

	@And("user enters {string} as username")
	public void user_enters_as_username(String givenUsername) {
		homePage.enterUserName(givenUsername);

	}

	@And("user enters {string} as password")
	public void user_enters_as_password(String givenPassword) {
		homePage.enterPassword(givenPassword);

	}

	@Then("clicks sign in button.")
	public void clicks_sign_in_button() {
		homePage.signIn();

	}


	@And("select Phones category")
	public void select_phones_category() {
		homePage.phonesCategoryClick();

	}

	@Then("clicking on a first phone from a list")
	public void choosing_first_phone_from_a_list() {
		homePage.chooseFirstPhone();
	}

	@And("add choosen phone to the cart")
	public void add_choosen_phone_to_the_cart() {
		phonePage.addToCartBtn();

	}

	@And("redirecting to Cart")
	public void redirecting_to_cart() {
		phonePage.goToCart();

	}

	@And("clicking place order button")
	public void clicking_place_order_button() {
		cartPage.clickPlaceOrderBtn();
		

	}

	@And("type name as {string}")
	public void type_name_as(String string) {
		cartPage.typeFullName(string);;

	}

	@And("type Country as {string}")
	public void type_country_as(String string) {
		cartPage.typeCountry(string);

	}

	@And("type City as {string}")
	public void type_city_as(String string) {
		cartPage.typeCity(string);


	}

	@And("type credit card as {string}")
	public void type_credit_card_as(String string) {
		cartPage.typeCCNumber(string);

	}


	@And("type month as {string}")
	public void type_month_as(String string) {
		cartPage.typeMonth(string);
	    
	}

	@And("type year as {string}")
	public void type_year_as(String string) {
		cartPage.typeYear(string);

	}
	
	@And("clicking purchase button")
	public void clicking_purchase_button() {
		cartPage.clickPurchaseBtn();
	}

	
	@Then("if purchase successull text {string} should be displayed")
	public void if_purchase_successull_text_should_be_displayed(String string) {
	    cartPage.purchaseConfirmation();
	}

	@And("confirm Ok button")
	public void confirm_ok_button() {
	    cartPage.clickPurchaseBtn();
	}


}
