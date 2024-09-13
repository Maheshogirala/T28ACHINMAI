package Seleniumpractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userformat {
	public static WebDriver driver;

	public static void main(String[] args) throws ParseException {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		String expdate="28/September/2024";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();

		
		//to formate the date into calender available format
		Calendar calendar = Calendar.getInstance();//set timezone
		//specifying the user input given format
		SimpleDateFormat date = new SimpleDateFormat("dd/MMM/yyyy");
		Date formatteddate= date.parse(expdate);//format the date stored in parse
		calendar.setTime(formatteddate);//setting date with calendar web
		//separate the expdate
		int expday=calendar.get(calendar.DAY_OF_MONTH);//28
		int expmonth=calendar.get(calendar.MONTH);//09
		int expyear= calendar.get(calendar.YEAR);//2024
		String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
		//format the current date
		calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
		//separate the currentdate
		int currentmonth= calendar.get(calendar.MONTH);//09
		int currentyear=calendar.get(calendar.YEAR);//2024
		//select current month date
		while(expmonth==currentmonth) {
			driver.findElement(By.xpath("//a[text()='"+expday+"']")).click();
			
		}
		
		

	}

}
