package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class CheckOutPage {
  
	
	public WebDriver dr;
	
	public void ChekOutPage(WebDriver m) {
		dr=m;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="value of xpath") WebElement priceOne;
	@FindBy(xpath="value of xpath") WebElement drop;
	@FindBy(xpath="value of xpath") WebElement quantities;
	
	
	public void increaseQuantity(String num) {
		Shared.comparePriceWithQuantity(priceOne, drop, (List<WebElement>) quantities, num);
	}
}
