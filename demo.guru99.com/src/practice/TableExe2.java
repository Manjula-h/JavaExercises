package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExe2 {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String innerText = driver.findElement(By
			.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
			.getText(); 		
		System.out.println(innerText); 

	}

}
