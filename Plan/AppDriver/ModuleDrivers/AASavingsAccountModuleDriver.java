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
public class AASavingsAccountModuleDriver extends BaseWebModuleDriver {
	public AASavingsAccountModuleDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_AccountStatement(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in Account Number 
		uiDriver.typeGlobalValue("fill_AccountStatement.txtAccount_Number", input.get("TypeGlobalValue@Account_Number"));
		
		//2. Type $data in Account Number field
		uiDriver.setValue("fill_AccountStatement.txtAccount_Number", input.get("Type@Account_Number"));
		
		//3. Type $Parama1 Date in Value Date  textbox
		uiDriver.TypeDate("fill_AccountStatement.txtValue_Date", input.get("TypeDate@Value_Date"));
		
	}
	

	/**
	*Overriding toString() method of object class to print AASavingsAccountModule
	*format string
	**/
	public String toString(){
		return "AASavingsAccountModuleDriver()";
	}
}
