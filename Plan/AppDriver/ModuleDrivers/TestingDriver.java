/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:40:22
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
public class TestingDriver extends BaseWebModuleDriver {
	public TestingDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_senderRefIncoming(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in SenderRefIncoming 
		uiDriver.typeGlobalValue("fill_senderRefIncoming.txtSenderRefIncoming", input.get("TypeGlobalValue@SenderRefIncoming"));
		
	}
	
	public void asserttxt(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in Status Code	 
		uiDriver.checkText("asserttxt.eltStatus_Code_",input.get("AssertTextPresent@Status_Code_"));
		
		//3. Verfies that text $Parama1 is present in Status Message 
		uiDriver.checkText("asserttxt.eltStatus_Message",input.get("AssertTextPresent@Status_Message"));
		
		//4. Verfies that text $Parama1 is present in StatusCode 
		uiDriver.checkText("asserttxt.eltStatusCode",input.get("AssertTextPresent@StatusCode"));
		
		//5. Check  INAU is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("asserttxt.eltINAU",input.get("AssertElementPresent@INAU"));
		
		//6. Check  Version is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("asserttxt.eltVersion",input.get("AssertElementPresent@Version"));
		
	}
	
	public void act_click_Message_Tab(DataRow input, DataRow output) {
		//1. Click Parties to LC if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltParties_to_LC",input.get("ClickWithSkip@Parties_to_LC"));
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//4. Click Pay Revolving Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltPay_Revolving_Details",input.get("ClickWithSkip@Pay_Revolving_Details"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//6. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//7. Click Charges if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltCharges",input.get("ClickWithSkip@Charges"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//10. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltMessages",input.get("ClickWithSkip@Messages"));
		
		//11. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//12. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//13. Click Changes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltChanges",input.get("ClickWithSkip@Changes"));
		
		//14. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//15. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//16. Click Advice Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltAdvice_Details",input.get("ClickWithSkip@Advice_Details"));
		
		//17. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
		//18. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//19. Click Parties to Undertaking if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_Message_Tab.eltParties_to_Undertaking",input.get("ClickWithSkip@Parties_to_Undertaking"));
		
		//20. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#7"));
		
	}
	
