/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:08
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
public class limitsDriver extends BaseWebModuleDriver {
	public limitsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_LIMIT_MUFGHK_MAINTAIN(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Set RunTime Global Value from getting the text  LimitID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LIMIT_MUFGHK_MAINTAIN.eltLimitID",input.get("setRunTimeGlobalValue@LimitID"));
		
		//4. Type $data in Currency field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtCurrency", input.get("Type@Currency"));
		
		//5. Type $data in Country of Risk field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtCountry_of_Risk", input.get("Type@Country_of_Risk"));
		
		//6. Type $data in Country Percent field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtCountry_Percent", input.get("Type@Country_Percent"));
		
		//7. Type $data in GCARS Application Number field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtGCARS_Application_Number", input.get("Type@GCARS_Application_Number"));
		
		//8. Enter global value for the key $Parama1 in GCARS Application Number 
		uiDriver.typeGlobalValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtGCARS_Application_Number", input.get("TypeGlobalValue@GCARS_Application_Number"));
		
		//9. Type $data in GCARS Facility Number field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtGCARS_Facility_Number", input.get("Type@GCARS_Facility_Number"));
		
		//10. Click Ringi.Satei 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltRingi_Satei_1",input.get("ClickWithSkip@Ringi_Satei_1"));
		
		//11. Click Ringi.Satei 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltRingi_Satei_2",input.get("ClickWithSkip@Ringi_Satei_2"));
		
		//12. Click Ringi.Satei 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltRingi_Satei_3",input.get("ClickWithSkip@Ringi_Satei_3"));
		
		//13. Type $data in Inter-office type field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtInter_office_type", input.get("Type@Inter_office_type"));
		
		//14. Type $data in Inter-office branch code field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtInter_office_branch_code", input.get("Type@Inter_office_branch_code"));
		
		//15. Click Inclusive/Non-inclusive 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltInclusive_Non_inclusive_1",input.get("ClickWithSkip@Inclusive_Non_inclusive_1"));
		
		//16. Click Inclusive/Non-inclusive 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltInclusive_Non_inclusive_2",input.get("ClickWithSkip@Inclusive_Non_inclusive_2"));
		
		//17. Type $data in Purpose field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtPurpose", input.get("Type@Purpose"));
		
		//18. Type $data in Internal Amount field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtInternal_Amount", input.get("Type@Internal_Amount"));
		
		//19. Click Fix/Variable None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltFix_Variable_None",input.get("ClickWithSkip@Fix_Variable_None"));
		
		//20. Click Fix/Variable Fixed if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltFix_Variable_Fixed",input.get("ClickWithSkip@Fix_Variable_Fixed"));
		
		//21. Click Fix/Variable Variable if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltFix_Variable_Variable",input.get("ClickWithSkip@Fix_Variable_Variable"));
		
		//22. Type $Parama1 Date in Approval Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_MAINTAIN.txtApproval_Date", input.get("TypeDate@Approval_Date"));
		
		//23. Click Available Marker None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltAvailable_Marker_None",input.get("ClickWithSkip@Available_Marker_None"));
		
		//24. Click Available Marker N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltAvailable_Marker_N",input.get("ClickWithSkip@Available_Marker_N"));
		
		//25. Click Available Marker R if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltAvailable_Marker_R",input.get("ClickWithSkip@Available_Marker_R"));
		
		//26. Click Available Marker Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltAvailable_Marker_Y",input.get("ClickWithSkip@Available_Marker_Y"));
		
		//27. Type $data in Credit Facility Term field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtCredit_Facility_Term", input.get("Type@Credit_Facility_Term"));
		
		//28. Type $data in Repayment Type field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtRepayment_Type", input.get("Type@Repayment_Type"));
		
		//29. Click Syndication 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltSyndication_1",input.get("ClickWithSkip@Syndication_1"));
		
		//30. Click Syndication 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltSyndication_2",input.get("ClickWithSkip@Syndication_2"));
		
		//31. Click Committed 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltCommitted_1",input.get("ClickWithSkip@Committed_1"));
		
		//32. Click Committed 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_MAINTAIN.eltCommitted_2",input.get("ClickWithSkip@Committed_2"));
		
		//33. Type $Parama1 Date in Agreement Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_MAINTAIN.txtAgreement_Date", input.get("TypeDate@Agreement_Date"));
		
		//34. Type $data in Syndication Total field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_MAINTAIN.txtSyndication_Total", input.get("Type@Syndication_Total"));
		
	}
	
	public void act_fill_LIMIT_MUFGHK_INPUT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  LimitID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LIMIT_MUFGHK_INPUT.eltLimitID",input.get("setRunTimeGlobalValue@LimitID"));
		
