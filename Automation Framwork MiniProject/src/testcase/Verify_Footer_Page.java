package testcase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import browserImplementation.Browser_Launch;
import pages.Footer_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Verify_Footer_Page {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Footer_Page fp;
	

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
		fp=new Footer_Page(driver);
		fp.login_My_Store();
		fp.verify_Facebook_Link();
		fp.verify_Twitter_Link();
		fp.verify_Youtube_Link();
		fp.verify_Subscribed_Link();
		fp.verify_Women_Link();
		fp.verify_Special_Link();
		fp.verify_BestSeller_Link();
		fp.verify_NewProduct_Link();
		fp.verify_OutStore_Link();
		fp.verify_Contact_Link();
		fp.verify_TermsAndCondition_Link();
		fp.verify_About_us_Link();
		fp.verify_Sitemap_Link();
		fp.verify_My_Orders_Link();
		fp.verify_My_Credit_Slip_Link();
		fp.verify_MyAdress_Link();
		fp.verify_My_Personal_Info_Link();
		fp.verify_Location_Text();
		fp.verify_Contact_Text();
		fp.verify_Email_Text();
		fp.verify_Prestshop_Text();
		fp.verify_SignOut_Link();
		driver.close();
		
	}
}
