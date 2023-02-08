package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class MenPage {
	
WebDriver dr;
	
	public  MenPage(WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="value of xpath") WebElement womenlink;
	@FindBy(xpath="value of xpath") WebElement menOptions;
	
	public WomenPage clickWomenLink() {
		return new WomenPage();
	}
	
	public TShirtPage clickOnTshirt() {
		Shared.clickOnElementByText((List<WebElement>) menOptions, "Tshirt");
		return new TShirtPage(dr);
	}

}
