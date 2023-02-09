/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:40:06
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
public class TradeFinanceDriver extends BaseWebModuleDriver {
	public TradeFinanceDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_transactionref(DataRow input, DataRow output) {
		//1. Type $data in Transaction Ref field
		uiDriver.setValue("act_fill_transactionref.txtTransaction_Ref", input.get("Type@Transaction_Ref"));
		
		//2. Enter global value for the key $Parama1 in Transaction Ref 
		uiDriver.typeGlobalValue("act_fill_transactionref.txtTransaction_Ref", input.get("TypeGlobalValue@Transaction_Ref"));
		
	}
	
	public void act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//3. Set RunTime Global Value from getting the text  Import Usance LCs to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtImport_Usance_LCs",input.get("setRunTimeGlobalValue@Import_Usance_LCs"));
		
		//4. Type $data in Import Usance LC Type field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtImport_Usance_LC_Type", input.get("Type@Import_Usance_LC_Type"));
		
		//5. Enter global value for the key $Parama1 in Applicant ID.1 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtApplicant_ID_1", input.get("TypeGlobalValue@Applicant_ID_1"));
		
		//6. Type $data in Applicant ID field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtApplicant_ID", input.get("Type@Applicant_ID"));
		
		//7. Type $data in LC Currency field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Currency", input.get("Type@LC_Currency"));
		
		//8. Type $data in LC Amount field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Amount", input.get("Type@LC_Amount"));
		
		//9. Type $data in LC Expiry Place field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Expiry_Place", input.get("Type@LC_Expiry_Place"));
		
		//10. Type $Parama1 Date in LC Issue Date  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Issue_Date", input.get("TypeDate@LC_Issue_Date"));
		
		//11. Type $data in LC Expiry Date field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Expiry_Date", input.get("Type@LC_Expiry_Date"));
		
		//12. Type $Parama1 Date in LC Expiry Date  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLC_Expiry_Date", input.get("TypeDate@LC_Expiry_Date"));
		
		//13. Type $data in Liability Reversal Date field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLiability_Reversal_Date", input.get("Type@Liability_Reversal_Date"));
		
		//14. Type $Parama1 Date in Liability Reversal Date  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLiability_Reversal_Date", input.get("TypeDate@Liability_Reversal_Date"));
		
		//15. Click Paper Lc Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltPaper_Lc_Yes",input.get("ClickWithSkip@Paper_Lc_Yes"));
		
		//16. Type $data in GST Sub Product field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtGST_Sub_Product", input.get("Type@GST_Sub_Product"));
		
		//17. Click Limit Reference.1 Multivalue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltLimit_Reference_1_Multivalue",input.get("ClickWithSkip@Limit_Reference_1_Multivalue#1"));
		
		//18. Click Limit Reference.1 Multivalue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltLimit_Reference_1_Multivalue",input.get("ClickWithSkip@Limit_Reference_1_Multivalue#2"));
		
		//19. Type $data in Limit Reference.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLimit_Reference_1", input.get("Type@Limit_Reference_1"));
		
		//20. Type $data in Limit Reference.2 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLimit_Reference_2", input.get("Type@Limit_Reference_2"));
		
		//21. Type $data in Limit Reference.3 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLimit_Reference_3", input.get("Type@Limit_Reference_3"));
		
		//22. Click Auto Expiry_Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltAuto_Expiry_Yes",input.get("ClickWithSkip@Auto_Expiry_Yes"));
		
		//23. Type $data in Account Officer field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAccount_Officer", input.get("Type@Account_Officer"));
		
		//24. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//25. Dynamic Wait
		uiDriver.dynamicWait();
		
		//26. Click on Parties to LC WebElement
		uiDriver.click("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltParties_to_LC");
		
		//27. Type $data in Benificary ID field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtBenificary_ID", input.get("Type@Benificary_ID"));
		
		//28. Enter global value for the key $Parama1 in Ben id 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtBen_id", input.get("TypeGlobalValue@Ben_id"));
		
		//29. Type $data in Advising Bank ID field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAdvising_Bank_ID", input.get("Type@Advising_Bank_ID"));
		
		//30. Enter global value for the key $Parama1 in ADV BNK ID 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtADV_BNK_ID", input.get("TypeGlobalValue@ADV_BNK_ID"));
		
