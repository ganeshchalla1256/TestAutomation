/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:51
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
public class DepositDriver extends BaseWebModuleDriver {
	public DepositDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void NewActivity(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click New Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltNew_Activity",input.get("ClickWithSkip@New_Activity"));
		
		//3. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//5. Click Update Account Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltUpdate_Account_Details",input.get("ClickWithSkip@Update_Account_Details"));
		
		//6. Click Change Debit Interest Condition if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltChange_Debit_Interest_Condition",input.get("ClickWithSkip@Change_Debit_Interest_Condition"));
		
		//7. Click Update Limit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltUpdate_Limit",input.get("ClickWithSkip@Update_Limit"));
		
		//8. Click Debit Interest for Int Current Acc if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltDebit_Interest_for_Int_Current_Acc",input.get("ClickWithSkip@Debit_Interest_for_Int_Current_Acc"));
		
		//9. Click Update Limit for Int Current Acc if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltUpdate_Limit_for_Int_Current_Acc",input.get("ClickWithSkip@Update_Limit_for_Int_Current_Acc"));
		
		//10. Click Change Commitment Term if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltChange_Commitment_Term",input.get("ClickWithSkip@Change_Commitment_Term"));
		
		//11. Click Change Schedule if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltChange_Schedule",input.get("ClickWithSkip@Change_Schedule"));
		
		//12. Click Change Deposit Interest (User) if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltChange_Deposit_Interest_User_",input.get("ClickWithSkip@Change_Deposit_Interest_User_"));
		
		//13. Click Change Customer if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltChange_Customer",input.get("ClickWithSkip@Change_Customer"));
		
		//14. Click Nominee regestration if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltNominee_regestration",input.get("ClickWithSkip@Nominee_regestration"));
		
		//15. Click Activity to update posting Restriction if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltActivity_to_update_posting_Restriction",input.get("ClickWithSkip@Activity_to_update_posting_Restriction"));
		
		//16. Click Redeem Arrangement if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltRedeem_Arrangement",input.get("ClickWithSkip@Redeem_Arrangement"));
		
		//17. Click Close Arrangement if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltClose_Arrangement",input.get("ClickWithSkip@Close_Arrangement"));
		
		//18. Click Update Settlement Instructions if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("NewActivity.eltUpdate_Settlement_Instructions",input.get("ClickWithSkip@Update_Settlement_Instructions"));
		
	}
	
	public void fill_customer_registration_for_MT998(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Type $data in Mufg Application.1 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_1", input.get("Type@Mufg_Application_1"));
		
		//3. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#1"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//5. Type Mufg Application.2 $Parama1
		uiDriver.setValue("fill_customer_registration_for_MT998.eltMufg_Application_2", input.get("Type@Mufg_Application_2#1"));
		
		//6. Click Delete Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltDelete_Multivalue_Field",input.get("ClickWithSkip@Delete_Multivalue_Field"));
		
		//7. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#2"));
		
		//8. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#2"));
		
		//9. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#3"));
		
		//10. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#3"));
		
		//11. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#4"));
		
		//12. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#4"));
		
		//13. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#5"));
		
		//14. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#5"));
		
		//15. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#6"));
		
		//16. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#6"));
		
		//17. Click Add Multivalue Field if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltAdd_Multivalue_Field",input.get("ClickWithSkip@Add_Multivalue_Field#7"));
		
		//18. Type $data in Mufg Application.2 field
		uiDriver.setValue("fill_customer_registration_for_MT998.txtMufg_Application_2", input.get("Type@Mufg_Application_2#7"));
		
		//19. Enter global value for the key $Parama1 in GP Account No.1 
		uiDriver.typeGlobalValue("fill_customer_registration_for_MT998.txtGP_Account_No_1", input.get("TypeGlobalValue@GP_Account_No_1"));
		
		//20. Click Expand Multivalue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltExpand_Multivalue",input.get("ClickWithSkip@Expand_Multivalue"));
		
		//21. Enter global value for the key $Parama1 in GP Account No.2 
		uiDriver.typeGlobalValue("fill_customer_registration_for_MT998.txtGP_Account_No_2", input.get("TypeGlobalValue@GP_Account_No_2"));
		
		//22. Click Delete Multivalue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltDelete_Multivalue",input.get("ClickWithSkip@Delete_Multivalue"));
		
		//23. Click Expand Multivalue 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltExpand_Multivalue_1",input.get("ClickWithSkip@Expand_Multivalue_1#1"));
		
		//24. Click Expand Multivalue 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltExpand_Multivalue_1",input.get("ClickWithSkip@Expand_Multivalue_1#2"));
		
		//25. Click Expand Multivalue 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_customer_registration_for_MT998.eltExpand_Multivalue_1",input.get("ClickWithSkip@Expand_Multivalue_1#3"));
		
		//26. Enter global value for the key $Parama1 in GP Account No.3 
		uiDriver.typeGlobalValue("fill_customer_registration_for_MT998.txtGP_Account_No_3", input.get("TypeGlobalValue@GP_Account_No_3"));
		
		//27. Enter global value for the key $Parama1 in GP Account No.4 
		uiDriver.typeGlobalValue("fill_customer_registration_for_MT998.txtGP_Account_No_4", input.get("TypeGlobalValue@GP_Account_No_4"));
		
		//28. Enter global value for the key $Parama1 in GP Account No.5 
		uiDriver.typeGlobalValue("fill_customer_registration_for_MT998.txtGP_Account_No_5", input.get("TypeGlobalValue@GP_Account_No_5"));
		
	}
	
