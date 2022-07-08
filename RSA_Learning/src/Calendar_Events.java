import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Events {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fst_6_02/07/2022")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@cx='24.5']")).click();
		Thread.sleep(2000);
	}

}
