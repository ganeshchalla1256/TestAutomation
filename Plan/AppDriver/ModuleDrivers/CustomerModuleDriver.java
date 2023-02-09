/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:19
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
public class CustomerModuleDriver extends BaseWebModuleDriver {
	public CustomerModuleDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_click_delete(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click Delete if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_delete.eltDelete",input.get("ClickWithSkip@Delete"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. HandleAlertMessage DELETES_A_DEAL $Parama1
		uiDriver.alertMsg("act_click_delete.eltDELETES_A_DEAL",input.get("AlertMessageHandle@DELETES_A_DEAL"));
		
		//5. DELETES_A_DEAL $Parama1
		//uiDriver.alertMsg("act_click_delete.eltDELETES_A_DEAL",input.get("AlertMessageHandle@DELETES_A_DEAL"));
		
		//6. AlertMessageHandle DELETES_A_DEAL $Parama1
		//uiDriver.alertMsg("act_click_delete.eltDELETES_A_DEAL",input.get("AlertMessageHandle@DELETES_A_DEAL"));
		
	}
	

	/**
	*Overriding toString() method of object class to print CustomerModule
	*format string
	**/
	public String toString(){
		return "CustomerModuleDriver()";
	}
}
