package week2day2;
/*http://leaftaps.com/opentaps/control/main
 * 1	Launch the browser
 * 2	Enter the username
 * 3	Enter the password
 * 4	Click Login
 * 5	Click crm/sfa link
 * 6	Click Leads link
 * 7	Click Find leads
 * 8	Click create leads
 * 9 	Click Delete button **/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case4DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Set path for browser
		WebDriverManager.chromedriver().setup();

		//To launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//return type of get : void
		driver.get("http://leaftaps.com/opentaps/control/main");

		//how to maximize the browser
		driver.manage().window().maximize();

		//Attribute based xPath://tagName[@attributeName='attributeValue']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		//Partial Text based xPath://tagName[contains(text(),'textValue')]
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//Index/ Collection based xPath:(//tagName)[index]
		//tagName[@attribute='attributeValue'])[index]
		//(//tagName[text()='textValue'])[index]
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[2]")).click();

		//Partial Attribute based xPath:
		//tagName[contains(@attributeName,'attributeValue')]
		driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]")).sendKeys("Company4");


		//Attribute based xPath://tagName[@attributeName='attributeValue']
		String firstName = "Zomato";
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Delivery");
		//click on create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		Thread.sleep(6000);
		WebElement findFirstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String findF_Name = findFirstName.getText();

		if(firstName.equals(findF_Name))
			System.out.println("Account is created successfully");
		else
			System.out.println("Account creation is failed");
		
		//Delete Lead
		driver.findElement(By.xpath("//a[contains(@class,'Dangerous')]")).click();
		Thread.sleep(2000);
		System.out.println("Lead is deleted successfully");
		driver.close();
	}

}
