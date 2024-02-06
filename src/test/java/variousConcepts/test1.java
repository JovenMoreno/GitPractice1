package variousConcepts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	 WebDriver driver;
	
	@Before
	public void init() {
		
		System.out.println("Before Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Selenium_Practice1\\crm\\driver\\chromedriver.exe ");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click(); 
		
		
	}
	
	
	@Test
	public void loginTest() {
		System.out.println("Positive Test");
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Bank & Cash')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		
		driver.findElement(By.id("account")).sendKeys("Joven Moreno");
		
		driver.findElement(By.id("description")).sendKeys("QA Student");
		
		driver.findElement(By.id("balance")).sendKeys("1500");
		
		driver.findElement(By.id("account_number")).sendKeys("123123");
		
		driver.findElement(By.id("contact_person")).sendKeys("Cyrus");
		
		driver.findElement(By.id("contact_phone")).sendKeys("469469469");
		
		driver.findElement(By.id("ib_url")).sendKeys("www.abcd.com");
				
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	}
	
}
