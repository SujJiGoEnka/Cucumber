package stepdefinitions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import resources.DriverFactory;

public class Login {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/lib/chromedriver/chromedriver.exe");

		driver = DriverFactory.getBrowser("Chrome");
		
		String baseUrl = "http://tpsharepoint.eur.ad.tullib.com/itsm/_layouts/15/start.aspx#/Lists/Application%20Links/AllItems.aspx?RootFolder=%2Fitsm%2FLists%2FApplication%20Links%2FUSFI%2FNon-Production%2FAPI%20Jars&FolderCTID=";
		Runtime.getRuntime().exec("E:/Important Code/AutoIT scripts/credentials.exe");
		driver.get(baseUrl);
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		System.out.println("Step 2");
	}

	@Given("^I$")
	public void i() throws Throwable {

	}

	@Given("^some$")
	public void some() throws Throwable {

	}
}
