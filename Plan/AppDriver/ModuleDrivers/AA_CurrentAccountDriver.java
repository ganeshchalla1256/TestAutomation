/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:15
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
public class AA_CurrentAccountDriver extends BaseWebModuleDriver {
	public AA_CurrentAccountDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_UpdateLimit(DataRow input, DataRow output) {
		//1. Click Reference
		uiDriver.click("act_UpdateLimit.txtReference");
		
		//2. Dynamic Wait
		uiDriver.dynamicWait();
		
		//3. Type $data in Limit Reference field
		uiDriver.setValue("act_UpdateLimit.txtLimit_Reference", input.get("Type@Limit_Reference"));
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. Type $data in Limit Serial field
		uiDriver.setValue("act_UpdateLimit.txtLimit_Serial", input.get("Type@Limit_Serial"));
		
		//6. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void fill_Transactionid(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type Transactionid $Parama1
		uiDriver.setValue("fill_Transactionid.eltTransactionid", input.get("Type@Transactionid"));
		
		//3. Enter global value for the key $Parama1 in TRANSACTION 
		uiDriver.typeGlobalValue("fill_Transactionid.eltTRANSACTION", input.get("TypeGlobalValue@TRANSACTION"));
		
		//4. TypeConcatenatedGlobalValue given in $Parama1 in TRANSID 
		uiDriver.typeConcatenatedGlobalValue("fill_Transactionid.eltTRANSID", input.get("TypeConcatenatedGlobalValue@TRANSID"));
		
	}
	
	public void fill_AACurrentAccount(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in Customer.1 
		uiDriver.typeGlobalValue("fill_AACurrentAccount.eltCustomer_1", input.get("TypeGlobalValue@Customer_1"));
		
		//2. Type Currency $Parama1
		uiDriver.setValue("fill_AACurrentAccount.eltCurrency", input.get("Type@Currency"));
		
		//3. Set RunTime Global Value from getting the text  AACurrentCurrency to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_AACurrentAccount.eltAACurrentCurrency",input.get("setRunTimeGlobalValue@AACurrentCurrency"));
		
		//4. Set RunTime Global Value from getting the text  AACurActNum to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_AACurrentAccount.eltAACurActNum",input.get("setRunTimeGlobalValue@AACurActNum"));
		
		//5. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//6. Click Validate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_AACurrentAccount.btnValidate",input.get("ClickWithSkip@Validate"));
		
		//7. Type $data in ClsFee Fixed Amount field
		uiDriver.setValue("fill_AACurrentAccount.txtClsFee_Fixed_Amount", input.get("Type@ClsFee_Fixed_Amount"));
		
		//8. Type $data in Charge Amount field
		uiDriver.setValue("fill_AACurrentAccount.txtCharge_Amount", input.get("Type@Charge_Amount"));
		
		//9. Type $data in TxnFee Fixed Amount field
		uiDriver.setValue("fill_AACurrentAccount.txtTxnFee_Fixed_Amount", input.get("Type@TxnFee_Fixed_Amount"));
		
		//10. Type $data in Sav_TxnFee Fixed Amount field
		uiDriver.setValue("fill_AACurrentAccount.txtSav_TxnFee_Fixed_Amount", input.get("Type@Sav_TxnFee_Fixed_Amount"));
		
		//11. Set RunTime Global Value from getting the text  AAActivityId to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_AACurrentAccount.txtAAActivityId",input.get("setRunTimeGlobalValue@AAActivityId"));
		
	}
	
