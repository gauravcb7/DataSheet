

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class notinuse {
	
	public  WebDriver driver;
	public WebDriverWait wait;
	public DriverFactory driverFactory;
	
		
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{
	    // Navigate to homepage page
		
		driver.navigate().to("https://wikiuat.hcl.com/sites/SmartDeal/SitePages/Home.aspx");
		System.out.println(driver.getTitle());
		wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("Smart Deal - Home"));
		try{
		assertEquals(driver.getTitle(),"Smart Deal - Home");
		}catch(AssertionError e){
			Select dropdown = new Select(driver.findElement(By.xpath("//div/select[@id='ctl00_PlaceHolderMain_ClaimsLogonSelector']")));
			dropdown.selectByVisibleText("Windows Authentication");
					
		}catch(UnhandledAlertException e){
			WebDriverWait wait = new WebDriverWait(driver,2);
			Alert alert =wait.until(ExpectedConditions.alertIsPresent());
			alert.authenticateUsing(new UserAndPassword("srivastavag","Welcomecb7$"));
		}
	    
	}

	@When("^User Navigate to Deal Page$")
	public void user_Navigate_to_Deal_Page() throws Throwable {
	    // Naviage to deal page
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleIs("Smart Deal - Home"));
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/a[@class='newDeal']")).click();
		System.out.println(driver.getTitle());
		try{
		assertEquals(driver.getTitle(), "Smart Deal - KIF");
		}catch(AssertionError e){
			Select dropdown = new Select(driver.findElement(By.xpath("//div/select[@id='ctl00_PlaceHolderMain_ClaimsLogonSelector']")));
			dropdown.selectByVisibleText("Windows Authentication");
			
		}
	}

	@When("^User enters all the data$")
	public void user_enters_all_the_data() throws Throwable {
	    // Input data to various fields
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleIs("Smart Deal - KIF"));
		String mainWindowHandler = driver.getWindowHandle();
	    
		//verify Attach button is disabled
		assertEquals(driver.findElement(By.xpath("//div/input[@id='btnAttach']")).isEnabled(),false);
		
		//verify SPOCs button is disabled
		assertEquals(driver.findElement(By.xpath("//div/input[@id='btnSPOCSelection']")).isEnabled(), false);
		
		//Customer name
		driver.findElement(By.xpath("//div/input[@id='txtCustomer']")).sendKeys("ByAutomation");
		
		//Customer vertical
		Select selectCusVertical = new Select(driver.findElement(By.xpath("//div/select[@id='ddlServiceLines']")));
		selectCusVertical.selectByVisibleText("ERS");
		
		//Deal size
		Select selectSize = new Select(driver.findElement(By.xpath("//div/select[@id='ddlDealSize']")));
		selectSize.selectByValue("2");
		
		//Deal type
		Select selectType = new Select(driver.findElement(By.xpath("//div/select[@id='ddlDealType']")));
		selectType.selectByVisibleText("Annuity Deal");
		
		//RFP/RFI received by sales date
		
		WebElement cal = driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtRFPReceivedbySalesDateDateDatePickerImage']"));
		cal.click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtRFPReceivedbySalesDateDateDatePickerFrame']"))));
		datePicker("17");
		driver.switchTo().window(mainWindowHandler);
		
		//Vertical
		Select selectVertical = new Select(driver.findElement(By.xpath("//div/select[@id='ddlVertical']")));
		selectVertical.selectByVisibleText("Professional Services");
		
		//G 2000 Ranking
		Select selectRanking = new Select(driver.findElement(By.xpath("//div/select[@id='ddlWhetherPartofRanking']")));
		selectRanking.selectByVisibleText("No");
		
		//Third part Consultant
		Select selectConsultant = new Select(driver.findElement(By.xpath("//div/select[@id='ddlthirdpartyConsultant']")));
		selectConsultant.selectByVisibleText("KPMG");
		
		//EN/NN
		Select selectEnnn = new Select(driver.findElement(By.xpath("//div/select[@id='ddlENNN']")));
		selectEnnn.selectByVisibleText("EN");
		
		//RFP/RFI issue date
		WebElement cal2= driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtRFPRFIssueDateDateDatePickerImage']"));
		cal2.click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtRFPRFIssueDateDateDatePickerFrame']"))));
		datePicker("19");
		driver.switchTo().window(mainWindowHandler);
		
		//Geography 
		Select selectGeo = new Select(driver.findElement(By.xpath("//div/select[@id='ddlGeography']")));
		selectGeo.selectByVisibleText("Europe");
		
		//Submission date
		WebElement cal3= driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtSubmissionDateDateDatePickerImage']"));
		cal3.click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtSubmissionDateDateDatePickerFrame']"))));
		datePicker("30");
		driver.switchTo().window(mainWindowHandler);
	}

	/*@Then("^Message displayed Deal Successfully Created$")
	public void message_displayed_Deal_Successfully_Created() throws Throwable {
		wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/span[@id='lblDealNo']")));
	    
	    String dealNumber = driver.findElement(By.xpath("//div/span[@id='lblDealNo']")).getText();
	    System.out.println(" %%%%%%%%%% "+dealNumber);
	    assertTrue(("Deal Successfully Created"+dealNumber),driver.findElement(By.xpath("//div/span[@id='lblDealNo']")).isDisplayed());
	    
	    // After verify the attachment and SPOC button enablement
	    
	  //verify Attach button is enabled
	  		assertEquals(driver.findElement(By.xpath("//div/input[@id='btnAttach']")).isEnabled(),true);
	  		
	  		//verify SPOCs button is enabled
	  		assertEquals(driver.findElement(By.xpath("//div/input[@id='btnSPOCSelection']")).isEnabled(), true);
	    
	       	    
	}
	
	@And("^User click Save button$")
	public void user_click_Save_button() throws Throwable {
		//Press save button
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleIs("Smart Deal - KIF"));
		try{
			driver.findElement(By.xpath("//div/input[@id='btnKIFSave']")).click();
			}catch(UnhandledAlertException e){
			System.out.println("ISSUE WITH ALERT BOX");
		}
	    
	}

	@Then("^Message Alert displayed Enter all mandatory fields$")
	public void message_Alert_displayed_Enter_all_mandatory_fields() throws Throwable {
	 //verify the text present on alert message
		String ver_text = "Please fill all mandatory fields and save again.";
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		assertTrue(alert.getText().contains(ver_text));
		alert.accept();
		
	}
	*/
	

	public void datePicker(String date){
		WebElement table = driver.findElement(By.xpath("//div[@id='DatePickerDiv']/div/div/div[@class='ms-picker-body']/table[@class='ms-picker-table']/tbody"));
		List<WebElement> validColumns=null;
			//For any other valid date
			// WebElement validColumn = table.findElement(By.xpath("//td[@class='ms-picker-daycenter']/a[contains(text(), date)]"));
			 //validColumn.click();
			 validColumns = table.findElements(By.cssSelector("td.ms-picker-daycenter"));
			 for(WebElement cell:validColumns){
				 String cellvalue=cell.findElement(By.tagName("a")).getText();
				 System.out.println(cellvalue);
				 if(date.equals(cellvalue)){
					 	
						System.out.println("matched");
						cell.click();
						break;
				 }
			 }
		 			 
		}
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@When("^User select Customer Vertical as \"([^\"]*)\"$")
	public void user_select_Customer_Vertical_as(String arg1) throws Throwable {
	    // User will select either EAS or SAP value from dropdown
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleIs("Smart Deal - KIF"));
		Select selectVertical = new Select(driver.findElement(By.xpath("//div/select[@id='ddlServiceLines']")));
		selectVertical.selectByVisibleText(arg1);
	}

	@Then("^another related dropdown appear$")
	public void another_related_dropdown_appear() throws Throwable {
	    // validate related dropdown should will visible after selecting customer vertical
		
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/select[@id='ddlVBUEASSupport']")));
		assertTrue("Related Dropdown Exist",driver.findElement(By.xpath("//div/select[@id='ddlVBUEASSupport']")).isDisplayed());
	}

	

	@When("^User select Vertical as other$")
	public void user_select_Vertical_as_other() throws Throwable {
	    // Select Vertical field value as other
		Select selectVertical = new Select(driver.findElement(By.xpath("//div/select[@id='ddlVertical']")));
		selectVertical.selectByVisibleText("Other (please specify)");
	}

	@Then("^Specify other input field displayed$")
	public void specify_other_input_field_displayed() throws Throwable {
	    // validate other input field on selecting
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='txtspecifyOther']")));
		assertTrue("Specify Other input box exist",driver.findElement(By.xpath("//div/input[@id='txtspecifyOther']")).isDisplayed());
	}

	@When("^User select G (\\d+) ranking as Yes$")
	public void user_select_G_ranking_as_Yes(int arg1) throws Throwable {
	    // Select G 2000 ranking as Yes
		Select selectRanking = new Select(driver.findElement(By.xpath("//div/select[@id='ddlWhetherPartofRanking']")));
		selectRanking.selectByVisibleText("Yes");
	}

	@Then("^Rank input field displayed$")
	public void rank_input_field_displayed() throws Throwable {
	    // Validate rank input field should displayed
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='txtRankdescription']")));
		assertTrue("If yes the Rank input box exist",driver.findElement(By.xpath("//div/input[@id='txtRankdescription']")).isDisplayed());
		
	}

	@When("^User select Third party Enabler as other$")
	public void user_select_Third_party_Enabler_as_other() throws Throwable {
	    // Select 3rd party enabler as other
		Select selectConsultant = new Select(driver.findElement(By.xpath("//div/select[@id='ddlthirdpartyConsultant']")));
		selectConsultant.selectByVisibleText("Other (please specify)");
		
	}

	@Then("^Specify other third party input field displayed$")
	public void specify_other_third_party_input_field_displayed() throws Throwable {
	    // Validate 3rd party specify other input field
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='txtspecifyotherconsultant']")));
		assertTrue("Specify other text box exist",driver.findElement(By.xpath("//div/input[@id='txtspecifyotherconsultant']")).isDisplayed());
		
	}

	@Then("^User enter remaining fields$")
	public void user_enter_remaining_fields() throws Throwable {
	    // Enter remaining mandatory fields
		String mainWindowHandler = driver.getWindowHandle();
		//Customer name
				driver.findElement(By.xpath("//div/input[@id='txtCustomer']")).sendKeys("ByAutomation");
		//Deal size
				Select selectSize = new Select(driver.findElement(By.xpath("//div/select[@id='ddlDealSize']")));
				selectSize.selectByValue("2");
				
		//Deal type
				Select selectType = new Select(driver.findElement(By.xpath("//div/select[@id='ddlDealType']")));
				selectType.selectByVisibleText("Annuity Deal");
				
		//RFP/RFI received by sales date
				
				WebElement cal = driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtRFPReceivedbySalesDateDateDatePickerImage']"));
				cal.click();
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtRFPReceivedbySalesDateDateDatePickerFrame']"))));
				datePicker("17");
				driver.switchTo().window(mainWindowHandler);
	 //EN/NN
				Select selectEnnn = new Select(driver.findElement(By.xpath("//div/select[@id='ddlENNN']")));
				selectEnnn.selectByVisibleText("EN");
				
	//RFP/RFI issue date
				WebElement cal2= driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtRFPRFIssueDateDateDatePickerImage']"));
				cal2.click();
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtRFPRFIssueDateDateDatePickerFrame']"))));
				datePicker("19");
				driver.switchTo().window(mainWindowHandler);
				
	//Geography 
				Select selectGeo = new Select(driver.findElement(By.xpath("//div/select[@id='ddlGeography']")));
				selectGeo.selectByVisibleText("Europe");
				
	//Submission date
				WebElement cal3= driver.findElement(By.xpath("//div/table/tbody/tr/td/a/img[@id='spdtSubmissionDateDateDatePickerImage']"));
				cal3.click();
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//div/table/tbody/tr/td/iframe[@id='spdtSubmissionDateDateDatePickerFrame']"))));
				datePicker("30");
				driver.switchTo().window(mainWindowHandler);
	//Specify Other * Vertical
				driver.findElement(By.xpath("//div/input[@id='txtspecifyOther']")).sendKeys("Vertical-Other");
	

	//If yes the Rank *
				driver.findElement(By.xpath("//div/input[@id='txtRankdescription']")).sendKeys("1000");
				
				
	//Specify Other * Consultant
				driver.findElement(By.xpath("//div/input[@id='txtspecifyotherconsultant']")).sendKeys("Consultant Other");
				
	}

	
}
