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
public class PaymentDriver extends BaseWebModuleDriver {
	public PaymentDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void clk_DeliveryPreview_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Delivery Preview WebElement
		uiDriver.click("clk_DeliveryPreview_act.eltDelivery_Preview");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//6. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//7. Verfies that text $Parama1 is present in 202 
		uiDriver.checkText("clk_DeliveryPreview_act.elt202",input.get("AssertTextPresent@202"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//9. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow"));
		
	}
	
	public void act_click_editBtn(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click Edit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_editBtn.btnEdit",input.get("ClickWithSkip@Edit"));
		
		//3. Click Reinitiate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_editBtn.btnReinitiate",input.get("ClickWithSkip@Reinitiate"));
		
		//4. Click Delete if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_editBtn.btnDelete",input.get("ClickWithSkip@Delete"));
		
		//5. Click View if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_editBtn.btnView",input.get("ClickWithSkip@View"));
		
		//6. Click Editbutton if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_editBtn.btnEditbutton",input.get("ClickWithSkip@Editbutton"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Payment ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.eltPayment_ID",input.get("setRunTimeGlobalValue@Payment_ID"));
		
		//4. Type $data in Transaction Currency field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtTransaction_Currency", input.get("Type@Transaction_Currency"));
		
		//5. Type $data in Transaction Amount field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtTransaction_Amount", input.get("Type@Transaction_Amount"));
		
		//6. Type $data in Processing Date field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtProcessing_Date", input.get("Type@Processing_Date"));
		
		//7. Type $Parama1 Date in Processing Date  textbox
		uiDriver.TypeDate("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtProcessing_Date", input.get("TypeDate@Processing_Date"));
		
		//8. Type $data in Cheque Number field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCheque_Number", input.get("Type@Cheque_Number"));
		
		//9. Enter global value for the key $Parama1 in Cheque Number 
		uiDriver.typeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCheque_Number", input.get("TypeGlobalValue@Cheque_Number"));
		
		//10. Type $data in Debit Account Number field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Account_Number", input.get("Type@Debit_Account_Number"));
		
		//11. Enter global value for the key $Parama1 in Debit Account Number 
		uiDriver.typeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Account_Number", input.get("TypeGlobalValue@Debit_Account_Number"));
		
		//12. Type $data in Credit Account Number field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Account_Number", input.get("Type@Credit_Account_Number"));
		
		//13. Enter global value for the key $Parama1 in Credit Account Number 
		uiDriver.typeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Account_Number", input.get("TypeGlobalValue@Credit_Account_Number"));
		
		//14. Click Debit Account Number check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnDebit_Account_Number_check",input.get("ClickWithSkip@Debit_Account_Number_check"));
		
		//15. Click Credit Account Number check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnCredit_Account_Number_check",input.get("ClickWithSkip@Credit_Account_Number_check"));
		
		//16. Type $data in Debit Account Currency field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Account_Currency", input.get("Type@Debit_Account_Currency"));
		
		//17. Type $data in Credit Account Currency field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Account_Currency", input.get("Type@Credit_Account_Currency"));
		
		//18. Click Credit Exch rate method_FX contract if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnCredit_Exch_rate_method_FX_contract",input.get("ClickWithSkip@Credit_Exch_rate_method_FX_contract"));
		
		//19. Click Debit Exch rate method_FX Contract if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnDebit_Exch_rate_method_FX_Contract",input.get("ClickWithSkip@Debit_Exch_rate_method_FX_Contract"));
		
		//20. Enter global value for the key $Parama1 in Debit FX contract 
		uiDriver.typeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_FX_contract", input.get("TypeGlobalValue@Debit_FX_contract"));
		
		//21. Enter global value for the key $Parama1 in Credit FX contract 
		uiDriver.typeGlobalValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_FX_contract", input.get("TypeGlobalValue@Credit_FX_contract"));
		
		//22. Type $data in Debit Customer Spread field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Customer_Spread", input.get("Type@Debit_Customer_Spread"));
		
		//23. Type $data in Debit Treasury Rate field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Treasury_Rate", input.get("Type@Debit_Treasury_Rate"));
		
		//24. Click Debit Customer Spread check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnDebit_Customer_Spread_check",input.get("ClickWithSkip@Debit_Customer_Spread_check"));
		
		//25. Click Debit Treasury Rate check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnDebit_Treasury_Rate_check",input.get("ClickWithSkip@Debit_Treasury_Rate_check"));
		
		//26. Type $data in Credit Customer Spread field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Customer_Spread", input.get("Type@Credit_Customer_Spread"));
		
		//27. Type $data in Credit Treasury Rate field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Treasury_Rate", input.get("Type@Credit_Treasury_Rate"));
		
		//28. Click Credit Customer Spread check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnCredit_Customer_Spread_check",input.get("ClickWithSkip@Credit_Customer_Spread_check"));
		
		//29. Click Credit Treasury Rate check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnCredit_Treasury_Rate_check",input.get("ClickWithSkip@Credit_Treasury_Rate_check"));
		
		//30. Type $data in Fx Contract ID field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtFx_Contract_ID", input.get("Type@Fx_Contract_ID"));
		
		//31. Type $Parama1 Date in Debit Value Date  textbox
		uiDriver.TypeDate("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Value_Date", input.get("TypeDate@Debit_Value_Date"));
		
		//32. Click Debit Value Check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnDebit_Value_Check",input.get("ClickWithSkip@Debit_Value_Check"));
		
		//33. Type $Parama1 Date in Credit Value Date  textbox
		uiDriver.TypeDate("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Value_Date", input.get("TypeDate@Credit_Value_Date"));
		
		//34. Click Credit Value Check if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.btnCredit_Value_Check",input.get("ClickWithSkip@Credit_Value_Check"));
		
		//35. Click Additional Information if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.eltAdditional_Information",input.get("ClickWithSkip@Additional_Information"));
		
		//36. Type $data in Additional text field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtAdditional_text", input.get("Type@Additional_text"));
		
		//37. Type $data in Debit Customer Remarks field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtDebit_Customer_Remarks", input.get("Type@Debit_Customer_Remarks"));
		
		//38. Click Error Information if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.eltError_Information",input.get("ClickWithSkip@Error_Information"));
		
		//39. Select $data from the Return Reject Payment list
		uiDriver.select("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.lstReturn_Reject_Payment", input.get("Select@Return_Reject_Payment"));
		
		//40. Type $data in Return Reject Code field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtReturn_Reject_Code", input.get("Type@Return_Reject_Code"));
		
		//41. Type $data in Credit Customer Remarks field
		uiDriver.setValue("act_fill_PP_ORDER_ENTRY_CTR_BOOK_CREATE_NEW.txtCredit_Customer_Remarks", input.get("Type@Credit_Customer_Remarks"));
		
		//42. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Payment
	*format string
	**/
	public String toString(){
		return "PaymentDriver()";
	}
}
