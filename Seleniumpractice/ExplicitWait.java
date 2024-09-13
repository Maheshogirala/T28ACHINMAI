package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html\r\n");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//input[@type='text']"), "seleniumWebDriver"));
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(ele.getText());
			
		

	}

}
