package com.healthgraph.ehr.addpatient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.healthgraph.ehr.commommethods.Common_Methods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Patient extends Common_Methods
{

	@Given("^Run the URL to launch EHR application$")
	public void run_the_URL_to_launch_EHR_application() throws Throwable 
	{
		browser_and_url_open();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable 
	{
		driver.findElement(By.name("session[username]")).sendKeys(username);
		driver.findElement(By.name("session[password]")).sendKeys(password);
	}

	@When("^click on login login button$")
	public void click_on_login_login_button() throws Throwable 
	{
		driver.findElement(By.name("commit")).click();
	}

	@Then("^EHR patient list page should display$")
	public void ehr_patient_list_page_should_display() throws Throwable
	{
		if(driver.findElement(By.xpath("//*[@src=\"/assets/foss_navbar-f513423ccdf9771ea548ff72a115157b342f4860087869219c650fc59f089a33.png\"]")).isDisplayed())
		{
			Reporter.addStepLog("Successfully log in as a recepionist to EHR -->Test Pass");
		}
		else
		{
			Reporter.addStepLog("Log in as a recepionist to EHR is not working-->DEFECT");
		}

	}

	/*@Then("^close the browser$")
	public void close_the_browser() throws Throwable 
	{
	   //driver.close();
	   driver.quit();
	}*/

	@Then("^click on add pluse button$")
	public void click_on_add_pluse_button() throws Throwable 
	{

		if(driver.findElement(By.xpath("//*[@class='glyphicon glyphicon-plus']")).isDisplayed()) 
		{
			Thread.sleep(5000);
			clickElementByElement(driver.findElement(By.xpath("//*[@class='glyphicon glyphicon-plus']")));
			Thread.sleep(5000);
			if(driver.findElement(By.xpath("//*[text()='Add New Patient']")).isDisplayed())
			{
				Reporter.addStepLog("Add new patient pop up is opening after click of ADD button-->Test Pass");
			}
			else
			{
				Reporter.addStepLog("Add new patient pop up is not opening after click of ADD button-->DEFECT");
			}
		}
		else
		{
			Reporter.addStepLog("Add plus button is not displaying in patient list page-->DEFECT");
		}
	}

	@Then("^click on add new patient button$")
	public void click_on_add_new_patient_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[text()='Add New Patient']")).click();
	}
	
	@When("^user fill mandatory fields \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_fill_mandatory_fields(String firstname, String mobno) throws Throwable 
	{
  
	   driver.findElement(By.name("patient[firstname]")).sendKeys(firstname);
	   driver.findElement(By.name("patient[mobilenumber]")).sendKeys(mobno);
	   
	}

	@Then("^user can create appointment$")
	public void user_can_create_appointment() throws Throwable 
	{
	    driver.findElement(By.xpath("//input[@value='Create Appointment']")).click();
	}

	@Then("^open the created appointment in edit mode$")
	public void open_the_created_appointment_in_edit_mode() throws Throwable 
	{
	    
	}

	@Then("^remove the mandatory fields and click on create appointment button$")
	public void remove_the_mandatory_fields_and_click_on_create_appointment_button() throws Throwable
	{
	    
	}

	@Then("^validate warning message should display$")
	public void validate_warning_message_should_display() throws Throwable 
	{
	   
	}

	@Then("^fill patient details  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_patient_details(String firstname1, String mobno1, String middlename, String lastname, String secondaryno, 
			String email, String language, String secondarylanguage, String pincode, String Add1, String Add2, String MedicalRepoNo, String Aadhaar, String PANno,
			String DLno, String patientref, String location, String SpeialistAvialable, String Doctor, String AppointmentType, String AppointmentCat) throws Throwable
	{
	   
	}


}
