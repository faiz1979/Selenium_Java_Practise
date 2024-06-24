import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("test@test.com");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("signInBtn")).click();
		String name = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(name);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Faiz");
		driver.findElement(By.cssSelector("input[placeholder= 'Email']")).sendKeys("john@test.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9867543456");
		
		WebElement m = driver.findElement(By.xpath("//form/div/button[2]"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", m);
	      
	     String txt = driver.findElement(By.xpath("//div/div/div/div/div/div/div/form/p")).getText();
	     System.out.println(txt);
	    
	      driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("faizm");
	      driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
	      driver.findElement(By.className("signInBtn")).click();
	      driver.close();
	      driver.quit();
	      
		
		

	}

}
