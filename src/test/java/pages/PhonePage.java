
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonePage {
	private WebDriver driver;
	
	private By addCartBtn = By.xpath("//a[normalize-space()='Add to cart']");
	private By goToCart = By.xpath("//a[normalize-space()='Cart']");
	
	public PhonePage(WebDriver driver) {
		this.driver = driver;
			
	}
	
	public void addToCartBtn() {
		driver.findElement(addCartBtn).click();	
	}
	
	public void simpleAlertOk() {
		driver.switchTo().alert().accept();
	}

	public void goToCart() {
		driver.findElement(goToCart).click();
	}
	
}