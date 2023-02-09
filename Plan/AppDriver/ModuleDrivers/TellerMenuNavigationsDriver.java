/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:20
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
public class TellerMenuNavigationsDriver extends BaseWebModuleDriver {
	public TellerMenuNavigationsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_Navigate_Find_AccountDeposit(DataRow input, DataRow output) {
		//1. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//2. Click User Menu if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltUser_Menu",input.get("ClickWithSkip@User_Menu"));
		
		//3. Click Retail Operations if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltRetail_Operations",input.get("ClickWithSkip@Retail_Operations"));
		
		//4. Click Find Account if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltFind_Account",input.get("ClickWithSkip@Find_Account"));
		
		//5. Click Find Deposit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltFind_Deposit",input.get("ClickWithSkip@Find_Deposit"));
		
		//6. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#1"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//8. Click Authorised if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltAuthorised",input.get("ClickWithSkip@Authorised"));
		
		//9. Click Unauthorised if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltUnauthorised",input.get("ClickWithSkip@Unauthorised"));
		
		//10. Type Arrangement $Parama1
		uiDriver.setValue("act_Navigate_Find_AccountDeposit.eltArrangement", input.get("Type@Arrangement"));
		
		//11. Enter global value for the key $Parama1 in Arrangement 
		uiDriver.typeGlobalValue("act_Navigate_Find_AccountDeposit.eltArrangement", input.get("TypeGlobalValue@Arrangement"));
		
		//12. Type Owner $Parama1
		uiDriver.setValue("act_Navigate_Find_AccountDeposit.eltOwner", input.get("Type@Owner"));
		
		//13. Enter global value for the key $Parama1 in Owner 
		uiDriver.typeGlobalValue("act_Navigate_Find_AccountDeposit.eltOwner", input.get("TypeGlobalValue@Owner"));
		
		//14. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltFind",input.get("ClickWithSkip@Find"));
		
		//15. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//16. Click Overview if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_Find_AccountDeposit.eltOverview",input.get("ClickWithSkip@Overview"));
		
		//17. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#2"));
		
		//18. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
	}
	

	/**
	*Overriding toString() method of object class to print TellerMenuNavigations
	*format string
	**/
	public String toString(){
		return "TellerMenuNavigationsDriver()";
	}
}
