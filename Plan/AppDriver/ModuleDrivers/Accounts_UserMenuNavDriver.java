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
public class Accounts_UserMenuNavDriver extends BaseWebModuleDriver {
	public Accounts_UserMenuNavDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Set RunTime Global Value from getting the text  Adhoc Charge Collection to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.eltAdhoc_Charge_Collection",input.get("setRunTimeGlobalValue@Adhoc_Charge_Collection"));
		
		//3. Type $data in Debit Currency field
		uiDriver.setValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtDebit_Currency", input.get("Type@Debit_Currency"));
		
		//4. Type $Parama1 Date in Debit Value Date  textbox
		uiDriver.TypeDate("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtDebit_Value_Date", input.get("TypeDate@Debit_Value_Date"));
		
		//5. Enter global value for the key $Parama1 in Debit Account 
		uiDriver.typeGlobalValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtDebit_Account", input.get("TypeGlobalValue@Debit_Account"));
		
		//6. Type $data in CreditPL field
		uiDriver.setValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtCreditPL", input.get("Type@CreditPL"));
		
		//7. Type $data in Payment Currency field
		uiDriver.setValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtPayment_Currency", input.get("Type@Payment_Currency"));
		
		//8. Type $data in Payment Amount field
		uiDriver.setValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtPayment_Amount", input.get("Type@Payment_Amount"));
		
		//9. Enter global value for the key $Parama1 in Ordering Customer 
		uiDriver.typeGlobalValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtOrdering_Customer", input.get("TypeGlobalValue@Ordering_Customer"));
		
		//10. Type $data in Payement Narrative.1 field
		uiDriver.setValue("act_fill_PAYMENT_ORDER_MUFGHK_ADHOC_CHARGE.txtPayement_Narrative_1", input.get("Type@Payement_Narrative_1"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Accounts_UserMenuNav
	*format string
	**/
	public String toString(){
		return "Accounts_UserMenuNavDriver()";
	}
}
