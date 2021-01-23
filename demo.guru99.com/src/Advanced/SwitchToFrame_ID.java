package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_ID {

	public static void main(String[] args) {
		String exe = "D:\\Selenium files\\Chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("*********We are done***************");

	}

}
