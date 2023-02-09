/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:20
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
public class AA_ReusableModuleDriver extends BaseWebModuleDriver {
	public AA_ReusableModuleDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void wait_SleepTime(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_ReusableModule
	*format string
	**/
	public String toString(){
		return "AA_ReusableModuleDriver()";
	}
}