		//4. Type $data in Currency field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtCurrency", input.get("Type@Currency"));
		
		//5. Type $data in Country of Risk field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtCountry_of_Risk", input.get("Type@Country_of_Risk"));
		
		//6. Type $data in Country Percent field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtCountry_Percent", input.get("Type@Country_Percent"));
		
		//7. Type $data in GCARS Application Number field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtGCARS_Application_Number", input.get("Type@GCARS_Application_Number"));
		
		//8. Enter global value for the key $Parama1 in GCARS Application Number 
		uiDriver.typeGlobalValue("act_fill_LIMIT_MUFGHK_INPUT.txtGCARS_Application_Number", input.get("TypeGlobalValue@GCARS_Application_Number"));
		
		//9. Type $data in GCARS Facility Number field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtGCARS_Facility_Number", input.get("Type@GCARS_Facility_Number"));
		
		//10. Type $data in Inter-office type field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtInter_office_type", input.get("Type@Inter_office_type"));
		
		//11. Type $data in Inter-office branch code field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtInter_office_branch_code", input.get("Type@Inter_office_branch_code"));
		
		//12. Click Ringi.Satei 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltRingi_Satei_1",input.get("ClickWithSkip@Ringi_Satei_1"));
		
		//13. Click Ringi.Satei 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltRingi_Satei_2",input.get("ClickWithSkip@Ringi_Satei_2"));
		
		//14. Click Ringi.Satei 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltRingi_Satei_3",input.get("ClickWithSkip@Ringi_Satei_3"));
		
		//15. Click Inclusive/Non-inclusive 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltInclusive_Non_inclusive_1",input.get("ClickWithSkip@Inclusive_Non_inclusive_1"));
		
		//16. Click Inclusive/Non-inclusive 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltInclusive_Non_inclusive_2",input.get("ClickWithSkip@Inclusive_Non_inclusive_2"));
		
		//17. Type $data in Purpose field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtPurpose", input.get("Type@Purpose"));
		
		//18. Type $data in Internal Amount field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtInternal_Amount", input.get("Type@Internal_Amount"));
		
		//19. Click Fix/Variable None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltFix_Variable_None",input.get("ClickWithSkip@Fix_Variable_None"));
		
		//20. Click Fix/Variable Fixed if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltFix_Variable_Fixed",input.get("ClickWithSkip@Fix_Variable_Fixed"));
		
		//21. Click Fix/Variable Variable if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltFix_Variable_Variable",input.get("ClickWithSkip@Fix_Variable_Variable"));
		
		//22. Type $Parama1 Date in Conversion Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtConversion_Date", input.get("TypeDate@Conversion_Date"));
		
		//23. Type $data in Original Limit Reference field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtOriginal_Limit_Reference", input.get("Type@Original_Limit_Reference"));
		
		//24. Type $Parama1 Date in Proposal Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtProposal_Date", input.get("TypeDate@Proposal_Date"));
		
		//25. Type $Parama1 Date in Approval Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtApproval_Date", input.get("TypeDate@Approval_Date"));
		
		//26. Type $Parama1 Date in Online Limit Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtOnline_Limit_Date", input.get("TypeDate@Online_Limit_Date"));
		
		//27. Click Review Freq_Frequency Control if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.btnReview_Freq_Frequency_Control",input.get("ClickWithSkip@Review_Freq_Frequency_Control"));
		
		//28. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//29. Type $Parama1 Date in Next Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtNext_Date", input.get("TypeDate@Next_Date"));
		
		//30. Click Save if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.btnSave",input.get("ClickWithSkip@Save"));
		
		//31. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//32. Click Available Marker None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltAvailable_Marker_None",input.get("ClickWithSkip@Available_Marker_None"));
		
		//33. Click Available Marker N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltAvailable_Marker_N",input.get("ClickWithSkip@Available_Marker_N"));
		
		//34. Click Available Marker R if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltAvailable_Marker_R",input.get("ClickWithSkip@Available_Marker_R"));
		
		//35. Click Available Marker Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltAvailable_Marker_Y",input.get("ClickWithSkip@Available_Marker_Y"));
		
		//36. Type $data in Credit Facility Term field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtCredit_Facility_Term", input.get("Type@Credit_Facility_Term"));
		
		//37. Type $data in Repayment Type field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtRepayment_Type", input.get("Type@Repayment_Type"));
		
		//38. Click Syndication 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltSyndication_1",input.get("ClickWithSkip@Syndication_1"));
		
