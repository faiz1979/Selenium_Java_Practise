import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class password_dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "Faiz";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String txt1 = driver.findElement(By.xpath("//p")).getText();
		System.out.println(txt1);
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String str1 = (driver.findElement(By.cssSelector("form p")).getText());
		driver.close();
		String[] array1 = str1.split("'");
		String[] array2 = array1[1].split("'");
		String password = array2[0];
		System.out.println(password);
		return password;
		
		
		/*String[] array1 = str1.split(" ");
		
		for(int i = 0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		
		String[] pass = array1[4].split("'");
		
		String actual_pass = pass[1];
		System.out.println(actual_pass); */
	}

}
