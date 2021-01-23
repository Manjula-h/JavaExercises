package Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SessionHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		
		//First session of WebDriver
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/");
	    
	    //Second session of WebDriver
	    WebDriver driver2 = new ChromeDriver();	   
	    driver2.get("http://demo.guru99.com/V4/");

	}

}