	public void asserttxt_treasury(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Verfies that text $Parama1 is present in 1000 
		uiDriver.checkText("asserttxt_treasury.elt1000",input.get("AssertTextPresent@1000"));
		
		//3. Verfies that text $Parama1 is present in 15000 
		uiDriver.checkText("asserttxt_treasury.elt15000",input.get("AssertTextPresent@15000"));
		
		//4. Verfies that text $Parama1 is present in 7900 
		uiDriver.checkText("asserttxt_treasury.elt7900",input.get("AssertTextPresent@7900"));
		
		//5. Verfies that text $Parama1 is present in 400 
		uiDriver.checkText("asserttxt_treasury.elt400",input.get("AssertTextPresent@400"));
		
		//6. Verfies that text $Parama1 is present in 1200 
		uiDriver.checkText("asserttxt_treasury.elt1200",input.get("AssertTextPresent@1200"));
		
		//7. Verfies that text $Parama1 is present in 2650 
		uiDriver.checkText("asserttxt_treasury.elt2650",input.get("AssertTextPresent@2650"));
		
		//8. Verfies that text $Parama1 is present in 40000 
		uiDriver.checkText("asserttxt_treasury.elt40000",input.get("AssertTextPresent@40000"));
		
		//9. Verfies that text $Parama1 is present in Input Missing 
		uiDriver.checkText("asserttxt_treasury.eltInput_Missing",input.get("AssertTextPresent@Input_Missing"));
		
		//10. Verfies that text $Parama1 is present in FW 
		uiDriver.checkText("asserttxt_treasury.eltFW",input.get("AssertTextPresent@FW"));
		
		//11. Verfies that text $Parama1 is present in FWSR 
		uiDriver.checkText("asserttxt_treasury.eltFWSR",input.get("AssertTextPresent@FWSR"));
		
		//12. Verfies that text $Parama1 is present in SP 
		uiDriver.checkText("asserttxt_treasury.eltSP",input.get("AssertTextPresent@SP"));
		
		//13. Verfies that text $Parama1 is present in SW 
		uiDriver.checkText("asserttxt_treasury.eltSW",input.get("AssertTextPresent@SW"));
		
		//14. Verfies that text $Parama1 is present in SWFF 
		uiDriver.checkText("asserttxt_treasury.eltSWFF",input.get("AssertTextPresent@SWFF"));
		
		//15. Verfies that text $Parama1 is present in SWMM 
		uiDriver.checkText("asserttxt_treasury.eltSWMM",input.get("AssertTextPresent@SWMM"));
		
		//16. Verfies that text $Parama1 is present in FWSZ 
		uiDriver.checkText("asserttxt_treasury.eltFWSZ",input.get("AssertTextPresent@FWSZ"));
		
		//17. Verfies that text $Parama1 is present in FWZ 
		uiDriver.checkText("asserttxt_treasury.eltFWZ",input.get("AssertTextPresent@FWZ"));
		
		//18. Verfies that text $Parama1 is present in SPZ 
		uiDriver.checkText("asserttxt_treasury.eltSPZ",input.get("AssertTextPresent@SPZ"));
		
		//19. Verfies that text $Parama1 is present in 50000 
		uiDriver.checkText("asserttxt_treasury.elt50000",input.get("AssertTextPresent@50000"));
		
		//20. Verfies that text $Parama1 is present in 10000 
		uiDriver.checkText("asserttxt_treasury.elt10000",input.get("AssertTextPresent@10000"));
		
		//21. Verfies that text $Parama1 is present in FR Deal Number 
		uiDriver.checkText("asserttxt_treasury.eltFR_Deal_Number",input.get("AssertTextPresent@FR_Deal_Number"));
		
		//22. Verfies that text $Parama1 is present in ISSUED 
		uiDriver.checkText("asserttxt_treasury.eltISSUED",input.get("AssertTextPresent@ISSUED"));
		
		//23. Verfies that text $Parama1 is present in 102 
		uiDriver.checkText("asserttxt_treasury.elt102",input.get("AssertTextPresent@102"));
		
	}
	
	public void asserttxt_Loans(DataRow input, DataRow output) {
		//1. Verfies that text $Parama1 is present in ERROR Beneficiary Name 
		uiDriver.checkText("asserttxt_Loans.eltERROR_Beneficiary_Name",input.get("AssertTextPresent@ERROR_Beneficiary_Name"));
		
		//2. Verfies that text $Parama1 is present in ERROR Account with Bank BIC 
		uiDriver.checkText("asserttxt_Loans.eltERROR_Account_with_Bank_BIC",input.get("AssertTextPresent@ERROR_Account_with_Bank_BIC"));
		
		//3. Verfies that text $Parama1 is present in Base Rate Code 
		uiDriver.checkText("asserttxt_Loans.eltBase_Rate_Code",input.get("AssertTextPresent@Base_Rate_Code"));
		
		//4. Verfies that text $Parama1 is present in L.BASE.RATE.CODE - Input missing 
		uiDriver.checkText("asserttxt_Loans.eltL_BASE_RATE_CODE_Input_missing",input.get("AssertTextPresent@L_BASE_RATE_CODE_Input_missing"));
		
		//5. Check  Response Messages.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("asserttxt_Loans.eltResponse_Messages_2",input.get("AssertElementPresent@Response_Messages_2"));
		
		//6. Check  Request Status is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("asserttxt_Loans.eltRequest_Status",input.get("AssertElementPresent@Request_Status"));
		
	}
	
