package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame(1); //Switching to the frame
		//driver.switchTo().frame(driver.findElement(By.id("a077aa5e")));
		System.out.println("********We are switched to the iframe*******");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");

	}

}
