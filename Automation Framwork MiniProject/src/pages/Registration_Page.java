package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import excelUtility.ExcelReader;

public class Registration_Page {
	WebDriver driver;
	ExcelReader er;
	By email=By.name("email_create");
	By firstName=By.name("customer_firstname");
	By lastName=By.name("customer_lastname");
	By password=By.name("passwd");
	By company=By.name("company");
	By address1=By.name("address1");
	By address2=By.name("address2");
	By city=By.name("city");
	By zipCode=By.name("postcode");
	By addAdd=By.name("other");
	By phNo=By.name("phone");
	By MNo=By.name("phone_mobile");
	By aliasAdd=By.name("alias");
	

	public Registration_Page(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framwork MiniProject\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
	}

	public void register_New_User() throws Exception {
		int totalrow=er.getRowCount(0);
		for (int i = 0; i < totalrow; i++) {

			driver.findElement(email).sendKeys(er.getData(0, i, 0));
			driver.findElement(By.id("SubmitCreate")).click();

			driver.findElement(By.id("id_gender1")).click();
			driver.findElement(firstName).sendKeys(er.getData(0, i, 1));
			driver.findElement(lastName).sendKeys(er.getData(0, i, 2));
			driver.findElement(password).sendKeys(er.getData(0, i, 3));

			WebElement dd=driver.findElement(By.name("days"));
			Select day=new Select(dd);
			day.selectByValue(er.getIntData(0, i, 4)+"");
			WebElement dm=driver.findElement(By.name("months"));
			Select mon=new Select(dm);
			mon.selectByIndex(er.getIntData(0, i, 5));
			WebElement dy=driver.findElement(By.name("years"));
			Select year=new Select(dy);
			year.selectByValue(er.getIntData(0, i, 6)+"");

			driver.findElement(By.name("newsletter")).click();
			driver.findElement(By.name("optin")).click();
			driver.findElement(company).sendKeys(er.getData(0, i, 7));
			driver.findElement(address1).sendKeys(er.getData(0, i, 8));
			driver.findElement(address2).sendKeys(er.getData(0, i, 9));

			driver.findElement(city).sendKeys(er.getData(0, i, 10));
			WebElement statedown=driver.findElement(By.id("id_state"));
			Select state=new Select(statedown);
			state.selectByIndex(i+1);
			driver.findElement(zipCode).sendKeys(er.getIntData(0, i, 11)+"");
			driver.findElement(addAdd).sendKeys(er.getData(0, i, 12));
			driver.findElement(phNo).sendKeys(er.getIntData(0, i, 13)+"");
			driver.findElement(MNo).sendKeys(er.getIntData(0, i, 14)+"");
			driver.findElement(aliasAdd).clear();
			driver.findElement(aliasAdd).sendKeys(er.getData(0, i, 15));
			driver.findElement(By.id("submitAccount")).click();
			driver.findElement(By.className("logout")).click();
			driver.findElement(By.className("login")).click();

			System.out.println("Create account successfully completed");
		
				login_Check(i);


		}



	}
	public void login_Check(int k) {
		
		driver.findElement(By.id("email")).sendKeys(er.getData(0, k, 0));
		System.out.println("User name is: "+er.getData(0, k, 0));
		
		
		driver.findElement(By.id("passwd")).sendKeys(er.getData(0, k, 3));
		System.out.println("Password is: "+er.getData(0, k, 3));
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("succesfully signin");
		driver.findElement(By.className("logout")).click();
		driver.findElement(By.className("login")).click();
		
	}


}
