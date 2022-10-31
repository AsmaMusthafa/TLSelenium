package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) 
 */
public class FBCreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("firstname")).sendKeys("Asma");
		driver.findElement(By.name("lastname")).sendKeys("Mohamed");
		driver.findElement(By.name("reg_email__")).sendKeys("09909012345");
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		
		WebElement e_day = driver.findElement(By.id("day"));
		Select selectDay = new Select(e_day);
		selectDay.selectByValue("24");
		
		WebElement e_month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(e_month);
		selectMonth.selectByVisibleText("Apr");
		
		WebElement e_year = driver.findElement(By.id("year"));
		Select selectYear = new Select(e_year);
		selectYear.selectByIndex(10);
		
		driver.findElement(By.className("_8esa")).click();
		
		
		
		
//		driver.close();

	}

}
