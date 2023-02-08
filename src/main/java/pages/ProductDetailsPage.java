package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Shared;

public class ProductDetailsPage {
	
	@FindBy(how=How.XPATH, using="value of xpath") WebElement orginalElement;
	@FindBy(how=How.XPATH, using="value of xpath") WebElement addCartButton;
	@FindBy(how=How.XPATH, using="value of xpath") WebElement viewCartButton;
	@FindBy(xpath="value of xpath") List<WebElement> allColors;
	@FindBy(xpath="value of xpath") List<WebElement> allSize;
	@FindBy(xpath="value of xpath") WebElement disElement;
	
	public void verifyPrice() {
		Shared.verifyPriceDiscount(orginalElement, disElement, .75f);
	
	}
	
	public void selectcolor() {
		Shared.clickOnElementByAttribute(allColors, "title", "blue");
	
	}
	
	public void selectsize() {
		Shared.clickOnElementByText(allSize, "xs");
	}
	
	public void clickAddCart() {
		addCartButton.click();
	}
	
	public CheckOutPage clickViewcart() {
		viewCartButton.click();
		return new CheckOutPage();
	}

	

	
	
	
	
	//Design pattren-POM
	
}
