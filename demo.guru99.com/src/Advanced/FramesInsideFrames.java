package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInsideFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames --" + size);

		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);

		WebElement frame1Element = driver.findElement(By.tagName("body"));
		String frame1Text = frame1Element.getText();
		System.out.println("Frame1 is :" + frame1Text);

		int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);

		driver.switchTo().frame(0);

		int countIframesInFrame2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
		
		WebElement frame2Element= driver.findElement(By.tagName("p"));
		String frame2Text=frame2Element.getText();
        System.out.println("Frame2 is :"+frame1Text);
        System.out.println("Frame2 is :"+frame2Text);
        
        driver.switchTo().defaultContent();
   	}

}
