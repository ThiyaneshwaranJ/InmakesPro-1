package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.bas.BaseClass;
import org.poj.signpojo1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test extends BaseClass {
	@Given("Enduser has to launch the chrome browser and maximize the window")
	public void enduser_has_to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();

	}

	@When("Enduser has to launch the url of facebook application")
	public void enduser_has_to_launch_the_url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("Enduser has to click the create new account button")
	public void enduser_has_to_click_the_create_new_account_button() {
		signpojo1 s =new signpojo1();
	    clickBtn(s.getCreateacc());
	}

	@When("Enduser has to enter the firstname in firstname box")
	public void enduser_has_to_enter_the_firstname_in_firstname_box(io.cucumber.datatable.DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		//List<String> l = d.asList();
		Map<String, String> m = d.asMap(String.class, String.class);
	   signpojo1  s = new signpojo1();
	 //  passText(l.get(1), s.getFistname());
	   passText(m.get("secondname"), s.getFistname());
	   
	}

	@When("Enter the Surname in Surname box")
	public void enter_the_Surname_in_Surname_box() {
		signpojo1 s = new signpojo1();
		passText("J", s.getSurname());
	}

	@When("Enduser has to enter the mobileno or email in that textbox")
	public void enduser_has_to_enter_the_mobileno_or_email_in_that_textbox() {
		signpojo1 s = new signpojo1();
		passText("thiyanesh1999@gmail.com", s.getEmailid());


	    
	}

	@When("Enduser has to enter the new password in new password box")
	public void enduser_has_to_enter_the_new_password_in_new_password_box(io.cucumber.datatable.DataTable d) {
//		List<List<String>> l1 = d.asLists();
			List<Map<String, String>> m1 = d.asMaps();
			signpojo1 s = new signpojo1();
		//	passText(l1.get(1).get(2), s.getPassword());
			passText(m1.get(0).get("password1"), s.getPassword());
	}

	@Then("Enduser has to close the chrome browser")
	public void enduser_has_to_close_the_chrome_browser() {
	     //closeEntireBrowser();  
	} 

}
