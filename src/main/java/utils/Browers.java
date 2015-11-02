package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Browers {
	public WebDriver driver = null;
	private FirefoxProfile firefoxprofile = null;
	private static DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");

	public Browers(BrowersType bt) {
		switch (bt) {
		case firefox:
			System.setProperty("webdriver.firefox.bin",
					"D:\\Program Files\\Mozilla Firefox\\firefox.exe");
			//File firebug = new File(projectpath + "/tool/firebug-2.0.13-fx.xpi");
			//File firepath = new File(projectpath
			//		+ "/tool/firepath-0.9.7.1-fx.xpi");
			firefoxprofile = new FirefoxProfile();
			//firefoxprofile.addExtension(firebug);
			//firefoxprofile.addExtension(firepath);
			firefoxprofile
					.setPreference("webdriver.accept.untrusted", true);
			//firefoxprofile.setPreference(
			//		"extensions.firebug.currentVersion", "2.0.13");
			driver = new FirefoxDriver(firefoxprofile);
			driver.manage().window().maximize();

			break;
		case ie:
			System.setProperty("webdriver.ie.driver", projectpath
					+ "/src/main/java/utils/IEDriverServer.exe");
			caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");// ÿ�δ�������������cookie����űȽ�С���û�������룩��cache�����ͼƬ����ҳ����֮�ࣩ
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
			driver.manage().window().maximize();
			break;

		case chrome:
			System.setProperty("webdriver.chrome.driver", projectpath
					+ "/src/main/java/utils/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}

	}
}
