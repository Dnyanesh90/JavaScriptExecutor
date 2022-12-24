package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://prafpawar11.github.io/basicdemo.html");
			
			WebElement wb =driver.findElement(By.xpath("//a[text()='Google']"));
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			Thread.sleep(5000);
			
			js.executeScript("arguments[0].click();", wb);
			
			
			js.executeScript("document.getElementById('female').click();");

	}

}
