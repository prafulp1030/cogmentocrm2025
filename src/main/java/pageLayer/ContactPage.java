package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement contactSaveButton;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnContactLink() {
		this.contactLink.click();
	}

	public void clickOnContactCreateButton() {
		this.createButton.click();
	}

	public void createContact(String firstName, String lastName) {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
	}

	public void clickOnContactSaveButton() {
		this.contactSaveButton.click();
	}
}
