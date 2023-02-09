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
public class LiasionDriver extends BaseWebModuleDriver {
	public LiasionDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_arrangement(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Arrangement 
		uiDriver.typeGlobalValue("act_fill_arrangement.eltArrangement", input.get("TypeGlobalValue@Arrangement"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Liasion
	*format string
	**/
	public String toString(){
		return "LiasionDriver()";
	}
}