	public void asserttxt_verify(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in Status 
		uiDriver.checkText("asserttxt_verify.eltStatus",input.get("AssertTextPresent@Status"));
		
		//3. Verfies that text $Parama1 is present in 1010 
		uiDriver.checkText("asserttxt_verify.elt1010",input.get("AssertTextPresent@1010"));
		
		//4. Verfies that text $Parama1 is present in 1015 
		uiDriver.checkText("asserttxt_verify.elt1015",input.get("AssertTextPresent@1015"));
		
		//5. Verfies that text $Parama1 is present in 1011 
		uiDriver.checkText("asserttxt_verify.elt1011",input.get("AssertTextPresent@1011"));
		
		//6. Verfies that text $Parama1 is present in 1012 
		uiDriver.checkText("asserttxt_verify.elt1012",input.get("AssertTextPresent@1012"));
		
		//7. Verfies that text $Parama1 is present in 1013 
		uiDriver.checkText("asserttxt_verify.elt1013",input.get("AssertTextPresent@1013"));
		
		//8. Verfies that text $Parama1 is present in Error Message Validation 
		uiDriver.checkText("asserttxt_verify.eltError_Message_Validation",input.get("AssertTextPresent@Error_Message_Validation"));
		
		//9. Verfies that text $Parama1 is present in Cheque Number 
		uiDriver.checkText("asserttxt_verify.eltCheque_Number",input.get("AssertTextPresent@Cheque_Number"));
		
		//10. Check  Client No is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("asserttxt_verify.eltClient_No",input.get("AssertElementPresent@Client_No"));
		
		//11. Verfies that text $Parama1 is present in Cheque Missing 
		uiDriver.checkText("asserttxt_verify.eltCheque_Missing",input.get("AssertTextPresent@Cheque_Missing"));
		
		//12. Verfies that text $Parama1 is present in USD 
		uiDriver.checkText("asserttxt_verify.eltUSD",input.get("AssertTextPresent@USD"));
		
		//13. Verfies that text $Parama1 is present in Unauth Overdraw 
		uiDriver.checkText("asserttxt_verify.eltUnauth_Overdraw",input.get("AssertTextPresent@Unauth_Overdraw"));
		
		//14. Verfies that text $Parama1 is present in LGS 
		uiDriver.checkText("asserttxt_verify.eltLGS",input.get("AssertTextPresent@LGS"));
		
		//15. Verfies that text $Parama1 is present in UploadFileError 
		uiDriver.checkText("asserttxt_verify.eltUploadFileError",input.get("AssertTextPresent@UploadFileError"));
		
		//16. Verfies that text $Parama1 is present in Id 
		uiDriver.checkText("asserttxt_verify.eltId",input.get("AssertTextPresent@Id"));
		
		//17. Verfies that text $Parama1 is present in Cleared error 
		uiDriver.checkText("asserttxt_verify.eltCleared_error",input.get("AssertTextPresent@Cleared_error"));
		
		//18. Verfies that text $Parama1 is present in Issued error 
		uiDriver.checkText("asserttxt_verify.eltIssued_error",input.get("AssertTextPresent@Issued_error"));
		
		//19. Verfies that text $Parama1 is present in Posting error 
		uiDriver.checkText("asserttxt_verify.eltPosting_error",input.get("AssertTextPresent@Posting_error"));
		
		//20. Verfies that text $Parama1 is present in Acceptance error 
		uiDriver.checkText("asserttxt_verify.eltAcceptance_error",input.get("AssertTextPresent@Acceptance_error"));
		
		//21. Verfies that text $Parama1 is present in Rejection error 
		uiDriver.checkText("asserttxt_verify.eltRejection_error",input.get("AssertTextPresent@Rejection_error"));
		
		//22. Verfies that text $Parama1 is present in Arrangement Transaction 
		uiDriver.checkText("asserttxt_verify.eltArrangement_Transaction",input.get("AssertTextPresent@Arrangement_Transaction"));
		
	}
	
