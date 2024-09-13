package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiseledrpdwn {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele= driver.findElement(By.xpath("//select[@id='ide']"));
		Select drpdwn = new Select(ele);
		if(drpdwn.isMultiple()) {
			//drpdwn.selectByIndex(1);
			drpdwn.deselectByValue("nb");
		}
		}

}
