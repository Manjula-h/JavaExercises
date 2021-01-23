package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
//		driver.get(baseURL);
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		drpCountry.selectByVisibleText("ANTARCTICA");

		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);

	}

}
