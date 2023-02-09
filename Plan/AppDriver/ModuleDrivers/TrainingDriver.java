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
public class TrainingDriver extends BaseWebModuleDriver {
	public TrainingDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_Clk_ViewButton(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on VIEW Link
		uiDriver.click("act_Clk_ViewButton.lnkVIEW");
		
	}
	

	/**
	*Overriding toString() method of object class to print Training
	*format string
	**/
	public String toString(){
		return "TrainingDriver()";
	}
}
