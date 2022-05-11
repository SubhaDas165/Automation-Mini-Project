package testcase;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserImplementation.Browser_Launch;
import pages.Home_Page;


public class Verify_HomePage {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Home_Page hp;

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
		
		hp =new Home_Page(driver);
		hp.verify_Fadded_Short_sleeve_Tshirts_product();
		hp.verify_Blouse_product();
		hp.verify_Printed_Dress1_product();
		hp.verify_Printed_Dress2_product();
		hp.verify_Printed_Summer_Dress1_product();
		hp.verify_Printed_Summer_Dress2_product();
		hp.verify_Printed_Chiffon_Dress_product();
		hp.verify_Image_Link();
		hp.verify_SeleniumFramework_Link();
		hp.verify_Follow_Us_on_Facebook_Text();
		hp.verify_Come_Visit_Us_Text();
		hp.verify_Come_Visit_Us_Text();
		hp.verify_Come_Visit_Us_Description_Text();
		hp.verify_Call_Us_Text();
		hp.verify_How_to_Pays_Dues_Text();
		hp.verify_How_to_Pays_Dues_Description_Text();
		hp.verify_Custom_Block_Text();
		hp.verify_Custom_Block_Description_Text();
        hp.verify_Automation_Practice_Website_Text();
        hp.verify_Automation_Practice_Website_Description_Text();
	    hp.verify_Practice_Selenium_Text();
        hp.verify_Subsidiary_seleniumframeworkcom_Text();
		driver.quit();

	}

}
