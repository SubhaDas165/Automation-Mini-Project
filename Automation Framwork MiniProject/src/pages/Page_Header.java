package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Header {
WebDriver driver;
	
	public Page_Header(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void verify_Sale_Link() throws InterruptedException {
		driver.findElement(By.className("img-responsive")).click();
		String ac=driver.findElement(By.partialLinkText("Sign in")).getText();
		System.out.println(ac);
		String ex="Sign in";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Sale Link Test case pass ");
		}else {
			System.out.println("Sale Link Test case failed");
		}

		
	}
	public void verify_Contact_Link() throws InterruptedException {
		driver.findElement(By.id("contact-link")).click();
		String ac=driver.getTitle();
		System.out.println(ac);
		String ex="Contact us - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Contact us Link Test case pass ");
		}else {
			System.out.println("Contact us Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Contact_Number() throws InterruptedException {
		String ac=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span")).getText();
		System.out.println(ac);
		String ex="Call us now: 0123-456-789";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Contact Number Test Test case pass ");
		}else {
			System.out.println("Contact Number Test Test case failed");
		}

		
	}
	
	public void verify_Sign() throws InterruptedException {
		driver.findElement(By.className("login")).click();
		String ac=driver.getTitle();
		String ex="Login - My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("SignIn Link Test case pass ");
		}else {
			System.out.println("SignIn Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Logo() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
		String ac=driver.getTitle();
		String ex="My Store";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Logo Link Test case pass ");
		}else {
			System.out.println("Logo Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Women_Link() throws InterruptedException {
		driver.findElement(By.linkText("Women")).click();
		String ac=driver.findElement(By.className("cat-name")).getText();
		String ex="Women ";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Woman Link Test case pass ");
		}else {
			System.out.println("Woman Link Test case failed");
		}

		driver.navigate().back();
	}
	public void verify_Dreses_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		String ac=driver.findElement(By.className("cat-name")).getText();
		String ex="Dresses ";
		if(ac.equalsIgnoreCase(ex)){
			System.out.println("Dresses link Test case pass ");
		}else {
			System.out.println("Dresses link Test case failed");
		}
		
		driver.navigate().back();
	}
	public void verify_Tshirt_Link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	
		String ac=driver.findElement(By.className("cat-name")).getText();
		String ec="T-shirts ";
		if(ac.equalsIgnoreCase(ec)){
			System.out.println("Tshirt link Test case pass ");
		}else {
			System.out.println("Tshirt link Test case failed");
		}
		
		driver.navigate().back();
	}
	public void verify_Search_Button() {
		driver.findElement(By.name("search_query")).sendKeys("t-shirts");
		driver.findElement(By.name("submit_search")).click();
		String ac=driver.findElement(By.className("display-title")).getText();
		String ex="View";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Search button verified :Test case pass");
		}else {
			System.out.println("Search button Test case failed");
		}
	}
	public void verify_Cart() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
		String ac=driver.findElement(By.className("page-heading")).getText();
		String ex="Shopping-cart summary";
		if(ac.equalsIgnoreCase(ex)) {
			System.out.println("Cart verified :Test case pass");
		}else {
			System.out.println("Test case failed");
		}
	}
	
}
