package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSE_Test {

	public static void main(String[] args) {
		String driverPath = "D:\\\\Selenium files\\\\Chrome_driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");			
		JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button =driver.findElement(By.name("btnLogin"));			
        		
     	
        driver.findElement(By.name("uid")).sendKeys("mngr304065	");					
        driver.findElement(By.name("password")).sendKeys("zymygug");					
        		
       	
        js.executeScript("arguments[0].click();", button);
                                
      	
        js.executeScript("alert('Welcome to Guru99');"); 

	}

}
