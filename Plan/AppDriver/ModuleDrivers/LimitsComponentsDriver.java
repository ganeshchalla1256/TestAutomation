/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:20
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
public class LimitsComponentsDriver extends BaseWebModuleDriver {
	public LimitsComponentsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_FillScrdOrUnscrLmtRfIDType(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. TypeConcatenatedGlobalValue given in $Parama1 in Secured Limit 
		uiDriver.typeConcatenatedGlobalValue("act_FillScrdOrUnscrLmtRfIDType.txtSecured_Limit", input.get("TypeConcatenatedGlobalValue@Secured_Limit"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Enter global value for the key $Parama1 in Secured Limit 
		uiDriver.typeGlobalValue("act_FillScrdOrUnscrLmtRfIDType.txtSecured_Limit", input.get("TypeGlobalValue@Secured_Limit"));
		
	}
	
	public void act_FillUnAuthCreditlineNo(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in CREDIT.LINE.NO 
		uiDriver.typeGlobalValue("act_FillUnAuthCreditlineNo.txtCREDIT_LINE_NO", input.get("TypeGlobalValue@CREDIT_LINE_NO"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Enter global value for the key $Parama1 in LIMIT 
		uiDriver.typeGlobalValue("act_FillUnAuthCreditlineNo.txtLIMIT", input.get("TypeGlobalValue@LIMIT"));
		
	}
	
	public void act_fill_LIMIT_MUFGHK_SECURED(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type Currency $Parama1
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.eltCurrency", input.get("Type@Currency"));
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. Type Internal Amount $Parama1
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.eltInternal_Amount", input.get("Type@Internal_Amount"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Set RunTime Global Value from getting the text  Secured Limit to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_LIMIT_MUFGHK_SECURED.eltSecured_Limit",input.get("setRunTimeGlobalValue@Secured_Limit"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Type $data in Country of Risk.1 field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtCountry_of_Risk_1", input.get("Type@Country_of_Risk_1"));
		
		//9. Click Available Marker_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.eltAvailable_Marker_Y",input.get("ClickWithSkip@Available_Marker_Y"));
		
		//10. Type $data in GCARS Application Num field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtGCARS_Application_Num", input.get("Type@GCARS_Application_Num"));
		
		//11. Type $data in GCARS Facility Num field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtGCARS_Facility_Num", input.get("Type@GCARS_Facility_Num"));
		
		//12. Click Ringi.satei_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.txtRingi_satei_1",input.get("ClickWithSkip@Ringi_satei_1"));
		
		//13. Click Ringi.satei_2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.txtRingi_satei_2",input.get("ClickWithSkip@Ringi_satei_2"));
		
		//14. Click Ringi.satei_8 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.txtRingi_satei_8",input.get("ClickWithSkip@Ringi_satei_8"));
		
		//15. Click Inclusive/NonInclusive_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.txtInclusive_NonInclusive_1",input.get("ClickWithSkip@Inclusive_NonInclusive_1"));
		
		//16. Click Inclusive/NonInclusive_2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.txtInclusive_NonInclusive_2",input.get("ClickWithSkip@Inclusive_NonInclusive_2"));
		
		//17. Type $data in Purpose field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtPurpose", input.get("Type@Purpose"));
		
		//18. Type $data in Credit Facility Term field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtCredit_Facility_Term", input.get("Type@Credit_Facility_Term"));
		
		//19. Type $data in RepaymentType field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtRepaymentType", input.get("Type@RepaymentType"));
		
		//20. Type $data in Review Fqy field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtReview_Fqy", input.get("Type@Review_Fqy"));
		
		//21. Type $data in Min Commitment Rate field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtMin_Commitment_Rate", input.get("Type@Min_Commitment_Rate"));
		
		//22. Type $data in Max Tenor field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtMax_Tenor", input.get("Type@Max_Tenor"));
		
		//23. Type $data in Minimum Margin field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtMinimum_Margin", input.get("Type@Minimum_Margin"));
		
		//24. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_LIMIT_MUFGHK_SECURED.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//25. Type $data in Max Total field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtMax_Total", input.get("Type@Max_Total"));
		
		//26. Type $data in Collateral Code.1 field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtCollateral_Code_1", input.get("Type@Collateral_Code_1"));
		
		//27. Type $data in Max Value.1 field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtMax_Value_1", input.get("Type@Max_Value_1"));
		
		//28. Click Fix/Variable if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_LIMIT_MUFGHK_SECURED.eltFix_Variable",input.get("ClickWithSkip@Fix_Variable"));
		
		//29. Type $data in Inter-office type field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtInter_office_type", input.get("Type@Inter_office_type"));
		
		//30. Type $data in Inter-office branch code field
		uiDriver.setValue("act_fill_LIMIT_MUFGHK_SECURED.txtInter_office_branch_code", input.get("Type@Inter_office_branch_code"));
		
	}
	

	/**
	*Overriding toString() method of object class to print LimitsComponents
	*format string
	**/
	public String toString(){
		return "LimitsComponentsDriver()";
	}
}
