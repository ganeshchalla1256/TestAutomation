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
public class AA_DepositsDriver extends BaseWebModuleDriver {
	public AA_DepositsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_accountno(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Account No 
		uiDriver.typeGlobalValue("fill_accountno.txtAccount_No", input.get("TypeGlobalValue@Account_No"));
		
		//3. Type $data in Message Type field
		uiDriver.setValue("fill_accountno.txtMessage_Type", input.get("Type@Message_Type"));
		
		//4. Type $data in Account No field
		uiDriver.setValue("fill_accountno.txtAccount_No", input.get("Type@Account_No"));
		
		//5. Type $Parama1 Date in Date Time Stamp  textbox
		uiDriver.TypeDate("fill_accountno.txtDate_Time_Stamp", input.get("TypeDate@Date_Time_Stamp"));
		
	}
	
	public void fill_AccountID(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Account Id 
		uiDriver.typeGlobalValue("fill_AccountID.txtAccount_Id", input.get("TypeGlobalValue@Account_Id"));
		
		//3. Type $data in Account Id field
		uiDriver.setValue("fill_AccountID.txtAccount_Id", input.get("Type@Account_Id"));
		
	}
	
	public void act_fill_message_time(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Select $data from the Message Type list
		uiDriver.select("act_fill_message_time.lstMessage_Type", input.get("Select@Message_Type"));
		
		//3. Select $data from the Send Message list
		uiDriver.select("act_fill_message_time.lstSend_Message", input.get("Select@Send_Message"));
		
		//4. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//5. Type $data in Message Time 1 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_1", input.get("Type@Message_Time_1"));
		
		//6. Click Expand Multi 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_message_time.btnExpand_Multi_1",input.get("ClickWithSkip@Expand_Multi_1"));
		
		//7. Type $data in Message Time 2 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_2", input.get("Type@Message_Time_2"));
		
		//8. Click Expand Multi 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_message_time.btnExpand_Multi_2",input.get("ClickWithSkip@Expand_Multi_2"));
		
		//9. Type $data in Message Time 3 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_3", input.get("Type@Message_Time_3"));
		
		//10. Click Expand Multi 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_message_time.btnExpand_Multi_3",input.get("ClickWithSkip@Expand_Multi_3"));
		
		//11. Type $data in Message Time 4 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_4", input.get("Type@Message_Time_4"));
		
		//12. Type $data in Message Time 5 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_5", input.get("Type@Message_Time_5"));
		
		//13. Type $data in Message Time 6 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_6", input.get("Type@Message_Time_6"));
		
		//14. Type $data in Message Time 7 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_7", input.get("Type@Message_Time_7"));
		
		//15. Type $data in Message Time 8 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_8", input.get("Type@Message_Time_8"));
		
		//16. Type $data in Message Time 9 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_9", input.get("Type@Message_Time_9"));
		
		//17. Type $data in Message Time 10 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_10", input.get("Type@Message_Time_10"));
		
		//18. Type $data in Message Time 11 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_11", input.get("Type@Message_Time_11"));
		
		//19. Type $data in Message Time 12 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_12", input.get("Type@Message_Time_12"));
		
		//20. Type $data in Message Time 13 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_13", input.get("Type@Message_Time_13"));
		
		//21. Type $data in Message Time 14 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_14", input.get("Type@Message_Time_14"));
		
		//22. Type $data in Message Time 15 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_15", input.get("Type@Message_Time_15"));
		
		//23. Type $data in Message Time 16 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_16", input.get("Type@Message_Time_16"));
		
		//24. Type $data in Message Time 17 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_17", input.get("Type@Message_Time_17"));
		
		//25. Type $data in Message Time 18 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_18", input.get("Type@Message_Time_18"));
		
		//26. Type $data in Message Time 19 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_19", input.get("Type@Message_Time_19"));
		
		//27. Type $data in Message Time 20 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_20", input.get("Type@Message_Time_20"));
		
		//28. Type $data in Message Time 21 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_21", input.get("Type@Message_Time_21"));
		
		//29. Type $data in Message Time 22 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_22", input.get("Type@Message_Time_22"));
		
		//30. Type $data in Message Time 23 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_23", input.get("Type@Message_Time_23"));
		
		//31. Type $data in Message Time 24 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_24", input.get("Type@Message_Time_24"));
		
		//32. Type $data in Message Time 25 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_25", input.get("Type@Message_Time_25"));
		
		//33. Type $data in Message Time 26 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_26", input.get("Type@Message_Time_26"));
		
		//34. Type $data in Message Time 27 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_27", input.get("Type@Message_Time_27"));
		
		//35. Type $data in Message Time 28 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_28", input.get("Type@Message_Time_28"));
		
		//36. Type $data in Message Time 29 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_29", input.get("Type@Message_Time_29"));
		
		//37. Type $data in Message Time 30 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_30", input.get("Type@Message_Time_30"));
		
		//38. Type $data in Message Time 31 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_31", input.get("Type@Message_Time_31"));
		
		//39. Type $data in Message Time 32 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_32", input.get("Type@Message_Time_32"));
		
		//40. Type $data in Message Time 33 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_33", input.get("Type@Message_Time_33"));
		
		//41. Type $data in Message Time 34 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_34", input.get("Type@Message_Time_34"));
		
		//42. Type $data in Message Time 35 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_35", input.get("Type@Message_Time_35"));
		
		//43. Type $data in Message Time 36 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_36", input.get("Type@Message_Time_36"));
		
		//44. Type $data in Message Time 37 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_37", input.get("Type@Message_Time_37"));
		
		//45. Type $data in Message Time 38 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_38", input.get("Type@Message_Time_38"));
		
		//46. Type $data in Message Time 39 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_39", input.get("Type@Message_Time_39"));
		
		//47. Type $data in Message Time 40 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_40", input.get("Type@Message_Time_40"));
		
		//48. Type $data in Message Time 41 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_41", input.get("Type@Message_Time_41"));
		
		//49. Type $data in Message Time 42 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_42", input.get("Type@Message_Time_42"));
		
		//50. Type $data in Message Time 43 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_43", input.get("Type@Message_Time_43"));
		
		//51. Type $data in Message Time 44 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_44", input.get("Type@Message_Time_44"));
		
		//52. Type $data in Message Time 45 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_45", input.get("Type@Message_Time_45"));
		
		//53. Type $data in Message Time 46 field
		uiDriver.setValue("act_fill_message_time.txtMessage_Time_46", input.get("Type@Message_Time_46"));
		
		//54. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_Deposits
	*format string
	**/
	public String toString(){
		return "AA_DepositsDriver()";
	}
}
