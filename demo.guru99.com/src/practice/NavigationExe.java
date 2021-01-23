package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/block.html";
		driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("Inside")).click();					
        System.out.println(driver.getTitle());					
        driver.navigate().back();			
        driver.findElement(By.partialLinkText("Outside")).click();					
        System.out.println(driver.getTitle());					
        driver.quit();
	}

}
