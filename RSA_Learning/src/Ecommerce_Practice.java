import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++)
		{
			String name=products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				//Click on Add Cart
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
		}
		for(int i=0; i<products.size(); i++)
		{
			String name=products.get(i).getText();
			if(name.contains("Brocoli"))
			{
				//Click on Add Cart
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
		}

	}

}
