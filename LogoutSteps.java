package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class LogoutSteps<Actions> {
	WebDriver driver = null;

	@Given("User has opened the browser3")
	public void user_has_opened_the_browser3() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muliandomarpaung\\eclipse-workspace\\.metadata\\Batch4DemoSelenium\\src\\main\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().window().maximize();
	}

	@And("User login with valid credential1")
	public void user_login_with_valid_credential1() {

		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	
	@When("User has navigated to humburger button1")
	public void user_has_navigated_to_humburger_button1() throws InterruptedException {

		driver.findElement(By.id("react-burger-menu-btn")).click();

		Thread.sleep(2000);

	}

	@And("User click item logout1")
	public void user_click_item_logout1() throws InterruptedException {

		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(2000);

	}

	@Then("User logout successfully and back to login homepage1")
	public void user_logout_successfully_and_back_to_login_homepage1() {

		driver.findElement(By.id("root")).isDisplayed();
		
		driver.close();
		driver.quit();

	}
	

	//@When("User has navigated to humburger button2")
	//public void user_has_navigated_to_humburger_button2() throws InterruptedException {

		//driver.findElement(By.id("react-burger-menu-btn")).click();


	//}

	//@And("User click item logout2")
	//public void user_click_item_logout2() throws InterruptedException {

		//driver.findElement(By.id("logout_sidebar_link")).click();

		
	//}

	//@And("User press reload in browser")
	//public void user_click_reload_in_browser(WebElement actions) {
		

	//	WebDriver driver = new ChromeDriver();

		//driver.get("https://www.saucedemo.com/inventory.html");
		//driver.navigate().refresh();

	//}

	//@Then("User logout successfully and back to login homepage2")
	//public void user_logout_successfully_and_back_to_login_homepage2() {
		
		//driver.findElement(By.linkText("https://www.saucedemo.com/")).isDisplayed();

		//driver.close();
		//driver.quit();
	//}

}
