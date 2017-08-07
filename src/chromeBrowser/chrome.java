package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selinium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			//driver.findElement(By.id("lst-ib")).sendKeys("theegiants");
			//driver.findElement(By.name("btnK")).submit();
			driver.findElement(By.name("q")).sendKeys("theegiants");
			Thread.sleep(4000);
			driver.findElement(By.name("btnK")).submit();
			Thread.sleep(5000);
			driver.quit();
			
			
	}

}
