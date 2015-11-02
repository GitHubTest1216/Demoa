package testModel1;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.*;


public class TestMavenSureFilePlugin {
	protected static WebDriver driver;
	private Do du;

	@BeforeClass
	public void beforeClass() {
		Browers browers = new Browers(BrowersType.chrome);
		driver = browers.driver;
		du=new Do(driver);
	}

	@Test
	public void loginBaidu() {
		driver.get("https://www.baidu.com/");
		du.waitFor(3000);
		
	}

	@AfterClass
	public void afterClass() {		
		driver.quit();
	}
	


}