	public void act_fill_TELLER_CSD_FCY_CASHDEP(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Teller ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TELLER_CSD_FCY_CASHDEP.eltTeller_ID",input.get("setRunTimeGlobalValue@Teller_ID"));
		
		//4. Type $data in Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtCurrency", input.get("Type@Currency"));
		
		//5. Type $data in Credit Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtCredit_Currency", input.get("Type@Credit_Currency"));
		
		//6. Send Key Action $Parama1 at Credit Currency 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_FCY_CASHDEP.txtCredit_Currency", input.get("SendKeyAction@Credit_Currency"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//8. Type $data in Deposit Amount field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtDeposit_Amount", input.get("Type@Deposit_Amount"));
		
		//9. Enter global value for the key $Parama1 in Account 
		uiDriver.typeGlobalValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtAccount", input.get("TypeGlobalValue@Account"));
		
		//10. Type $data in Account field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtAccount", input.get("Type@Account"));
		
		//11. Type $data in Exchange Rate field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtExchange_Rate", input.get("Type@Exchange_Rate"));
		
		//12. Type $data in Narrative field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtNarrative", input.get("Type@Narrative"));
		
		//13. Click Waive Charges None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHDEP.eltWaive_Charges_None",input.get("ClickWithSkip@Waive_Charges_None"));
		
		//14. Click Waive Charges No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHDEP.eltWaive_Charges_No",input.get("ClickWithSkip@Waive_Charges_No"));
		
		//15. Click Waive Charges Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHDEP.eltWaive_Charges_Yes",input.get("ClickWithSkip@Waive_Charges_Yes"));
		
		//16. Type $data in FX Contract Number field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtFX_Contract_Number", input.get("Type@FX_Contract_Number"));
		
		//17. Type $data in Remarks field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHDEP.txtRemarks", input.get("Type@Remarks"));
		
		//18. Dynamic Wait
		uiDriver.dynamicWait();
		
		//19. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//20. Click Validate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHDEP.eltValidate",input.get("ClickWithSkip@Validate"));
		
		//21. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//22. Verfies that text $Parama1 is present in Net Credit 
		uiDriver.checkText("act_fill_TELLER_CSD_FCY_CASHDEP.eltNet_Credit",input.get("AssertTextPresent@Net_Credit"));
		
		//23. Verfies that text $Parama1 is present in New Cust Bal 
		uiDriver.checkText("act_fill_TELLER_CSD_FCY_CASHDEP.eltNew_Cust_Bal",input.get("AssertTextPresent@New_Cust_Bal"));
		
		//24. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
	}
	
