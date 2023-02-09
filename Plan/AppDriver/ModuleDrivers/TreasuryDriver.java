/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:04
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
public class TreasuryDriver extends BaseWebModuleDriver {
	public TreasuryDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_DE_HEADER_Selection_Criteria(DataRow input, DataRow output) {
		//1. Type $Parama1 Date in VALUE.DATE  textbox
		uiDriver.TypeDate("fill_DE_HEADER_Selection_Criteria.txtVALUE_DATE", input.get("TypeDate@VALUE_DATE"));
		
		//2. Type $data in MESSAGE.TYPE field
		uiDriver.setValue("fill_DE_HEADER_Selection_Criteria.txtMESSAGE_TYPE", input.get("Type@MESSAGE_TYPE"));
		
		//3. Enter global value for the key $Parama1 in TRANSACTION REF 
		uiDriver.typeGlobalValue("fill_DE_HEADER_Selection_Criteria.txtTRANSACTION_REF", input.get("TypeGlobalValue@TRANSACTION_REF"));
		
		//4. Type $data in DISPOSITION field
		uiDriver.setValue("fill_DE_HEADER_Selection_Criteria.txtDISPOSITION", input.get("Type@DISPOSITION"));
		
		//5. Enter global value for the key $Parama1 in ID 
		uiDriver.typeGlobalValue("fill_DE_HEADER_Selection_Criteria.txtID", input.get("TypeGlobalValue@ID"));
		
	}
	
	public void act_waitrefresh_DFE_INTRF_LOG(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. WaitandRefresh Edit $Parama1
		uiDriver.waitandRefresh("act_waitrefresh_DFE_INTRF_LOG.eltEdit",input.get("WaitandRefresh@Edit"));
		
		//3. Set RunTime Global Value from getting the text  Store_DCId to $Parama1
		uiDriver.setRunTimeGlobalValue("act_waitrefresh_DFE_INTRF_LOG.txtStore_DCId",input.get("setRunTimeGlobalValue@Store_DCId"));
		
		//4. Click Edit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_waitrefresh_DFE_INTRF_LOG.txtEdit",input.get("ClickWithSkip@Edit"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void act_verify_delivery_message(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltMessages",input.get("ClickWithSkip@Messages"));
		
		//3. Click Delivery if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery",input.get("ClickWithSkip@Delivery"));
		
		//4. Click Delivery Ref.1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery_Ref_1",input.get("ClickWithSkip@Delivery_Ref_1"));
		
		//5. Click Delivery Ref.2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery_Ref_2",input.get("ClickWithSkip@Delivery_Ref_2"));
		
		//6. Click Delivery Ref.3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery_Ref_3",input.get("ClickWithSkip@Delivery_Ref_3"));
		
		//7. Click Delivery Ref.4 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery_Ref_4",input.get("ClickWithSkip@Delivery_Ref_4"));
		
		//8. Click Advice Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Details",input.get("ClickWithSkip@Advice_Details"));
		
		//9. Click Advice Reference.1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Reference_1",input.get("ClickWithSkip@Advice_Reference_1"));
		
		//10. Click Advice Reference.2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Reference_2",input.get("ClickWithSkip@Advice_Reference_2"));
		
		//11. Click Advice Reference.3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Reference_3",input.get("ClickWithSkip@Advice_Reference_3"));
		
		//12. Click Advice Reference.4 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Reference_4",input.get("ClickWithSkip@Advice_Reference_4"));
		
		//13. Click ContextEnq if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContextEnq",input.get("ClickWithSkip@ContextEnq"));
		
		//14. Click Context Enquiry if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContext_Enquiry",input.get("ClickWithSkip@Context_Enquiry"));
		
		//15. Click ContextEnq Amend if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContextEnq_Amend",input.get("ClickWithSkip@ContextEnq_Amend"));
		
		//16. Click ContextEnq Free Format if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContextEnq_Free_Format",input.get("ClickWithSkip@ContextEnq_Free_Format"));
		
		//17. Click Context Enquiry FXAT if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContext_Enquiry_FXAT",input.get("ClickWithSkip@Context_Enquiry_FXAT"));
		
		//18. Click Context Enquiry FWD if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContext_Enquiry_FWD",input.get("ClickWithSkip@Context_Enquiry_FWD"));
		
		//19. Click Advice Reference if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltAdvice_Reference",input.get("ClickWithSkip@Advice_Reference"));
		
		//20. Click Delivery Reference if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltDelivery_Reference",input.get("ClickWithSkip@Delivery_Reference"));
		
		//21. Click Confirm Sent.2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltConfirm_Sent_2",input.get("ClickWithSkip@Confirm_Sent_2"));
		
		//22. Click Confirm Sent.3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltConfirm_Sent_3",input.get("ClickWithSkip@Confirm_Sent_3"));
		
		//23. Click ContEnq if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltContEnq",input.get("ClickWithSkip@ContEnq"));
		
		//24. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#2"));
		
		//25. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//26. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//27. Click View Message if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltView_Message",input.get("ClickWithSkip@View_Message"));
		
		//28. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//29. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#1"));
		
		//30. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//31. Click View Delivery if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltView_Delivery",input.get("ClickWithSkip@View_Delivery"));
		
		//32. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//33. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#3"));
		
		//34. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//35. Click Delivery Preview if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.btnDelivery_Preview",input.get("ClickWithSkip@Delivery_Preview"));
		
		//36. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
		//37. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#4"));
		
		//38. Click Preview Message if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltPreview_Message",input.get("ClickWithSkip@Preview_Message"));
		
		//39. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#8"));
		
		//40. Click Preview Message Swift if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_delivery_message.eltPreview_Message_Swift",input.get("ClickWithSkip@Preview_Message_Swift"));
		
		//41. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#7"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Treasury
	*format string
	**/
	public String toString(){
		return "TreasuryDriver()";
	}
}
