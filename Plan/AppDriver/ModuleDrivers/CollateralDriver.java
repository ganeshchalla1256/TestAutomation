/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:23
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
public class CollateralDriver extends BaseWebModuleDriver {
	public CollateralDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_fill_COLLATERAL_RIGHT_MUFGHK_INP(DataRow input, DataRow output) {
		//1. Type $data in Collateral Code field
		uiDriver.setValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtCollateral_Code", input.get("Type@Collateral_Code"));
		
		//2. Type $data in Expiry Date field
		uiDriver.setValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtExpiry_Date", input.get("Type@Expiry_Date"));
		
		//3. Set RunTime Global Value from getting the text  Collateral Link to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.eltCollateral_Link",input.get("setRunTimeGlobalValue@Collateral_Link"));
		
		//4. Enter global value for the key $Parama1 in Limit Reference.1 
		uiDriver.typeGlobalValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtLimit_Reference_1", input.get("TypeGlobalValue@Limit_Reference_1"));
		
		//5. TypeConcatenatedGlobalValue given in $Parama1 in Limit Reference.1 
		uiDriver.typeConcatenatedGlobalValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtLimit_Reference_1", input.get("TypeConcatenatedGlobalValue@Limit_Reference_1"));
		
		//6. Type $data in Allocation %.1 field
		uiDriver.setValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtAllocation_1", input.get("Type@Allocation_1"));
		
		//7. Type $Parama1 Date in Valid Date  textbox
		uiDriver.TypeDate("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtValid_Date", input.get("TypeDate@Valid_Date"));
		
		//8. Type $data in Valid Date field
		uiDriver.setValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtValid_Date", input.get("Type@Valid_Date"));
		
		//9. Enter global value for the key $Parama1 in Limit Ref Cust.1 
		uiDriver.typeGlobalValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtLimit_Ref_Cust_1", input.get("TypeGlobalValue@Limit_Ref_Cust_1"));
		
		//10. Type $data in Notes field
		uiDriver.setValue("act_fill_COLLATERAL_RIGHT_MUFGHK_INP.txtNotes", input.get("Type@Notes"));
		
	}
	
