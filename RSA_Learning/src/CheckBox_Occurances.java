import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Gets count of Check boxes present on web page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// Gets count of Radio buttons present on web page
		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		// Get count of links present on web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Get count of buttons present on web page
		System.out.println(driver.findElements(By.tagName("button")).size());

	}

}
