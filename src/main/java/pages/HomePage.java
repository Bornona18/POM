package pages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {


	public WebDriver dr;
	
	public HomePage(WebDriver h) {
		dr=h;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy(xpath="value of xpath") WebElement menLink;
	@FindBy(xpath="value of xpath") WebElement womenLink;
	@FindBy(xpath="value of xpath") WebElement ShoesLink;
	@FindBy(xpath="value of xpath") WebElement TshirtLink;
	
	
	

	public void verifyHomepageTittle() {
		System.out.println(dr.getTitle().contains(""));
	}
	public MenPage clickMenPage() {
		menLink.click();
		return new  MenPage(dr);
	}
	
	public WomenPage clickWomenpage() {
	    womenLink.click();
		return new  WomenPage();
	}
	
	public ShoesPage clickShoes() {
		ShoesLink.click();
		return new ShoesPage(dr);
	}
	
	

}






	



