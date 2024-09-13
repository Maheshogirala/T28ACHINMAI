package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	driver= new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html\\r\\n");
	driver.manage().window().maximize();
	Wait<WebDriver>wait= new FluentWait<>(driver);
	withTimeouts(Duration.ofSeconds(20));
	pollingEvery(Duration.ofSeconds(5));
	ignoring(ElementNotInteractableException.class);
	
	driver.findElement(By.xpath("//button[@id='btn2']")).click();
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//input[@type='text']"), "seleniumWebDriver"));
	
	WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
	
	System.out.println(ele.getText());
		
	
	
}
}
