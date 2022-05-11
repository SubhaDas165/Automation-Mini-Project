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

public class Buy_Product {
	WebDriver driver;
	ExcelReader er;
	public Buy_Product(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framwork MiniProject\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
	}
	public void buy_Product() {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();//click on tshirts
		driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).click();//choose the tshirt
		driver.findElement(By.className("icon-plus")).click();//increase the quantity
		driver.findElement(By.className("icon-plus")).click();//increase the quantity
		WebElement sizeDrorp=driver.findElement(By.id("group_1"));
		Select size=new Select(sizeDrorp);
		size.selectByVisibleText("L");//select the size of tshirt
		driver.findElement(By.id("color_14")).click();//choose the color
		driver.findElement(By.name("Submit")).click();// add to cart
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();//proceed to checout
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();//click sign in
		driver.findElement(By.id("email")).sendKeys(er.getData(0, 0, 0));//enter registered email
		driver.findElement(By.id("passwd")).sendKeys(er.getData(0, 0, 3));//enter password
		driver.findElement(By.id("SubmitLogin")).click();//login 
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();//proceed to checkout
		
		driver.findElement(By.id("cgv")).click();//click the check box
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();//proced to checkout
		driver.findElement(By.className("bankwire")).click();//choose the payment mode
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();//click confirm my order
		String ac=driver.findElement(By.className("cheque-indent")).getText();
		String ec="Your order on My Store is complete.";
		if(ac.equalsIgnoreCase(ec)) {
			System.out.println("Test case pass");
			System.out.println("Order done");
			
		}else {
			System.out.println("Test case failed");
			System.out.println("Order failed");
		}


	}
	

}
