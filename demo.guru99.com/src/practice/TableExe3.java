package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExe3 {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String innerText = driver.findElement(By
			.xpath("//table/tbody/tr/td[2]"
			+ "//table/tbody/tr[4]/td/"
			+ "table/tbody/tr/td[2]/"
			+ "table/tbody/tr[2]/td[1]/"
			+ "table[2]/tbody/tr[3]/td[2]/font"))
			.getText(); 		
		System.out.println(innerText); 

	}

}