	public void act_CommitAndAcceptCurAcc(DataRow input, DataRow output) {
		//1. Click on Validate button
		uiDriver.click("act_CommitAndAcceptCurAcc.btnValidate");
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Arrangement to $Parama1
		uiDriver.setRunTimeGlobalValue("act_CommitAndAcceptCurAcc.eltArrangement",input.get("setRunTimeGlobalValue@Arrangement"));
		
		//4. Click on Commit button
		uiDriver.click("act_CommitAndAcceptCurAcc.btnCommit");
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//6. clickIfPresent AccOpenAgrement
		uiDriver.clickIfPresent("act_CommitAndAcceptCurAcc.eltAccOpenAgrement");
		
		//7. AccOpenAgmt_Received
		uiDriver.clickIfPresent("act_CommitAndAcceptCurAcc.btnAccOpenAgmt_Received");
		
		//8. clickIfPresent Accept Overrides
		uiDriver.clickIfPresent("act_CommitAndAcceptCurAcc.eltAccept_Overrides");
		
		//9. Verify whether the Txn Complete element present
		if (uiDriver.checkElementPresent("act_CommitAndAcceptCurAcc.eltTxn_Complete", 15000)) {
			passed("checkElementPresent","checkElementPresent should pass","checkElementPresent passed",false);
		} else {
			failed("checkElementPresent","checkElementPresent should pass","checkElementPresent failed");
		}
		
		//10. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_Navigate_AAUnauthorise(DataRow input, DataRow output) {
		//1. SwitchToFrame
		uiDriver.SwitchFrame();
		
		//2. Click on User Menu Link
		uiDriver.click("act_Navigate_AAUnauthorise.lnkUser_Menu");
		
		//3. Click on Retail Operations Link
		uiDriver.click("act_Navigate_AAUnauthorise.lnkRetail_Operations");
		
		//4. Click on Find Account Link
		uiDriver.click("act_Navigate_AAUnauthorise.lnkFind_Account");
		
		//5. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//6. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//7. Click on Unauthorised WebElement
		uiDriver.click("act_Navigate_AAUnauthorise.eltUnauthorised");
		
	}
	
	public void act_fill_Unauthorise(DataRow input, DataRow output) {
		//1. Type Arrangement $Parama1
		uiDriver.setValue("act_fill_Unauthorise.eltArrangement", input.get("Type@Arrangement"));
		
		//2. Enter global value for the key $Parama1 in Arrangement 
		uiDriver.typeGlobalValue("act_fill_Unauthorise.eltArrangement", input.get("TypeGlobalValue@Arrangement"));
		
		//3. Type Owner $Parama1
		uiDriver.setValue("act_fill_Unauthorise.eltOwner", input.get("Type@Owner"));
		
		//4. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Unauthorise.btnFind",input.get("ClickWithSkip@Find"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//6. Set RunTime Global Value from getting the text  Account to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_Unauthorise.eltAccount",input.get("setRunTimeGlobalValue@Account"));
		
		//7. Click OverviewIcon if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Unauthorise.btnOverviewIcon",input.get("ClickWithSkip@OverviewIcon"));
		
		//8. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#1"));
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//10. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//11. Dynamic Wait
		uiDriver.dynamicWait();
		
		//12. Click AuthApprove if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Unauthorise.btnAuthApprove",input.get("ClickWithSkip@AuthApprove"));
		
		//13. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#2"));
		
		//14. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//15. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//16. Click AuthValidate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Unauthorise.btnAuthValidate",input.get("ClickWithSkip@AuthValidate"));
		
		//17. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
	}
	
