import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); // Waits until page loads fully
		driver.navigate().to("https://rahulshettyacademy.com"); // Not waits until full page load
		driver.navigate().back(); // Navigates back to previous page.
		driver.navigate().forward(); // Navigates back to parent page.

	}

}
