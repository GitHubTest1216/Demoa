package testModel3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Browers;
import utils.BrowersType;

public class TestMultipleThreads {
	protected static WebDriver driver;

	// 并行处理时，每个test要完全独立，不能耦合
	
	@Test
	public void toBaidu() {
		Browers browers = new Browers(BrowersType.chrome);
		driver = browers.driver;
		driver.get("https://www.jd.com/");
		driver.quit();
	}

	@Test
	public void toMail() {
		Browers browers = new Browers(BrowersType.chrome);
		driver = browers.driver;
		driver.get("http://www.163.com/");
		driver.quit();
		
	}

}
