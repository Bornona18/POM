package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Shared {
	
	public static Properties readProp(String path) throws IOException {
		File f =new File("config.properties");
		FileInputStream fi =new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fi);
		return prop;
	}
	
	public void dropDown() {
		Select s=new Select(null);
		s.selectByValue("2");
	}
	public static void comparePriceWithQuantity(WebElement priceElement,WebElement dropdown,List<WebElement>quantities,String num) {
		String otext=priceElement.getText();
		int priceForOneProd=Integer.parseInt(otext.replace("", "$"));
		dropdown.click();
		
		clickOnElementByText(quantities,num );
		String otext1=priceElement.getText();
		int priceForMoreThanOneProd=Integer.parseInt(otext1.replace("", "$"));
		if(priceForOneProd*Integer.parseInt(num)==priceForMoreThanOneProd) {
			System.out.println("price increased");
		}

		
	}
	
	public static void verifyPriceDiscount(WebElement originPriceElement,WebElement discountPriceElement,float f) {
		String otext=originPriceElement.getText();
		String dtext=discountPriceElement.getText();
		int originPrice=Integer.parseInt(otext.replace("", "$"));
		int discountpricePrice=Integer.parseInt(dtext.replace("", "$"));
		Assert.assertTrue(originPrice*f==discountpricePrice);
	}
	//*[@id="content"]/div/div/section/section[1]/section/div/div/div[2]/a/span[1]/span[2]
	public static void clickOnElementByText(List<WebElement>elements,String text) {
		for(WebElement element:elements) {
			if(element.getText().equals(text)) {
				element.click();
				break;
			}
		}
	}
	
	public static void clickOnElementByAttribute(List<WebElement> elements,String attName,String color) {
		for(WebElement element:elements) {
			if(element.getAttribute(attName).equals(color)) {
				element.click();
				break;
			}
		}
	}
	public static void clickOnElementByIndex(List<WebElement> elements,int index) {
		
			elements.get(index).click();
			
		
	}
	
	public static void clickOnElements(WebDriver dr,List<WebElement> elements) {
		for(int i=0;i<=elements.size();i++) {
			elements.get(i).click();
			dr.navigate().back();
		}
	}
	
}
	
//	public static void click(WebElement element) {
//		element.click();
//		
//	}
	
	
	
//}
//	
//
//	public static boolean verifyElement(WebElement element) {
//		return element.isDisplayed();
//	}
//
//	public static void click(WebElement element) {
//		element.click();
//		
//	}
//
//	public static void clickOnElementByIndex(List<WebElement> allTshirtProduct, int i) {
//		// TODO Auto-generated method stub
//		
//	}

	

	

	
