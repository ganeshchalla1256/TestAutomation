/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:37
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
public class Mis_DealsDriver extends BaseWebModuleDriver {
	public Mis_DealsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_TransactionrefId(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Type $data in Transaction Ref field
		uiDriver.setValue("fill_TransactionrefId.txtTransaction_Ref", input.get("Type@Transaction_Ref"));
		
		//3. Enter global value for the key $Parama1 in Transaction Ref 
		uiDriver.typeGlobalValue("fill_TransactionrefId.txtTransaction_Ref", input.get("TypeGlobalValue@Transaction_Ref"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Mis_Deals
	*format string
	**/
	public String toString(){
		return "Mis_DealsDriver()";
	}
}
