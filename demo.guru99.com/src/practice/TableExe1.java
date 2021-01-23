package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExe1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
		
		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText); 

	}

}
