import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//CSS Selector
//Class Name: tagname.class name Ex: Button.signInBtn, P.error, etc.... (If any spaces in class name, replace space with dot(.)
//ID: tagname#id Ex: input-#InputUsername
//Generic: Tagname[attribute='value'] Ex: input[placeholder='Username']
//Console Search for CSS $('p.error')
//TagName[attribute*='partial value'] <-CSS Regular expresion

//xPath
// //Tagname[@attribute='value']
// //Tagname[@attribute='value'][index]
// //parentTagName/childTagName
// //Tagname[contains(@attribute,'partial value')] <-Regular Expression
//Console Search for xPath $x(//TagName[@attribute='Value'])

//Ctrl+Shift+F for formatting code
//Maintain Camel Casing for variables & methods and toggle case for Class names
public class Learning_Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ePixels\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sumank");
		driver.findElement(By.name("inputPassword")).sendKeys("sumank");
		driver.findElement(By.className("signInBtn")).click();

		// Capturing output text into a string
		String Msg = driver.findElement(By.className("error")).getText();
		System.out.println(Msg);

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);

		// Xpath Syntax
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suman");

		// cssSelector Syntax-1
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("suman@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("suman@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8008458415");
		// cssSelector Syntax-2
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// cssSelector Syntax-3 (Traversing from Parent to Child)
		System.out.println(driver.findElement(By.cssSelector("form P")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		// cssSelector Syntax-4
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Suman");
		// css Regular Expression Syntax (*)
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		// xPath Regular expression syntax
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		// Identifying locator with text name
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Practice(driver);
		driver.close();
	}

	public static void Practice(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Parent to Child and sibling traversal
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		// Child to Parent traversal [1 Step Up]
		driver.findElement(By.xpath("//header/div/button[1]/parent::div"));
		// Child to Parent traversal [2 Steps Up]
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header"));
		// Child to parent and again to child traversal
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a"));
		// Child to parent and to sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}
};
