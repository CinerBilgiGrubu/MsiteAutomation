package cbgTest.msite;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ChromeTest {
	
	public static WebDriver driver;
	
	@Test
//    @Before
    public void launchChrome() throws Exception {
		Map<String, Object> deviceMetrics = new HashMap<>();
		deviceMetrics.put("width", 1078);
		deviceMetrics.put("height", 924);
		deviceMetrics.put("pixelRatio", 3.0);
		Map<String, Object> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceMetrics", deviceMetrics);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" +
		"Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML,like Gecko) " + "Chrome/67.0.3396.99 Mobile Safari/537.36");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
		
		 driver.get("https://m.haberturk.com/");
//    }

//    @After
//    public void tearDown() throws Exception {
//        driver.quit();
//    }
//
//    @Test
//    public void smokeTest() throws Exception {

      

    }
}