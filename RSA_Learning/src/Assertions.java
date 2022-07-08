import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Passing false condition to AsserttFalse which expects a false condition
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("Flase Assert condition pass");
		driver.findElement(By.id("checkBoxOption1")).click();

		// Passing true condition to AsserttTrue which expects a true condition
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("True Assert condition pass");

		// Comparing element value is equal to user passed value or not
		Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']")).getText(),
				"Practice Page");
	}

}
