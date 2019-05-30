package cbgTest.msite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

public class ChromeTest2 {
	
	public static WebDriver driver;
	
	@Test
	
    public void launchChrome() throws Exception {
		
		//Create a map to add device properties i.e. Device Name
		Map<String, String> deviceProps = new HashMap<>();
		deviceProps.put("deviceName", "iPhone X"); //Device Name should be same as in Chrome
		 
		//Create a map for the chromeoption and add the above device
		Map<String, Object> chromeOptions = new HashMap<>();
		chromeOptions.put("mobileEmulation", deviceProps);
		 
		//Initialize the Capabilities and pass the chromeoptions and initialize the Chrome brower
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		
		driver.manage().window().maximize();
		
		 driver.get("https://m.haberturk.com/");
		 Thread.sleep(5000);
		 
		 WebElement oWe = driver.findElement(By.linkText("İncele"));
		 
		 try {
			 Actions oAction = new Actions(driver);
			 
			 oAction.moveToElement(oWe);
			 Thread.sleep(5000);
			 oAction.contextClick(oWe).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			 
		 }  catch(Exception e)
		 
		 		 {
			 System.out.println(e);
			 
		 }
		 
  
		 //TEPE slider
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[3]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[4]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[5]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[6]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span[7]")).click();
		 Thread.sleep(3000);
		 
//		 scrollDownOrUp(500);
//		 Thread.sleep(3000);
//		 scrollDownOrUp(-500);
//		 WebDriverRefresh();
//		 waitTime(3);
		 
		 
	}
	
	public void scrollDownOrUp(int downSize) {
		try {
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0," + downSize + ")", "");
			
		} catch (Exception ex) {

			Assert.fail("Scroll işleminde hata oluştu." + " => "
					+ ex.getMessage());
		}
	}
	
	
	protected void WebDriverRefresh() {
		driver.navigate().refresh();
	}
	
	public void waitTime(long i) throws InterruptedException {
		Thread.sleep(i * 1000);
	}
	
	public void slider(){
		
		WebElement slider = driver.findElement(By.xpath("//section[@id='NewMainTopSlider']//span"));

	    for (int i = 1; i <= 7 ; i++) {
	            slider.sendKeys(Keys.ARROW_LEFT);
	        }
	 
	}
}