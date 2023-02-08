package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage  {
	
WebDriver dr;
	
	
	@FindBy(xpath="value of xpath") WebElement menMenu;
	@FindBy(xpath="value of xpath") WebElement logo;
	
	public void HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void verifyWomenPageTitle() {
		
	}

}
