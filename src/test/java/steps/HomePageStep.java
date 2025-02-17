package steps;

import org.testng.Assert;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.HomePage;

public class HomePageStep extends BaseClass {

	private HomePage homePage;

	@When("user is on home page and validate title")
	public void user_is_on_home_page_and_validate_title() {
		homePage = new HomePage();

		Assert.assertEquals(homePage.getTitle(), "Cogmento CRM");

	}

	@Then("user validate url")
	public void user_validate_url() {
		Assert.assertEquals(homePage.getCurrentUrl().contains("cogmento"), true);
	}

	@Then("user validate logo")
	public void user_validate_logo() {

		Assert.assertEquals(homePage.getLogoStatus(), true);
	}

}
