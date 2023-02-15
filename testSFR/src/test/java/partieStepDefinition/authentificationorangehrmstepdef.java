
package partieStepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import partieObject.authentificationorangehrmobject;

public class authentificationorangehrmstepdef {
	
	public static WebDriver driver= setup.driver;
	
	private authentificationorangehrmobject login = new authentificationorangehrmobject(driver);
	
	
	@Given("acceder a l url orange hrm")
	public void acceder_a_l_url_orange_hrm() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("taper le username")
	public void taper_le_username() {
	  login.rempinom();
	}

	@And("taper le mot de passe")
	public void taper_le_mot_de_passe() {
	    login.replipass();
	}

	@And("cliquer sur le bouton connecter")
	public void cliquer_sur_le_bouton_connecter() {
	   login.klik();
	}

	@Then("acceder a la page d acceuil")
	public void acceder_a_la_page_d_acceuil() {
		

	}
	
	

}
