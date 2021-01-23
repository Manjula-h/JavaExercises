package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		
		driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c D:\\Selenium files\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try {
        Process exec = null;
		try {
			exec = Runtime.getRuntime().exec(wget_command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException  ex) {
        System.out.println(ex.toString());
        }

	}

}
