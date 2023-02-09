/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:18
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
public class NewDriver extends BaseWebModuleDriver {
	public NewDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void switchWindow(DataRow input, DataRow output) {
		//1. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//2. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void swtFrame(DataRow input, DataRow output) {
		//1. SwitchToFrame
		uiDriver.SwitchFrame();
		
	}
	
	public void ClickAcceptOverride(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. clickIfPresent Accept Overrides
		uiDriver.clickIfPresent("ClickAcceptOverride.eltAccept_Overrides");
		
	}
	

	/**
	*Overriding toString() method of object class to print New
	*format string
	**/
	public String toString(){
		return "NewDriver()";
	}
}
