package steps;

import baseLayer.BaseClass;
import io.cucumber.java.en.When;
import pageLayer.DealsPage;

public class DealsPageStep extends BaseClass {
	private DealsPage deals;

	@When("user click on deals link")
	public void user_click_on_deals_link() {
		deals = new DealsPage();
		deals.clickOnDealsLink();
	}

	@When("user click on deals create button")
	public void user_click_on_deals_create_button() {
		deals.clickOnDealsCreateButton();
	}

	@When("user enter title and Description")
	public void user_enter_title_and_description() {
		deals.createDeals("Mobile Phone", "Iphone Mobile Phones");
	}

	@When("user click on deals save button")
	public void user_click_on_deals_save_button() throws InterruptedException {
		Thread.sleep(5000);
		deals.clickOnDealsSaveButton();
	}

}
