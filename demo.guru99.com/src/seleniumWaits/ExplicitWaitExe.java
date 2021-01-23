package seleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExe {

	public static void main(String[] args) {
		String driverPath = "D:\\\\Selenium files\\\\Chrome_driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		driver.get("http://demo.guru99.com/test/guru99home/" );
		driver.manage().window().maximize() ;
		
		aTitle = driver.getTitle();
		
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"rt-header\"]/div/div[1]/div/a/img")));
		guru99seleniumlink.click();

	}

}

/* Expected conditons
 
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated() */


