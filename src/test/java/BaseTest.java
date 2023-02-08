import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Shared;

public class BaseTest {
	
	WebDriver dr;
	@Before
	public void start() throws IOException {
		
		//from properties file
		Properties prop=Shared.readProp("/Users/pagli/eclipse-workspace-BitTech-1/Crosebrowsing/config.properties");
		String b=prop.getProperty("browser");
		
		
		if(b.equals("chrome")) {
			System.out.println("chrome");
			System.setProperty("", "");
			dr=new ChromeDriver();
			
		}else if (b.equals("firefox")){
			System.out.println("firefox");
			System.setProperty("webdriver.geco.driver", "Path of geco driver");
			dr=new FirefoxDriver();
			
		}else if(b.equals("IE")) {
			System.out.println("ie");
		}
		
			
		
		//From command lind
//		String b=System.getProperty("browser");
//		
//		if(b.equals("chrome")) {
//			System.out.println("chrome");
//			System.setProperty("", "");
//			dr=new ChromeDriver();
//			
//		}else if (b.equals("firefox")){
//			System.out.println("firefox");
//			System.setProperty("webdriver.geco.driver", "Path of geco driver");
//			dr=new FirefoxDriver();
//			
//		}else if(b.equals("IE")) {
//			System.out.println("ie");
//		}
		
	}

}
