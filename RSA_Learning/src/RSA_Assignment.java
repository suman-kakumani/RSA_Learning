import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RSA_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\ePixels\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("RSA Learning");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("RSALearning@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("(//select[@id='exampleFormControlSelect1'])[1]")).click();
        WebElement staticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown=new Select(staticDropDown);
        dropdown.selectByVisibleText("Male"); 
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("07/05/2022");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(1000);
        driver.close();

	}

}