		//31. Enter global value for the key $Parama1 in Advise Through Bank ID 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAdvise_Through_Bank_ID", input.get("TypeGlobalValue@Advise_Through_Bank_ID"));
		
		//32. Type $data in Availbl with Bank ID field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAvailbl_with_Bank_ID", input.get("Type@Availbl_with_Bank_ID"));
		
		//33. Enter global value for the key $Parama1 in Avail bank id 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAvail_bank_id", input.get("TypeGlobalValue@Avail_bank_id"));
		
		//34. Type $data in Advise Through Bank.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAdvise_Through_Bank_1", input.get("Type@Advise_Through_Bank_1"));
		
		//35. Type $data in Reimbursing Bank.1.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtReimbursing_Bank_1_1", input.get("Type@Reimbursing_Bank_1_1"));
		
		//36. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//37. Dynamic Wait
		uiDriver.dynamicWait();
		
		//38. Click on Charges WebElement
		uiDriver.click("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltCharges");
		
		//39. Click Charges from_O if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltCharges_from_O",input.get("ClickWithSkip@Charges_from_O"));
		
		//40. Type $data in Waive Charges? field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtWaive_Charges_", input.get("Type@Waive_Charges_"));
		
		//41. Type $data in Charge Code.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Code_1", input.get("Type@Charge_Code_1"));
		
		//42. Type $data in Party Charged.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtParty_Charged_1", input.get("Type@Party_Charged_1"));
		
		//43. Enter global value for the key $Parama1 in Charge Debit Acct.1 
		uiDriver.typeGlobalValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Debit_Acct_1", input.get("TypeGlobalValue@Charge_Debit_Acct_1"));
		
		//44. Type $data in Charge Debit Acct.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Debit_Acct_1", input.get("Type@Charge_Debit_Acct_1"));
		
		//45. Type $data in Charge Currency.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Currency_1", input.get("Type@Charge_Currency_1"));
		
		//46. Type $data in Charge Amount.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Amount_1", input.get("Type@Charge_Amount_1"));
		
		//47. Type $data in Amortise Charges?.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAmortise_Charges_1", input.get("Type@Amortise_Charges_1"));
		
		//48. Type $data in Charge Status.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCharge_Status_1", input.get("Type@Charge_Status_1"));
		
		//49. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//50. Dynamic Wait
		uiDriver.dynamicWait();
		
		//51. Click Pay/Revolving Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltPay_Revolving_Details",input.get("ClickWithSkip@Pay_Revolving_Details"));
		
		//52. Type $data in Drawing Type.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtDrawing_Type_1", input.get("Type@Drawing_Type_1"));
		
		//53. Type $data in Payment Percent.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Percent_1", input.get("Type@Payment_Percent_1"));
		
		//54. Type $data in Acpt Time Band.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_1", input.get("Type@Acpt_Time_Band_1"));
		
		//55. Type $Parama1 Date in Acpt Time Band.1  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_1", input.get("TypeDate@Acpt_Time_Band_1"));
		
		//56. Type $data in Payment Portion.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Portion_1", input.get("Type@Payment_Portion_1"));
		
		//57. Type $data in Drawing Type.2 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtDrawing_Type_2", input.get("Type@Drawing_Type_2"));
		
		//58. Type $data in Payment Percent.2 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Percent_2", input.get("Type@Payment_Percent_2"));
		
		//59. Type $data in Acpt Time Band.2 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_2", input.get("Type@Acpt_Time_Band_2"));
		
		//60. Type $Parama1 Date in Acpt Time Band.2  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_2", input.get("TypeDate@Acpt_Time_Band_2"));
		
		//61. Type $data in Payment Portion.2 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Portion_2", input.get("Type@Payment_Portion_2"));
		
		//62. Type $data in Drawing Type.3 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtDrawing_Type_3", input.get("Type@Drawing_Type_3"));
		
		//63. Type $data in Payment Percent.3 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Percent_3", input.get("Type@Payment_Percent_3"));
		
		//64. Type $data in Acpt Time Band.3 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_3", input.get("Type@Acpt_Time_Band_3"));
		
		//65. Type $Parama1 Date in Acpt Time Band.3  textbox
		uiDriver.TypeDate("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtAcpt_Time_Band_3", input.get("TypeDate@Acpt_Time_Band_3"));
		
