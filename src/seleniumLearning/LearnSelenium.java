package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		
		registerLink.click();
		
		WebElement firstname  = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Jerome");
		
		driver.findElement(By.name("lastName")).sendKeys("J");
		
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		
		driver.findElement(By.id("userName")).sendKeys("testing123@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("NO10, World la than oru edam");
		
		Select dd = new Select(driver.findElement(By.name("country")));
		
		dd.selectByValue("92");
		
		dd.selectByVisibleText("IRELAND ");
		
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(4000);
		
		String confirmText = driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif']/b)[1]")).getText();
		
		
		if(confirmText.equals("Dear Jerome J,"))
		{
			System.out.println("PASS");
			System.out.println("First Commit");
		}
	}
}

//Locators = ID, CLASSNAME, NAME, XPATH, LINKTEXT, TAGNAME
//XPATH = "//tagname[@attributeName='attributeValue']"

//Partial XPATHS
//tagname[starts-with(@attributeName,'attributeValue')]
//tagname[ends-with(@attributeName,'attributeValue')]
//tagname[contains(@attributeName,'attributeValue')]

//a[]