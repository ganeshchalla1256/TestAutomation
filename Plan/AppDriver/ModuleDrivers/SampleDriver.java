/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:28
Module part of 'Temenos'
Module created using Adapt Selenium Builder
******************************************************************************/
package ModuleDrivers;
import cbf.utils.DataRow;
import cbfx.ui.web.BaseWebModuleDriver;
import cbfx.ui.web.KeywordDriver;
import static cbf.engine.TestResultLogger.*;

/**
Extends BaseModuleDriver class and performs application specific operations
*/
public class SampleDriver extends BaseWebModuleDriver {
	public SampleDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_click_Validate(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Validate WebElement
		uiDriver.click("act_click_Validate.eltValidate");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_Click_Authorisebutton(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click on Authorise WebElement
		uiDriver.click("act_Click_Authorisebutton.eltAuthorise");
		
	}
	
	public void act_send_customerNo(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in MNEMONIC 
		uiDriver.typeGlobalValue("act_send_customerNo.eltMNEMONIC", input.get("TypeGlobalValue@MNEMONIC"));
		
		//3. Enter global value for the key $Parama1 in ACCOUNT.NUMBER 
		uiDriver.typeGlobalValue("act_send_customerNo.eltACCOUNT_NUMBER", input.get("TypeGlobalValue@ACCOUNT_NUMBER"));
		
		//4. Enter global value for the key $Parama1 in CUSTOMER.NO 
		uiDriver.typeGlobalValue("act_send_customerNo.eltCUSTOMER_NO", input.get("TypeGlobalValue@CUSTOMER_NO"));
		
		//5. Type CustomerNo $Parama1
		uiDriver.setValue("act_send_customerNo.eltCustomerNo", input.get("Type@CustomerNo"));
		
		//6. Type Currency $Parama1
		uiDriver.setValue("act_send_customerNo.eltCurrency", input.get("Type@Currency"));
		
		//7. Enter global value for the key $Parama1 in InternalAccountNo 
		uiDriver.typeGlobalValue("act_send_customerNo.eltInternalAccountNo", input.get("TypeGlobalValue@InternalAccountNo"));
		
		//8. Enter global value for the key $Parama1 in CustomerId 
		uiDriver.typeGlobalValue("act_send_customerNo.eltCustomerId", input.get("TypeGlobalValue@CustomerId"));
		
	}
	
	public void act_click_second_authbutton(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Click on SecondAuth WebElement
		uiDriver.click("act_click_second_authbutton.eltSecondAuth");
		
	}
	
	public void act_MoveOutOfFrame(DataRow input, DataRow output) {
		//1. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
	}
	
	public void act_commit_button(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click on Commit WebElement
		uiDriver.click("act_commit_button.eltCommit");
		
	}
	
	public void act_click_selection_screen(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Click on Selection Screen WebElement
		uiDriver.click("act_click_selection_screen.eltSelection_Screen");
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
	}
	
	public void act_click_find(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Find WebElement
		uiDriver.click("act_click_find.eltFind");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Sample
	*format string
	**/
	public String toString(){
		return "SampleDriver()";
	}
}
