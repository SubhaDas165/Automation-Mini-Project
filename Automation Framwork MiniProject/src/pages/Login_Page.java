package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import excelUtility.ExcelReader;

public class Login_Page {
	WebDriver driver;
	ExcelReader er;
	public Login_Page(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framwork MiniProject\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
	}
	public void verify_Login() {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("subha123@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Subha123");
		driver.findElement(By.id("SubmitLogin")).click();
		String ac=driver.findElement(By.className("page-heading")).getText();
		
		String ec="My account";
		if(ac.equalsIgnoreCase(ec)) {
			System.out.println("Login test case pass");
		}else {
			System.out.println("Login test case failed");
		}
		
	}

}