		//66. Type $data in Payment Portion.3 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtPayment_Portion_3", input.get("Type@Payment_Portion_3"));
		
		//67. Click Revolving Type Cm if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltRevolving_Type_Cm",input.get("ClickWithSkip@Revolving_Type_Cm"));
		
		//68. Click Revolving Type Nc if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltRevolving_Type_Nc",input.get("ClickWithSkip@Revolving_Type_Nc"));
		
		//69. Type $data in No of Revolutions field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtNo_of_Revolutions", input.get("Type@No_of_Revolutions"));
		
		//70. Type $data in Revolving Fqy field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtRevolving_Fqy", input.get("Type@Revolving_Fqy"));
		
		//71. Type $data in Limit for Revolving field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtLimit_for_Revolving", input.get("Type@Limit_for_Revolving"));
		
		//72. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//73. Dynamic Wait
		uiDriver.dynamicWait();
		
		//74. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltMessages",input.get("ClickWithSkip@Messages#1"));
		
		//75. Type $data in Customer Remarks.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCustomer_Remarks_1", input.get("Type@Customer_Remarks_1#1"));
		
		//76. Dynamic Wait
		uiDriver.dynamicWait();
		
		//77. Click on Validate WebElement
		uiDriver.click("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltValidate");
		
		//78. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//79. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltMessages",input.get("ClickWithSkip@Messages#2"));
		
		//80. Type $data in Customer Remarks.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCustomer_Remarks_1", input.get("Type@Customer_Remarks_1#2"));
		
		//81. Dynamic Wait
		uiDriver.dynamicWait();
		
		//82. Click on Validate WebElement
		uiDriver.click("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltValidate");
		
		//83. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//84. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltMessages",input.get("ClickWithSkip@Messages#3"));
		
		//85. Type $data in Send Message_yes field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtSend_Message_yes", input.get("Type@Send_Message_yes"));
		
		//86. Type $data in Customer Remarks.1 field
		uiDriver.setValue("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.txtCustomer_Remarks_1", input.get("Type@Customer_Remarks_1#3"));
		
		//87. Dynamic Wait
		uiDriver.dynamicWait();
		
		//88. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//89. Dynamic Wait
		uiDriver.dynamicWait();
		
		//90. Click MT 740 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.eltMT_740",input.get("ClickWithSkip@MT_740"));
		
		//91. Click 40F Applicable Rule Codes Urr Latest Version if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LETTER_OF_CREDIT_MUFGHK_IMPSIGHT_I.elt40F_Applicable_Rule_Codes_Urr_Latest_Version",input.get("ClickWithSkip@40F_Applicable_Rule_Codes_Urr_Latest_Version"));
		
		//92. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//93. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//3. Type $data in Loan Maturity Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtLoan_Maturity_Date", input.get("Type@Loan_Maturity_Date"));
		
		//4. Type $Parama1 Date in Loan Maturity Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtLoan_Maturity_Date", input.get("TypeDate@Loan_Maturity_Date"));
		
		//5. Type $data in Effective Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtEffective_Date", input.get("Type@Effective_Date"));
		
		//6. Type $Parama1 Date in Effective Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtEffective_Date", input.get("TypeDate@Effective_Date"));
		
		//7. Type $data in Rate change from field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtRate_change_from", input.get("Type@Rate_change_from"));
		
		//8. Type $Parama1 Date in Rate change from  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtRate_change_from", input.get("TypeDate@Rate_change_from"));
		
		//9. Type $data in New Interest Rate.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtNew_Interest_Rate_1", input.get("Type@New_Interest_Rate_1"));
		
		//10. Type $data in Amt Increase/Decrease field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtAmt_Increase_Decrease", input.get("Type@Amt_Increase_Decrease"));
		
		//11. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//12. Click Advice Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltAdvice_Details",input.get("ClickWithSkip@Advice_Details"));
		
		//13. Type $data in Interest Payable field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtInterest_Payable", input.get("Type@Interest_Payable"));
		
		//14. Type $data in Principal Repay Amt field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtPrincipal_Repay_Amt", input.get("Type@Principal_Repay_Amt"));
		
		//15. Enter global value for the key $Parama1 in Bill Reference Number.1 
		uiDriver.checkTextGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltBill_Reference_Number_1", input.get("AssertGlobalValueTextPresent@Bill_Reference_Number_1"));
		
