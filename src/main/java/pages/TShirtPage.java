package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class TShirtPage {
	
	WebDriver dr;
	
	@FindBy(xpath="value of xpath") WebElement menMenu;
	@FindBy(xpath="value of xpath") List<WebElement>allTshirtProduct; 
	
	public TShirtPage(WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
	}
	
	public ProductDetailsPage clickOnAnyProduct() {
		Shared.clickOnElementByIndex(allTshirtProduct, 0);
		return new ProductDetailsPage();
	}

	
	
	

}