	public void act_ClkSelectionScreen(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on SelectionScreen WebElement
		uiDriver.click("act_ClkSelectionScreen.eltSelectionScreen");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void fill_CustomerID_act(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Enter global value for the key $Parama1 in Customer ID 
		uiDriver.typeGlobalValue("fill_CustomerID_act.txtCustomer_ID", input.get("TypeGlobalValue@Customer_ID"));
		
		//3. Type $data in Customer ID field
		uiDriver.setValue("fill_CustomerID_act.txtCustomer_ID", input.get("Type@Customer_ID"));
		
		//4. Type $data in Sector field
		uiDriver.setValue("fill_CustomerID_act.txtSector", input.get("Type@Sector"));
		
	}
	
	public void fill_CollateralID_forCreation(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. TypeConcatenatedGlobalValue given in $Parama1 in Collateral Id 
		uiDriver.typeConcatenatedGlobalValue("fill_CollateralID_forCreation.txtCollateral_Id", input.get("TypeConcatenatedGlobalValue@Collateral_Id"));
		
	}
	
	public void act_verify_COLLATERAL_CODE(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Verfies that text $Parama1 is present in Collateral code 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.eltCollateral_code",input.get("AssertTextPresent@Collateral_code"));
		
		//4. Verfies that text $Parama1 is present in 110 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt110",input.get("AssertTextPresent@110"));
		
		//5. Verfies that text $Parama1 is present in 120 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt120",input.get("AssertTextPresent@120"));
		
		//6. Verfies that text $Parama1 is present in 130 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt130",input.get("AssertTextPresent@130"));
		
		//7. Verfies that text $Parama1 is present in 210 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt210",input.get("AssertTextPresent@210"));
		
		//8. Verfies that text $Parama1 is present in 220 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt220",input.get("AssertTextPresent@220"));
		
		//9. Verfies that text $Parama1 is present in 310 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt310",input.get("AssertTextPresent@310"));
		
		//10. Verfies that text $Parama1 is present in 410 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt410",input.get("AssertTextPresent@410"));
		
		//11. Verfies that text $Parama1 is present in 420 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt420",input.get("AssertTextPresent@420"));
		
		//12. Verfies that text $Parama1 is present in 430 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt430",input.get("AssertTextPresent@430"));
		
		//13. Verfies that text $Parama1 is present in 440 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt440",input.get("AssertTextPresent@440"));
		
		//14. Verfies that text $Parama1 is present in 510 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt510",input.get("AssertTextPresent@510"));
		
		//15. Verfies that text $Parama1 is present in 520 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt520",input.get("AssertTextPresent@520"));
		
		//16. Verfies that text $Parama1 is present in 530 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt530",input.get("AssertTextPresent@530"));
		
		//17. Verfies that text $Parama1 is present in 540 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt540",input.get("AssertTextPresent@540"));
		
		//18. Verfies that text $Parama1 is present in 610 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt610",input.get("AssertTextPresent@610"));
		
		//19. Verfies that text $Parama1 is present in 620 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt620",input.get("AssertTextPresent@620"));
		
		//20. Verfies that text $Parama1 is present in 690 
		uiDriver.checkText("act_verify_COLLATERAL_CODE.elt690",input.get("AssertTextPresent@690"));
		
		//21. Dynamic Wait
		uiDriver.dynamicWait();
		
		//22. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_verify_ENQ_COLLAT_EXPIRY(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. TypeConcatenatedGlobalValue given in $Parama1 in Collateral Id 
		uiDriver.typeConcatenatedGlobalValue("act_verify_ENQ_COLLAT_EXPIRY.txtCollateral_Id", input.get("TypeConcatenatedGlobalValue@Collateral_Id"));
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//5. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_ENQ_COLLAT_EXPIRY.eltFind",input.get("ClickWithSkip@Find"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//7. Click View Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_ENQ_COLLAT_EXPIRY.eltView_Details",input.get("ClickWithSkip@View_Details"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
	}
	
	public void fill_CustNo_CollateralLink(DataRow input, DataRow output) {
		//1. Enter global value for the key $Parama1 in Collateral Link 
		uiDriver.typeGlobalValue("fill_CustNo_CollateralLink.eltCollateral_Link", input.get("TypeGlobalValue@Collateral_Link"));
		
		//2. TypeConcatenatedGlobalValue given in $Parama1 in Collateral Link 
		uiDriver.typeConcatenatedGlobalValue("fill_CustNo_CollateralLink.eltCollateral_Link", input.get("TypeConcatenatedGlobalValue@Collateral_Link"));
		
	}
	
	public void act_fill_COLLATERAL_MUFGHK_INP(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Verfies that text $Parama1 is present in Collateral Code Error 
		uiDriver.checkText("act_fill_COLLATERAL_MUFGHK_INP.eltCollateral_Code_Error",input.get("AssertTextPresent@Collateral_Code_Error"));
		
		//3. Type $data in Nominal Value field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtNominal_Value", input.get("Type@Nominal_Value"));
		
		//4. Type $data in Currency field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtCurrency", input.get("Type@Currency"));
		
		//5. Type $data in Collateral Code field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtCollateral_Code", input.get("Type@Collateral_Code"));
		
		//6. Type $data in Description.1 field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtDescription_1", input.get("Type@Description_1"));
		
		//7. Type $data in Collateral Type field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtCollateral_Type", input.get("Type@Collateral_Type"));
		
		//8. Type $data in Country field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtCountry", input.get("Type@Country"));
		
		//9. Type $data in Company field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtCompany", input.get("Type@Company"));
		
		//10. Type $Parama1 Date in Expiry Date  textbox
		uiDriver.TypeDate("act_fill_COLLATERAL_MUFGHK_INP.txtExpiry_Date", input.get("TypeDate@Expiry_Date"));
		
		//11. Type $Parama1 Date in Value Date  textbox
		uiDriver.TypeDate("act_fill_COLLATERAL_MUFGHK_INP.txtValue_Date", input.get("TypeDate@Value_Date"));
		
		//12. Set RunTime Global Value from getting the text  Collateral Details to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_COLLATERAL_MUFGHK_INP.eltCollateral_Details",input.get("setRunTimeGlobalValue@Collateral_Details"));
		
		//13. Type $data in Execution Value field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtExecution_Value", input.get("Type@Execution_Value"));
		
		//14. Type $data in Gen Ledger Value field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtGen_Ledger_Value", input.get("Type@Gen_Ledger_Value"));
		
		//15. Enter global value for the key $Parama1 in Application Ref 
		uiDriver.typeGlobalValue("act_fill_COLLATERAL_MUFGHK_INP.txtApplication_Ref", input.get("TypeGlobalValue@Application_Ref"));
		
		//16. Click Transfer risk Covered_YES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnTransfer_risk_Covered_YES",input.get("ClickWithSkip@Transfer_risk_Covered_YES"));
		
		//17. Click Transfer risk Covered_NO if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnTransfer_risk_Covered_NO",input.get("ClickWithSkip@Transfer_risk_Covered_NO"));
		
		//18. Click Standard_YES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnStandard_YES",input.get("ClickWithSkip@Standard_YES"));
		
		//19. Click Standard_NO if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnStandard_NO",input.get("ClickWithSkip@Standard_NO"));
		
		//20. Click Quality_Excelent if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnQuality_Excelent",input.get("ClickWithSkip@Quality_Excelent"));
		
		//21. Click Quality_Ordinary if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnQuality_Ordinary",input.get("ClickWithSkip@Quality_Ordinary"));
		
		//22. Click Quality_Other if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_COLLATERAL_MUFGHK_INP.btnQuality_Other",input.get("ClickWithSkip@Quality_Other"));
		
		//23. Type $data in Registration status field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtRegistration_status", input.get("Type@Registration_status"));
		
		//24. Type $data in Provider Main Office Customer Code  field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtProvider_Main_Office_Customer_Code_", input.get("Type@Provider_Main_Office_Customer_Code_"));
		
		//25. Type $data in Provider Main Office Code field
		uiDriver.setValue("act_fill_COLLATERAL_MUFGHK_INP.txtProvider_Main_Office_Code", input.get("Type@Provider_Main_Office_Code"));
		
		//26. Select $data from the Listed list
		uiDriver.select("act_fill_COLLATERAL_MUFGHK_INP.lstListed", input.get("Select@Listed"));
		
		//27. Select $data from the Provider Type list
		uiDriver.select("act_fill_COLLATERAL_MUFGHK_INP.lstProvider_Type", input.get("Select@Provider_Type"));
		
		//28. Select $data from the Divident payment list
		uiDriver.select("act_fill_COLLATERAL_MUFGHK_INP.lstDivident_payment", input.get("Select@Divident_payment"));
		
	}
	
	public void act_fill_ENQ_CO_001(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Select $data from the Selection list
		uiDriver.select("act_fill_ENQ_CO_001.lstSelection", input.get("Select@Selection"));
		
		//4. TypeConcatenatedGlobalValue given in $Parama1 in Liability Number 
		uiDriver.typeConcatenatedGlobalValue("act_fill_ENQ_CO_001.txtLiability_Number", input.get("TypeConcatenatedGlobalValue@Liability_Number"));
		
		//5. Click Find if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_ENQ_CO_001.eltFind",input.get("ClickWithSkip@Find"));
		
		//6. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	

	/**
	*Overriding toString() method of object class to print Collateral
	*format string
	**/
	public String toString(){
		return "CollateralDriver()";
	}
}