		//16. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//17. Click Account Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltAccount_Details",input.get("ClickWithSkip@Account_Details"));
		
		//18. Enter global value for the key $Parama1 in Principal Liq Acct 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.txtPrincipal_Liq_Acct", input.get("TypeGlobalValue@Principal_Liq_Acct"));
		
		//19. Dynamic Wait
		uiDriver.dynamicWait();
		
		//20. Click Validate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltValidate",input.get("ClickWithSkip@Validate"));
		
		//21. Dynamic Wait
		uiDriver.dynamicWait();
		
		//22. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//23. Click Commit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltCommit",input.get("ClickWithSkip@Commit"));
		
		//24. Dynamic Wait
		uiDriver.dynamicWait();
		
		//25. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//26. Verfies that text $Parama1 is present in Override Message 
		uiDriver.checkText("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_IMP.eltOverride_Message",input.get("AssertTextPresent@Override_Message"));
		
		//27. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//28. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//4. Type $data in IS Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR.txtIS_Rate", input.get("Type@IS_Rate"));
		
		//5. Type $Parama1 Date in MaturityDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR.txtMaturityDate", input.get("TypeDate@MaturityDate"));
		
		//6. Enter global value for the key $Parama1 in Principal Liquidation Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR.txtPrincipal_Liquidation_Accnt", input.get("TypeGlobalValue@Principal_Liquidation_Accnt"));
		
		//7. Enter global value for the key $Parama1 in Interest Liquidation Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR.txtInterest_Liquidation_Accnt", input.get("TypeGlobalValue@Interest_Liquidation_Accnt"));
		
