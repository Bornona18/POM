import org.junit.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.MenPage;
import pages.ProductDetailsPage;
import pages.ShoesPage;
import pages.TShirtPage;
import pages.WomenPage;

public class IntegrationTest extends BaseTest{
	
	HomePage hp;
	MenPage mp;
	WomenPage wp;
	ShoesPage sp;
	ProductDetailsPage pdp;
	CheckOutPage cp;
	TShirtPage tp;
	
	@Test
	public void test1() {
		
		System.out.println("Test 1 executed");
		
		HomePage homePage =new HomePage(dr);
		homePage.verifyHomepageTittle();
		mp=homePage.clickMenPage();
		tp=mp.clickOnTshirt();
		pdp=tp.clickOnAnyProduct();
		pdp.verifyPrice();
		pdp.selectcolor();
		pdp.selectsize();
		pdp.clickAddCart();
		cp=pdp.clickViewcart();
		cp.increaseQuantity("5");
			
	}
	
	
	@Test
	public void test2() {
		System.out.println("Test 2 executed");
		
		HomePage homePage =new HomePage(dr);
		homePage.verifyHomepageTittle();
		mp=homePage.clickMenPage();
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 executed");
		
		HomePage homePage =new HomePage(dr);
		homePage.verifyHomepageTittle();
		sp=homePage.clickShoes();
	}

}

