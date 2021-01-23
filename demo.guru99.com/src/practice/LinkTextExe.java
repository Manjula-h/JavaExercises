package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);					
        String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();		
        System.out.println(theLinkText);					
        theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();		
        System.out.println(theLinkText);

	}

}