	public void fill_frequency_control(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//2. Click Frequency control if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_frequency_control.btnFrequency_control",input.get("ClickWithSkip@Frequency_control"));
		
		//3. Click Statement-1 Frequency.1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_frequency_control.btnStatement_1_Frequency_1",input.get("ClickWithSkip@Statement_1_Frequency_1"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//5. Type $Parama1 Date in NextDate  textbox
		uiDriver.TypeDate("fill_frequency_control.txtNextDate", input.get("TypeDate@NextDate"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//7. Click on Business day button
		uiDriver.click("fill_frequency_control.btnBusiness_day");
		
		//8. Click on Save button
		uiDriver.click("fill_frequency_control.btnSave");
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//10. Type $data in If No Movement field
		uiDriver.setValue("fill_frequency_control.txtIf_No_Movement", input.get("Type@If_No_Movement"));
		
		//11. Type $data in Swift Statement Type field
		uiDriver.setValue("fill_frequency_control.txtSwift_Statement_Type", input.get("Type@Swift_Statement_Type"));
		
		//12. Click Account Stmt if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_frequency_control.eltAccount_Stmt",input.get("ClickWithSkip@Account_Stmt"));
		
		//13. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//14. Click Descript Statement No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_frequency_control.btnDescript_Statement_No",input.get("ClickWithSkip@Descript_Statement_No"));
		
		//15. Click Tax Advice No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_frequency_control.btnTax_Advice_No",input.get("ClickWithSkip@Tax_Advice_No"));
		
	}
	
	public void act_Navigate_CurrentAccNewArrg_HK(DataRow input, DataRow output) {
		//1. ProceedToFrame Menu
		uiDriver.SwitchFrame();
		
		//2. Click User Menu if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_CurrentAccNewArrg_HK.lnkUser_Menu",input.get("ClickWithSkip@User_Menu"));
		
		//3. Click on Product Catalog Link
		uiDriver.click("act_Navigate_CurrentAccNewArrg_HK.lnkProduct_Catalog");
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#1"));
		
		//5. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#1"));
		
		//6. Click on Accounts Link
		uiDriver.click("act_Navigate_CurrentAccNewArrg_HK.lnkAccounts");
		
		//7. Click on MUFG HK Current Account Link
		uiDriver.click("act_Navigate_CurrentAccNewArrg_HK.lnkMUFG_HK_Current_Account");
		
		//8. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//9. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#2"));
		
		//10. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//11. Click Current Account if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_CurrentAccNewArrg_HK.lnkCurrent_Account",input.get("ClickWithSkip@Current_Account"));
		
		//12. Click Interest Bearing Current Account if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_Navigate_CurrentAccNewArrg_HK.lnkInterest_Bearing_Current_Account",input.get("ClickWithSkip@Interest_Bearing_Current_Account"));
		
		//13. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow#2"));
		
		//14. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
	}
	
	public void act_fill_DE_ADDRESS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type $data in Delivery Address field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtDelivery_Address", input.get("Type@Delivery_Address"));
		
		//3. Enter global value for the key $Parama1 in Delivery Address 
		uiDriver.typeGlobalValue("act_fill_DE_ADDRESS.txtDelivery_Address", input.get("TypeGlobalValue@Delivery_Address"));
		
		//4. Type $data in GB Short Name field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_Short_Name", input.get("Type@GB_Short_Name"));
		
		//5. Type $data in GB NAME 1 field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_NAME_1", input.get("Type@GB_NAME_1"));
		
		//6. Type $data in GB NAME 2 field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_NAME_2", input.get("Type@GB_NAME_2"));
		
		//7. Type $data in GB STREET ADDR field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_STREET_ADDR", input.get("Type@GB_STREET_ADDR"));
		
		//8. Type $data in TOWN COUNTRY field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtTOWN_COUNTRY", input.get("Type@TOWN_COUNTRY"));
		
		//9. Type $data in POSTCODE field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtPOSTCODE", input.get("Type@POSTCODE"));
		
		//10. Type $data in GB Country field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_Country", input.get("Type@GB_Country"));
		
		//11. Type $data in Email field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtEmail", input.get("Type@Email"));
		
		//12. Type $data in Building Name field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtBuilding_Name", input.get("Type@Building_Name"));
		
		//13. Type $data in GB Address Item1 field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_Address_Item1", input.get("Type@GB_Address_Item1"));
		
		//14. Type $data in GB Address Item2 field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_Address_Item2", input.get("Type@GB_Address_Item2"));
		
		//15. Type $data in GB Address.1 field
		uiDriver.setValue("act_fill_DE_ADDRESS.txtGB_Address_1", input.get("Type@GB_Address_1"));
		
	}
	

	/**
	*Overriding toString() method of object class to print AA_CurrentAccount
	*format string
	**/
	public String toString(){
		return "AA_CurrentAccountDriver()";
	}
}
