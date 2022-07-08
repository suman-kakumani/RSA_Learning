import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enabled_Disabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://spicejet.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		if (driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']"))
				.getAttribute("style").contains("rgb")) {
			System.out.println("Is Disabled");
		}
		driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
