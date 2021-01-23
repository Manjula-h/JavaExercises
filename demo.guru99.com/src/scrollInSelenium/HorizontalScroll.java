package scrollInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) {
		String driverPath = "D:\\\\Selenium files\\\\Chrome_driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		WebElement Element = driver.findElement(By.linkText("VBScript"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
