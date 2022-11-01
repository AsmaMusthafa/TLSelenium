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
 * 9	enter your company name 
 * 10 enter your first name
 * 11 enter your last name
 * 12 click on create lead
 * 13 Click Edit
**/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case2EditCompanyName {

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
		driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]")).sendKeys("Company 2");


		//Attribute based xPath://tagName[@attributeName='attributeValue']
		String firstName = "Flipkart";
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Enterprises");
		//click on create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		Thread.sleep(6000);
		WebElement findFirstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String findF_Name = findFirstName.getText();

		if(firstName.equals(findF_Name))
			System.out.println("Account is created successfully");
		else
			System.out.println("Account creation is failed");

		//Click Edit
		//Text based xPath: - //tagName[text()='textValue']
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		//Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String changeCompanyName = "Company Two";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(changeCompanyName);

		//Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
