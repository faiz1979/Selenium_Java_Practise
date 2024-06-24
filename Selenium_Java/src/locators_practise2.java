import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators_practise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username = "Faiz";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		//String txt1 = driver.findElement(By.cssSelector("p")).getText();
		String txt1 = driver.findElement(By.xpath("//p")).getText();
		//String txt1 = driver.findElement(By.tagName("p")).getText();
		System.out.println(txt1);
		Assert.assertEquals(txt1, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+username+",");

	}

}
