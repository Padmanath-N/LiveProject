package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseSCMClass;

public class pomSCM extends BaseSCMClass  {
	
	@FindBy(css="#twotabsearchtextbox")	WebElement searchbox;
	@FindBy(css="#nav-search-submit-button") WebElement searchbtn;
	@FindBy(linkText="The Kids Book of Canada") WebElement selectbook;
	@FindBy(id="add-to-cart-button") WebElement addtocart;
	@FindBy(id="sw-gtc") WebElement gotocart;
	@FindBy(css="#twotabsearchtextbox")	WebElement searchbox1;
		
	 
	
		
	public pomSCM() {
		
		PageFactory.initElements(driver, this);
	}
		public void typesearchbox(String bookname) {
		
		searchbox.sendKeys(bookname);
	}
	
	public void clicksearchbtn () {
		
		searchbtn.click();
	}

	public void selectbook() {
		selectbook.click();
	}
	
	public void addtocart() {
		addtocart.click();
	}
	public void gotocart() {
		gotocart.click();
	}
	public void typesearchbox1(String bookname) {
		
		searchbox1.sendKeys(bookname);
	}
		
	}

