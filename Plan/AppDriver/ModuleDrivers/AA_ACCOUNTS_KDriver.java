/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:15
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
public class AA_ACCOUNTS_KDriver extends BaseWebModuleDriver {
	public AA_ACCOUNTS_KDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_verify_EB_CSD_LD_PO_PARAMETER_fields(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in Description 
		uiDriver.checkText("act_verify_EB_CSD_LD_PO_PARAMETER_fields.eltDescription",input.get("AssertTextPresent@Description"));
		
		//3. Verfies that text $Parama1 is present in Allow Po 
		uiDriver.checkText("act_verify_EB_CSD_LD_PO_PARAMETER_fields.eltAllow_Po",input.get("AssertTextPresent@Allow_Po"));
		
		//4. Verfies that text $Parama1 is present in Po Product.1 
		uiDriver.checkText("act_verify_EB_CSD_LD_PO_PARAMETER_fields.eltPo_Product_1",input.get("AssertTextPresent@Po_Product_1"));
		
		//5. Verfies that text $Parama1 is present in Internal Acct Categ 
		uiDriver.checkText("act_verify_EB_CSD_LD_PO_PARAMETER_fields.eltInternal_Acct_Categ",input.get("AssertTextPresent@Internal_Acct_Categ"));
		
	}
	
	public void act_TakeScreenshot_ENQ_PROCESS_STATUS(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in Process ID 
		uiDriver.typeGlobalValue("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltProcess_ID", input.get("TypeGlobalValue@Process_ID"));
		
		//2. Type Activity Status $Parama1
		uiDriver.setValue("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltActivity_Status", input.get("Type@Activity_Status"));
		
		//3. Click FIND if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltFIND",input.get("ClickWithSkip@FIND"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//5. Click Page 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltPage_2",input.get("ClickWithSkip@Page_2"));
		
		//6. Click Page 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltPage_3",input.get("ClickWithSkip@Page_3"));
		
		//7. Click Page 4 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltPage_4",input.get("ClickWithSkip@Page_4"));
		
		//8. Click Page 5 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_TakeScreenshot_ENQ_PROCESS_STATUS.eltPage_5",input.get("ClickWithSkip@Page_5"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_ENQ_CSD_ENQ_LD_PO_INAU(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Type $data in L3.LD.Reference field
		uiDriver.setValue("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.txtL3_LD_Reference", input.get("Type@L3_LD_Reference"));
		
		//3. Enter global value for the key $Parama1 in L3.LD.Reference 
		uiDriver.typeGlobalValue("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.txtL3_LD_Reference", input.get("TypeGlobalValue@L3_LD_Reference"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//5. Click FIND if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.eltFIND",input.get("ClickWithSkip@FIND"));
		
		//6. Set RunTime Global Value from getting the text  PaymentOrderID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.txtPaymentOrderID",input.get("setRunTimeGlobalValue@PaymentOrderID"));
		
		//7. Click Routing details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.eltRouting_details",input.get("ClickWithSkip@Routing_details"));
		
		//8. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//9. Click Payment System Info if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_CSD_ENQ_LD_PO_INAU.eltPayment_System_Info",input.get("ClickWithSkip@Payment_System_Info"));
		
	}
	
	public void act_click_contextenquiry_HK(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click PO Reference if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_contextenquiry_HK.btnPO_Reference",input.get("ClickWithSkip@PO_Reference"));
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//5. Click View Payment if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_contextenquiry_HK.btnView_Payment",input.get("ClickWithSkip@View_Payment"));
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_ACCOUNTS_K
	*format string
	**/
	public String toString(){
		return "AA_ACCOUNTS_KDriver()";
	}
}
