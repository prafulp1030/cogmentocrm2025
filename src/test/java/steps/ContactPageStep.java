package steps;

import baseLayer.BaseClass;
import io.cucumber.java.en.When;
import pageLayer.ContactPage;

public class ContactPageStep extends BaseClass {
	private ContactPage contactPage;

	@When("user click on contact link")
	public void user_click_on_contact_link() {
		contactPage = new ContactPage();
		contactPage.clickOnContactLink();
	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		contactPage.clickOnContactCreateButton();
	}

	@When("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {

		contactPage.createContact("Rahul", "Patil");
	}

	@When("user click on contact save button")
	public void user_click_on_contact_save_button() throws InterruptedException {
		Thread.sleep(5000);
		contactPage.clickOnContactSaveButton();
	}
}
