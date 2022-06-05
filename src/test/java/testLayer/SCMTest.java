package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseSCMClass;
import pompackage.pomSCM;

public class SCMTest extends BaseSCMClass {
	pomSCM Add;
	public SCMTest () {
	super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		Add=new pomSCM();
	}
	
	@Test (priority=1)
	public void Add_one_item_to_cart() {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.gotocart();
		driver.close();
	}
	
	@Test (priority=2)
	public void Add_morethan_one_item_to_cart() throws InterruptedException {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.gotocart();		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#a-autoid-4")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys("2");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test (priority=3)
	public void Add_same_item_multiple_times () throws InterruptedException {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test (priority=4)
	public void Add_multiple_items_of_different_type_items () {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox1(prop.getProperty("searchbox1"));
		Add.clicksearchbtn();
		driver.findElement(By.className("s-image")).click();
		Add.addtocart();
		Add.gotocart();
		driver.close();
	}
	
	@Test (priority=5)
	public void Remove_some_item_from_cart () {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox1(prop.getProperty("searchbox1"));
		Add.clicksearchbtn();
		driver.findElement(By.className("s-image")).click();
		Add.addtocart();
		Add.gotocart();
		driver.findElement(By.className("a-color-link")).click();
		driver.close();
	}
	
	@Test (priority=6)
	public void Remove_all_item_from_cart () throws InterruptedException {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox1(prop.getProperty("searchbox1"));
		Add.clicksearchbtn();
		driver.findElement(By.className("s-image")).click();
		Add.addtocart();
		Add.gotocart();
		driver.findElement(By.className("a-color-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("a-color-link")).click();
		driver.close();
	}
	
	@Test (priority=6)
	public void Click_an_item_in_the_cart () {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox1(prop.getProperty("searchbox1"));
		Add.clicksearchbtn();
		driver.findElement(By.className("s-image")).click();
		Add.addtocart();
		Add.gotocart();
		driver.findElement(By.className("sc-product-image")).click();
		driver.close();
	}
	
	@Test (priority=7)
	public void Close_And_Reopen_the_site () throws InterruptedException {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Add.selectbook();
		Add.addtocart();
		Add.typesearchbox1(prop.getProperty("searchbox1"));
		Add.clicksearchbtn();
		driver.findElement(By.className("s-image")).click();
		Add.addtocart();
		Add.gotocart();
		driver.findElement(By.id("nav-logo-sprites")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-cart-count")).click();
		driver.close();		
	}
	
	@Test (priority=8)
	public void Product_Information () throws InterruptedException {
		Add.typesearchbox(prop.getProperty("searchbox"));
		Add.clicksearchbtn();
		Thread.sleep(3000);
		driver.close();
	}

	}
