package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoesPage {
	
	public WebDriver dr;
	
	public ShoesPage(WebDriver h) {
		dr=h;
		PageFactory.initElements(dr, this);
	}

}
