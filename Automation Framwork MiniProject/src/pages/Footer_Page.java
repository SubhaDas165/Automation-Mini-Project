package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer_Page {
WebDriver driver;
	
	public Footer_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void login_My_Store() {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("subha123@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Subha123");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("SignIn successful");
	}
	public void verify_Facebook_Link() {
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[1]/a")).click();
		String ac=driver.getTitle();
		
		String ex="Selenium Framework |  Facebook";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Facebook link verified :Test case pass");
		}else {
			System.out.println("Facebook link Test case failed");
		}
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	public void verify_Twitter_Link() {
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[2]/a")).click();
		String ac=driver.getTitle();
		
		String ex="Selenium Framework (@seleniumfrmwrk) / Twitter";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Twitter link verified :Test case pass");
		}else {
			System.out.println("Twitter link Test case failed");
		}
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	public void verify_Youtube_Link() {
	    driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[3]/a")).click();
		String ac=driver.getTitle();
		
		String ex="Selenium Framework";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Youtube link verified :Test case pass");
		}else {
			System.out.println("Youtube link Test case failed");
		}
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	public void verify_Subscribed_Link() {
		driver.findElement(By.id("newsletter-input")).sendKeys("subha123@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();
		String ex=" Newsletter : You have successfully subscribed to this newsletter.";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Newslater subscribed verified succesfully subscribed");
		}else {
			System.out.println("This email is regisgtered Please try using another email");
		}
		
	}
	
	public void verify_Women_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Women")).click();
		String ac=driver.getTitle();
		String ex="Women - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Women Link Test case pass ");
		}else {
			System.out.println("Women Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Special_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Specials")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
		String ex="Price drop";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Special Link Test case pass ");
		}else {
			System.out.println("Special Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_BestSeller_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[3]/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
		String ex="Best sellers";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("BestSeller Link Test case pass ");
		}else {
			System.out.println("BestSeller Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_NewProduct_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
		String ex="New products";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("NewProduct Link Test case pass ");
		}else {
			System.out.println("NewProduct Test case failed");
		}

		driver.navigate().back();
	}
	
	public void verify_OutStore_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a")).click();
		String ac=driver.getTitle();
		String ex="Stores - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("OutStore Link Test case pass ");
		}else {
			System.out.println("OutStore Link Test case failed");
		}

		driver.navigate().back();
	}
	
	public void verify_Contact_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Contact us")).click();
		String ac=driver.getTitle();
		String ex="Contact us - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Contact us Link Test case pass ");
		}else {
			System.out.println("Contact us Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_TermsAndCondition_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Terms and conditions of use")).click();
		String ac=driver.findElement(By.className("page-heading")).getText();
		String ex="Terms and conditions of use";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Terms and condition Link Test case pass ");
		}else {
			System.out.println("Terms and condition Link Test case failed");
		}

		driver.navigate().back();
	}

	public void verify_About_us_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("About us")).click();
		String ac=driver.getTitle();
		
		String ex="About us - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("About us Link Test case pass ");
		}else {
			System.out.println("About us Link Test case failed");
		}

		driver.navigate().back();
	}
	
	public void verify_Sitemap_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Sitemap")).click();
		String ac=driver.getTitle();
		
		String ex="Sitemap - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("SiteMap Link Test case pass ");
		}else {
			System.out.println("SiteMap us Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_My_Orders_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("My orders")).click();
		String ac=driver.getTitle();
		String ex="Order history - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("My orders Link Test case pass ");
		}else {
			System.out.println("My orders Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_My_Credit_Slip_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("My credit slips")).click();
		String ac=driver.getTitle();
		String ex="Order slip - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("My_Credit_Slip Link Test case pass ");
		}else {
			System.out.println("My_Credit_Slip Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_MyAdress_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("My addresses")).click();
		String ac=driver.getTitle();
		String ex="Addresses - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("MyAdress Link Test case pass ");
		}else {
			System.out.println("MyAdress Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_My_Personal_Info_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("My personal info")).click();
		String ac=driver.getTitle();
		String ex="Identity - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("My_Personal_Info Link Test case pass ");
		}else {
			System.out.println("My_Personal_Info Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_SignOut_Link() throws InterruptedException {
		driver.findElement(By.partialLinkText("Sign out")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"editorial_block_center\"]/h1")).getText();
		
		String ex="Automation Practice Website";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("SignOut Link Test case pass ");
		}else {
			System.out.println("SignOut Link Test case failed");
		}
	
	}
	public void verify_Location_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[1]")).getText();
		String ec="Selenium Framework, Research Triangle Park, North Carolina, USA";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Location Text Test case pass ");
		}else {
			System.out.println("Location Text Link Test case failed");
		}
	}
	public void verify_Contact_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]")).getText();
		String ec="Call us now: (347) 466-7432";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Contact Text Test case pass ");
		}else {
			System.out.println("Contact Text Link Test case failed");
		}
	}
	public void verify_Email_Text() {
		String ac=driver.findElement(By.linkText("support@seleniumframework.com")).getText();
		String ec="support@seleniumframework.com";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Email Text Test case pass ");
		}else {
			System.out.println("Email Text Link Test case failed");
		}
	}
	public void verify_Prestshop_Text() {
		String ac=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[4]/div")).getText();
		String ec="© 2014 Ecommerce software by PrestaShop™";

		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Prestashop Text Test case pass ");
		}else {
			System.out.println("Prestashop Text Link Test case failed");
		}
	}

}
