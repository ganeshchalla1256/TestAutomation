/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:47
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
public class GenericGuaranteeDriver extends BaseWebModuleDriver {
	public GenericGuaranteeDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_click_newDeal(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click New Deal if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_newDeal.eltNew_Deal",input.get("ClickWithSkip@New_Deal"));
		
	}
	

	/**
	*Overriding toString() method of object class to print GenericGuarantee
	*format string
	**/
	public String toString(){
		return "GenericGuaranteeDriver()";
	}
}
