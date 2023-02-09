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
public class RFD_NRE_fixedDepositDriver extends BaseWebModuleDriver {
	public RFD_NRE_fixedDepositDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_SecuredLimitID_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type $data in Secured Limit Id field
		uiDriver.setValue("fill_SecuredLimitID_act.txtSecured_Limit_Id", input.get("Type@Secured_Limit_Id"));
		
		//3. TypeConcatenatedGlobalValue given in $Parama1 in Secured Limit Id 
		uiDriver.typeConcatenatedGlobalValue("fill_SecuredLimitID_act.txtSecured_Limit_Id", input.get("TypeConcatenatedGlobalValue@Secured_Limit_Id"));
		
	}
	
	public void clk_reverseadealFromlive_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Reverses a deal WebElement
		uiDriver.click("clk_reverseadealFromlive_act.eltReverses_a_deal");
		
	}
	
	public void fill_transactionRefID_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Transaction ID 
		uiDriver.typeGlobalValue("fill_transactionRefID_act.txtTransaction_ID", input.get("TypeGlobalValue@Transaction_ID"));
		
		//3. Type $data in Status field
		uiDriver.setValue("fill_transactionRefID_act.txtStatus", input.get("Type@Status"));
		
	}
	

	/**
	*Overriding toString() method of object class to print RFD_NRE_fixedDeposit
	*format string
	**/
	public String toString(){
		return "RFD_NRE_fixedDepositDriver()";
	}
}