		//8. Enter global value for the key $Parama1 in Charge debit Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EARLY_MATLN_TR.txtCharge_debit_Accnt", input.get("TypeGlobalValue@Charge_debit_Accnt"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_storeglobalvalue(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Set RunTime Global Value from getting the text  GV_UsanceNo to $Parama1
		uiDriver.setRunTimeGlobalValue("act_storeglobalvalue.eltGV_UsanceNo",input.get("setRunTimeGlobalValue@GV_UsanceNo"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//4. Set RunTime Global Value from getting the text  PO_Reference to $Parama1
		uiDriver.setRunTimeGlobalValue("act_storeglobalvalue.txtPO_Reference",input.get("setRunTimeGlobalValue@PO_Reference"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//6. Set RunTime Global Value from getting the text  GV_ProcessID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_storeglobalvalue.txtGV_ProcessID",input.get("setRunTimeGlobalValue@GV_ProcessID"));
		
	}
	
	public void act_click_amend(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Click on Amend WebElement
		uiDriver.click("act_click_amend.eltAmend");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_click_view(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Click on View button
		uiDriver.click("act_click_view.btnView");
		
	}
	
	public void clk_Changes_BLBatch_Tab(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Changes WebElement
		uiDriver.click("clk_Changes_BLBatch_Tab.eltChanges");
		
	}
	
	public void fill_ImportUsanceLCs_ID(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Import Usance LCs 
		uiDriver.typeGlobalValue("fill_ImportUsanceLCs_ID.txtImport_Usance_LCs", input.get("TypeGlobalValue@Import_Usance_LCs"));
		
		//3. Type $data in Import Usance LCs field
		uiDriver.setValue("fill_ImportUsanceLCs_ID.txtImport_Usance_LCs", input.get("Type@Import_Usance_LCs"));
		
	}
	
	public void act_verify_TransactionEntries(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in -5000 
		uiDriver.checkText("act_verify_TransactionEntries.elt_5000",input.get("AssertTextPresent@_5000"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Verfies that text $Parama1 is present in -14500 
		uiDriver.checkText("act_verify_TransactionEntries.elt_14500",input.get("AssertTextPresent@_14500"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Verfies that text $Parama1 is present in -150 
		uiDriver.checkText("act_verify_TransactionEntries.elt_150",input.get("AssertTextPresent@_150"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Verfies that text $Parama1 is present in 10000 
		uiDriver.checkText("act_verify_TransactionEntries.elt10000",input.get("AssertTextPresent@10000"));
		
		//9. Dynamic Wait
		uiDriver.dynamicWait();
		
		//10. Verfies that text $Parama1 is present in 1000000 
		uiDriver.checkText("act_verify_TransactionEntries.elt1000000",input.get("AssertTextPresent@1000000"));
		
		//11. Dynamic Wait
		uiDriver.dynamicWait();
		
		//12. Verfies that text $Parama1 is present in 500000 
		uiDriver.checkText("act_verify_TransactionEntries.elt500000",input.get("AssertTextPresent@500000"));
		
		//13. Dynamic Wait
		uiDriver.dynamicWait();
		
		//14. Verfies that text $Parama1 is present in 15000 
		uiDriver.checkText("act_verify_TransactionEntries.elt15000",input.get("AssertTextPresent@15000"));
		
		//15. Dynamic Wait
		uiDriver.dynamicWait();
		
		//16. Verfies that text $Parama1 is present in 30000 
		uiDriver.checkText("act_verify_TransactionEntries.elt30000",input.get("AssertTextPresent@30000"));
		
		//17. Dynamic Wait
		uiDriver.dynamicWait();
		
		//18. Verfies that text $Parama1 is present in 500 
		uiDriver.checkText("act_verify_TransactionEntries.elt500",input.get("AssertTextPresent@500"));
		
		//19. Dynamic Wait
		uiDriver.dynamicWait();
		
		//20. Verfies that text $Parama1 is present in 20000 
		uiDriver.checkText("act_verify_TransactionEntries.elt20000",input.get("AssertTextPresent@20000"));
		
		//21. Dynamic Wait
		uiDriver.dynamicWait();
		
		//22. Verfies that text $Parama1 is present in 150 
		uiDriver.checkText("act_verify_TransactionEntries.elt150",input.get("AssertTextPresent@150"));
		
		//23. Dynamic Wait
		uiDriver.dynamicWait();
		
		//24. Verfies that text $Parama1 is present in 5000 
		uiDriver.checkText("act_verify_TransactionEntries.elt5000",input.get("AssertTextPresent@5000"));
		
		//25. Dynamic Wait
		uiDriver.dynamicWait();
		
		//26. Verfies that text $Parama1 is present in 3000 
		uiDriver.checkText("act_verify_TransactionEntries.elt3000",input.get("AssertTextPresent@3000"));
		
		//27. Dynamic Wait
		uiDriver.dynamicWait();
		
		//28. Verfies that text $Parama1 is present in 1000 
		uiDriver.checkText("act_verify_TransactionEntries.elt1000",input.get("AssertTextPresent@1000"));
		
		//29. Dynamic Wait
		uiDriver.dynamicWait();
		
		//30. Verfies that text $Parama1 is present in 2000 
		uiDriver.checkText("act_verify_TransactionEntries.elt2000",input.get("AssertTextPresent@2000"));
		
		//31. Dynamic Wait
		uiDriver.dynamicWait();
		
		//32. Verfies that text $Parama1 is present in No entries found for deal 
		uiDriver.checkText("act_verify_TransactionEntries.eltNo_entries_found_for_deal",input.get("AssertTextPresent@No_entries_found_for_deal"));
		
		//33. Dynamic Wait
		uiDriver.dynamicWait();
		
		//34. Verfies that text $Parama1 is present in 10 
		uiDriver.checkText("act_verify_TransactionEntries.elt10",input.get("AssertTextPresent@10"));
		
		//35. Dynamic Wait
		uiDriver.dynamicWait();
		
		//36. Verfies that text $Parama1 is present in -1000 
		uiDriver.checkText("act_verify_TransactionEntries.elt_1000",input.get("AssertTextPresent@_1000"));
		
		//37. Dynamic Wait
		uiDriver.dynamicWait();
		
		//38. Verfies that text $Parama1 is present in 6500 
		uiDriver.checkText("act_verify_TransactionEntries.elt6500",input.get("AssertTextPresent@6500"));
		
		//39. Dynamic Wait
		uiDriver.dynamicWait();
		
		//40. Verfies that text $Parama1 is present in 10,000 
		uiDriver.checkText("act_verify_TransactionEntries.elt10_000",input.get("AssertTextPresent@10_000"));
		
		//41. Dynamic Wait
		uiDriver.dynamicWait();
		
		//42. Verfies that text $Parama1 is present in 8000 
		uiDriver.checkText("act_verify_TransactionEntries.elt8000",input.get("AssertTextPresent@8000"));
		
		//43. Dynamic Wait
		uiDriver.dynamicWait();
		
		//44. Verfies that text $Parama1 is present in 4000 
		uiDriver.checkText("act_verify_TransactionEntries.elt4000",input.get("AssertTextPresent@4000"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click Online Repay Amount Expand if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.eltOnline_Repay_Amount_Expand",input.get("ClickWithSkip@Online_Repay_Amount_Expand"));
		
		//4. Type $data in Online Repay Amount.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtOnline_Repay_Amount_1", input.get("Type@Online_Repay_Amount_1"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Type $data in Online Repay Type.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtOnline_Repay_Type_1", input.get("Type@Online_Repay_Type_1"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Type $data in Online Repay Amount.2 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtOnline_Repay_Amount_2", input.get("Type@Online_Repay_Amount_2"));
		
		//9. Dynamic Wait
		uiDriver.dynamicWait();
		
		//10. Type $data in Online Repay Type.2 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtOnline_Repay_Type_2", input.get("Type@Online_Repay_Type_2"));
		
		//11. Dynamic Wait
		uiDriver.dynamicWait();
		
		//12. Enter global value for the key $Parama1 in Bill Reference Number.1 
		uiDriver.checkTextGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.eltBill_Reference_Number_1", input.get("AssertGlobalValueTextPresent@Bill_Reference_Number_1"));
		
		//13. Dynamic Wait
		uiDriver.dynamicWait();
		
		//14. Type $Parama1 Date in Repay Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtRepay_Date", input.get("TypeDate@Repay_Date"));
		
		//15. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//16. Enter global value for the key $Parama1 in Principal Liq Acct 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_IMP.txtPrincipal_Liq_Acct", input.get("TypeGlobalValue@Principal_Liq_Acct"));
		
		//17. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_LD_SCHEDULE_DEFINE(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $data in Forward.Backward.Key field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtForward_Backward_Key", input.get("Type@Forward_Backward_Key"));
		
		//4. Type $data in Base.DateKey field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtBase_DateKey", input.get("Type@Base_DateKey"));
		
		//5. Click Expand MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_SCHEDULE_DEFINE.eltExpand_MultiValue",input.get("ClickWithSkip@Expand_MultiValue"));
		
		//6. Type $data in Sch Type.1 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtSch_Type_1", input.get("Type@Sch_Type_1"));
		
		//7. Type $Parama1 Date in Date.1  textbox
		uiDriver.TypeDate("act_fill_LD_SCHEDULE_DEFINE.txtDate_1", input.get("TypeDate@Date_1"));
		
		//8. Type $data in Amount.1 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtAmount_1", input.get("Type@Amount_1"));
		
		//9. Type $data in Frequency.1 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtFrequency_1", input.get("Type@Frequency_1"));
		
		//10. Type $data in Sch Type.2 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtSch_Type_2", input.get("Type@Sch_Type_2"));
		
		//11. Type $Parama1 Date in Date.2  textbox
		uiDriver.TypeDate("act_fill_LD_SCHEDULE_DEFINE.txtDate_2", input.get("TypeDate@Date_2"));
		
		//12. Type $data in Amount.2 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtAmount_2", input.get("Type@Amount_2"));
		
		//13. Type $data in Frequency.2 field
		uiDriver.setValue("act_fill_LD_SCHEDULE_DEFINE.txtFrequency_2", input.get("Type@Frequency_2"));
		
		//14. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//15. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_verify_limit(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Verfies that text $Parama1 is present in Utilisation 
		uiDriver.checkText("act_verify_limit.eltUtilisation",input.get("AssertTextPresent@Utilisation"));
		
		//4. Verfies that text $Parama1 is present in Available Amt.1 
		uiDriver.checkText("act_verify_limit.eltAvailable_Amt_1",input.get("AssertTextPresent@Available_Amt_1"));
		
		//5. Verfies that text $Parama1 is present in Max Total 
		uiDriver.checkText("act_verify_limit.eltMax_Total",input.get("AssertTextPresent@Max_Total"));
		
		//6. Dynamic Wait
		uiDriver.dynamicWait();
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void assert_texterror(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Verfies that text $Parama1 is present in Loan Type 
		uiDriver.checkText("assert_texterror.eltLoan_Type",input.get("AssertTextPresent@Loan_Type"));
		
		//3. Verfies that text $Parama1 is present in Purpose Code 
		uiDriver.checkText("assert_texterror.eltPurpose_Code",input.get("AssertTextPresent@Purpose_Code"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//5. Click Import Lc Basic Info if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("assert_texterror.eltImport_Lc_Basic_Info",input.get("ClickWithSkip@Import_Lc_Basic_Info"));
		
		//6. Type $Parama1 Date in Lc Issue Date  textbox
		uiDriver.TypeDate("assert_texterror.txtLc_Issue_Date", input.get("TypeDate@Lc_Issue_Date"));
		
		//7. Verfies that text $Parama1 is present in Error Message 
		uiDriver.checkText("assert_texterror.eltError_Message",input.get("AssertTextPresent@Error_Message"));
		
		//8. Check  Sub Category is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltSub_Category",input.get("AssertElementPresent@Sub_Category"));
		
		//9. Check  Product Purpose is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltProduct_Purpose",input.get("AssertElementPresent@Product_Purpose"));
		
		//10. Check  Same Day is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltSame_Day",input.get("AssertElementPresent@Same_Day"));
		
		//11. Check  Commt Amt Avail.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltCommt_Amt_Avail_1",input.get("AssertElementPresent@Commt_Amt_Avail_1"));
		
		//12. Check  Expiry Type is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltExpiry_Type",input.get("AssertElementPresent@Expiry_Type"));
		
		//13. Check  Intrest Spread is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltIntrest_Spread",input.get("AssertElementPresent@Intrest_Spread"));
		
		//14. Check  Amount.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltAmount_1",input.get("AssertElementPresent@Amount_1"));
		
		//15. Check  Repay Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror.eltRepay_Date",input.get("AssertElementPresent@Repay_Date"));
		
	}
	
	public void act_fill_DE_PRODUCT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Click MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_DE_PRODUCT.eltMultiValue",input.get("ClickWithSkip@MultiValue#1"));
		
		//4. Click MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_DE_PRODUCT.eltMultiValue",input.get("ClickWithSkip@MultiValue#2"));
		
		//5. Click MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_DE_PRODUCT.eltMultiValue",input.get("ClickWithSkip@MultiValue#3"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Type $data in Carrier Address No.1 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCarrier_Address_No_1", input.get("Type@Carrier_Address_No_1"));
		
		//8. Type $data in Language.1 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtLanguage_1", input.get("Type@Language_1"));
		
		//9. Type $data in Format.1 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtFormat_1", input.get("Type@Format_1"));
		
		//10. Type $data in Copies.1 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCopies_1", input.get("Type@Copies_1"));
		
		//11. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//12. Type $data in Carrier Address No.2 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCarrier_Address_No_2", input.get("Type@Carrier_Address_No_2"));
		
		//13. Type $data in Language.2 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtLanguage_2", input.get("Type@Language_2"));
		
		//14. Type $data in Format.2 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtFormat_2", input.get("Type@Format_2"));
		
		//15. Type $data in Copies.2 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCopies_2", input.get("Type@Copies_2"));
		
		//16. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//17. Type $data in Carrier Address No.3 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCarrier_Address_No_3", input.get("Type@Carrier_Address_No_3"));
		
		//18. Type $data in Language.3 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtLanguage_3", input.get("Type@Language_3"));
		
		//19. Type $data in Format.3 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtFormat_3", input.get("Type@Format_3"));
		
		//20. Type $data in Copies.3 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCopies_3", input.get("Type@Copies_3"));
		
		//21. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//22. Type $data in Carrier Address No.4 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCarrier_Address_No_4", input.get("Type@Carrier_Address_No_4"));
		
		//23. Type $data in Language.4 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtLanguage_4", input.get("Type@Language_4"));
		
		//24. Type $data in Format.4 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtFormat_4", input.get("Type@Format_4"));
		
		//25. Type $data in Copies.4 field
		uiDriver.setValue("act_fill_DE_PRODUCT.txtCopies_4", input.get("Type@Copies_4"));
		
		//26. Dynamic Wait
		uiDriver.dynamicWait();
		
		//27. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
	}
	

	/**
	*Overriding toString() method of object class to print TradeFinance
	*format string
	**/
	public String toString(){
		return "TradeFinanceDriver()";
	}
}
