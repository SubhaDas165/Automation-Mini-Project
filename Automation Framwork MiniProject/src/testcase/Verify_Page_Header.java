package testcase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import browserImplementation.Browser_Launch;
import pages.Page_Header;

public class Verify_Page_Header {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Page_Header ph;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		obj=new Browser_Launch();
		System.out.println("Enter The Browser");
		System.out.println("For Chrome Browser press 1");
		System.out.println("For Microsoft Edge Browser press 2");
		System.out.println("For FireFox Browser press 3");
		int k=sc.nextInt();
		if(k==1) {
			driver=obj.launch_Chrome();
			System.out.println("Thank you for choosing Chrome Browser");
		}
		if(k==2) {
			driver=obj.launch_Edge();
			System.out.println("Thank you for choosing Microsoft Edge");
		}
		if(k==3) {
			driver=obj.launch_FireFox();
			System.out.println("Thank you for choosing FireFox Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ph=new Page_Header(driver);
		ph.verify_Sale_Link();
		ph.verify_Sign();
		ph.verify_Contact_Link();
		ph.verify_Contact_Number();
		ph.verify_Search_Button();
		ph.verify_Logo();
		ph.verify_Women_Link();
		ph.verify_Dreses_Link();
		ph.verify_Tshirt_Link();
		ph.verify_Cart();
		driver.quit();
	}

}
