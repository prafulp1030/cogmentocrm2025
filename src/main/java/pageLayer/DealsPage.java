package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class DealsPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/deals']")
	private WebElement dealsLink;

	@FindBy(xpath = "//a[@href='/deals/new']")
	private WebElement dealsCreateButton;

	@FindBy(name = "title")
	private WebElement title;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement dealsSaveButton;

	public DealsPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnDealsLink() {
		this.dealsLink.click();
	}

	public void clickOnDealsCreateButton() {
		this.dealsCreateButton.click();
	}

	public void createDeals(String title, String description) {
		this.title.sendKeys(title);
		this.description.sendKeys(description);
	}

	public void clickOnDealsSaveButton() {
		this.dealsSaveButton.click();
	}

}
