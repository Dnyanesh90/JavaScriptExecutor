package Tutorial1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

WebDriver driver =new ChromeDriver();

driver.get("https://prafpawar11.github.io/basicdemo.html");

JavascriptExecutor js =(JavascriptExecutor)driver;
Thread.sleep(5000);

js.executeScript("document.getElementById('female').click();");

	}

}
