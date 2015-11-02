package testModel2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Browers;
import utils.BrowersType;
import utils.Do;

public class TestJavaInPom {
	protected static WebDriver driver;
	private Do du;

	@BeforeClass
	public void beforeClass() {
		Browers browers = new Browers(BrowersType.chrome);
		driver = browers.driver;
		du=new Do(driver);
	}

	@Test
	public void loginMail126() {
		driver.get("http://www.126.com/");
		du.waitFor(3000);
		

	}

	@AfterClass
	public void afterClass() {		
		driver.quit();
	}
	

}
