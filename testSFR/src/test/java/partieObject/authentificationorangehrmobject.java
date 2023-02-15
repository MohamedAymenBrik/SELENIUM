package partieObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class authentificationorangehrmobject {
	
	
	WebDriver driver;

	public authentificationorangehrmobject(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	
	
	
	
	// identification des elements 
	
	@FindBy (how = How.NAME , using ="username" )
	public static WebElement nom;
	
	@FindBy (how = How.NAME , using ="password" )
	public static WebElement motdepass;
	
	@FindBy (how = How.XPATH , using ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button" )
	public static WebElement bouton;
	
	// creation des methodes 
	
	public void rempinom() {
		nom.sendKeys("Admin");
	}
	
	public void replipass() {
		motdepass.sendKeys("admin123");
	}
	
	public void klik() {
		bouton.click();
	}

}