	public void asserttxt_delivery(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Verfies that text $Parama1 is present in Delivery Type 
		uiDriver.checkText("asserttxt_delivery.eltDelivery_Type",input.get("AssertTextPresent@Delivery_Type"));
		
		//4. Verfies that text $Parama1 is present in 22L/Reporting jurisdiction 
		uiDriver.checkText("asserttxt_delivery.elt22L_Reporting_jurisdiction",input.get("AssertTextPresent@22L_Reporting_jurisdiction"));
		
		//5. Verfies that text $Parama1 is present in 22M/UTI NAME SPACE 
		uiDriver.checkText("asserttxt_delivery.elt22M_UTI_NAME_SPACE",input.get("AssertTextPresent@22M_UTI_NAME_SPACE"));
		
		//6. Verfies that text $Parama1 is present in 22N/TRANSACTION IDENTIFIER 
		uiDriver.checkText("asserttxt_delivery.elt22N_TRANSACTION_IDENTIFIER",input.get("AssertTextPresent@22N_TRANSACTION_IDENTIFIER"));
		
		//7. Verfies that text $Parama1 is present in 25/ACCOUNT IDENTIFICATION 
		uiDriver.checkText("asserttxt_delivery.elt25_ACCOUNT_IDENTIFICATION",input.get("AssertTextPresent@25_ACCOUNT_IDENTIFICATION"));
		
		//8. Verfies that text $Parama1 is present in 28C/ENTRY NUMBER 
		uiDriver.checkText("asserttxt_delivery.elt28C_ENTRY_NUMBER",input.get("AssertTextPresent@28C_ENTRY_NUMBER"));
		
		//9. Verfies that text $Parama1 is present in 90D/NUMBER AND SUM OF ENTRIES 
		uiDriver.checkText("asserttxt_delivery.elt90D_NUMBER_AND_SUM_OF_ENTRIES",input.get("AssertTextPresent@90D_NUMBER_AND_SUM_OF_ENTRIES"));
		
		//10. Verfies that text $Parama1 is present in :86/INFORMATION TO ACCOUNT OWNER 
		uiDriver.checkText("asserttxt_delivery.elt_86_INFORMATION_TO_ACCOUNT_OWNER",input.get("AssertTextPresent@_86_INFORMATION_TO_ACCOUNT_OWNER"));
		
		//11. Verfies that text $Parama1 is present in :61/STATEMENT LINE 
		uiDriver.checkText("asserttxt_delivery.elt_61_STATEMENT_LINE",input.get("AssertTextPresent@_61_STATEMENT_LINE"));
		
		//12. Verfies that text $Parama1 is present in :22A/Type of Operation 
		uiDriver.checkText("asserttxt_delivery.elt_22A_Type_of_Operation",input.get("AssertTextPresent@_22A_Type_of_Operation"));
		
		//13. Verfies that text $Parama1 is present in 90C/NUMBER AND SUM OF ENTRIES 
		uiDriver.checkText("asserttxt_delivery.elt90C_NUMBER_AND_SUM_OF_ENTRIES",input.get("AssertTextPresent@90C_NUMBER_AND_SUM_OF_ENTRIES"));
		
		//14. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void assert_text(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in Ccy 
		uiDriver.checkText("assert_text.eltCcy",input.get("AssertTextPresent@Ccy"));
		
		//3. Verfies that text $Parama1 is present in Amt 
		uiDriver.checkText("assert_text.eltAmt",input.get("AssertTextPresent@Amt"));
		
		//4. Verfies that text $Parama1 is present in Status Code 
		uiDriver.checkText("assert_text.eltStatus_Code",input.get("AssertTextPresent@Status_Code"));
		
		//5. Verfies that text $Parama1 is present in Description 
		uiDriver.checkText("assert_text.eltDescription",input.get("AssertTextPresent@Description"));
		
		//6. Verfies that text $Parama1 is present in Debit 
		uiDriver.checkText("assert_text.eltDebit",input.get("AssertTextPresent@Debit"));
		
		//7. Check  HK0020001 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_text.eltHK0020001",input.get("AssertElementPresent@HK0020001"));
		
		//8. Check  IS Rate is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_text.eltIS_Rate",input.get("AssertElementPresent@IS_Rate"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Testing
	*format string
	**/
	public String toString(){
		return "TestingDriver()";
	}
}
