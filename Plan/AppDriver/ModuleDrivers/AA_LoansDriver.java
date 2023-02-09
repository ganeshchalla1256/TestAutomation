/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:20
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
public class AA_LoansDriver extends BaseWebModuleDriver {
	public AA_LoansDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_transactionid_concat(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. ConfigFileReadWrite TRANSFORMALTID6 $Parama1
		uiDriver.readWrite("fill_transactionid_concat.eltTRANSFORMALTID6",input.get("ConfigFileReadWrite@TRANSFORMALTID6"));
		
		//3. TypeConcatenatedGlobalValue given in $Parama1 in Gaurantee ID 
		uiDriver.typeConcatenatedGlobalValue("fill_transactionid_concat.txtGaurantee_ID", input.get("TypeConcatenatedGlobalValue@Gaurantee_ID"));
		
		//4. TypeConcatenatedGlobalValue given in $Parama1 in DE.ADDRESS 
		uiDriver.typeConcatenatedGlobalValue("fill_transactionid_concat.txtDE_ADDRESS", input.get("TypeConcatenatedGlobalValue@DE_ADDRESS"));
		
		//5. Type $data in DE.ADDRESS field
		uiDriver.setValue("fill_transactionid_concat.txtDE_ADDRESS", input.get("Type@DE_ADDRESS"));
		
		//6. TypeConcatenatedGlobalValue given in $Parama1 in ChequeNo 
		uiDriver.typeConcatenatedGlobalValue("fill_transactionid_concat.txtChequeNo", input.get("TypeConcatenatedGlobalValue@ChequeNo"));
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_Loans
	*format string
	**/
	public String toString(){
		return "AA_LoansDriver()";
	}
}
