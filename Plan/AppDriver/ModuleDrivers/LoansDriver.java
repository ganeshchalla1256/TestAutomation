/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:30
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
public class LoansDriver extends BaseWebModuleDriver {
	public LoansDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_commitmentId(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Input Commitment 
		uiDriver.typeGlobalValue("fill_commitmentId.txtInput_Commitment", input.get("TypeGlobalValue@Input_Commitment"));
		
	}
	
	public void fill_contractId(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in ContractId 
		uiDriver.typeGlobalValue("fill_contractId.txtContractId", input.get("TypeGlobalValue@ContractId"));
		
	}
	
	public void act_check_NoMatches(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in No records matched the selection criteria 
		uiDriver.checkText("act_check_NoMatches.eltNo_records_matched_the_selection_criteria",input.get("AssertTextPresent@No_records_matched_the_selection_criteria"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Set RunTime Global Value from getting the text  Loan Id to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltLoan_Id",input.get("setRunTimeGlobalValue@Loan_Id"));
		
		//4. Type $data in CustomerId field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCustomerId", input.get("Type@CustomerId"));
		
		//5. Enter global value for the key $Parama1 in CustomerId 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCustomerId", input.get("TypeGlobalValue@CustomerId"));
		
		//6. Type $data in Currency field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCurrency", input.get("Type@Currency"));
		
		//7. Type $data in Total Commitment Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtTotal_Commitment_Amount", input.get("Type@Total_Commitment_Amount"));
		
		//8. Type $data in Commitment Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Amount", input.get("Type@Commitment_Amount"));
		
		//9. Type $data in Unavailable Commitment Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtUnavailable_Commitment_Amount", input.get("Type@Unavailable_Commitment_Amount"));
		
		//10. Type $data in Commitment Remarks field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Remarks", input.get("Type@Commitment_Remarks"));
		
		//11. Type $data in Business Day Def field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtBusiness_Day_Def", input.get("Type@Business_Day_Def"));
		
		//12. Type $data in Commitment Type field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Type", input.get("Type@Commitment_Type#2"));
		
		//13. Type $Parama1 Date in Commitment Start Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Start_Date", input.get("TypeDate@Commitment_Start_Date"));
		
		//14. Type $data in Commitment End Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_End_Date", input.get("Type@Commitment_End_Date"));
		
		//15. Type $Parama1 Date in Commitment End Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_End_Date", input.get("TypeDate@Commitment_End_Date"));
		
		//16. Type $data in Calculation Basis field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCalculation_Basis", input.get("Type@Calculation_Basis"));
		
		//17. Type $data in Commitment Fee Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Fee_Rate", input.get("Type@Commitment_Fee_Rate"));
		
		//18. Click Same Day No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltSame_Day_No",input.get("ClickWithSkip@Same_Day_No"));
		
		//19. Click Same Day Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltSame_Day_Yes",input.get("ClickWithSkip@Same_Day_Yes"));
		
		//20. Type $data in Interest Basis field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtInterest_Basis", input.get("Type@Interest_Basis"));
		
		//21. Type $data in Commitment Type field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCommitment_Type", input.get("Type@Commitment_Type#1"));
		
		//22. Click Limit Impact None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltLimit_Impact_None",input.get("ClickWithSkip@Limit_Impact_None"));
		
		//23. Click Limit Impact No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltLimit_Impact_No",input.get("ClickWithSkip@Limit_Impact_No"));
		
		//24. Click Limit Impact Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltLimit_Impact_Yes",input.get("ClickWithSkip@Limit_Impact_Yes"));
		
		//25. Type $data in Limit Reference field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtLimit_Reference", input.get("Type@Limit_Reference"));
		
		//26. Click Secured None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltSecured_None",input.get("ClickWithSkip@Secured_None"));
		
		//27. Click Secured No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltSecured_No",input.get("ClickWithSkip@Secured_No"));
		
		//28. Click Secured Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltSecured_Yes",input.get("ClickWithSkip@Secured_Yes"));
		
		//29. Click Drawings Allowed None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltDrawings_Allowed_None",input.get("ClickWithSkip@Drawings_Allowed_None"));
		
		//30. Click Drawings Allowed No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltDrawings_Allowed_No",input.get("ClickWithSkip@Drawings_Allowed_No"));
		
		//31. Click Drawings Allowed Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltDrawings_Allowed_Yes",input.get("ClickWithSkip@Drawings_Allowed_Yes"));
		
		//32. Type $data in Tranche Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtTranche_Amount", input.get("Type@Tranche_Amount"));
		
		//33. Type $Parama1 Date in Drawdown Start Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtDrawdown_Start_Date", input.get("TypeDate@Drawdown_Start_Date"));
		
		//34. Type $Parama1 Date in Drawdown End Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtDrawdown_End_Date", input.get("TypeDate@Drawdown_End_Date"));
		
		//35. Type $data in Auto Schedule field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtAuto_Schedule", input.get("Type@Auto_Schedule"));
		
		//36. Type $data in Define Schedule field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtDefine_Schedule", input.get("Type@Define_Schedule"));
		
		//37. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Embedded loan id to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtEmbedded_loan_id",input.get("setRunTimeGlobalValue@Embedded_loan_id"));
		
		//4. Enter global value for the key $Parama1 in Customer Id 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtCustomer_Id", input.get("TypeGlobalValue@Customer_Id"));
		
		//5. Type $data in Currency field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtCurrency", input.get("Type@Currency"));
		
		//6. Type $data in Loan Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtLoan_Amount", input.get("Type@Loan_Amount"));
		
		//7. Type $data in Business Day Ref field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtBusiness_Day_Ref", input.get("Type@Business_Day_Ref"));
		
		//8. Type $Parama1 Date in LoanStartDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtLoanStartDate", input.get("TypeDate@LoanStartDate"));
		
		//9. Type $Parama1 Date in LoanMaturityDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtLoanMaturityDate", input.get("TypeDate@LoanMaturityDate"));
		
		//10. Click LongShort_Long if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnLongShort_Long",input.get("ClickWithSkip@LongShort_Long"));
		
		//11. Click LongShort_Short if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnLongShort_Short",input.get("ClickWithSkip@LongShort_Short"));
		
		//12. Select $data from the Code of Purpose list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstCode_of_Purpose", input.get("Select@Code_of_Purpose"));
		
		//13. Click Recourse_No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnRecourse_No",input.get("ClickWithSkip@Recourse_No"));
		
		//14. Click Recourse_others if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnRecourse_others",input.get("ClickWithSkip@Recourse_others"));
		
		//15. Click Recourse_Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnRecourse_Yes",input.get("ClickWithSkip@Recourse_Yes"));
		
		//16. Click Issue Accural_Acturial if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnIssue_Accural_Acturial",input.get("ClickWithSkip@Issue_Accural_Acturial"));
		
		//17. Click Issue Accural_Linear if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnIssue_Accural_Linear",input.get("ClickWithSkip@Issue_Accural_Linear"));
		
		//18. Click Issue Accural_No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnIssue_Accural_No",input.get("ClickWithSkip@Issue_Accural_No"));
		
		//19. Click Interest Payment method_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnInterest_Payment_method_1",input.get("ClickWithSkip@Interest_Payment_method_1"));
		
		//20. Click Interest Payment method_2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnInterest_Payment_method_2",input.get("ClickWithSkip@Interest_Payment_method_2"));
		
		//21. Select $data from the Interest type list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstInterest_type", input.get("Select@Interest_type"));
		
		//22. Select $data from the Interest basis list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstInterest_basis", input.get("Select@Interest_basis"));
		
		//23. Type $data in Interest rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtInterest_rate", input.get("Type@Interest_rate"));
		
		//24. Type $data in IS rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtIS_rate", input.get("Type@IS_rate"));
		
		//25. Type $data in Interest Key field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtInterest_Key", input.get("Type@Interest_Key"));
		
		//26. Select $data from the Negative Rate_No list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstNegative_Rate_No", input.get("Select@Negative_Rate_No"));
		
		//27. Select $data from the BaseRate Code_BA list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstBaseRate_Code_BA", input.get("Select@BaseRate_Code_BA"));
		
		//28. Type $data in Margin field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtMargin", input.get("Type@Margin"));
		
		//29. Type $data in Liquidation Mode field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtLiquidation_Mode", input.get("Type@Liquidation_Mode"));
		
		//30. Type $data in Sub Category field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtSub_Category", input.get("Type@Sub_Category"));
		
		//31. Select $data from the Product Purpose list
		uiDriver.select("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.lstProduct_Purpose", input.get("Select@Product_Purpose"));
		
		//32. Click AdviceDetails if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnAdviceDetails",input.get("ClickWithSkip@AdviceDetails"));
		
		//33. Type $data in Customer rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtCustomer_rate", input.get("Type@Customer_rate"));
		
		//34. Type $Parama1 Date in IntStartDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtIntStartDate", input.get("TypeDate@IntStartDate"));
		
		//35. Type $Parama1 Date in IntEndDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtIntEndDate", input.get("TypeDate@IntEndDate"));
		
		//36. Click Interest year basis DpDown if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.eltInterest_year_basis_DpDown",input.get("ClickWithSkip@Interest_year_basis_DpDown"));
		
		//37. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//38. Click Interest year basis DpDown A if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.eltInterest_year_basis_DpDown_A",input.get("ClickWithSkip@Interest_year_basis_DpDown_A"));
		
		//39. Type $data in Interest payable field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtInterest_payable", input.get("Type@Interest_payable"));
		
		//40. Click Advice Flag Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.eltAdvice_Flag_Y",input.get("ClickWithSkip@Advice_Flag_Y"));
		
		//41. Click IntandScheduledetails if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnIntandScheduledetails",input.get("ClickWithSkip@IntandScheduledetails"));
		
		//42. Click Capitalise Interest_No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnCapitalise_Interest_No",input.get("ClickWithSkip@Capitalise_Interest_No"));
		
		//43. Click Capitalise Interest_Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnCapitalise_Interest_Yes",input.get("ClickWithSkip@Capitalise_Interest_Yes"));
		
		//44. Type $data in Interest accural method field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtInterest_accural_method", input.get("Type@Interest_accural_method"));
		
		//45. Type $data in Auto Schedule field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtAuto_Schedule", input.get("Type@Auto_Schedule"));
		
		//46. Type $data in Define Schedule field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtDefine_Schedule", input.get("Type@Define_Schedule"));
		
		//47. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//48. Click Account Details Tab if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.btnAccount_Details_Tab",input.get("ClickWithSkip@Account_Details_Tab"));
		
		//49. Enter global value for the key $Parama1 in Drawdown Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtDrawdown_Account", input.get("TypeGlobalValue@Drawdown_Account"));
		
		//50. Type $data in Drawdown Account field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtDrawdown_Account", input.get("Type@Drawdown_Account"));
		
		//51. Enter global value for the key $Parama1 in Principle Liquidation Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtPrinciple_Liquidation_Account", input.get("TypeGlobalValue@Principle_Liquidation_Account"));
		
		//52. Enter global value for the key $Parama1 in Interest Liquidation Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_INPUT.txtInterest_Liquidation_Account", input.get("TypeGlobalValue@Interest_Liquidation_Account"));
		
		//53. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_verify_PV_MANAGEMENT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Check  GB Description is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltGB_Description",input.get("AssertElementPresent@GB_Description"));
		
		//4. Check  Job Frequency is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltJob_Frequency",input.get("AssertElementPresent@Job_Frequency"));
		
		//5. Check  Posting Timing is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltPosting_Timing",input.get("AssertElementPresent@Posting_Timing"));
		
		//6. Check  Posting Delay is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltPosting_Delay",input.get("AssertElementPresent@Posting_Delay"));
		
		//7. Check  Profile Id is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltProfile_Id",input.get("AssertElementPresent@Profile_Id"));
		
		//8. Check  Class Level is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltClass_Level",input.get("AssertElementPresent@Class_Level"));
		
		//9. Check  Product.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltProduct_1",input.get("AssertElementPresent@Product_1"));
		
		//10. Check  Class Rule.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltClass_Rule_1",input.get("AssertElementPresent@Class_Rule_1"));
		
		//11. Check  Categ Start.1.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltCateg_Start_1_1",input.get("AssertElementPresent@Categ_Start_1_1"));
		
		//12. Check  Categ End.1.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltCateg_End_1_1",input.get("AssertElementPresent@Categ_End_1_1"));
		
		//13. Check  Class Frequency is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltClass_Frequency",input.get("AssertElementPresent@Class_Frequency"));
		
		//14. Check  Calc Post Freq is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_MANAGEMENT.eltCalc_Post_Freq",input.get("AssertElementPresent@Calc_Post_Freq"));
		
		//15. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_fill_COS_PROCESS_STATUS(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#1"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//4. Enter global value for the key $Parama1 in Process 
		uiDriver.typeGlobalValue("act_fill_COS_PROCESS_STATUS.txtProcess", input.get("TypeGlobalValue@Process"));
		
		//5. Type $data in Activity Status field
		uiDriver.setValue("act_fill_COS_PROCESS_STATUS.txtActivity_Status", input.get("Type@Activity_Status"));
		
		//6. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltFind",input.get("ClickWithSkip@Find"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//8. Click Execute Activity if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltExecute_Activity",input.get("ClickWithSkip@Execute_Activity"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//10. Click Other Normal Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltOther_Normal_Funding_Creation",input.get("ClickWithSkip@Other_Normal_Funding_Creation"));
		
		//11. Click Embedded Normal Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltEmbedded_Normal_Funding_Creation",input.get("ClickWithSkip@Embedded_Normal_Funding_Creation"));
		
		//12. Click Pending if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltPending",input.get("ClickWithSkip@Pending"));
		
		//13. Click Normal Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltNormal_Funding_Creation",input.get("ClickWithSkip@Normal_Funding_Creation"));
		
		//14. Click Special Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltSpecial_Funding_Creation",input.get("ClickWithSkip@Special_Funding_Creation"));
		
		//15. Click Commitment set up & Loan under comm if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltCommitment_set_up_Loan_under_comm",input.get("ClickWithSkip@Commitment_set_up_Loan_under_comm"));
		
		//16. Click Decision by LOD Maker_Pending if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltDecision_by_LOD_Maker_Pending",input.get("ClickWithSkip@Decision_by_LOD_Maker_Pending"));
		
		//17. Click Decision by LOD Checker_Pending if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltDecision_by_LOD_Checker_Pending",input.get("ClickWithSkip@Decision_by_LOD_Checker_Pending"));
		
		//18. Click Other Special Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltOther_Special_Funding_Creation",input.get("ClickWithSkip@Other_Special_Funding_Creation"));
		
		//19. Click Embedded Special Funding Creation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltEmbedded_Special_Funding_Creation",input.get("ClickWithSkip@Embedded_Special_Funding_Creation"));
		
		//20. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//21. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//22. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#2"));
		
		//23. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//24. Enter global value for the key $Parama1 in Transaction Reference 
		uiDriver.typeGlobalValue("act_fill_COS_PROCESS_STATUS.txtTransaction_Reference", input.get("TypeGlobalValue@Transaction_Reference"));
		
		//25. Type $data in Transaction Type field
		uiDriver.setValue("act_fill_COS_PROCESS_STATUS.txtTransaction_Type", input.get("Type@Transaction_Type"));
		
		//26. Click Commitment Set Up if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.btnCommitment_Set_Up",input.get("ClickWithSkip@Commitment_Set_Up"));
		
		//27. Click Loan Under Commitment if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.btnLoan_Under_Commitment",input.get("ClickWithSkip@Loan_Under_Commitment"));
		
		//28. ClickAndSwitchWindow $Parama1 Context Enquiry
		uiDriver.ClickAndSwitchWindow("act_fill_COS_PROCESS_STATUS.eltContext_Enquiry",input.get("ClickAndSwitchWindow@Context_Enquiry"));
		
		//29. Click Loan View if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltLoan_View",input.get("ClickWithSkip@Loan_View"));
		
		//30. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#9"));
		
		//31. Click Amend if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.btnAmend",input.get("ClickWithSkip@Amend"));
		
		//32. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#10"));
		
		//33. Type $data in Interest Rate Fixed field
		uiDriver.setValue("act_fill_COS_PROCESS_STATUS.txtInterest_Rate_Fixed", input.get("Type@Interest_Rate_Fixed"));
		
		//34. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//35. Click Accepted if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltAccepted",input.get("ClickWithSkip@Accepted"));
		
		//36. Click Rejected if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltRejected",input.get("ClickWithSkip@Rejected"));
		
		//37. Click Validate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltValidate",input.get("ClickWithSkip@Validate"));
		
		//38. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#7"));
		
		//39. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//40. Click Commit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltCommit",input.get("ClickWithSkip@Commit"));
		
		//41. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
		//42. clickIfPresent AcceptOverride
		uiDriver.clickIfPresent("act_fill_COS_PROCESS_STATUS.eltAcceptOverride");
		
		//43. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#8"));
		
		//44. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//45. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#3"));
		
		//46. Click Refresh if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_PROCESS_STATUS.eltRefresh",input.get("ClickWithSkip@Refresh"));
		
		//47. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
	}
	
	public void act_fill_EB_FREE_MESSAGE_MUFGHK_FM799(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Set RunTime Global Value from getting the text  Free Format Msg ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.eltFree_Format_Msg_ID",input.get("setRunTimeGlobalValue@Free_Format_Msg_ID"));
		
		//4. Enter global value for the key $Parama1 in Transaction ref 
		uiDriver.typeGlobalValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.txtTransaction_ref", input.get("TypeGlobalValue@Transaction_ref"));
		
		//5. Enter global value for the key $Parama1 in Our reference 
		uiDriver.typeGlobalValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.txtOur_reference", input.get("TypeGlobalValue@Our_reference"));
		
		//6. Enter global value for the key $Parama1 in Receiver customer 
		uiDriver.typeGlobalValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.txtReceiver_customer", input.get("TypeGlobalValue@Receiver_customer"));
		
		//7. Type $data in Message Text field
		uiDriver.setValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.txtMessage_Text", input.get("Type@Message_Text"));
		
		//8. Type $data in Internal remarks field
		uiDriver.setValue("act_fill_EB_FREE_MESSAGE_MUFGHK_FM799.txtInternal_remarks", input.get("Type@Internal_remarks"));
		
	}
	
	public void act_fill_LOCAL_Tab_Fields_General_Loan_Creation(DataRow input, DataRow output) {
		//1. Click Disbursment mode_Payment Order if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnDisbursment_mode_Payment_Order",input.get("ClickWithSkip@Disbursment_mode_Payment_Order"));
		
		//2. Click Disbursment mode_Direct MT if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnDisbursment_mode_Direct_MT",input.get("ClickWithSkip@Disbursment_mode_Direct_MT"));
		
		//3. Type $data in Payment Order Product field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtPayment_Order_Product", input.get("Type@Payment_Order_Product"));
		
		//4. Type $data in Nostro Account field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtNostro_Account", input.get("Type@Nostro_Account"));
		
		//5. Enter global value for the key $Parama1 in Nostro Account 
		uiDriver.typeGlobalValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtNostro_Account", input.get("TypeGlobalValue@Nostro_Account"));
		
		//6. Enter global value for the key $Parama1 in PO Reference 
		uiDriver.typeGlobalValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtPO_Reference", input.get("TypeGlobalValue@PO_Reference"));
		
		//7. Type $data in PO Reference field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtPO_Reference", input.get("Type@PO_Reference"));
		
		//8. Enter global value for the key $Parama1 in Benificiary Account Number 
		uiDriver.typeGlobalValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtBenificiary_Account_Number", input.get("TypeGlobalValue@Benificiary_Account_Number"));
		
		//9. Type $data in Beneficiary Name field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtBeneficiary_Name", input.get("Type@Beneficiary_Name"));
		
		//10. Type $data in Acct with Clearing Code field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtAcct_with_Clearing_Code", input.get("Type@Acct_with_Clearing_Code"));
		
		//11. Type $data in Acct with Bank BIC field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtAcct_with_Bank_BIC", input.get("Type@Acct_with_Bank_BIC"));
		
		//12. Click Acct with Swift Address.1_multiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnAcct_with_Swift_Address_1_multiValue",input.get("ClickWithSkip@Acct_with_Swift_Address_1_multiValue#1"));
		
		//13. Click Acct with Swift Address.1_multiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnAcct_with_Swift_Address_1_multiValue",input.get("ClickWithSkip@Acct_with_Swift_Address_1_multiValue#2"));
		
		//14. Type $data in Acct with Swift Address.1 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtAcct_with_Swift_Address_1", input.get("Type@Acct_with_Swift_Address_1"));
		
		//15. Type $data in Acct with Swift Address.2 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtAcct_with_Swift_Address_2", input.get("Type@Acct_with_Swift_Address_2"));
		
		//16. Type $data in Acct with Swift Address.3 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtAcct_with_Swift_Address_3", input.get("Type@Acct_with_Swift_Address_3"));
		
		//17. Type $data in Receiver BIC field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtReceiver_BIC", input.get("Type@Receiver_BIC"));
		
		//18. Click Remittance Information.1_MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnRemittance_Information_1_MultiValue",input.get("ClickWithSkip@Remittance_Information_1_MultiValue#1"));
		
		//19. Click Remittance Information.1_MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnRemittance_Information_1_MultiValue",input.get("ClickWithSkip@Remittance_Information_1_MultiValue#2"));
		
		//20. Click Remittance Information.1_MultiValue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.btnRemittance_Information_1_MultiValue",input.get("ClickWithSkip@Remittance_Information_1_MultiValue#3"));
		
		//21. Type $data in Remittance Information.1 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtRemittance_Information_1", input.get("Type@Remittance_Information_1"));
		
		//22. Type $data in Remittance Information.2 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtRemittance_Information_2", input.get("Type@Remittance_Information_2"));
		
		//23. Type $data in Remittance Information.3 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtRemittance_Information_3", input.get("Type@Remittance_Information_3"));
		
		//24. Type $data in Remittance Information.4 field
		uiDriver.setValue("act_fill_LOCAL_Tab_Fields_General_Loan_Creation.txtRemittance_Information_4", input.get("Type@Remittance_Information_4"));
		
	}
	
	public void act_fill_Advice_Details_Tab(DataRow input, DataRow output) {
		//1. Click Advice Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Advice_Details_Tab.eltAdvice_Details",input.get("ClickWithSkip@Advice_Details"));
		
		//2. Click Send Payment_NO if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Advice_Details_Tab.btnSend_Payment_NO",input.get("ClickWithSkip@Send_Payment_NO"));
		
		//3. Click Send Payment_YES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Advice_Details_Tab.btnSend_Payment_YES",input.get("ClickWithSkip@Send_Payment_YES"));
		
		//4. Click Send Confirmation_NO if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Advice_Details_Tab.btnSend_Confirmation_NO",input.get("ClickWithSkip@Send_Confirmation_NO"));
		
		//5. Click Send Confirmation_YES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Advice_Details_Tab.btnSend_Confirmation_YES",input.get("ClickWithSkip@Send_Confirmation_YES"));
		
	}
	
	public void act_fill_prov_cust_branch_code(DataRow input, DataRow output) {
		//1. Type $data in Prov Cust Code field
		uiDriver.setValue("act_fill_prov_cust_branch_code.txtProv_Cust_Code", input.get("Type@Prov_Cust_Code"));
		
		//2. Type $data in Prov Branch Code field
		uiDriver.setValue("act_fill_prov_cust_branch_code.txtProv_Branch_Code", input.get("Type@Prov_Branch_Code"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Input Discounted Loan ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltInput_Discounted_Loan_ID",input.get("setRunTimeGlobalValue@Input_Discounted_Loan_ID"));
		
		//4. Enter global value for the key $Parama1 in Customer Id 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtCustomer_Id", input.get("TypeGlobalValue@Customer_Id"));
		
		//5. Type $data in Currency field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtCurrency", input.get("Type@Currency"));
		
		//6. Type $data in Loan Amount.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtLoan_Amount_1", input.get("Type@Loan_Amount_1"));
		
		//7. Type $data in Business Day Def.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtBusiness_Day_Def_1", input.get("Type@Business_Day_Def_1"));
		
		//8. Type $Parama1 Date in Loan Start Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtLoan_Start_Date", input.get("TypeDate@Loan_Start_Date"));
		
		//9. Type $Parama1 Date in Loan Maturity Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtLoan_Maturity_Date", input.get("TypeDate@Loan_Maturity_Date"));
		
		//10. Enter global value for the key $Parama1 in Commitment Ref 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtCommitment_Ref", input.get("TypeGlobalValue@Commitment_Ref"));
		
		//11. Click Long Short Long if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltLong_Short_Long",input.get("ClickWithSkip@Long_Short_Long"));
		
		//12. Click Long Short Short if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltLong_Short_Short",input.get("ClickWithSkip@Long_Short_Short"));
		
		//13. Click Recourse No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltRecourse_No",input.get("ClickWithSkip@Recourse_No"));
		
		//14. Click Recourse Others if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltRecourse_Others",input.get("ClickWithSkip@Recourse_Others"));
		
		//15. Click Recourse Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltRecourse_Yes",input.get("ClickWithSkip@Recourse_Yes"));
		
		//16. Click Issue Accrual Actuarial if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltIssue_Accrual_Actuarial",input.get("ClickWithSkip@Issue_Accrual_Actuarial"));
		
		//17. Click Issue Accrual Linear if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltIssue_Accrual_Linear",input.get("ClickWithSkip@Issue_Accrual_Linear"));
		
		//18. Click Issue Accrual No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltIssue_Accrual_No",input.get("ClickWithSkip@Issue_Accrual_No"));
		
		//19. Type $data in Code of Purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtCode_of_Purpose", input.get("Type@Code_of_Purpose"));
		
		//20. Type $data in Interest Type field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtInterest_Type", input.get("Type@Interest_Type"));
		
		//21. Type $data in Interest Basis field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtInterest_Basis", input.get("Type@Interest_Basis"));
		
		//22. Click Int Paymt Method None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltInt_Paymt_Method_None",input.get("ClickWithSkip@Int_Paymt_Method_None"));
		
		//23. Click Int Paymt Method 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltInt_Paymt_Method_1",input.get("ClickWithSkip@Int_Paymt_Method_1"));
		
		//24. Click Int Paymt Method 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltInt_Paymt_Method_2",input.get("ClickWithSkip@Int_Paymt_Method_2"));
		
		//25. Type $data in Interest Rate Fixed field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtInterest_Rate_Fixed", input.get("Type@Interest_Rate_Fixed"));
		
		//26. Type $data in IS Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtIS_Rate", input.get("Type@IS_Rate"));
		
		//27. Type $data in Interest Key field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtInterest_Key", input.get("Type@Interest_Key"));
		
		//28. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//29. Type $data in Negative Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtNegative_Rate", input.get("Type@Negative_Rate"));
		
		//30. Type $data in Base Rate Code field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtBase_Rate_Code", input.get("Type@Base_Rate_Code"));
		
		//31. Click Use Default PI Rate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltUse_Default_PI_Rate",input.get("ClickWithSkip@Use_Default_PI_Rate"));
		
		//32. Type $data in Limit Reference field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtLimit_Reference", input.get("Type@Limit_Reference"));
		
		//33. Type $data in Liquidation Mode field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtLiquidation_Mode", input.get("Type@Liquidation_Mode"));
		
		//34. Type $data in Yield Method field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtYield_Method", input.get("Type@Yield_Method"));
		
		//35. Type $data in Margin field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtMargin", input.get("Type@Margin"));
		
		//36. Type $data in Sub Category field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtSub_Category", input.get("Type@Sub_Category"));
		
		//37. Type $data in Prod Purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtProd_Purpose", input.get("Type@Prod_Purpose"));
		
		//38. Type $data in Intt Accrual Method field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtIntt_Accrual_Method", input.get("Type@Intt_Accrual_Method"));
		
		//39. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//40. Type $data in Define Schedules field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtDefine_Schedules", input.get("Type@Define_Schedules"));
		
		//41. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//42. Click Account Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.eltAccount_Details",input.get("ClickWithSkip@Account_Details"));
		
		//43. Type $data in Drawdown Account field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtDrawdown_Account", input.get("Type@Drawdown_Account"));
		
		//44. Enter global value for the key $Parama1 in Drawdown Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtDrawdown_Account", input.get("TypeGlobalValue@Drawdown_Account"));
		
		//45. Type $data in Principal Liq Account field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtPrincipal_Liq_Account", input.get("Type@Principal_Liq_Account"));
		
		//46. Enter global value for the key $Parama1 in Principal Liq Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtPrincipal_Liq_Account", input.get("TypeGlobalValue@Principal_Liq_Account"));
		
		//47. Enter global value for the key $Parama1 in Int Liq Acct 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMDR.txtInt_Liq_Acct", input.get("TypeGlobalValue@Int_Liq_Acct"));
		
		//48. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_ENQ_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $data in SAME.DAY.FLAG field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtSAME_DAY_FLAG", input.get("Type@SAME_DAY_FLAG"));
		
		//4. Type $data in COMMITMENT.TYPE field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.txtCOMMITMENT_TYPE", input.get("Type@COMMITMENT_TYPE"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//6. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltFind",input.get("ClickWithSkip@Find"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//8. Check  Currency is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT.eltCurrency",input.get("AssertElementPresent@Currency"));
		
	}
	
	public void act_fill_ENQ_MUFGHK_COMMIT_AUTH_NAU(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Enter global value for the key $Parama1 in Id 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_COMMIT_AUTH_NAU.txtId", input.get("TypeGlobalValue@Id"));
		
		//4. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_COMMIT_AUTH_NAU.eltFind",input.get("ClickWithSkip@Find"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//6. Verfies that text $Parama1 is present in Unavailable Commitment Amt 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_COMMIT_AUTH_NAU.eltUnavailable_Commitment_Amt",input.get("AssertTextPresent@Unavailable_Commitment_Amt"));
		
		//7. Verfies that text $Parama1 is present in Total Commitment Amt 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_COMMIT_AUTH_NAU.eltTotal_Commitment_Amt",input.get("AssertTextPresent@Total_Commitment_Amt"));
		
	}
	
	public void act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST(DataRow input, DataRow output) {
		//1. Type $data in Invoice Ref field
		uiDriver.setValue("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.txtInvoice_Ref", input.get("Type@Invoice_Ref"));
		
		//2. Enter global value for the key $Parama1 in Invoice Ref 
		uiDriver.typeGlobalValue("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.txtInvoice_Ref", input.get("TypeGlobalValue@Invoice_Ref"));
		
		//3. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltFind",input.get("ClickWithSkip@Find"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//5. Verfies that text $Parama1 is present in Id 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltId",input.get("AssertTextPresent@Id"));
		
		//6. Verfies that text $Parama1 is present in Customer Name 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltCustomer_Name",input.get("AssertTextPresent@Customer_Name"));
		
		//7. Verfies that text $Parama1 is present in Product 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltProduct",input.get("AssertTextPresent@Product"));
		
		//8. Verfies that text $Parama1 is present in Ccy 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltCcy",input.get("AssertTextPresent@Ccy"));
		
		//9. Verfies that text $Parama1 is present in Invoice Amount 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltInvoice_Amount",input.get("AssertTextPresent@Invoice_Amount"));
		
		//10. Verfies that text $Parama1 is present in Invoice Due Date 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltInvoice_Due_Date",input.get("AssertTextPresent@Invoice_Due_Date"));
		
		//11. Verfies that text $Parama1 is present in Invoice Reference 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltInvoice_Reference",input.get("AssertTextPresent@Invoice_Reference"));
		
		//12. Verfies that text $Parama1 is present in Loan Status 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltLoan_Status",input.get("AssertTextPresent@Loan_Status"));
		
		//13. Verfies that text $Parama1 is present in Invoice Amount 1 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltInvoice_Amount_1",input.get("AssertTextPresent@Invoice_Amount_1"));
		
		//14. Verfies that text $Parama1 is present in Invoice Amount 2 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_INVOICE_LD_TXNS_LIST.eltInvoice_Amount_2",input.get("AssertTextPresent@Invoice_Amount_2"));
		
	}
	
	public void act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Check  Amendment of Next Interest Period for Embedded Loan is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltAmendment_of_Next_Interest_Period_for_Embedded_Loan",input.get("AssertElementPresent@Amendment_of_Next_Interest_Period_for_Embedded_Loan"));
		
		//4. Check  Int End Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltInt_End_Date",input.get("AssertElementPresent@Int_End_Date"));
		
		//5. Check  Customer Reference is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltCustomer_Reference",input.get("AssertElementPresent@Customer_Reference"));
		
		//6. Check  LD Contract ID is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltLD_Contract_ID",input.get("AssertElementPresent@LD_Contract_ID"));
		
		//7. Check  NO.SORT.OPTION is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltNO_SORT_OPTION",input.get("AssertElementPresent@NO_SORT_OPTION"));
		
		//8. Type $data in Customer Reference field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtCustomer_Reference", input.get("Type@Customer_Reference"));
		
		//9. Enter global value for the key $Parama1 in Customer Reference 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtCustomer_Reference", input.get("TypeGlobalValue@Customer_Reference"));
		
		//10. Type $data in LD Contract ID field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtLD_Contract_ID", input.get("Type@LD_Contract_ID"));
		
		//11. Enter global value for the key $Parama1 in LD Contract ID 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtLD_Contract_ID", input.get("TypeGlobalValue@LD_Contract_ID"));
		
		//12. Type $data in Int End Date field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtInt_End_Date", input.get("Type@Int_End_Date"));
		
		//13. Type $Parama1 Date in Int End Date  textbox
		uiDriver.TypeDate("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.txtInt_End_Date", input.get("TypeDate@Int_End_Date"));
		
		//14. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//15. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltFind",input.get("ClickWithSkip@Find"));
		
		//16. Dynamic Wait
		uiDriver.dynamicWait();
		
		//17. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//18. Check  Customer Rate is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_MUFGHK_EMD_LOAN_AMD_TXNS.eltCustomer_Rate",input.get("AssertElementPresent@Customer_Rate"));
		
		//19. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//20. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_Factoring_Payable_Financial(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click Factoring/Payable Financing if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Factoring_Payable_Financial.eltFactoring_Payable_Financing",input.get("ClickWithSkip@Factoring_Payable_Financing"));
		
		//4. Type $data in Party type field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtParty_type", input.get("Type@Party_type"));
		
		//5. Type $data in Party Name field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtParty_Name", input.get("Type@Party_Name"));
		
		//6. Type $data in Invoice Ref Number field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtInvoice_Ref_Number", input.get("Type@Invoice_Ref_Number"));
		
		//7. Enter global value for the key $Parama1 in Invoice Ref Number 
		uiDriver.typeGlobalValue("act_fill_Factoring_Payable_Financial.txtInvoice_Ref_Number", input.get("TypeGlobalValue@Invoice_Ref_Number"));
		
		//8. Type $Parama1 Date in Invoice Due date  textbox
		uiDriver.TypeDate("act_fill_Factoring_Payable_Financial.txtInvoice_Due_date", input.get("TypeDate@Invoice_Due_date"));
		
		//9. Type $data in Grace Days field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtGrace_Days", input.get("Type@Grace_Days"));
		
		//10. Type $data in Shipment to field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtShipment_to", input.get("Type@Shipment_to"));
		
		//11. Type $data in Shipment from field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtShipment_from", input.get("Type@Shipment_from"));
		
		//12. Type $data in Party rating field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtParty_rating", input.get("Type@Party_rating"));
		
		//13. Type $data in Goods and services info field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtGoods_and_services_info", input.get("Type@Goods_and_services_info"));
		
		//14. Type $data in Party customer id field
		uiDriver.setValue("act_fill_Factoring_Payable_Financial.txtParty_customer_id", input.get("Type@Party_customer_id"));
		
		//15. Enter global value for the key $Parama1 in Party customer id 
		uiDriver.typeGlobalValue("act_fill_Factoring_Payable_Financial.txtParty_customer_id", input.get("TypeGlobalValue@Party_customer_id"));
		
		//16. Send Key Action $Parama1 at Party customer id 
		uiDriver.sendKeyEvents("act_fill_Factoring_Payable_Financial.txtParty_customer_id", input.get("SendKeyAction@Party_customer_id"));
		
		//17. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_EMB(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $data in Online Repay Amount.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_EMB.txtOnline_Repay_Amount_1", input.get("Type@Online_Repay_Amount_1"));
		
		//4. Type $data in Online Repay Type.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_EMB.txtOnline_Repay_Type_1", input.get("Type@Online_Repay_Type_1"));
		
		//5. Type $Parama1 Date in Repay Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND_ONLINE_EMB.txtRepay_Date", input.get("TypeDate@Repay_Date"));
		
		//6. Dynamic Wait
		uiDriver.dynamicWait();
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Verfies that text $Parama1 is present in L.CUST.NAME 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_CUST_NAME",input.get("AssertTextPresent@L_CUST_NAME"));
		
		//4. Verfies that text $Parama1 is present in L.CUS.RES.ID 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_CUS_RES_ID",input.get("AssertTextPresent@L_CUS_RES_ID"));
		
		//5. Verfies that text $Parama1 is present in L.CUST.RATING 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_CUST_RATING",input.get("AssertTextPresent@L_CUST_RATING"));
		
		//6. Verfies that text $Parama1 is present in L.PARTY.TYPE 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_PARTY_TYPE",input.get("AssertTextPresent@L_PARTY_TYPE"));
		
		//7. Verfies that text $Parama1 is present in L.PARTY.CUS.ID 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_PARTY_CUS_ID",input.get("AssertTextPresent@L_PARTY_CUS_ID"));
		
		//8. Verfies that text $Parama1 is present in L.PARTY.NAME 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_PARTY_NAME",input.get("AssertTextPresent@L_PARTY_NAME"));
		
		//9. Verfies that text $Parama1 is present in L.PARTY.RES.ID 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_PARTY_RES_ID",input.get("AssertTextPresent@L_PARTY_RES_ID"));
		
		//10. Verfies that text $Parama1 is present in L.PARTY.RATING 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_PARTY_RATING",input.get("AssertTextPresent@L_PARTY_RATING"));
		
		//11. Verfies that text $Parama1 is present in L.INV.DUE.DATE 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_INV_DUE_DATE",input.get("AssertTextPresent@L_INV_DUE_DATE"));
		
		//12. Verfies that text $Parama1 is present in L.GRACE.DAYS 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_GRACE_DAYS",input.get("AssertTextPresent@L_GRACE_DAYS"));
		
		//13. Verfies that text $Parama1 is present in L.INVOICE.REF 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_INVOICE_REF",input.get("AssertTextPresent@L_INVOICE_REF"));
		
		//14. Verfies that text $Parama1 is present in L.SHIP.TO 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_SHIP_TO",input.get("AssertTextPresent@L_SHIP_TO"));
		
		//15. Verfies that text $Parama1 is present in L.SHIP.FROM 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_SHIP_FROM",input.get("AssertTextPresent@L_SHIP_FROM"));
		
		//16. Verfies that text $Parama1 is present in L.GOODS.SERV 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_GOODS_SERV",input.get("AssertTextPresent@L_GOODS_SERV"));
		
		//17. Verfies that text $Parama1 is present in L.SUB.CATEGORY 
		uiDriver.checkText("act_verify_ENQ_LD_LOANS_AND_DEPOSITS_HIS.eltL_SUB_CATEGORY",input.get("AssertTextPresent@L_SUB_CATEGORY"));
		
	}
	
	public void act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Type $data in ID Contains field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtID_Contains", input.get("Type@ID_Contains"));
		
		//4. Enter global value for the key $Parama1 in ID 
		uiDriver.typeGlobalValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtID", input.get("TypeGlobalValue@ID"));
		
		//5. Type $data in MIS.INTEREST.RATE field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtMIS_INTEREST_RATE", input.get("Type@MIS_INTEREST_RATE"));
		
		//6. Type $Parama1 Date in FIN.MAT.DATE  textbox
		uiDriver.TypeDate("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtFIN_MAT_DATE", input.get("TypeDate@FIN_MAT_DATE"));
		
		//7. Enter global value for the key $Parama1 in L.INVOICE.REF_Number 
		uiDriver.typeGlobalValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_INVOICE_REF_Number", input.get("TypeGlobalValue@L_INVOICE_REF_Number"));
		
		//8. Type $data in L.INVOICE.REF_Number field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_INVOICE_REF_Number", input.get("Type@L_INVOICE_REF_Number"));
		
		//9. Type $data in L.SHIP.TO field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_SHIP_TO", input.get("Type@L_SHIP_TO"));
		
		//10. Type $data in L.SHIP.FROM field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_SHIP_FROM", input.get("Type@L_SHIP_FROM"));
		
		//11. Type $data in L.PARTY.TYPE field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_PARTY_TYPE", input.get("Type@L_PARTY_TYPE"));
		
		//12. Type $data in L.PARTY.CUS.ID field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_PARTY_CUS_ID", input.get("Type@L_PARTY_CUS_ID"));
		
		//13. Enter global value for the key $Parama1 in L.PARTY.CUS.ID 
		uiDriver.typeGlobalValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_PARTY_CUS_ID", input.get("TypeGlobalValue@L_PARTY_CUS_ID"));
		
		//14. Type $data in L.CUST.NAME field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_CUST_NAME", input.get("Type@L_CUST_NAME"));
		
		//15. Type $data in L.PARTY.NAME field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_HIS.txtL_PARTY_NAME", input.get("Type@L_PARTY_NAME"));
		
	}
	
	public void act_fill_ENQ_LD_LOANS_AND_DEPOSITS(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in ID 
		uiDriver.typeGlobalValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.txtID", input.get("TypeGlobalValue@ID"));
		
		//2. Type $data in LONG.SHORT field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.txtLONG_SHORT", input.get("Type@LONG_SHORT"));
		
		//3. Type $data in Recourse field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.txtRecourse", input.get("Type@Recourse"));
		
		//4. Type $data in MIS.INTEREST.RATE field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.txtMIS_INTEREST_RATE", input.get("Type@MIS_INTEREST_RATE"));
		
		//5. Check  CODE.OF.PURPOSE is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.eltCODE_OF_PURPOSE",input.get("AssertElementPresent@CODE_OF_PURPOSE"));
		
		//6. Check  L.SUB.CATEGORY is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.eltL_SUB_CATEGORY",input.get("AssertElementPresent@L_SUB_CATEGORY"));
		
		//7. Check  L.PROD.CATEGORY is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_ENQ_LD_LOANS_AND_DEPOSITS.eltL_PROD_CATEGORY",input.get("AssertElementPresent@L_PROD_CATEGORY"));
		
	}
	
	public void act_fill_ENQ_LD_LOANS_AND_DEPOSITS_NAU(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Enter global value for the key $Parama1 in ID 
		uiDriver.typeGlobalValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_NAU.txtID", input.get("TypeGlobalValue@ID"));
		
		//4. Type $data in MIS.INTEREST.RATE field
		uiDriver.setValue("act_fill_ENQ_LD_LOANS_AND_DEPOSITS_NAU.txtMIS_INTEREST_RATE", input.get("Type@MIS_INTEREST_RATE"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_verify_LIMIT_MUFGHK_INPUT_fields(DataRow input, DataRow output) {
		//1. Check  GCARS Application Number is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltGCARS_Application_Number",input.get("AssertElementPresent@GCARS_Application_Number"));
		
		//2. Check  GCARS Facility Number is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltGCARS_Facility_Number",input.get("AssertElementPresent@GCARS_Facility_Number"));
		
		//3. Check  Ringi.Satei is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRingi_Satei",input.get("AssertElementPresent@Ringi_Satei"));
		
		//4. Check  Credit Application Type is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Application_Type",input.get("AssertElementPresent@Credit_Application_Type"));
		
		//5. Check  Inter-office branch code is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_branch_code",input.get("AssertElementPresent@Inter_office_branch_code"));
		
		//6. Check  Inter-office type Field is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type_Field",input.get("AssertElementPresent@Inter_office_type_Field"));
		
		//7. Check  Committed is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCommitted",input.get("AssertElementPresent@Committed"));
		
		//8. Check  Inclusive/Non-inclusive is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInclusive_Non_inclusive",input.get("AssertElementPresent@Inclusive_Non_inclusive"));
		
		//9. Check  Purpose is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltPurpose",input.get("AssertElementPresent@Purpose"));
		
		//10. Check  Syndication is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltSyndication",input.get("AssertElementPresent@Syndication"));
		
		//11. Check  Syndication Status is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltSyndication_Status",input.get("AssertElementPresent@Syndication_Status"));
		
		//12. Check  Syndication Total is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltSyndication_Total",input.get("AssertElementPresent@Syndication_Total"));
		
		//13. Check  Agent Bank is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltAgent_Bank",input.get("AssertElementPresent@Agent_Bank"));
		
		//14. Check  Agent Bank code is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltAgent_Bank_code",input.get("AssertElementPresent@Agent_Bank_code"));
		
		//15. Check  Final Take Amount is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltFinal_Take_Amount",input.get("AssertElementPresent@Final_Take_Amount"));
		
		//16. Check  Credit Facility Term Field is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Facility_Term_Field",input.get("AssertElementPresent@Credit_Facility_Term_Field"));
		
		//17. Check  Repayment Type Field is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type_Field",input.get("AssertElementPresent@Repayment_Type_Field"));
		
		//18. $Parama1 Credit Facility Term
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Facility_Term", input.get("DpdownValCheck@Credit_Facility_Term#1"));
		
		//19. $Parama1 Credit Facility Term
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Facility_Term", input.get("DpdownValCheck@Credit_Facility_Term#2"));
		
		//20. $Parama1 Credit Facility Term
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Facility_Term", input.get("DpdownValCheck@Credit_Facility_Term#3"));
		
		//21. $Parama1 Credit Facility Term
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltCredit_Facility_Term", input.get("DpdownValCheck@Credit_Facility_Term#4"));
		
		//22. $Parama1 Repayment Type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type", input.get("DpdownValCheck@Repayment_Type#1"));
		
		//23. $Parama1 Repayment Type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type", input.get("DpdownValCheck@Repayment_Type#2"));
		
		//24. $Parama1 Repayment Type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type", input.get("DpdownValCheck@Repayment_Type#3"));
		
		//25. $Parama1 Repayment Type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type", input.get("DpdownValCheck@Repayment_Type#4"));
		
		//26. $Parama1 Repayment Type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltRepayment_Type", input.get("DpdownValCheck@Repayment_Type#5"));
		
		//27. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#1"));
		
		//28. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#2"));
		
		//29. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#3"));
		
		//30. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#4"));
		
		//31. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#5"));
		
		//32. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#6"));
		
		//33. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#7"));
		
		//34. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#8"));
		
		//35. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#9"));
		
		//36. $Parama1 Inter-office type
		uiDriver.verifyDpDownList("act_verify_LIMIT_MUFGHK_INPUT_fields.eltInter_office_type", input.get("DpdownValCheck@Inter_office_type#10"));
		
	}
	
	public void assert_texterror_limits(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Check  Inter-office type is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror_limits.eltInter_office_type",input.get("AssertElementPresent@Inter_office_type"));
		
		//3. Check  Credit Facility Term is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror_limits.eltCredit_Facility_Term",input.get("AssertElementPresent@Credit_Facility_Term"));
		
		//4. Check  RepaymentType is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror_limits.eltRepaymentType",input.get("AssertElementPresent@RepaymentType"));
		
		//5. Check  Syndication Status is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror_limits.eltSyndication_Status",input.get("AssertElementPresent@Syndication_Status"));
		
		//6. Check  Final Take Amount is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("assert_texterror_limits.eltFinal_Take_Amount",input.get("AssertElementPresent@Final_Take_Amount"));
		
	}
	
	public void act_fill_loans_local_ref_fields(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Check  Conversion Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_loans_local_ref_fields.eltConversion_Date",input.get("AssertElementPresent@Conversion_Date"));
		
		//3. Verfies that text $Parama1 is present in Original Loan Id 
		uiDriver.checkText("act_fill_loans_local_ref_fields.eltOriginal_Loan_Id",input.get("AssertTextPresent@Original_Loan_Id"));
		
		//4. Type $data in Conversion Date field
		uiDriver.setValue("act_fill_loans_local_ref_fields.txtConversion_Date", input.get("Type@Conversion_Date"));
		
		//5. Type $Parama1 Date in Conversion Date  textbox
		uiDriver.TypeDate("act_fill_loans_local_ref_fields.txtConversion_Date", input.get("TypeDate@Conversion_Date"));
		
		//6. Type $data in Original Loan Id field
		uiDriver.setValue("act_fill_loans_local_ref_fields.txtOriginal_Loan_Id", input.get("Type@Original_Loan_Id"));
		
		//7. Enter global value for the key $Parama1 in Original Loan Id 
		uiDriver.typeGlobalValue("act_fill_loans_local_ref_fields.txtOriginal_Loan_Id", input.get("TypeGlobalValue@Original_Loan_Id"));
		
		//8. Take screenshot of Take Browser
		uiDriver.takescreenshot();
		
	}
	
	public void act_verify_loans_local_ref_fields(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Check  Conversion Date Error is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_local_ref_fields.eltConversion_Date_Error",input.get("AssertElementPresent@Conversion_Date_Error"));
		
		//3. Check  Conversion Date Field is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_local_ref_fields.eltConversion_Date_Field",input.get("AssertElementPresent@Conversion_Date_Field"));
		
		//4. Check  Original Loan Id Field is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_local_ref_fields.eltOriginal_Loan_Id_Field",input.get("AssertElementPresent@Original_Loan_Id_Field"));
		
		//5. Take screenshot of Take Browser
		uiDriver.takescreenshot();
		
	}
	
	public void act_verify_BaseRateCode(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#1"));
		
		//3. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#2"));
		
		//4. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#3"));
		
		//5. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#4"));
		
		//6. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#5"));
		
		//7. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#6"));
		
		//8. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#7"));
		
		//9. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#8"));
		
		//10. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#9"));
		
		//11. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#10"));
		
		//12. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#11"));
		
		//13. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#12"));
		
		//14. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#13"));
		
		//15. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#14"));
		
		//16. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#15"));
		
		//17. $Parama1 Base Rate Code
		uiDriver.verifyDpDownList("act_verify_BaseRateCode.eltBase_Rate_Code", input.get("DpdownValCheck@Base_Rate_Code#16"));
		
	}
	
	public void act_fill_ENQ_MUFGHK_EARLY_MATLN_EMB(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $data in Transaction Ref field
		uiDriver.setValue("act_fill_ENQ_MUFGHK_EARLY_MATLN_EMB.txtTransaction_Ref", input.get("Type@Transaction_Ref"));
		
		//4. Enter global value for the key $Parama1 in Transaction Ref 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_EARLY_MATLN_EMB.txtTransaction_Ref", input.get("TypeGlobalValue@Transaction_Ref"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//6. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//7. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_EARLY_MATLN_EMB.eltFind",input.get("ClickWithSkip@Find"));
		
		//8. Dynamic Wait
		uiDriver.dynamicWait();
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//10. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//11. Click Preclose if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_EARLY_MATLN_EMB.eltPreclose",input.get("ClickWithSkip@Preclose"));
		
		//12. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//13. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//4. Type $data in IS Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB.txtIS_Rate", input.get("Type@IS_Rate"));
		
		//5. Type $Parama1 Date in MaturityDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB.txtMaturityDate", input.get("TypeDate@MaturityDate"));
		
		//6. Enter global value for the key $Parama1 in Principal Liquidation Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB.txtPrincipal_Liquidation_Accnt", input.get("TypeGlobalValue@Principal_Liquidation_Accnt"));
		
		//7. Enter global value for the key $Parama1 in Interest Liquidation Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB.txtInterest_Liquidation_Accnt", input.get("TypeGlobalValue@Interest_Liquidation_Accnt"));
		
		//8. Enter global value for the key $Parama1 in Charge debit Accnt 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_EARLY_MATLN_EMB.txtCharge_debit_Accnt", input.get("TypeGlobalValue@Charge_debit_Accnt"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_ENQ_MUFGHK_ARPS_FILE_UPLOAD_STATUS(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Click Selection Screen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_ARPS_FILE_UPLOAD_STATUS.eltSelection_Screen",input.get("ClickWithSkip@Selection_Screen"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//4. Enter global value for the key $Parama1 in APP.REFERENCE 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_ARPS_FILE_UPLOAD_STATUS.txtAPP_REFERENCE", input.get("TypeGlobalValue@APP_REFERENCE"));
		
		//5. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_ARPS_FILE_UPLOAD_STATUS.eltFind",input.get("ClickWithSkip@Find"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Verfies that text $Parama1 is present in Status 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_ARPS_FILE_UPLOAD_STATUS.eltStatus",input.get("AssertTextPresent@Status"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//9. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_MD_DEAL_MUFGHK_GTAMD(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTAMD.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//4. Type $Parama1 Date in Claim Maturity Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTAMD.txtClaim_Maturity_Date", input.get("TypeDate@Claim_Maturity_Date"));
		
		//5. Type $data in Increase/Decrease Amount field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtIncrease_Decrease_Amount", input.get("Type@Increase_Decrease_Amount"));
		
		//6. Type $Parama1 Date in Effective Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTAMD.txtEffective_Date", input.get("TypeDate@Effective_Date"));
		
		//7. Select $data from the Kind of L/G list
		uiDriver.select("act_fill_MD_DEAL_MUFGHK_GTAMD.lstKind_of_L_G", input.get("Select@Kind_of_L_G"));
		
		//8. Enter global value for the key $Parama1 in Reference.1 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtReference_1", input.get("TypeGlobalValue@Reference_1"));
		
		//9. Dynamic Wait
		uiDriver.dynamicWait();
		
		//10. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//11. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//12. Click Commission if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltCommission",input.get("ClickWithSkip@Commission"));
		
		//13. Type $data in New Rate field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtNew_Rate", input.get("Type@New_Rate"));
		
		//14. Type $Parama1 Date in Comm Effective Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTAMD.txtComm_Effective_Date", input.get("TypeDate@Comm_Effective_Date"));
		
		//15. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//16. Click Charges if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltCharges",input.get("ClickWithSkip@Charges"));
		
		//17. Type $Parama1 Date in Charge Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTAMD.txtCharge_Date", input.get("TypeDate@Charge_Date"));
		
		//18. Type $data in Charge Currency field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtCharge_Currency", input.get("Type@Charge_Currency"));
		
		//19. Enter global value for the key $Parama1 in Charge Debit Account 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtCharge_Debit_Account", input.get("TypeGlobalValue@Charge_Debit_Account"));
		
		//20. Type $data in Charge Code field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtCharge_Code", input.get("Type@Charge_Code"));
		
		//21. Type $data in Charge Amount field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txtCharge_Amount", input.get("Type@Charge_Amount"));
		
		//22. Click Messages if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltMessages",input.get("ClickWithSkip@Messages"));
		
		//23. Click Advice Required No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltAdvice_Required_No",input.get("ClickWithSkip@Advice_Required_No"));
		
		//24. Click Advice Required Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltAdvice_Required_Yes",input.get("ClickWithSkip@Advice_Required_Yes"));
		
		//25. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//26. Click MT 767/775 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTAMD.eltMT_767_775",input.get("ClickWithSkip@MT_767_775"));
		
		//27. Type $data in 26E Number of Amendment field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txt26E_Number_of_Amendment", input.get("Type@26E_Number_of_Amendment"));
		
		//28. Type $data in 77U Other Amends to Undk field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTAMD.txt77U_Other_Amends_to_Undk", input.get("Type@77U_Other_Amends_to_Undk"));
		
		//29. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_AppendUpload_loansSC38_20221013(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_TESTFILESC38_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_loansSC38_20221013.eltUpload_TESTFILESC3820230124_csv",input.get("SetvalueInCsv@Upload_TESTFILESC38_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC51_20221018(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC51TESTFILE20221018_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC51_20221018.eltUpload_SC51TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC51TESTFILE20221018_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC35_20221018(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC35TESTFILE20221018_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC35_20221018.eltUpload_SC35TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC35TESTFILE20221018_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC36_20221018(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC36TESTFILE20221018_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC36_20221018.eltUpload_SC36TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC36TESTFILE20221018_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC54TC001_20221020(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC54TC001TESTFILE20221020_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC54TC001_20221020.eltUpload_SC54TC001TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC54TC001TESTFILE20221020_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC01_20221021(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC01TESTFILE20221021_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC01_20221021.eltUpload_SC01TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC01TESTFILE20221021_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_verify_ENQ_MUFGHK_ARPS_AUDIT_ENQ(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Check  CR1213SC01TC001 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_ENQ_MUFGHK_ARPS_AUDIT_ENQ.eltCR1213SC01TC001",input.get("AssertElementPresent@CR1213SC01TC001"));
		
	}
	
	public void act_AppendUpload_LoansSC02TC001_20221021(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC02TESTFILE20221021_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC02TC001_20221021.eltUpload_SC02TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC02TESTFILE20221021_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE(DataRow input, DataRow output) {
		//1. Click Selection screen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE.btnSelection_screen",input.get("ClickWithSkip@Selection_screen"));
		
		//2. Enter global value for the key $Parama1 in Trans reference 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE.txtTrans_reference", input.get("TypeGlobalValue@Trans_reference"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//4. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE.btnFind",input.get("ClickWithSkip@Find"));
		
		//5. Click View if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE.btnView",input.get("ClickWithSkip@View"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Verfies that text $Parama1 is present in Status 
		uiDriver.checkText("act_fill_ENQ_MUFGHK_ARPS_ORD_STATUS_LOG_NONE.eltStatus",input.get("AssertTextPresent@Status"));
		
	}
	
	public void act_AppendUpload_WrongLoansFile_SC04(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_HKCBSC04WRONGFILE20221108_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_WrongLoansFile_SC04.eltUpload_HKCBSC04WRONGFILE20230124_csv",input.get("SetvalueInCsv@Upload_HKCBSC04WRONGFILE20221108_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_ErrorLoans(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Verfies that text $Parama1 is present in Limit Reference 
		uiDriver.checkText("act_ErrorLoans.eltLimit_Reference",input.get("AssertTextPresent@Limit_Reference"));
		
		//3. Verfies that text $Parama1 is present in Limit Amount.1 
		uiDriver.checkText("act_ErrorLoans.eltLimit_Amount_1",input.get("AssertTextPresent@Limit_Amount_1"));
		
	}
	
	public void act_verify_INLEND_LDPD_PARAMETER(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Check  Category.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_1",input.get("AssertElementPresent@Category_1"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Check  No Of Rollover Allwd.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_1",input.get("AssertElementPresent@No_Of_Rollover_Allwd_1"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Check  Suspense Category.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_1",input.get("AssertElementPresent@Suspense_Category_1"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Check  Category.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_2",input.get("AssertElementPresent@Category_2"));
		
		//9. Dynamic Wait
		uiDriver.dynamicWait();
		
		//10. Check  No Of Rollover Allwd.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_2",input.get("AssertElementPresent@No_Of_Rollover_Allwd_2"));
		
		//11. Dynamic Wait
		uiDriver.dynamicWait();
		
		//12. Check  Suspense Category.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_2",input.get("AssertElementPresent@Suspense_Category_2"));
		
		//13. Dynamic Wait
		uiDriver.dynamicWait();
		
		//14. Check  Category.3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_3",input.get("AssertElementPresent@Category_3"));
		
		//15. Dynamic Wait
		uiDriver.dynamicWait();
		
		//16. Check  No Of Rollover Allwd.3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_3",input.get("AssertElementPresent@No_Of_Rollover_Allwd_3"));
		
		//17. Dynamic Wait
		uiDriver.dynamicWait();
		
		//18. Check  Suspense Category.3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_3",input.get("AssertElementPresent@Suspense_Category_3"));
		
		//19. Dynamic Wait
		uiDriver.dynamicWait();
		
		//20. Check  Category.4 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_4",input.get("AssertElementPresent@Category_4"));
		
		//21. Dynamic Wait
		uiDriver.dynamicWait();
		
		//22. Check  No Of Rollover Allwd.4 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_4",input.get("AssertElementPresent@No_Of_Rollover_Allwd_4"));
		
		//23. Dynamic Wait
		uiDriver.dynamicWait();
		
		//24. Check  Suspense Category.4 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_4",input.get("AssertElementPresent@Suspense_Category_4"));
		
		//25. Dynamic Wait
		uiDriver.dynamicWait();
		
		//26. Dynamic Wait
		uiDriver.dynamicWait();
		
		//27. Check  Category.5 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_5",input.get("AssertElementPresent@Category_5"));
		
		//28. Dynamic Wait
		uiDriver.dynamicWait();
		
		//29. Check  No Of Rollover Allwd.5 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_5",input.get("AssertElementPresent@No_Of_Rollover_Allwd_5"));
		
		//30. Dynamic Wait
		uiDriver.dynamicWait();
		
		//31. Check  Suspense Category.5 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_5",input.get("AssertElementPresent@Suspense_Category_5"));
		
		//32. Dynamic Wait
		uiDriver.dynamicWait();
		
		//33. Dynamic Wait
		uiDriver.dynamicWait();
		
		//34. Check  Category.6 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltCategory_6",input.get("AssertElementPresent@Category_6"));
		
		//35. Dynamic Wait
		uiDriver.dynamicWait();
		
		//36. Check  No Of Rollover Allwd.6 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltNo_Of_Rollover_Allwd_6",input.get("AssertElementPresent@No_Of_Rollover_Allwd_6"));
		
		//37. Dynamic Wait
		uiDriver.dynamicWait();
		
		//38. Check  Suspense Category.6 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_INLEND_LDPD_PARAMETER.eltSuspense_Category_6",input.get("AssertElementPresent@Suspense_Category_6"));
		
		//39. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Verfies that text $Parama1 is present in Loan Amount Error 
		uiDriver.checkText("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltLoan_Amount_Error",input.get("AssertTextPresent@Loan_Amount_Error"));
		
		//4. Set RunTime Global Value from getting the text  General Loan Creation ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltGeneral_Loan_Creation_ID",input.get("setRunTimeGlobalValue@General_Loan_Creation_ID"));
		
		//5. Type $data in Customer Id field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCustomer_Id", input.get("Type@Customer_Id"));
		
		//6. Enter global value for the key $Parama1 in Customer Id 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCustomer_Id", input.get("TypeGlobalValue@Customer_Id"));
		
		//7. Type $data in Currency field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCurrency", input.get("Type@Currency"));
		
		//8. Type $data in Loan Amount.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLoan_Amount_1", input.get("Type@Loan_Amount_1"));
		
		//9. Type $data in Business Day Def.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtBusiness_Day_Def_1", input.get("Type@Business_Day_Def_1"));
		
		//10. Type $data in Loan Start Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLoan_Start_Date", input.get("Type@Loan_Start_Date"));
		
		//11. Type $Parama1 Date in Loan Start Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLoan_Start_Date", input.get("TypeDate@Loan_Start_Date"));
		
		//12. Type $data in Loan Maturity Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLoan_Maturity_Date", input.get("Type@Loan_Maturity_Date"));
		
		//13. Type $Parama1 Date in Loan Maturity Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLoan_Maturity_Date", input.get("TypeDate@Loan_Maturity_Date"));
		
		//14. Type $data in Category field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCategory", input.get("Type@Category"));
		
		//15. Click Long Short Long if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltLong_Short_Long",input.get("ClickWithSkip@Long_Short_Long"));
		
		//16. Click Long Short Short if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltLong_Short_Short",input.get("ClickWithSkip@Long_Short_Short"));
		
		//17. Type $data in Code of Purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCode_of_Purpose", input.get("Type@Code_of_Purpose"));
		
		//18. Click Recourse No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltRecourse_No",input.get("ClickWithSkip@Recourse_No"));
		
		//19. Click Recourse Others if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltRecourse_Others",input.get("ClickWithSkip@Recourse_Others"));
		
		//20. Click Recourse Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltRecourse_Yes",input.get("ClickWithSkip@Recourse_Yes"));
		
		//21. Click Issue Accrual None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltIssue_Accrual_None",input.get("ClickWithSkip@Issue_Accrual_None"));
		
		//22. Click Issue Accrual Acturial if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltIssue_Accrual_Acturial",input.get("ClickWithSkip@Issue_Accrual_Acturial"));
		
		//23. Click Issue Accrual Linear if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltIssue_Accrual_Linear",input.get("ClickWithSkip@Issue_Accrual_Linear"));
		
		//24. Click Issue Accrual No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltIssue_Accrual_No",input.get("ClickWithSkip@Issue_Accrual_No"));
		
		//25. Click Int Paymt Method None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltInt_Paymt_Method_None",input.get("ClickWithSkip@Int_Paymt_Method_None"));
		
		//26. Click Int Paymt Method 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltInt_Paymt_Method_1",input.get("ClickWithSkip@Int_Paymt_Method_1"));
		
		//27. Click Int Paymt Method 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltInt_Paymt_Method_2",input.get("ClickWithSkip@Int_Paymt_Method_2"));
		
		//28. Type $data in Interest Type field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInterest_Type", input.get("Type@Interest_Type"));
		
		//29. Type $data in Interest Basis field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInterest_Basis", input.get("Type@Interest_Basis"));
		
		//30. Type $data in Interest Rate Fixed field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInterest_Rate_Fixed", input.get("Type@Interest_Rate_Fixed"));
		
		//31. Type $data in IS Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtIS_Rate", input.get("Type@IS_Rate"));
		
		//32. Type $data in Interest Key field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInterest_Key", input.get("Type@Interest_Key"));
		
		//33. Type $data in Interest Spread field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInterest_Spread", input.get("Type@Interest_Spread"));
		
		//34. Type $data in Negative Rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtNegative_Rate", input.get("Type@Negative_Rate"));
		
		//35. Type $data in Base Rate Code field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtBase_Rate_Code", input.get("Type@Base_Rate_Code"));
		
		//36. Type $data in Margin field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtMargin", input.get("Type@Margin"));
		
		//37. Click Use Default PI Rate if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltUse_Default_PI_Rate",input.get("ClickWithSkip@Use_Default_PI_Rate"));
		
		//38. Type Limit Reference $Parama1
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltLimit_Reference", input.get("Type@Limit_Reference"));
		
		//39. Type $data in Liquidation Mode field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtLiquidation_Mode", input.get("Type@Liquidation_Mode"));
		
		//40. Type $data in Sub Category field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtSub_Category", input.get("Type@Sub_Category"));
		
		//41. Type $data in Product Purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtProduct_Purpose", input.get("Type@Product_Purpose"));
		
		//42. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//43. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//44. Click Capitalise Interest No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltCapitalise_Interest_No",input.get("ClickWithSkip@Capitalise_Interest_No"));
		
		//45. Type $data in Define Schedules field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtDefine_Schedules", input.get("Type@Define_Schedules"));
		
		//46. Click Account Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltAccount_Details",input.get("ClickWithSkip@Account_Details"));
		
		//47. Type $data in Drawdown Account field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtDrawdown_Account", input.get("Type@Drawdown_Account"));
		
		//48. Enter global value for the key $Parama1 in Drawdown Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtDrawdown_Account", input.get("TypeGlobalValue@Drawdown_Account"));
		
		//49. Type $data in Principal Liq Account field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtPrincipal_Liq_Account", input.get("Type@Principal_Liq_Account"));
		
		//50. Enter global value for the key $Parama1 in Principal Liq Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtPrincipal_Liq_Account", input.get("TypeGlobalValue@Principal_Liq_Account"));
		
		//51. Type $data in Principal Beneficairy Bank.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtPrincipal_Beneficairy_Bank_1", input.get("Type@Principal_Beneficairy_Bank_1"));
		
		//52. Enter global value for the key $Parama1 in Principal Beneficairy Bank.1 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtPrincipal_Beneficairy_Bank_1", input.get("TypeGlobalValue@Principal_Beneficairy_Bank_1"));
		
		//53. Click Advice Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltAdvice_Details",input.get("ClickWithSkip@Advice_Details"));
		
		//54. Type $data in Customer Remarks field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtCustomer_Remarks", input.get("Type@Customer_Remarks"));
		
		//55. Click Factoring/Payable Financing if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.eltFactoring_Payable_Financing",input.get("ClickWithSkip@Factoring_Payable_Financing"));
		
		//56. Enter global value for the key $Parama1 in Invoice Reference Number 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_BRIDGE_UE_SCH_LN.txtInvoice_Reference_Number", input.get("TypeGlobalValue@Invoice_Reference_Number"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//3. Type $data in New Interest Rate.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtNew_Interest_Rate_1", input.get("Type@New_Interest_Rate_1"));
		
		//4. Type $data in Rate change from field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtRate_change_from", input.get("Type@Rate_change_from"));
		
		//5. Type $Parama1 Date in Rate change from  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtRate_change_from", input.get("TypeDate@Rate_change_from"));
		
		//6. Type $data in Amt Increase/Decrease field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtAmt_Increase_Decrease", input.get("Type@Amt_Increase_Decrease"));
		
		//7. Type $data in Effective Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtEffective_Date", input.get("Type@Effective_Date"));
		
		//8. Type $Parama1 Date in Effective Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtEffective_Date", input.get("TypeDate@Effective_Date"));
		
		//9. Type $data in Loan Maturity Date field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtLoan_Maturity_Date", input.get("Type@Loan_Maturity_Date"));
		
		//10. Type $Parama1 Date in Loan Maturity Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtLoan_Maturity_Date", input.get("TypeDate@Loan_Maturity_Date"));
		
		//11. Type $data in Base Rate Code field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtBase_Rate_Code", input.get("Type@Base_Rate_Code"));
		
		//12. Type $data in New IS Rate.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.txtNew_IS_Rate_1", input.get("Type@New_IS_Rate_1"));
		
		//13. Check  New IS Rate.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.eltNew_IS_Rate_1",input.get("AssertElementPresent@New_IS_Rate_1"));
		
		//14. Click New IS Rate.1_Multi Value if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.btnNew_IS_Rate_1_Multi_Value",input.get("ClickWithSkip@New_IS_Rate_1_Multi_Value#1"));
		
		//15. Click New IS Rate.1_Multi Value if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.btnNew_IS_Rate_1_Multi_Value",input.get("ClickWithSkip@New_IS_Rate_1_Multi_Value#2"));
		
		//16. Check  New IS Rate.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.eltNew_IS_Rate_2",input.get("AssertElementPresent@New_IS_Rate_2"));
		
		//17. Check  New IS Rate.3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_LOAN_AMEND.eltNew_IS_Rate_3",input.get("AssertElementPresent@New_IS_Rate_3"));
		
	}
	
	public void act_fill_MD_DEAL_MUFGHK_GTISS(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Generic ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.eltGeneric_ID",input.get("setRunTimeGlobalValue@Generic_ID"));
		
		//4. Enter global value for the key $Parama1 in Guarantee Ref 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtGuarantee_Ref", input.get("TypeGlobalValue@Guarantee_Ref"));
		
		//5. Type $data in Guarantee Type field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtGuarantee_Type", input.get("Type@Guarantee_Type"));
		
		//6. Type $data in Product Category field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtProduct_Category", input.get("Type@Product_Category"));
		
		//7. Type $data in Currency field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCurrency", input.get("Type@Currency"));
		
		//8. Type $data in Amount field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtAmount", input.get("Type@Amount"));
		
		//9. Enter global value for the key $Parama1 in RiskParty 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtRiskParty", input.get("TypeGlobalValue@RiskParty"));
		
		//10. Type $data in Claim Maturity Date field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtClaim_Maturity_Date", input.get("Type@Claim_Maturity_Date"));
		
		//11. Type $data in Expiry Date field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtExpiry_Date", input.get("Type@Expiry_Date"));
		
		//12. Type $Parama1 Date in Claim Maturity Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTISS.txtClaim_Maturity_Date", input.get("TypeDate@Claim_Maturity_Date"));
		
		//13. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTISS.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//14. Type $data in Limit Reference field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtLimit_Reference", input.get("Type@Limit_Reference"));
		
		//15. Type $data in Kind of LG field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtKind_of_LG", input.get("Type@Kind_of_LG"));
		
		//16. Type $data in Guarantee Purpose field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtGuarantee_Purpose", input.get("Type@Guarantee_Purpose"));
		
		//17. Click Back Forward Key None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltBack_Forward_Key_None",input.get("ClickWithSkip@Back_Forward_Key_None"));
		
		//18. Click Back Forward Key 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltBack_Forward_Key_1",input.get("ClickWithSkip@Back_Forward_Key_1"));
		
		//19. Click Back Forward Key 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltBack_Forward_Key_2",input.get("ClickWithSkip@Back_Forward_Key_2"));
		
		//20. Click Back Forward Key 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltBack_Forward_Key_3",input.get("ClickWithSkip@Back_Forward_Key_3"));
		
		//21. Type $data in Customer Name.1 field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCustomer_Name_1", input.get("Type@Customer_Name_1"));
		
		//22. Type $data in Counterparty Name.1 field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCounterparty_Name_1", input.get("Type@Counterparty_Name_1"));
		
		//23. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//24. Click Commision if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltCommision",input.get("ClickWithSkip@Commision"));
		
		//25. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//26. Click Commission Pay Type None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltCommission_Pay_Type_None",input.get("ClickWithSkip@Commission_Pay_Type_None"));
		
		//27. Click Commission Pay Type Begin if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltCommission_Pay_Type_Begin",input.get("ClickWithSkip@Commission_Pay_Type_Begin"));
		
		//28. Click Commission Pay Type End if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltCommission_Pay_Type_End",input.get("ClickWithSkip@Commission_Pay_Type_End"));
		
		//29. Type $data in Comm Rate field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtComm_Rate", input.get("Type@Comm_Rate"));
		
		//30. Click Commission Frequency if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.btnCommission_Frequency",input.get("ClickWithSkip@Commission_Frequency"));
		
		//31. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
		//32. Click Business Day if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.btnBusiness_Day",input.get("ClickWithSkip@Business_Day"));
		
		//33. Click Weekly if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.btnWeekly",input.get("ClickWithSkip@Weekly"));
		
		//34. Click Save if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.btnSave",input.get("ClickWithSkip@Save"));
		
		//35. Click Fixed Amount None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltFixed_Amount_None",input.get("ClickWithSkip@Fixed_Amount_None"));
		
		//36. Click Fixed Amount No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltFixed_Amount_No",input.get("ClickWithSkip@Fixed_Amount_No"));
		
		//37. Click Fixed Amount Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltFixed_Amount_Yes",input.get("ClickWithSkip@Fixed_Amount_Yes"));
		
		//38. Type $data in Comm Calculation Basis field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtComm_Calculation_Basis", input.get("Type@Comm_Calculation_Basis"));
		
		//39. Type $data in Commission Currency field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCommission_Currency", input.get("Type@Commission_Currency"));
		
		//40. Type $Parama1 Date in Commission Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTISS.txtCommission_Date", input.get("TypeDate@Commission_Date"));
		
		//41. Enter global value for the key $Parama1 in Comm Debit Acct 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtComm_Debit_Acct", input.get("TypeGlobalValue@Comm_Debit_Acct"));
		
		//42. Click Rate Change None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltRate_Change_None",input.get("ClickWithSkip@Rate_Change_None"));
		
		//43. Click Rate Change No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltRate_Change_No",input.get("ClickWithSkip@Rate_Change_No"));
		
		//44. Click Rate Change Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltRate_Change_Yes",input.get("ClickWithSkip@Rate_Change_Yes"));
		
		//45. Click Return Commision None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltReturn_Commision_None",input.get("ClickWithSkip@Return_Commision_None"));
		
		//46. Click Return Commision No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltReturn_Commision_No",input.get("ClickWithSkip@Return_Commision_No"));
		
		//47. Click Return Commision Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltReturn_Commision_Yes",input.get("ClickWithSkip@Return_Commision_Yes"));
		
		//48. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//49. Click MT760 Undertaking Details B if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltMT760_Undertaking_Details_B",input.get("ClickWithSkip@MT760_Undertaking_Details_B"));
		
		//50. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//51. Type $data in 40C Applicable Rules field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt40C_Applicable_Rules", input.get("Type@40C_Applicable_Rules"));
		
		//52. Type $data in 22D Form of Undertaking field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt22D_Form_of_Undertaking", input.get("Type@22D_Form_of_Undertaking"));
		
		//53. Type $data in 23B Expiry Type field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt23B_Expiry_Type", input.get("Type@23B_Expiry_Type"));
		
		//54. Type $data in 35G Expiry Cond/Event field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt35G_Expiry_Cond_Event", input.get("Type@35G_Expiry_Cond_Event"));
		
		//55. Enter global value for the key $Parama1 in 52A Issuing Bank ID 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt52A_Issuing_Bank_ID", input.get("TypeGlobalValue@52A_Issuing_Bank_ID"));
		
		//56. Enter global value for the key $Parama1 in 59A Beneficiary 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt59A_Beneficiary", input.get("TypeGlobalValue@59A_Beneficiary"));
		
		//57. Enter global value for the key $Parama1 in 56A advising bank 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt56A_advising_bank", input.get("TypeGlobalValue@56A_advising_bank"));
		
		//58. Type $data in 77U Undertaking Terms and Cond field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txt77U_Undertaking_Terms_and_Cond", input.get("Type@77U_Undertaking_Terms_and_Cond"));
		
		//59. Click 49 Confirmation Instructions_Without if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.elt49_Confirmation_Instructions_Without",input.get("ClickWithSkip@49_Confirmation_Instructions_Without"));
		
		//60. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//61. Click Parties to Undertaking if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltParties_to_Undertaking",input.get("ClickWithSkip@Parties_to_Undertaking"));
		
		//62. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//63. Enter global value for the key $Parama1 in Receiving Bank ID 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtReceiving_Bank_ID", input.get("TypeGlobalValue@Receiving_Bank_ID"));
		
		//64. Enter global value for the key $Parama1 in Beneficiary ID 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtBeneficiary_ID", input.get("TypeGlobalValue@Beneficiary_ID"));
		
		//65. Click Charges if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTISS.eltCharges",input.get("ClickWithSkip@Charges"));
		
		//66. Type $Parama1 Date in Charge Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTISS.txtCharge_Date", input.get("TypeDate@Charge_Date"));
		
		//67. Type $data in Charge Currency field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCharge_Currency", input.get("Type@Charge_Currency"));
		
		//68. Enter global value for the key $Parama1 in Charge Debit Accnt 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCharge_Debit_Accnt", input.get("TypeGlobalValue@Charge_Debit_Accnt"));
		
		//69. Type $data in Charge Code field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCharge_Code", input.get("Type@Charge_Code"));
		
		//70. Type $data in Charge Amount field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTISS.txtCharge_Amount", input.get("Type@Charge_Amount"));
		
		//71. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
	}
	
	public void act_verify_PV_LOAN_CLASSIFICATION(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Check  BANKRUPT-RATING10-2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltBANKRUPT_RATING10_2",input.get("AssertElementPresent@BANKRUPT_RATING10_2"));
		
		//4. Check  CLOSEWATCH-RATING8-1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltCLOSEWATCH_RATING8_1",input.get("AssertElementPresent@CLOSEWATCH_RATING8_1"));
		
		//5. Check  	CLOSEWATCH-RATING8-2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.elt_CLOSEWATCH_RATING8_2",input.get("AssertElementPresent@_CLOSEWATCH_RATING8_2"));
		
		//6. Check  CLOSEWATCH-RATING8-3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltCLOSEWATCH_RATING8_3",input.get("AssertElementPresent@CLOSEWATCH_RATING8_3"));
		
		//7. Check  LIKELYTOBECOMEBANKRUPT.1-RATING9 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltLIKELYTOBECOMEBANKRUPT_1_RATING9",input.get("AssertElementPresent@LIKELYTOBECOMEBANKRUPT_1_RATING9"));
		
		//8. Check  LIKELYTOBECOMEBANKRUPT.2-RATING9 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltLIKELYTOBECOMEBANKRUPT_2_RATING9",input.get("AssertElementPresent@LIKELYTOBECOMEBANKRUPT_2_RATING9"));
		
		//9. Check  NOCREDIT-RATING99 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNOCREDIT_RATING99",input.get("AssertElementPresent@NOCREDIT_RATING99"));
		
		//10. Check  NONE-RATING00 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNONE_RATING00",input.get("AssertElementPresent@NONE_RATING00"));
		
		//11. Check  NORMAL-2PERC is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_2PERC",input.get("AssertElementPresent@NORMAL_2PERC"));
		
		//12. Check  NORMAL-RATING1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING1",input.get("AssertElementPresent@NORMAL_RATING1"));
		
		//13. Check  NORMAL-RATING2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING2",input.get("AssertElementPresent@NORMAL_RATING2"));
		
		//14. Check  NORMAL-RATING3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING3",input.get("AssertElementPresent@NORMAL_RATING3"));
		
		//15. Check  NORMAL-RATING4 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING4",input.get("AssertElementPresent@NORMAL_RATING4"));
		
		//16. Check  NORMAL-RATING5 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING5",input.get("AssertElementPresent@NORMAL_RATING5"));
		
		//17. Check  NORMAL-RATING6 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING6",input.get("AssertElementPresent@NORMAL_RATING6"));
		
		//18. Check  NORMAL-RATING7 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltNORMAL_RATING7",input.get("AssertElementPresent@NORMAL_RATING7"));
		
		//19. Check  VIRTUALLYBANKRUPT-RATING10-1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_PV_LOAN_CLASSIFICATION.eltVIRTUALLYBANKRUPT_RATING10_1",input.get("AssertElementPresent@VIRTUALLYBANKRUPT_RATING10_1"));
		
		//20. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_fill_MD_DEAL_MUFGHK_GTINVPRO(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type $data in Invocation Amount field
		uiDriver.setValue("act_fill_MD_DEAL_MUFGHK_GTINVPRO.txtInvocation_Amount", input.get("Type@Invocation_Amount"));
		
		//3. Type $Parama1 Date in Claim Register Date  textbox
		uiDriver.TypeDate("act_fill_MD_DEAL_MUFGHK_GTINVPRO.txtClaim_Register_Date", input.get("TypeDate@Claim_Register_Date"));
		
		//4. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//5. Click MT765 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTINVPRO.eltMT765",input.get("ClickWithSkip@MT765"));
		
		//6. Click 22G Demand Type_PAEX if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTINVPRO.elt22G_Demand_Type_PAEX",input.get("ClickWithSkip@22G_Demand_Type_PAEX"));
		
		//7. Click 22G Demand Type_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTINVPRO.elt22G_Demand_Type_None",input.get("ClickWithSkip@22G_Demand_Type_None"));
		
		//8. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//9. Click 22G Demand Type_PAYM if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_MUFGHK_GTINVPRO.elt22G_Demand_Type_PAYM",input.get("ClickWithSkip@22G_Demand_Type_PAYM"));
		
	}
	
	public void act_fill_MD_DEAL_GTINVEXE(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow"));
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//5. Type $data in Invocation Amount field
		uiDriver.setValue("act_fill_MD_DEAL_GTINVEXE.txtInvocation_Amount", input.get("Type@Invocation_Amount"));
		
		//6. Type $data in Claim Debit Acct field
		uiDriver.setValue("act_fill_MD_DEAL_GTINVEXE.txtClaim_Debit_Acct", input.get("Type@Claim_Debit_Acct"));
		
		//7. Enter global value for the key $Parama1 in Claim Debit Acct 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_GTINVEXE.txtClaim_Debit_Acct", input.get("TypeGlobalValue@Claim_Debit_Acct"));
		
		//8. Type $data in Claim Credit Account field
		uiDriver.setValue("act_fill_MD_DEAL_GTINVEXE.txtClaim_Credit_Account", input.get("Type@Claim_Credit_Account"));
		
		//9. Enter global value for the key $Parama1 in Claim Credit Account 
		uiDriver.typeGlobalValue("act_fill_MD_DEAL_GTINVEXE.txtClaim_Credit_Account", input.get("TypeGlobalValue@Claim_Credit_Account"));
		
		//10. Click Claim Payment Method_External if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_GTINVEXE.btnClaim_Payment_Method_External",input.get("ClickWithSkip@Claim_Payment_Method_External"));
		
		//11. Click Claim Payment Method_Internal if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_GTINVEXE.btnClaim_Payment_Method_Internal",input.get("ClickWithSkip@Claim_Payment_Method_Internal"));
		
		//12. Click Claim Payment Method_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_MD_DEAL_GTINVEXE.btnClaim_Payment_Method_None",input.get("ClickWithSkip@Claim_Payment_Method_None"));
		
		//13. Type $data in Related Reference field
		uiDriver.setValue("act_fill_MD_DEAL_GTINVEXE.txtRelated_Reference", input.get("Type@Related_Reference"));
		
		//14. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_Customer_Rating_field(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Type $data in Customer Rating field
		uiDriver.setValue("act_fill_Customer_Rating_field.txtCustomer_Rating", input.get("Type@Customer_Rating"));
		
		//4. Click Customer rating_dropdown if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Customer_Rating_field.btnCustomer_rating_dropdown",input.get("ClickWithSkip@Customer_rating_dropdown"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//6. Click Customer rating_value_07 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_Customer_Rating_field.btnCustomer_rating_value_07",input.get("ClickWithSkip@Customer_rating_value_07"));
		
	}
	
	public void act_verify_LOCAL_Tab_Fields_General_Loan_Creation(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Click Local if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltLocal",input.get("ClickWithSkip@Local"));
		
		//3. Verfies that text $Parama1 is present in Disbursement Mode 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltDisbursement_Mode",input.get("AssertTextPresent@Disbursement_Mode"));
		
		//4. Verfies that text $Parama1 is present in Direct Mt 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltDirect_Mt",input.get("AssertTextPresent@Direct_Mt"));
		
		//5. Verfies that text $Parama1 is present in Payment Order 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltPayment_Order",input.get("AssertTextPresent@Payment_Order"));
		
		//6. Verfies that text $Parama1 is present in NOSTRO Account 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltNOSTRO_Account",input.get("AssertTextPresent@NOSTRO_Account"));
		
		//7. Verfies that text $Parama1 is present in Beneficiary Account Number 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltBeneficiary_Account_Number",input.get("AssertTextPresent@Beneficiary_Account_Number"));
		
		//8. Verfies that text $Parama1 is present in Beneficiary Name 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltBeneficiary_Name",input.get("AssertTextPresent@Beneficiary_Name"));
		
		//9. Verfies that text $Parama1 is present in Beneficiary Bank Clearing Code 
		uiDriver.checkText("act_verify_LOCAL_Tab_Fields_General_Loan_Creation.eltBeneficiary_Bank_Clearing_Code",input.get("AssertTextPresent@Beneficiary_Bank_Clearing_Code"));
		
	}
	
	public void act_fill_loan_extra_details(DataRow input, DataRow output) {
		//1. Type $Parama1 Date in Stop Accrual  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtStop_Accrual", input.get("TypeDate@Stop_Accrual"));
		
		//2. Type $data in Tax Paid by Lender field
		uiDriver.setValue("act_fill_loan_extra_details.txtTax_Paid_by_Lender", input.get("Type@Tax_Paid_by_Lender"));
		
		//3. Type $data in Tax Paid by Borrower field
		uiDriver.setValue("act_fill_loan_extra_details.txtTax_Paid_by_Borrower", input.get("Type@Tax_Paid_by_Borrower"));
		
		//4. Type $data in Taxable field
		uiDriver.setValue("act_fill_loan_extra_details.txtTaxable", input.get("Type@Taxable"));
		
		//5. Click Early Repayment F if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltEarly_Repayment_F",input.get("ClickWithSkip@Early_Repayment_F"));
		
		//6. Click Early Repayment N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltEarly_Repayment_N",input.get("ClickWithSkip@Early_Repayment_N"));
		
		//7. Click Early Repayment P if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltEarly_Repayment_P",input.get("ClickWithSkip@Early_Repayment_P"));
		
		//8. Type $Parama1 Date in Earliest Date  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtEarliest_Date", input.get("TypeDate@Earliest_Date"));
		
		//9. Type $data in Notice Days field
		uiDriver.setValue("act_fill_loan_extra_details.txtNotice_Days", input.get("Type@Notice_Days"));
		
		//10. Type $data in LOC field
		uiDriver.setValue("act_fill_loan_extra_details.txtLOC", input.get("Type@LOC"));
		
		//11. Click Correspondance 0 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltCorrespondance_0",input.get("ClickWithSkip@Correspondance_0"));
		
		//12. Click Correspondance 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltCorrespondance_1",input.get("ClickWithSkip@Correspondance_1"));
		
		//13. Click Correspondance 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltCorrespondance_2",input.get("ClickWithSkip@Correspondance_2"));
		
		//14. Type $data in Commodity field
		uiDriver.setValue("act_fill_loan_extra_details.txtCommodity", input.get("Type@Commodity"));
		
		//15. Click Reschedule N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltReschedule_N",input.get("ClickWithSkip@Reschedule_N"));
		
		//16. Click Reschedule Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltReschedule_Y",input.get("ClickWithSkip@Reschedule_Y"));
		
		//17. Click Participation 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltParticipation_1",input.get("ClickWithSkip@Participation_1"));
		
		//18. Click Participation 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltParticipation_2",input.get("ClickWithSkip@Participation_2"));
		
		//19. Type $data in Accrual Param field
		uiDriver.setValue("act_fill_loan_extra_details.txtAccrual_Param", input.get("Type@Accrual_Param"));
		
		//20. Enter global value for the key $Parama1 in Com Fee Liqq Acc 
		uiDriver.typeGlobalValue("act_fill_loan_extra_details.txtCom_Fee_Liqq_Acc", input.get("TypeGlobalValue@Com_Fee_Liqq_Acc"));
		
		//21. Type $data in Forward Backward Key field
		uiDriver.setValue("act_fill_loan_extra_details.txtForward_Backward_Key", input.get("Type@Forward_Backward_Key"));
		
		//22. Click Base date Key Base if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltBase_date_Key_Base",input.get("ClickWithSkip@Base_date_Key_Base"));
		
		//23. Click Base date Key Prev if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltBase_date_Key_Prev",input.get("ClickWithSkip@Base_date_Key_Prev"));
		
		//24. Click Drawings Allowed No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltDrawings_Allowed_No",input.get("ClickWithSkip@Drawings_Allowed_No"));
		
		//25. Click Drawings Allowed Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltDrawings_Allowed_Y",input.get("ClickWithSkip@Drawings_Allowed_Y"));
		
		//26. Click Tranche Amount Multivalue if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltTranche_Amount_Multivalue",input.get("ClickWithSkip@Tranche_Amount_Multivalue"));
		
		//27. Type $data in Tranche Amount.1 field
		uiDriver.setValue("act_fill_loan_extra_details.txtTranche_Amount_1", input.get("Type@Tranche_Amount_1"));
		
		//28. Type $Parama1 Date in Drawdown Start Date.1  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtDrawdown_Start_Date_1", input.get("TypeDate@Drawdown_Start_Date_1"));
		
		//29. Type $Parama1 Date in Drawdown End Date.1  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtDrawdown_End_Date_1", input.get("TypeDate@Drawdown_End_Date_1"));
		
		//30. Type $data in Tranche Amount.2 field
		uiDriver.setValue("act_fill_loan_extra_details.txtTranche_Amount_2", input.get("Type@Tranche_Amount_2"));
		
		//31. Type $Parama1 Date in Drawdown Start Date.2  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtDrawdown_Start_Date_2", input.get("TypeDate@Drawdown_Start_Date_2"));
		
		//32. Type $Parama1 Date in Drawdown End Date.2  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtDrawdown_End_Date_2", input.get("TypeDate@Drawdown_End_Date_2"));
		
		//33. Click Frequency Control if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltFrequency_Control",input.get("ClickWithSkip@Frequency_Control"));
		
		//34. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//35. Type $Parama1 Date in Next Date  textbox
		uiDriver.TypeDate("act_fill_loan_extra_details.txtNext_Date", input.get("TypeDate@Next_Date"));
		
		//36. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//37. Click Monthly if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltMonthly",input.get("ClickWithSkip@Monthly"));
		
		//38. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//39. Click Save if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_loan_extra_details.eltSave",input.get("ClickWithSkip@Save"));
		
		//40. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Click Same Day Flag No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND.eltSame_Day_Flag_No",input.get("ClickWithSkip@Same_Day_Flag_No"));
		
		//4. Click Same Day Flag Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND.eltSame_Day_Flag_Yes",input.get("ClickWithSkip@Same_Day_Flag_Yes"));
		
		//5. Click Revocability Irrevocable if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND.eltRevocability_Irrevocable",input.get("ClickWithSkip@Revocability_Irrevocable"));
		
		//6. Click Revocability Revocable if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND.eltRevocability_Revocable",input.get("ClickWithSkip@Revocability_Revocable"));
		
		//7. Type $data in Customer Commitment Remarks field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_COMMIT_AMEND.txtCustomer_Commitment_Remarks", input.get("Type@Customer_Commitment_Remarks"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_fill_COS_MUFGHK_COMMIT_AUTH_NAU(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//4. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#1"));
		
		//5. Click Selection Screen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_MUFGHK_COMMIT_AUTH_NAU.eltSelection_Screen",input.get("ClickWithSkip@Selection_Screen"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//7. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//8. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#2"));
		
		//9. Enter global value for the key $Parama1 in Id 
		uiDriver.typeGlobalValue("act_fill_COS_MUFGHK_COMMIT_AUTH_NAU.txtId", input.get("TypeGlobalValue@Id"));
		
		//10. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COS_MUFGHK_COMMIT_AUTH_NAU.eltFind",input.get("ClickWithSkip@Find"));
		
		//11. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//12. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//13. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#3"));
		
		//14. Verfies that text $Parama1 is present in Unavailable Commitment Amt 
		uiDriver.checkText("act_fill_COS_MUFGHK_COMMIT_AUTH_NAU.eltUnavailable_Commitment_Amt",input.get("AssertTextPresent@Unavailable_Commitment_Amt"));
		
		//15. Dynamic Wait
		uiDriver.dynamicWait();
		
		//16. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//17. Verfies that text $Parama1 is present in Total Commitment Amt 
		uiDriver.checkText("act_fill_COS_MUFGHK_COMMIT_AUTH_NAU.eltTotal_Commitment_Amt",input.get("AssertTextPresent@Total_Commitment_Amt"));
		
	}
	
	public void act_verify_ENQ_MUFGHK_LD_COMMITMENT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Enter global value for the key $Parama1 in Customer Id 
		uiDriver.typeGlobalValue("act_verify_ENQ_MUFGHK_LD_COMMITMENT.txtCustomer_Id", input.get("TypeGlobalValue@Customer_Id"));
		
		//4. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_ENQ_MUFGHK_LD_COMMITMENT.eltFind",input.get("ClickWithSkip@Find"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//6. Verfies that text $Parama1 is present in Unavailable Commitment Amt 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_LD_COMMITMENT.eltUnavailable_Commitment_Amt",input.get("AssertTextPresent@Unavailable_Commitment_Amt"));
		
		//7. Verfies that text $Parama1 is present in Total Commitment Amt 
		uiDriver.checkText("act_verify_ENQ_MUFGHK_LD_COMMITMENT.eltTotal_Commitment_Amt",input.get("AssertTextPresent@Total_Commitment_Amt"));
		
	}
	
	public void act_verify_ENQ_LD_COMMITMENT_DRAWING(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Enter global value for the key $Parama1 in CommitmentId 
		uiDriver.typeGlobalValue("act_verify_ENQ_LD_COMMITMENT_DRAWING.txtCommitmentId", input.get("TypeGlobalValue@CommitmentId"));
		
		//4. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_ENQ_LD_COMMITMENT_DRAWING.eltFind",input.get("ClickWithSkip@Find"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
	}
	
	public void act_verify_commitment_loans_fields(DataRow input, DataRow output) {
		//1. Check  Commitment Fee Rate is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltCommitment_Fee_Rate",input.get("AssertElementPresent@Commitment_Fee_Rate"));
		
		//2. Check  Tranche Amount.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltTranche_Amount_1",input.get("AssertElementPresent@Tranche_Amount_1"));
		
		//3. Check  Tranche Amount.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltTranche_Amount_2",input.get("AssertElementPresent@Tranche_Amount_2"));
		
		//4. Type $data in More Actions field
		uiDriver.setValue("act_verify_commitment_loans_fields.txtMore_Actions", input.get("Type@More_Actions"));
		
		//5. Click Go if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_commitment_loans_fields.eltGo",input.get("ClickWithSkip@Go"));
		
		//6. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//8. Check  Current Outstanding is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltCurrent_Outstanding",input.get("AssertElementPresent@Current_Outstanding"));
		
		//9. Check  Int Rate is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltInt_Rate",input.get("AssertElementPresent@Int_Rate"));
		
		//10. Check  Total Payment is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltTotal_Payment",input.get("AssertElementPresent@Total_Payment"));
		
		//11. Check  Principal is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltPrincipal",input.get("AssertElementPresent@Principal"));
		
		//12. Check  Outstanding is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_commitment_loans_fields.eltOutstanding",input.get("AssertElementPresent@Outstanding"));
		
	}
	
	public void act_fill_maxtotal_internalamount(DataRow input, DataRow output) {
		//1. Type $data in Internal Amount field
		uiDriver.setValue("act_fill_maxtotal_internalamount.txtInternal_Amount", input.get("Type@Internal_Amount"));
		
		//2. Type $data in Max Total field
		uiDriver.setValue("act_fill_maxtotal_internalamount.txtMax_Total", input.get("Type@Max_Total"));
		
	}
	
	public void act_verify_loans_and_deposits(DataRow input, DataRow output) {
		//1. Check  Category is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_and_deposits.eltCategory",input.get("AssertElementPresent@Category"));
		
		//2. Check  Int Payment Method is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_and_deposits.eltInt_Payment_Method",input.get("AssertElementPresent@Int_Payment_Method"));
		
		//3. Check  Issue Accrual is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_and_deposits.eltIssue_Accrual",input.get("AssertElementPresent@Issue_Accrual"));
		
		//4. Check  Sub Category is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_and_deposits.eltSub_Category",input.get("AssertElementPresent@Sub_Category"));
		
		//5. Check  Amount.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_loans_and_deposits.eltAmount_1",input.get("AssertElementPresent@Amount_1"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Type $data in New IS Rate.1 field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtNew_IS_Rate_1", input.get("Type@New_IS_Rate_1"));
		
		//4. Check  New IS Rate.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltNew_IS_Rate_1",input.get("AssertElementPresent@New_IS_Rate_1"));
		
		//5. Click New IS Rate.1_Multi Value if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.btnNew_IS_Rate_1_Multi_Value",input.get("ClickWithSkip@New_IS_Rate_1_Multi_Value#1"));
		
		//6. Click New IS Rate.1_Multi Value if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.btnNew_IS_Rate_1_Multi_Value",input.get("ClickWithSkip@New_IS_Rate_1_Multi_Value#2"));
		
		//7. Check  New IS Rate.2 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltNew_IS_Rate_2",input.get("AssertElementPresent@New_IS_Rate_2"));
		
		//8. Check  New IS Rate.3 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltNew_IS_Rate_3",input.get("AssertElementPresent@New_IS_Rate_3"));
		
		//9. Type $data in Base Rate Code field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtBase_Rate_Code", input.get("Type@Base_Rate_Code"));
		
		//10. Type $data in Amt Increase/Decrease field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtAmt_Increase_Decrease", input.get("Type@Amt_Increase_Decrease"));
		
		//11. Type $Parama1 Date in Effective Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtEffective_Date", input.get("TypeDate@Effective_Date"));
		
		//12. Click AdviceDetails if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.btnAdviceDetails",input.get("ClickWithSkip@AdviceDetails"));
		
		//13. Type $data in Customer rate field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtCustomer_rate", input.get("Type@Customer_rate"));
		
		//14. Type $Parama1 Date in IntStartDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtIntStartDate", input.get("TypeDate@IntStartDate"));
		
		//15. Type $Parama1 Date in IntEndDate  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtIntEndDate", input.get("TypeDate@IntEndDate"));
		
		//16. Click Interest year basis DpDown if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltInterest_year_basis_DpDown",input.get("ClickWithSkip@Interest_year_basis_DpDown"));
		
		//17. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//18. Click Interest year basis DpDown C if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltInterest_year_basis_DpDown_C",input.get("ClickWithSkip@Interest_year_basis_DpDown_C"));
		
		//19. Click Advice Flag Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltAdvice_Flag_Y",input.get("ClickWithSkip@Advice_Flag_Y"));
		
		//20. Type $data in Interest payable field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtInterest_payable", input.get("Type@Interest_payable"));
		
		//21. Type $data in Principal equivalent amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtPrincipal_equivalent_amount", input.get("Type@Principal_equivalent_amount"));
		
		//22. Type $data in Principal Repay Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtPrincipal_Repay_Amount", input.get("Type@Principal_Repay_Amount"));
		
		//23. Click Int and Sched Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.eltInt_and_Sched_Details",input.get("ClickWithSkip@Int_and_Sched_Details"));
		
		//24. Type $data in Define Schedules field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_EMB_AMEND.txtDefine_Schedules", input.get("Type@Define_Schedules"));
		
	}
	
	public void act_fill_ENQ_MUFGHK_LOAN_AMEND_REV_ONLINE_EMB(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Enter global value for the key $Parama1 in Contract Id 
		uiDriver.typeGlobalValue("act_fill_ENQ_MUFGHK_LOAN_AMEND_REV_ONLINE_EMB.txtContract_Id", input.get("TypeGlobalValue@Contract_Id"));
		
		//4. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//5. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_LOAN_AMEND_REV_ONLINE_EMB.eltFind",input.get("ClickWithSkip@Find"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//8. Click Amend if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_MUFGHK_LOAN_AMEND_REV_ONLINE_EMB.eltAmend",input.get("ClickWithSkip@Amend"));
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//10. Take screenshot of Take 
		uiDriver.takescreenshot();
		
	}
	
	public void act_fill_RFR_ATTRIBUTES_TAB(DataRow input, DataRow output) {
		//1. Click RFR ATTRIBUTES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_RFR_ATTRIBUTES_TAB.eltRFR_ATTRIBUTES",input.get("ClickWithSkip@RFR_ATTRIBUTES"));
		
		//2. Select $data from the RFR CONVENTION list
		uiDriver.select("act_fill_RFR_ATTRIBUTES_TAB.lstRFR_CONVENTION", input.get("Select@RFR_CONVENTION"));
		
		//3. Select $data from the RTR LOOK BACK TYPE list
		uiDriver.select("act_fill_RFR_ATTRIBUTES_TAB.lstRTR_LOOK_BACK_TYPE", input.get("Select@RTR_LOOK_BACK_TYPE"));
		
		//4. Type $data in RTR LOOK BACK DAYS field
		uiDriver.setValue("act_fill_RFR_ATTRIBUTES_TAB.txtRTR_LOOK_BACK_DAYS", input.get("Type@RTR_LOOK_BACK_DAYS"));
		
		//5. Select $data from the RTR CALCULATION METHOD list
		uiDriver.select("act_fill_RFR_ATTRIBUTES_TAB.lstRTR_CALCULATION_METHOD", input.get("Select@RTR_CALCULATION_METHOD"));
		
		//6. Select $data from the RTR SPREAD TREATMENT list
		uiDriver.select("act_fill_RFR_ATTRIBUTES_TAB.lstRTR_SPREAD_TREATMENT", input.get("Select@RTR_SPREAD_TREATMENT"));
		
	}
	
	public void ACT_VERIFY_RFR_ATTRIBUTES_TAB(DataRow input, DataRow output) {
		//1. Click RFR Attributes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltRFR_Attributes",input.get("ClickWithSkip@RFR_Attributes"));
		
		//2. Verfies that text $Parama1 is present in Lookback 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltLookback",input.get("AssertTextPresent@Lookback"));
		
		//3. Verfies that text $Parama1 is present in Observation.shift 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltObservation_shift",input.get("AssertTextPresent@Observation_shift"));
		
		//4. Verfies that text $Parama1 is present in Narrow 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltNarrow",input.get("AssertTextPresent@Narrow"));
		
		//5. Verfies that text $Parama1 is present in 3 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.elt3",input.get("AssertTextPresent@3"));
		
		//6. Verfies that text $Parama1 is present in Compound 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltCompound",input.get("AssertTextPresent@Compound"));
		
		//7. Verfies that text $Parama1 is present in Exclusive 
		uiDriver.checkText("ACT_VERIFY_RFR_ATTRIBUTES_TAB.eltExclusive",input.get("AssertTextPresent@Exclusive"));
		
	}
	
	public void act_AppendUpload_LoansFile_SC03(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_HKCBSC03TESTFILE20221010_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansFile_SC03.eltUpload_HKCBSC03TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_HKCBSC03TESTFILE20221010_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_TAB_MUFGHK_ARPS_ERROR_TXN(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//2. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#1"));
		
		//3. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#4"));
		
		//4. Click Selection Screen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltSelection_Screen",input.get("ClickWithSkip@Selection_Screen#1"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//6. Enter global value for the key $Parama1 in CUSOTMER.ID 
		uiDriver.typeGlobalValue("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltCUSOTMER_ID", input.get("TypeGlobalValue@CUSOTMER_ID#1"));
		
		//7. Type $data in RECORD.STATUS field
		uiDriver.setValue("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.txtRECORD_STATUS", input.get("Type@RECORD_STATUS"));
		
		//8. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltFind",input.get("ClickWithSkip@Find#1"));
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//10. WaitandRefresh EditRefresh $Parama1
		uiDriver.waitandRefresh("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltEditRefresh",input.get("WaitandRefresh@EditRefresh"));
		
		//11. Set RunTime Global Value from getting the text  LoanId to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltLoanId",input.get("setRunTimeGlobalValue@LoanId"));
		
		//12. Verfies that text $Parama1 is present in Status 
		uiDriver.checkText("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltStatus",input.get("AssertTextPresent@Status"));
		
		//13. Click Edit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltEdit",input.get("ClickWithSkip@Edit"));
		
		//14. Click Delete if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltDelete",input.get("ClickWithSkip@Delete"));
		
		//15. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//16. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//17. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#2"));
		
		//18. Click Bulk Authorise if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltBulk_Authorise",input.get("ClickWithSkip@Bulk_Authorise"));
		
		//19. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#5"));
		
		//20. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//21. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame#3"));
		
		//22. Click Selection Screen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.lnkSelection_Screen",input.get("ClickWithSkip@Selection_Screen#2"));
		
		//23. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#6"));
		
		//24. Enter global value for the key $Parama1 in CUSOTMER.ID 
		uiDriver.typeGlobalValue("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltCUSOTMER_ID", input.get("TypeGlobalValue@CUSOTMER_ID#2"));
		
		//25. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltFind",input.get("ClickWithSkip@Find#2"));
		
		//26. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#7"));
		
		//27. Click CheckBox if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltCheckBox",input.get("ClickWithSkip@CheckBox"));
		
		//28. Click Authorize if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_TAB_MUFGHK_ARPS_ERROR_TXN.eltAuthorize",input.get("ClickWithSkip@Authorize"));
		
		//29. Take screenshot of CHROME Browser
		uiDriver.takescreenshot();
		
		//30. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
	}
	
	public void act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Enter global value for the key $Parama1 in Customer Id 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtCustomer_Id", input.get("TypeGlobalValue@Customer_Id"));
		
		//3. Type $Parama1 Date in Maturity Date  textbox
		uiDriver.TypeDate("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.eltMaturity_Date", input.get("TypeDate@Maturity_Date"));
		
		//4. Type $data in Loan Amount field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtLoan_Amount", input.get("Type@Loan_Amount"));
		
		//5. Type Limit Reference $Parama1
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.eltLimit_Reference", input.get("Type@Limit_Reference"));
		
		//6. Type $data in Product Purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtProduct_Purpose", input.get("Type@Product_Purpose"));
		
		//7. Click Account Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.eltAccount_Details",input.get("ClickWithSkip@Account_Details"));
		
		//8. Enter global value for the key $Parama1 in Drawdown Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.eltDrawdown_Account", input.get("TypeGlobalValue@Drawdown_Account"));
		
		//9. Enter global value for the key $Parama1 in Principal Liq Account 
		uiDriver.typeGlobalValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.eltPrincipal_Liq_Account", input.get("TypeGlobalValue@Principal_Liq_Account"));
		
		//10. Type $data in Code of purpose field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtCode_of_purpose", input.get("Type@Code_of_purpose"));
		
		//11. Type $data in Business code sub function field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtBusiness_code_sub_function", input.get("Type@Business_code_sub_function"));
		
		//12. Type $data in APRS Flag field
		uiDriver.setValue("act_fill_LD_LOANS_AND_DEPOSITS_MUFGHK_ARPS_INP.txtAPRS_Flag", input.get("Type@APRS_Flag"));
		
	}
	
	public void act_Appendupload_LoansSC39_20221018(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_TESTFILE39_csv $Parama1
		uiDriver.AppendValueInCsv("act_Appendupload_LoansSC39_20221018.eltUpload_TESTFILE3920230124_csv",input.get("SetvalueInCsv@Upload_TESTFILE39_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC37_20221018(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC37TESTFILE20221018_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC37_20221018.eltUpload_SC37TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC37TESTFILE20221018_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC34_20221019(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC34TESTFILE20221019_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC34_20221019.eltUpload_SC34TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC34TESTFILE20221019_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUploadAT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC02TC001TESTFILE20221410_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUploadAT.eltUpload_SC02TC001TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC02TC001TESTFILE20221410_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_set_GlobalValues(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Set RunTime Global Value from getting the text  ARPSID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_GlobalValues.txtARPSID",input.get("setRunTimeGlobalValue@ARPSID"));
		
	}
	
	public void act_set_LoanID_GlobalValues(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Set RunTime Global Value from getting the text  GV_LoanID1 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID1",input.get("setRunTimeGlobalValue@GV_LoanID1"));
		
		//3. Set RunTime Global Value from getting the text  GV_LoanID2 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID2",input.get("setRunTimeGlobalValue@GV_LoanID2"));
		
		//4. Set RunTime Global Value from getting the text  GV_LoanID3 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID3",input.get("setRunTimeGlobalValue@GV_LoanID3"));
		
		//5. Set RunTime Global Value from getting the text  GV_LoanID4 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID4",input.get("setRunTimeGlobalValue@GV_LoanID4"));
		
		//6. Set RunTime Global Value from getting the text  GV_LoanID5 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID5",input.get("setRunTimeGlobalValue@GV_LoanID5"));
		
		//7. Set RunTime Global Value from getting the text  GV_LoanID6 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID6",input.get("setRunTimeGlobalValue@GV_LoanID6"));
		
		//8. Set RunTime Global Value from getting the text  GV_LoanID8 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID8",input.get("setRunTimeGlobalValue@GV_LoanID8"));
		
		//9. Set RunTime Global Value from getting the text  GV_LoanID9 to $Parama1
		uiDriver.setRunTimeGlobalValue("act_set_LoanID_GlobalValues.txtGV_LoanID9",input.get("setRunTimeGlobalValue@GV_LoanID9"));
		
	}
	
	public void act_AppendUpload_LoansSC08_20221020(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC08TESTFILE20221020_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC08_20221020.eltUpload_SC08TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC08TESTFILE20221020_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC54TC002_20221020(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC54TC002TESTFILE20221020_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC54TC002_20221020.eltUpload_SC54TC002TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC54TC002TESTFILE20221020_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_LoansSC54TC003_20221021(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC54TC003TESTFILE20221021_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansSC54TC003_20221021.eltUpload_SC54TC003TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC54TC003TESTFILE20221021_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_Loans_PreReqCases(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SCTESTFILEPreReq20221025_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_Loans_PreReqCases.eltUpload_SCTESTFILEPreReq20230124_csv",input.get("SetvalueInCsv@Upload_SCTESTFILEPreReq20221025_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_click_GuaranteeDetails(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Click Guarantee Basic Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_click_GuaranteeDetails.eltGuarantee_Basic_Details",input.get("ClickWithSkip@Guarantee_Basic_Details"));
		
	}
	
	public void act_AppendUpload_LoansFile_SC05(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_HKCBSC05TESTFILE20221010_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_LoansFile_SC05.eltUpload_HKCBSC05TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_HKCBSC05TESTFILE20221010_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload01(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_SC01TC001TESTFILE20221410_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload01.eltUpload_SC01TC001TESTFILE20230124_csv",input.get("SetvalueInCsv@Upload_SC01TC001TESTFILE20221410_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_AppendUpload_CorrectLoansFile_SC04(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SetvalueInCsv Upload_HKCBSC04CORRECTFILE20221108_csv $Parama1
		uiDriver.AppendValueInCsv("act_AppendUpload_CorrectLoansFile_SC04.eltUpload_HKCBSC04CORRECTFILE20230124_csv",input.get("SetvalueInCsv@Upload_HKCBSC04CORRECTFILE20221108_csv"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	

	/**
	*Overriding toString() method of object class to print Loans
	*format string
	**/
	public String toString(){
		return "LoansDriver()";
	}
}
