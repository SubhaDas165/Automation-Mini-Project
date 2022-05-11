package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void verify_Follow_Us_on_Facebook_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"facebook_block\"]/h4")).getText();
		String ec="Follow us on Facebook";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" Follow Us on Facebook Text Test case pass ");
		}else {
			System.out.println("Follow Us on Facebook Text case failed");
		}
	}
	public void verify_Come_Visit_Us_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3")).getText();
		String ec="Come Visit Us";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Come_Visit_Us Text Test case pass ");
		}else {
			System.out.println("Come_Visit_Us Text case failed");
		}
	}
	public void verify_Come_Visit_Us_Description_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/p")).getText();
		String ec="We are located in Research Triangle Park, North Carolina, USA";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" Come_Visit_Us_Description Text Test case pass ");
		}else {
			System.out.println("Come_Visit_Us_Description Text case failed");
		}
	}
	public void verify_Call_Us_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/h3")).getText();
		String ec="Call Us";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" Come_Visit_Us_Description Text Test case pass ");
		}else {
			System.out.println("Come_Visit_Us_Description Text case failed");
		}
	}
	public void verify_How_to_Pays_Dues_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/h3")).getText();
		String ec="How to Pay dues";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" How to Pay dues Text Test case pass ");
		}else {
			System.out.println("How to Pay dues Text case failed");
		}
	}
	public void verify_How_to_Pays_Dues_Description_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/p")).getText();
		String ec="You can pay us by calling or use our online pay channels";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" How to Pay dues description Text Test case pass ");
		}else {
			System.out.println("How to Pay dues description Text case failed");
		}
	}
	public void verify_Custom_Block_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[2]/h3")).getText();
		String ec="Custom Block";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" Custom Block Text Test case pass ");
		}else {
			System.out.println("Custom Block Text case failed");
		}
	}
	public void verify_Custom_Block_Description_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[2]/p[2]")).getText();
		String ec="Selenium Framework website was designed solely to help folks get over the fear of Automation. The website was an inspiration from the fact that there is no website that can bridge the gaps between the differences among various programming languages and help non-programmers get a taste of Automation.";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println(" Custom Block Description Text Test case pass ");
		}else {
			System.out.println("Custom Block Description Text case failed");
		}
	}
	public void verify_Automation_Practice_Website_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"editorial_block_center\"]/h1")).getText();
		String ec="Automation Practice Website";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Automation Practice Website Text Test case pass ");
		}else {
			System.out.println("Automation Practice Website Text case failed");
		}
	}
	public void verify_Automation_Practice_Website_Description_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"editorial_block_center\"]/div/p")).getText();
		String ec="This sample ecommerce website is being used by www.seleniumframework.com website to help pracitce exercises on a real-time ecommerce website. Different workflows for adding products to cart, checking out car, making payments etc. workflows will be automated using Automation scripts and this website is a candidate for the same. Please contact support@seleniumframework.com for any further questions. Thanks.";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Automation Practice Website Text Test case pass ");
		}else {
			System.out.println("Automation Practice Website Text case failed");
		}
	}
	public void verify_Practice_Selenium_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"editorial_block_center\"]/h2")).getText();
		String ec="Practice Selenium";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Practice Selenium Text Test case pass ");
		}else {
			System.out.println("Practice Selenium Website Text case failed");
		}
	}
	public void verify_Subsidiary_seleniumframeworkcom_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"editorial_image_legend\"]")).getText();
		String ec="Subsidiary of seleniumframework.com";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Subsidiary of seleniumframework.com Text Test case pass ");
		}else {
			System.out.println("Subsidiary of seleniumframework.com Text case failed");
		}
	}
	public void verify_Fadded_Short_sleeve_Tshirts_product() {
		driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).click();
		String ac=driver.getTitle();
		String ec="Faded Short Sleeve T-shirts - My Store";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Fadded_Short_sleeve_Tshirts_product Test case pass ");
		}else {
			System.out.println("Fadded_Short_sleeve_Tshirts_product Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Blouse_product() {
		driver.findElement(By.partialLinkText("Blouse")).click();
		String ac=driver.getTitle();
		String ec="Blouse - My Store";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Blouse_product  Test case pass ");
		}else {
			System.out.println("Blouse_product Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Printed_Dress1_product() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/h5/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).getText();
		String ec="demo_3";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Printed_Dress1_product Test case pass ");
		}else {
			System.out.println("Printed_Dress1_product Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Printed_Dress2_product() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/h5/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).getText();
		String ec="demo_4";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Printed_Dress2 Test case pass ");
		}else {
			System.out.println("Printed_Dress2 Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Printed_Summer_Dress1_product() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).getText();
		String ec="demo_5";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Printed_Summer_Dress1 Test case pass ");
		}else {
			System.out.println("Printed_Summer_Dress1 Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Printed_Summer_Dress2_product() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[2]/h5/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).getText();
		String ec="demo_6";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Printed_Summer_Dress2_product Test case pass ");
		}else {
			System.out.println("Printed_Summer_Dress2_product Test case failed");
		}
		driver.navigate().back();
	}
	public void verify_Printed_Chiffon_Dress_product() {
		driver.findElement(By.partialLinkText("Printed Chiffon Dress")).click();
		String ac=driver.getTitle();
		String ec="Printed Chiffon Dress - My Store";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Printed_Chiffon_Dress_product Text Test case pass ");
		}else {
			System.out.println("Printed_Chiffon_Dress_product Text case failed");
		}
		driver.navigate().back();
	}
	public void verify_Image_Link() throws InterruptedException {		
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img")).click();
			String ac1=driver.getTitle();
			String ec="Create and build your online store with PrestaShop";
			if(ac1.equalsIgnoreCase(ec)){
				System.out.println("1st image link Test case pass ");
			}else {
				System.out.println("1st image link Test case failed");
			}
			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[2]/a/img")).click();
			String ac2=driver.getTitle();
			if(ac2.equalsIgnoreCase(ec)){
				System.out.println("2nd image link Test case pass ");
			}else {
				System.out.println("2nd image link Test case failed");
			}
			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[1]/a/img")).click();
			String ac3=driver.getTitle();
			if(ac3.equalsIgnoreCase(ec)){
				System.out.println("3rd image link Test case pass ");
			}else {
				System.out.println("3rd image link Test case failed");
			}
			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[2]/a/img")).click();
			String ac4=driver.getTitle();
			if(ac4.equalsIgnoreCase(ec)){
				System.out.println("4th image link Test case pass ");
			}else {
				System.out.println("4th image link Test case failed");
			}
			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[3]/a/img")).click();
			String ac5=driver.getTitle();
			if(ac2.equalsIgnoreCase(ec)){
				System.out.println("5th image link Test case pass ");
			}else {
				System.out.println("5th image link Test case failed");
			}

			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[4]/a/img")).click();
			String ac6=driver.getTitle();
			if(ac2.equalsIgnoreCase(ec)){
				System.out.println("6th image link Test case pass ");
			}else {
				System.out.println("6th image link Test case failed");
			}

			driver.navigate().back();
			
			driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[5]/a/img")).click();
			String ac7=driver.getTitle();
			if(ac2.equalsIgnoreCase(ec)){
				System.out.println("7th image link Test case pass ");
			}else {
				System.out.println("7th image link Test case failed");
			}

			driver.navigate().back();
	}
	
	public void verify_SeleniumFramework_Link() {
		driver.findElement(By.linkText("Selenium Framework")).click();
		String ac=driver.getTitle();
		String ex="Selenium Framework | Selenium, Cucumber, Ruby, Java et al.";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Selenium Framework link verified :Test case pass");
		}else {
			System.out.println("Selenium Framework link Test case failed");
		}
		driver.navigate().back();
	}
	
	

	
}	
