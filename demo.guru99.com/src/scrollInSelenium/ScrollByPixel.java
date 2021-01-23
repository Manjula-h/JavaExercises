package scrollInSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

	public static void main(String[] args) {
		String driverPath = "D:\\\\Selenium files\\\\Chrome_driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");

	}

}
