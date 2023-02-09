/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:22
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
public class TellerOperationsDriver extends BaseWebModuleDriver {
	public TellerOperationsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_TELLER_LCY_CASHIN(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Cash Deposit ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TELLER_LCY_CASHIN.txtCash_Deposit_ID",input.get("setRunTimeGlobalValue@Cash_Deposit_ID"));
		
		//4. Type $data in Deposit Amount field
		uiDriver.setValue("act_fill_TELLER_LCY_CASHIN.txtDeposit_Amount", input.get("Type@Deposit_Amount"));
		
		//5. Send Key Action $Parama1 at Deposit Amount 
		uiDriver.sendKeyEvents("act_fill_TELLER_LCY_CASHIN.txtDeposit_Amount", input.get("SendKeyAction@Deposit_Amount"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Enter global value for the key $Parama1 in Credit Account 
		uiDriver.typeGlobalValue("act_fill_TELLER_LCY_CASHIN.txtCredit_Account", input.get("TypeGlobalValue@Credit_Account"));
		
		//8. Type $data in Credit Account field
		uiDriver.setValue("act_fill_TELLER_LCY_CASHIN.txtCredit_Account", input.get("Type@Credit_Account"));
		
	}
	

	/**
	*Overriding toString() method of object class to print TellerOperations
	*format string
	**/
	public String toString(){
		return "TellerOperationsDriver()";
	}
}
