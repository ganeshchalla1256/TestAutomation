/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:45
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
public class AA_AccountsDriver extends BaseWebModuleDriver {
	public AA_AccountsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_clk_reversedeal(DataRow input, DataRow output) {
		//1. Click on Reverse Deal WebElement
		uiDriver.click("act_clk_reversedeal.eltReverse_Deal");
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void act_clk_Authorisedeal(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. Click on Authorise a deal WebElement
		uiDriver.click("act_clk_Authorisedeal.eltAuthorise_a_deal");
		
	}
	
	public void act_ClickNewDeal(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on New deal WebElement
		uiDriver.click("act_ClickNewDeal.eltNew_deal");
		
	}
	
	public void act_fill_ACCOUNT_HK(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in Customer 
		uiDriver.typeGlobalValue("act_fill_ACCOUNT_HK.txtCustomer", input.get("TypeGlobalValue@Customer"));
		
		//2. Type $data in Category field
		uiDriver.setValue("act_fill_ACCOUNT_HK.txtCategory", input.get("Type@Category"));
		
		//3. Type $data in Currency field
		uiDriver.setValue("act_fill_ACCOUNT_HK.txtCurrency", input.get("Type@Currency"));
		
		//4. Click on Reconcile Acct button
		uiDriver.click("act_fill_ACCOUNT_HK.btnReconcile_Acct");
		
		//5. Set RunTime Global Value from getting the text  Account Number to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_ACCOUNT_HK.eltAccount_Number",input.get("setRunTimeGlobalValue@Account_Number"));
		
	}
	
	public void act_fill_effectiveDate(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Click on Calendar button
		uiDriver.click("act_fill_effectiveDate.btnCalendar");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//4. Select $data from the Month list
		uiDriver.select("act_fill_effectiveDate.lstMonth", input.get("Select@Month"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//6. Select $data from the Year list
		uiDriver.select("act_fill_effectiveDate.lstYear", input.get("Select@Year"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//8. Click on 16 button
		uiDriver.click("act_fill_effectiveDate.btn16");
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
	}
	
	public void act_fill_EB_FILE_UPLOAD(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Upload ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_EB_FILE_UPLOAD.eltUpload_ID",input.get("setRunTimeGlobalValue@Upload_ID"));
		
		//4. Type $data in Upload Type field
		uiDriver.setValue("act_fill_EB_FILE_UPLOAD.txtUpload_Type", input.get("Type@Upload_Type"));
		
		//5. Send Key Action $Parama1 at Upload Type 
		uiDriver.sendKeyEvents("act_fill_EB_FILE_UPLOAD.txtUpload_Type", input.get("SendKeyAction@Upload_Type"));
		
		//6. Type $data in Description field
		uiDriver.setValue("act_fill_EB_FILE_UPLOAD.txtDescription", input.get("Type@Description"));
		
		//7. Type $data in Target Company field
		uiDriver.setValue("act_fill_EB_FILE_UPLOAD.txtTarget_Company", input.get("Type@Target_Company"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_Accounts
	*format string
	**/
	public String toString(){
		return "AA_AccountsDriver()";
	}
}
