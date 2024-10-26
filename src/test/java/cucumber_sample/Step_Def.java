package cucumber_sample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def {

@Given("Launch browser")
public void launch_browser() {
   System.out.println("gfhjkl"); 
}

@When("Enter username and password")
public void enter_username_and_password() {
	   System.out.println("gfhjkl"); 
 
}

@Then("Click on login button")
public void click_on_login_button() {
	   System.out.println("gfhjkl"); 

}
}
