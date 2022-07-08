import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\ePixels\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");

    	WebElement from = driver.findElement(By.xpath("//div[contains(text(), 'From')]"));
    	from.sendKeys("HYD");
    	Thread.sleep(2000);
    	
    	WebElement to = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[3]/div/div[2]/input"));
    	to.sendKeys("GOI");
    	Thread.sleep(2000);

	}

}
