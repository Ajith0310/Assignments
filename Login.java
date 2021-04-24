package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("InvestorsUnion");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		
		WebElement eleDropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd1 = new Select(eleDropdown1);
		
		dd1.selectByVisibleText("Partner");	
		
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ajii");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Investment");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("6,00,000");
		
		WebElement eleDropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(eleDropdown2);
		dd2.selectByVisibleText("Finance");
		
		WebElement eleDropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(eleDropdown3);
		dd3.selectByVisibleText("Partnership");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AJITH");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Your Knowledge Is Your Investment");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Trust Your Skill");
		
		WebElement eleDropdown4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4 = new Select(eleDropdown4);
		dd4.selectByVisibleText("Catalog Generating Marketing Campaigns");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("None");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/10/1998");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Investment");
		
		WebElement eleDropdown5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd5 = new Select(eleDropdown5);
		dd5.selectByVisibleText("INR - Indian Rupee");
		
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AD");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("31");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("AJITH");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("inve.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ajith");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("b-15");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641031");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("31");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("InvestorUnion");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Thendral Nagar");
		
		WebElement eleDropdown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6 = new Select(eleDropdown6);
		dd6.selectByVisibleText("Tennessee");
		
		WebElement eleDropdown7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7 = new Select(eleDropdown7);
		dd7.selectByVisibleText("United States");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Broo");
		
		driver.findElement(By.name("submitButton")).click();
		
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);
		
		driver.close();
		
	}

}
