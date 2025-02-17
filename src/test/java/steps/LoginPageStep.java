package steps;

import baseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class LoginPageStep extends BaseClass {

	private LoginPage login;

	@Given("user open login page url on {string} browser")
	public void user_open_login_page_url_on_browser(String browsername) {

		initilization(browsername);
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {

		login = new LoginPage();
		login.enterUsernameAndPassword(username, password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
	}

	@AfterAll
	public static void tear() {
		new BaseClass().getDriver().quit();
	}

}
