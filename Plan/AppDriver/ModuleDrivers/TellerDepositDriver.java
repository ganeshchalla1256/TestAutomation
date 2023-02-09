/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:44
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
public class TellerDepositDriver extends BaseWebModuleDriver {
	public TellerDepositDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void aa_frame_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
	}
	
	public void act_click_commit(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Commit WebElement
		uiDriver.click("act_click_commit.eltCommit");
		
	}
	

	/**
	*Overriding toString() method of object class to print TellerDeposit
	*format string
	**/
	public String toString(){
		return "TellerDepositDriver()";
	}
}