	public void act_fill_ENQ_STMT_ENT_BOOK(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Enter global value for the key $Parama1 in Account 
		uiDriver.typeGlobalValue("act_fill_ENQ_STMT_ENT_BOOK.txtAccount", input.get("TypeGlobalValue@Account"));
		
		//4. Type $data in Account field
		uiDriver.setValue("act_fill_ENQ_STMT_ENT_BOOK.txtAccount", input.get("Type@Account"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Type $Parama1 Date in Booking Date  textbox
		uiDriver.TypeDate("act_fill_ENQ_STMT_ENT_BOOK.txtBooking_Date", input.get("TypeDate@Booking_Date"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void set_runtime_effective_date(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Set RunTime Global Value from getting the text  Alternate ID to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.txtAlternate_ID",input.get("setRunTimeGlobalValue@Alternate_ID"));
		
		//3. Set RunTime Global Value from getting the text  Effective Date to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltEffective_Date",input.get("setRunTimeGlobalValue@Effective_Date"));
		
		//4. ConfigFileReadWrite TRANSFORMDATE $Parama1
		uiDriver.readWrite("set_runtime_effective_date.eltTRANSFORMDATE",input.get("ConfigFileReadWrite@TRANSFORMDATE"));
		
		//5. Set RunTime Global Value from getting the text  FT Number to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltFT_Number",input.get("setRunTimeGlobalValue@FT_Number"));
		
		//6. Set RunTime Global Value from getting the text  Po Reference to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltPo_Reference",input.get("setRunTimeGlobalValue@Po_Reference"));
		
		//7. Set RunTime Global Value from getting the text  Account Id 1 to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltAccount_Id_1",input.get("setRunTimeGlobalValue@Account_Id_1"));
		
		//8. Set RunTime Global Value from getting the text  Account Id 2 to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltAccount_Id_2",input.get("setRunTimeGlobalValue@Account_Id_2"));
		
		//9. Set RunTime Global Value from getting the text  ArpsID to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltArpsID",input.get("setRunTimeGlobalValue@ArpsID"));
		
		//10. Set RunTime Global Value from getting the text  MatDate to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltMatDate",input.get("setRunTimeGlobalValue@MatDate"));
		
		//11. Set RunTime Global Value from getting the text  CO Number to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.txtCO_Number",input.get("setRunTimeGlobalValue@CO_Number"));
		
		//12. Set RunTime Global Value from getting the text  Delivery Reference to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.txtDelivery_Reference",input.get("setRunTimeGlobalValue@Delivery_Reference"));
		
		//13. Set RunTime Global Value from getting the text  CustId1 to $Parama1
		uiDriver.setRunTimeGlobalValue("set_runtime_effective_date.eltCustId1",input.get("setRunTimeGlobalValue@CustId1"));
		
	}
	
	public void act_Wait(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void act_fill_COS_PW_PROCESS_TRIGGER(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Set RunTime Global Value from getting the text  Process to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_COS_PW_PROCESS_TRIGGER.txtProcess",input.get("setRunTimeGlobalValue@Process"));
		
		//3. Type $data in Product ID field
		uiDriver.setValue("act_fill_COS_PW_PROCESS_TRIGGER.txtProduct_ID", input.get("Type@Product_ID"));
		
		//4. Type $Parama1 Date in Start Date  textbox
		uiDriver.TypeDate("act_fill_COS_PW_PROCESS_TRIGGER.txtStart_Date", input.get("TypeDate@Start_Date"));
		
		//5. Type $data in Participants field
		uiDriver.setValue("act_fill_COS_PW_PROCESS_TRIGGER.txtParticipants", input.get("Type@Participants"));
		
		//6. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Process 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtProcess", input.get("TypeGlobalValue@Process"));
		
		//3. Type $data in Activity Status field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtActivity_Status", input.get("Type@Activity_Status"));
		
		//4. Click on Find WebElement
		uiDriver.click("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltFind");
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//8. Verfies that text $Parama1 is present in New Term Deposit Creation 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltNew_Term_Deposit_Creation",input.get("AssertTextPresent@New_Term_Deposit_Creation"));
		
		//9. Click Execute Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltExecute_Activity",input.get("ClickWithSkip@Execute_Activity#1"));
		
		//10. Dynamic Wait
		uiDriver.dynamicWait();
		
		//11. Enter global value for the key $Parama1 in Deposit Account No 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtDeposit_Account_No", input.get("TypeGlobalValue@Deposit_Account_No"));
		
		//12. Enter global value for the key $Parama1 in Customer No 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtCustomer_No", input.get("TypeGlobalValue@Customer_No"));
		
		//13. Type $data in Customer Name field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtCustomer_Name", input.get("Type@Customer_Name"));
		
		//14. Type $data in Principal Amount field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtPrincipal_Amount", input.get("Type@Principal_Amount"));
		
		//15. Type $data in Interest Rate field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtInterest_Rate", input.get("Type@Interest_Rate"));
		
		//16. Type $data in Deposit Product field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtDeposit_Product", input.get("Type@Deposit_Product"));
		
		//17. Type $data in Tenor field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtTenor", input.get("Type@Tenor"));
		
		//18. Type $data in Currency field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtCurrency", input.get("Type@Currency"));
		
		//19. Enter global value for the key $Parama1 in Funding Account.1 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtFunding_Account_1", input.get("TypeGlobalValue@Funding_Account_1"));
		
		//20. Type $data in Funding Amount.1 field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtFunding_Amount_1", input.get("Type@Funding_Amount_1"));
		
		//21. Enter global value for the key $Parama1 in Settlement Acc No.1 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtSettlement_Acc_No_1", input.get("TypeGlobalValue@Settlement_Acc_No_1"));
		
		//22. Type $data in Settlement Amount.1 field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtSettlement_Amount_1", input.get("Type@Settlement_Amount_1"));
		
		//23. Type $Parama1 Date in Start Date  textbox
		uiDriver.TypeDate("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtStart_Date", input.get("TypeDate@Start_Date"));
		
		//24. Type $Parama1 Date in Maturity Date  textbox
		uiDriver.TypeDate("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtMaturity_Date", input.get("TypeDate@Maturity_Date"));
		
		//25. Type $data in Remarks field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtRemarks", input.get("Type@Remarks"));
		
		//26. Verfies that text $Parama1 is present in Decision by Marketing Checker 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltDecision_by_Marketing_Checker",input.get("AssertTextPresent@Decision_by_Marketing_Checker"));
		
		//27. Click Execute Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltExecute_Activity",input.get("ClickWithSkip@Execute_Activity#2"));
		
		//28. Click Accepted Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltAccepted_Activity",input.get("ClickWithSkip@Accepted_Activity#1"));
		
		//29. Click Rejected Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltRejected_Activity",input.get("ClickWithSkip@Rejected_Activity#1"));
		
		//30. Type $data in Rejected Reason field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtRejected_Reason", input.get("Type@Rejected_Reason#1"));
		
		//31. Verfies that text $Parama1 is present in Decision by Deposit Maker 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltDecision_by_Deposit_Maker",input.get("AssertTextPresent@Decision_by_Deposit_Maker"));
		
		//32. Click Execute Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltExecute_Activity",input.get("ClickWithSkip@Execute_Activity#3"));
		
		//33. Enter global value for the key $Parama1 in Transaction Reference 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtTransaction_Reference", input.get("TypeGlobalValue@Transaction_Reference"));
		
		//34. Click Accepted Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltAccepted_Activity",input.get("ClickWithSkip@Accepted_Activity#2"));
		
		//35. Click Rejected Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltRejected_Activity",input.get("ClickWithSkip@Rejected_Activity#2"));
		
		//36. Type $data in Rejected Reason field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtRejected_Reason", input.get("Type@Rejected_Reason#2"));
		
		//37. Enter global value for the key $Parama1 in Payment Reference 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtPayment_Reference", input.get("TypeGlobalValue@Payment_Reference"));
		
		//38. Enter global value for the key $Parama1 in TD Account No 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtTD_Account_No", input.get("TypeGlobalValue@TD_Account_No"));
		
		//39. Verfies that text $Parama1 is present in Decision by Deposit Checker 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltDecision_by_Deposit_Checker",input.get("AssertTextPresent@Decision_by_Deposit_Checker"));
		
		//40. Click Execute Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltExecute_Activity",input.get("ClickWithSkip@Execute_Activity#4"));
		
		//41. Click Accepted Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltAccepted_Activity",input.get("ClickWithSkip@Accepted_Activity#3"));
		
		//42. Click Rejected Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.eltRejected_Activity",input.get("ClickWithSkip@Rejected_Activity#3"));
		
		//43. Type $data in Rejected Reason field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_TD_PROCESS_STATUS.txtRejected_Reason", input.get("Type@Rejected_Reason#3"));
		
		//44. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_TELLER_CSD_USD_CASHDEP(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Teller ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TELLER_CSD_USD_CASHDEP.eltTeller_ID",input.get("setRunTimeGlobalValue@Teller_ID"));
		
		//4. Type $data in Credit Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtCredit_Currency", input.get("Type@Credit_Currency"));
		
		//5. Send Key Action $Parama1 at Credit Currency 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_USD_CASHDEP.txtCredit_Currency", input.get("SendKeyAction@Credit_Currency"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Type $data in Deposit Amount field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtDeposit_Amount", input.get("Type@Deposit_Amount"));
		
		//8. Enter global value for the key $Parama1 in Account 
		uiDriver.typeGlobalValue("act_fill_TELLER_CSD_USD_CASHDEP.txtAccount", input.get("TypeGlobalValue@Account"));
		
		//9. Type $data in Account field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtAccount", input.get("Type@Account"));
		
		//10. Type $data in Exchange Rate field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtExchange_Rate", input.get("Type@Exchange_Rate"));
		
		//11. Type $data in Narrative field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtNarrative", input.get("Type@Narrative"));
		
		//12. Click Waive Charges None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHDEP.eltWaive_Charges_None",input.get("ClickWithSkip@Waive_Charges_None"));
		
		//13. Click Waive Charges No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHDEP.eltWaive_Charges_No",input.get("ClickWithSkip@Waive_Charges_No"));
		
		//14. Click Waive Charges Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHDEP.eltWaive_Charges_Yes",input.get("ClickWithSkip@Waive_Charges_Yes"));
		
		//15. Type $data in FX Contract Number field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtFX_Contract_Number", input.get("Type@FX_Contract_Number"));
		
		//16. Type $data in Remarks field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHDEP.txtRemarks", input.get("Type@Remarks"));
		
		//17. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//18. Click Validate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHDEP.eltValidate",input.get("ClickWithSkip@Validate"));
		
		//19. Dynamic Wait
		uiDriver.dynamicWait();
		
		//20. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//21. Verfies that text $Parama1 is present in Net Credit 
		uiDriver.checkText("act_fill_TELLER_CSD_USD_CASHDEP.eltNet_Credit",input.get("AssertTextPresent@Net_Credit"));
		
		//22. Verfies that text $Parama1 is present in New Cust Bal.1 
		uiDriver.checkText("act_fill_TELLER_CSD_USD_CASHDEP.eltNew_Cust_Bal_1",input.get("AssertTextPresent@New_Cust_Bal_1"));
		
		//23. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
	}
	
	public void act_fill_TELLER_CSD_FCY_CASHCHQ(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Teller ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TELLER_CSD_FCY_CASHCHQ.eltTeller_ID",input.get("setRunTimeGlobalValue@Teller_ID"));
		
		//4. Type $data in Withdrawal Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtWithdrawal_Currency", input.get("Type@Withdrawal_Currency"));
		
		//5. Type $data in Debit Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtDebit_Currency", input.get("Type@Debit_Currency"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Type $data in Withdrawal Amount field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtWithdrawal_Amount", input.get("Type@Withdrawal_Amount"));
		
		//8. Send Key Action $Parama1 at Withdrawal Amount 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_FCY_CASHCHQ.txtWithdrawal_Amount", input.get("SendKeyAction@Withdrawal_Amount"));
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//10. Enter global value for the key $Parama1 in Debit Account 
		uiDriver.typeGlobalValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtDebit_Account", input.get("TypeGlobalValue@Debit_Account"));
		
		//11. Type $data in Debit Account field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtDebit_Account", input.get("Type@Debit_Account"));
		
		//12. Send Key Action $Parama1 at Debit Account 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_FCY_CASHCHQ.txtDebit_Account", input.get("SendKeyAction@Debit_Account"));
		
		//13. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//14. Type $data in Exchange Rate field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtExchange_Rate", input.get("Type@Exchange_Rate"));
		
		//15. Type $data in Cheque No field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtCheque_No", input.get("Type@Cheque_No"));
		
		//16. Type $data in Narrative field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtNarrative", input.get("Type@Narrative"));
		
		//17. Click Waive Charges None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHCHQ.eltWaive_Charges_None",input.get("ClickWithSkip@Waive_Charges_None"));
		
		//18. Click Waive Charges No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHCHQ.eltWaive_Charges_No",input.get("ClickWithSkip@Waive_Charges_No"));
		
		//19. Click Waive Charges Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_FCY_CASHCHQ.eltWaive_Charges_Yes",input.get("ClickWithSkip@Waive_Charges_Yes"));
		
		//20. Type $data in FX Contract Number field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtFX_Contract_Number", input.get("Type@FX_Contract_Number"));
		
		//21. Type $data in Remarks field
		uiDriver.setValue("act_fill_TELLER_CSD_FCY_CASHCHQ.txtRemarks", input.get("Type@Remarks"));
		
		//22. Dynamic Wait
		uiDriver.dynamicWait();
		
		//23. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
	}
	
	public void act_fill_TELLER_CSD_USD_CASHCHQ(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Teller ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TELLER_CSD_USD_CASHCHQ.eltTeller_ID",input.get("setRunTimeGlobalValue@Teller_ID"));
		
		//4. Type $data in Debit Currency field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtDebit_Currency", input.get("Type@Debit_Currency"));
		
		//5. Type $data in Withdrawal Amount field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtWithdrawal_Amount", input.get("Type@Withdrawal_Amount"));
		
		//6. Send Key Action $Parama1 at Withdrawal Amount 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_USD_CASHCHQ.txtWithdrawal_Amount", input.get("SendKeyAction@Withdrawal_Amount"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//8. Enter global value for the key $Parama1 in Debit Account 
		uiDriver.typeGlobalValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtDebit_Account", input.get("TypeGlobalValue@Debit_Account"));
		
		//9. Type $data in Debit Account field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtDebit_Account", input.get("Type@Debit_Account"));
		
		//10. Send Key Action $Parama1 at Debit Account 
		uiDriver.sendKeyEvents("act_fill_TELLER_CSD_USD_CASHCHQ.txtDebit_Account", input.get("SendKeyAction@Debit_Account"));
		
		//11. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//12. Type $data in Exchange Rate field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtExchange_Rate", input.get("Type@Exchange_Rate"));
		
		//13. Type $data in Cheque Number field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtCheque_Number", input.get("Type@Cheque_Number"));
		
		//14. Type $data in Narrative field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtNarrative", input.get("Type@Narrative"));
		
		//15. Click Waive Charges None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHCHQ.eltWaive_Charges_None",input.get("ClickWithSkip@Waive_Charges_None"));
		
		//16. Click Waive Charges No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHCHQ.eltWaive_Charges_No",input.get("ClickWithSkip@Waive_Charges_No"));
		
		//17. Click Waive Charges Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TELLER_CSD_USD_CASHCHQ.eltWaive_Charges_Yes",input.get("ClickWithSkip@Waive_Charges_Yes"));
		
		//18. Type $data in FX Contract Number field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtFX_Contract_Number", input.get("Type@FX_Contract_Number"));
		
		//19. Type $data in Remarks field
		uiDriver.setValue("act_fill_TELLER_CSD_USD_CASHCHQ.txtRemarks", input.get("Type@Remarks"));
		
		//20. Dynamic Wait
		uiDriver.dynamicWait();
		
		//21. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Deposit
	*format string
	**/
	public String toString(){
		return "DepositDriver()";
	}
}
