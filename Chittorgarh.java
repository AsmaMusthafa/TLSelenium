package week3day4setwebtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
// 1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names
 */
public class Chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//2. Click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();

		List<WebElement> securityNames = driver.findElements(By.xpath("//table//tr//td[3]"));
		List<String> list = new ArrayList<String>();
		int listSize = securityNames.size();
		
		//4. Get all the Security names
		System.out.println(" ");
		System.out.println("*********************");
		System.out.println("Security names are:");
		System.out.println("*********************");		

		for (int i = 0; i < listSize; i++) 
		{
			String text = securityNames.get(i).getText();
			System.out.println("\t"+i+". "+text);
			list.add(text);
		}
		Collections.sort(list);

		Set<String> set = new TreeSet<String>(list);
		int setSize = set.size();
		if(listSize==setSize)
		{
			System.out.println("There is no duplicates");
		}
		
		//5. Ensure whether there are duplicate Security names
		else
		{	System.out.println(" ");
			System.out.println("Yes, Security names have duplicates ");
			System.out.println(" ");
			System.out.println("****************************");
			System.out.println("Duplicate of Security names:");
			System.out.println("****************************");
			for (int i = 0; i < securityNames.size()-1; i++) 
			{
				if(securityNames.get(i+1).getText().equals(securityNames.get(i).getText()))
				{
					System.out.println(securityNames.get(i+1).getText());
				}
			}
			driver.close();

		}

	}
}
