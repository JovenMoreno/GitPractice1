package variousConcepts;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static WebDriver driver;
	
	
	
	/*public static void main(String[] args) throws InterruptedException {
		
		init();
		loginTest();
		Thread.sleep(5000);
		driverClose();
				
	} */
	
	@Before
	public void init() {
		
		System.out.println("Before Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Selenium_Practice1\\crm\\driver\\chromedriver.exe ");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://codefios.com/ebilling/login");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void loginTest() {
		System.out.println("Positive Test");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[2]/form[1]/div[3]/div[1]/label[1]/span[1]")).click();
		driver.findElement(By.id("login_submit")).click();
		
				
	}
	
	@Test
	public void negativeloginTest() {
		System.out.println("Negative Test");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[2]/form[1]/div[3]/div[1]/label[1]/span[1]")).click();
		driver.findElement(By.id("login_submit")).click();
		
				
	}
	
	
	@After
	
	public void sleep() throws InterruptedException {
		System.out.println("Now Sleeping");
		Thread.sleep(5000);
	} 
	
	
	@After
	public  void driverClose() {
		
		System.out.println("After Test");
		
		driver.close();
				
		
	}
	
	
	
	
	
	
	

}
