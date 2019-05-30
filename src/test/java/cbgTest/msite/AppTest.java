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

public class AppTest {
	
	public static WebDriver driver;
	
	@Test
//    @Before
    public void launchChrome() throws Exception {
        
        Map<String, String> mobileEmulation = new HashMap<>();

        mobileEmulation.put("deviceName", "Apple iPhone 5");

        Map<String, Object> chromeOptions = new HashMap<>();

        chromeOptions.put("mobileEmulation", mobileEmulation);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        
        ChromeOptions chromeOptions1 = new ChromeOptions();
		chromeOptions1.setExperimentalOption("mobileEmulation",mobileEmulation);
		
		driver = new ChromeDriver(chromeOptions1);

        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbalitatli\\Desktop\\chromedriver.exe");
        
      
        
        driver.get("https://m.haberturk.com/");

        Thread.sleep(1000);

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