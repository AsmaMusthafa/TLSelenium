package week3day4setwebtable;
/**
 *  1)Go to erial (https://erail.in/)
    2)Enter from as MS and press enter
    3)In Destination type cape and press enter
    4)Unchek sort date   
    5)Print the train names 
 */
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailGetTrainNames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("cape",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(3000);
		
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		int noOfName = trainName.size();
		System.out.println("Total number of trains:" +noOfName );
		
		for (WebElement eachName : trainName) {
			System.out.println(eachName.getText());
		}
		driver.close();
		
	}

}