		//39. Click Syndication 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltSyndication_2",input.get("ClickWithSkip@Syndication_2"));
		
		//40. Click Committed 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltCommitted_1",input.get("ClickWithSkip@Committed_1"));
		
		//41. Click Committed 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.eltCommitted_2",input.get("ClickWithSkip@Committed_2"));
		
		//42. Type $Parama1 Date in Agreement Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtAgreement_Date", input.get("TypeDate@Agreement_Date"));
		
		//43. Type $data in Collateral Code field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtCollateral_Code", input.get("Type@Collateral_Code"));
		
		//44. Type $data in Maximum Amount field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtMaximum_Amount", input.get("Type@Maximum_Amount"));
		
		//45. Type $data in Max Tenor field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtMax_Tenor", input.get("Type@Max_Tenor"));
		
		//46. Type $data in Tenor Days field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtTenor_Days", input.get("Type@Tenor_Days"));
		
		//47. Type $data in Minimum Margin % field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtMinimum_Margin_", input.get("Type@Minimum_Margin_"));
		
		//48. Click Syndication Status if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_INPUT.btnSyndication_Status",input.get("ClickWithSkip@Syndication_Status"));
		
		//49. Type $data in Syndication Total field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtSyndication_Total", input.get("Type@Syndication_Total"));
		
		//50. Type $data in Agent Bank code field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtAgent_Bank_code", input.get("Type@Agent_Bank_code"));
		
		//51. Type $data in Agent Bank field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtAgent_Bank", input.get("Type@Agent_Bank"));
		
		//52. Type $data in Final Take Amount field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_INPUT.txtFinal_Take_Amount", input.get("Type@Final_Take_Amount"));
		
		//53. Type $Parama1 Date in Last Draw Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_INPUT.txtLast_Draw_Date", input.get("TypeDate@Last_Draw_Date"));
		
	}
	
	public void act_fill_LIMIT_SUB_ALLOC_INPUT(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Sub Limit ID to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LIMIT_SUB_ALLOC_INPUT.eltSub_Limit_ID",input.get("setRunTimeGlobalValue@Sub_Limit_ID"));
		
		//4. TypeConcatenatedGlobalValue given in $Parama1 in Sub Alloc From 
		uiDriver.typeConcatenatedGlobalValue("act_fill_LIMIT_SUB_ALLOC_INPUT.txtSub_Alloc_From", input.get("TypeConcatenatedGlobalValue@Sub_Alloc_From"));
		
		//5. TypeConcatenatedGlobalValue given in $Parama1 in Sub Alloc To 
		uiDriver.typeConcatenatedGlobalValue("act_fill_LIMIT_SUB_ALLOC_INPUT.txtSub_Alloc_To", input.get("TypeConcatenatedGlobalValue@Sub_Alloc_To"));
		
		//6. Type $data in Notes field
		uiDriver.setValue("act_fill_LIMIT_SUB_ALLOC_INPUT.txtNotes", input.get("Type@Notes"));
		
		//7. Type $Parama1 Date in Effective Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_SUB_ALLOC_INPUT.txtEffective_Date", input.get("TypeDate@Effective_Date"));
		
		//8. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_SUB_ALLOC_INPUT.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//9. Type $data in Currency field
		uiDriver.setValue("act_fill_LIMIT_SUB_ALLOC_INPUT.txtCurrency", input.get("Type@Currency"));
		
		//10. Type $data in Online Limit field
		uiDriver.setValue("act_fill_LIMIT_SUB_ALLOC_INPUT.txtOnline_Limit", input.get("Type@Online_Limit"));
		
		//11. Click Auto Restore Limit None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_SUB_ALLOC_INPUT.eltAuto_Restore_Limit_None",input.get("ClickWithSkip@Auto_Restore_Limit_None"));
		
		//12. Click Auto Restore Limit Maximum if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_SUB_ALLOC_INPUT.eltAuto_Restore_Limit_Maximum",input.get("ClickWithSkip@Auto_Restore_Limit_Maximum"));
		
		//13. Click Auto Restore Limit N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_SUB_ALLOC_INPUT.eltAuto_Restore_Limit_N",input.get("ClickWithSkip@Auto_Restore_Limit_N"));
		
		//14. Click Auto Restore Limit Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_SUB_ALLOC_INPUT.eltAuto_Restore_Limit_Y",input.get("ClickWithSkip@Auto_Restore_Limit_Y"));
		
		//15. Dynamic Wait
		uiDriver.dynamicWait();
		
		//16. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	

	/**
	*Overriding toString() method of object class to print limits
	*format string
	**/
	public String toString(){
		return "limitsDriver()";
	}
}
