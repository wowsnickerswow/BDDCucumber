package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;


import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class Hooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_props();
		
		
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");	
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	@After(order=0)
	public void quiteBrowser() { 
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			
			String screnShotName = scenario.getName().replaceAll("","");
			byte [] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screnShotName);

		}
	}
	

}
