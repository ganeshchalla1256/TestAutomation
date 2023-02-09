/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:40:28
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
public class CommonDriver extends BaseWebModuleDriver {
	public CommonDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Check  DPS Addr Typ is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ",input.get("AssertElementPresent@DPS_Addr_Typ"));
		
		//3. $Parama1 DPS Addr Typ_options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("DpdownValCheck@DPS_Addr_Typ_options#1"));
		
		//4. $Parama1 DPS Addr Typ_options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("DpdownValCheck@DPS_Addr_Typ_options#2"));
		
		//5. $Parama1 DPS Addr Typ_options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("DpdownValCheck@DPS_Addr_Typ_options#3"));
		
		//6. $Parama1 DPS Addr Typ_options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("DpdownValCheck@DPS_Addr_Typ_options#4"));
		
		//7. $Parama1 DPS Addr Typ_options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("DpdownValCheck@DPS_Addr_Typ_options#5"));
		
		//8. Type DPS Addr Typ_options $Parama1
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDPS_Addr_Typ_options", input.get("Type@DPS_Addr_Typ_options"));
		
		//9. Dynamic Wait
		uiDriver.dynamicWait();
		
		//10. Type $data in No Of Employees field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.txtNo_Of_Employees", input.get("Type@No_Of_Employees"));
		
		//11. Click Cross Default Clause_General_Agreement if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCross_Default_Clause_General_Agreement",input.get("ClickWithSkip@Cross_Default_Clause_General_Agreement"));
		
		//12. Dynamic Wait
		uiDriver.dynamicWait();
		
		//13. Verfies that text $Parama1 is present in Forex 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltForex",input.get("AssertTextPresent@Forex"));
		
		//14. Click Forex Customer With Web Confirmation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnForex_Customer_With_Web_Confirmation",input.get("ClickWithSkip@Forex_Customer_With_Web_Confirmation"));
		
		//15. Click Forex Customer With Letter Confirmation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnForex_Customer_With_Letter_Confirmation",input.get("ClickWithSkip@Forex_Customer_With_Letter_Confirmation"));
		
		//16. Click Non Forex Customer if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnNon_Forex_Customer",input.get("ClickWithSkip@Non_Forex_Customer"));
		
		//17. Dynamic Wait
		uiDriver.dynamicWait();
		
		//18. Type $Parama1 Date in Lst Assess Dt  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.txtLst_Assess_Dt", input.get("TypeDate@Lst_Assess_Dt"));
		
		//19. Dynamic Wait
		uiDriver.dynamicWait();
		
		//20. Click CHINA ITIC_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_ITIC_Y",input.get("ClickWithSkip@CHINA_ITIC_Y"));
		
		//21. Click CHINA ITIC_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_ITIC_N",input.get("ClickWithSkip@CHINA_ITIC_N"));
		
		//22. Click CHINA ITIC_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_ITIC_NONE",input.get("ClickWithSkip@CHINA_ITIC_NONE"));
		
		//23. Dynamic Wait
		uiDriver.dynamicWait();
		
		//24. Verfies that text $Parama1 is present in CHINA Cmp Status 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status",input.get("AssertTextPresent@CHINA_Cmp_Status"));
		
		//25. $Parama1 CHINA Cmp Status_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status_Options", input.get("DpdownValCheck@CHINA_Cmp_Status_Options#1"));
		
		//26. $Parama1 CHINA Cmp Status_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status_Options", input.get("DpdownValCheck@CHINA_Cmp_Status_Options#2"));
		
		//27. $Parama1 CHINA Cmp Status_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status_Options", input.get("DpdownValCheck@CHINA_Cmp_Status_Options#3"));
		
		//28. $Parama1 CHINA Cmp Status_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status_Options", input.get("DpdownValCheck@CHINA_Cmp_Status_Options#4"));
		
		//29. Type CHINA Cmp Status_Options $Parama1
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCHINA_Cmp_Status_Options", input.get("Type@CHINA_Cmp_Status_Options"));
		
		//30. Dynamic Wait
		uiDriver.dynamicWait();
		
		//31. Click CHINA Predominant_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_Predominant_Y",input.get("ClickWithSkip@CHINA_Predominant_Y"));
		
		//32. Click CHINA Predominant_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_Predominant_N",input.get("ClickWithSkip@CHINA_Predominant_N"));
		
		//33. Click CHINA Predominant_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCHINA_Predominant_NONE",input.get("ClickWithSkip@CHINA_Predominant_NONE"));
		
		//34. Dynamic Wait
		uiDriver.dynamicWait();
		
		//35. Verfies that text $Parama1 is present in CParty Type 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type",input.get("AssertTextPresent@CParty_Type"));
		
		//36. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#1"));
		
		//37. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#2"));
		
		//38. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#3"));
		
		//39. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#4"));
		
		//40. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#5"));
		
		//41. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#6"));
		
		//42. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#7"));
		
		//43. $Parama1 CParty Type_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("DpdownValCheck@CParty_Type_Options#8"));
		
		//44. Type CParty Type_Options $Parama1
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCParty_Type_Options", input.get("Type@CParty_Type_Options"));
		
		//45. Dynamic Wait
		uiDriver.dynamicWait();
		
		//46. Verfies that text $Parama1 is present in Accept Direct Mkt-Mufg 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg",input.get("AssertTextPresent@Accept_Direct_Mkt_Mufg"));
		
		//47. $Parama1 Accept Direct Mkt-Mufg_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("DpdownValCheck@Accept_Direct_Mkt_Mufg_Options#1"));
		
		//48. $Parama1 Accept Direct Mkt-Mufg_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("DpdownValCheck@Accept_Direct_Mkt_Mufg_Options#2"));
		
		//49. $Parama1 Accept Direct Mkt-Mufg_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("DpdownValCheck@Accept_Direct_Mkt_Mufg_Options#3"));
		
		//50. $Parama1 Accept Direct Mkt-Mufg_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("DpdownValCheck@Accept_Direct_Mkt_Mufg_Options#4"));
		
		//51. $Parama1 Accept Direct Mkt-Mufg_Options
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("DpdownValCheck@Accept_Direct_Mkt_Mufg_Options#5"));
		
		//52. Type Accept Direct Mkt-Mufg_Options $Parama1
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltAccept_Direct_Mkt_Mufg_Options", input.get("Type@Accept_Direct_Mkt_Mufg_Options"));
		
		//53. Dynamic Wait
		uiDriver.dynamicWait();
		
		//54. Verfies that text $Parama1 is present in PB 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltPB",input.get("AssertTextPresent@PB"));
		
		//55. Click PB_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnPB_Y",input.get("ClickWithSkip@PB_Y"));
		
		//56. Click PB_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnPB_N",input.get("ClickWithSkip@PB_N"));
		
		//57. Click PB_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnPB_NONE",input.get("ClickWithSkip@PB_NONE"));
		
		//58. Dynamic Wait
		uiDriver.dynamicWait();
		
		//59. Verfies that text $Parama1 is present in Disclosure Consent 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltDisclosure_Consent",input.get("AssertTextPresent@Disclosure_Consent"));
		
		//60. Click Disclosure Consent_No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnDisclosure_Consent_No",input.get("ClickWithSkip@Disclosure_Consent_No"));
		
		//61. Dynamic Wait
		uiDriver.dynamicWait();
		
		//62. Verfies that text $Parama1 is present in Last Consent Letter Sent 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltLast_Consent_Letter_Sent",input.get("AssertTextPresent@Last_Consent_Letter_Sent"));
		
		//63. Click Last Consent Letter Sent_A if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnLast_Consent_Letter_Sent_A",input.get("ClickWithSkip@Last_Consent_Letter_Sent_A"));
		
		//64. Click Last Consent Letter Sent_B if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnLast_Consent_Letter_Sent_B",input.get("ClickWithSkip@Last_Consent_Letter_Sent_B"));
		
		//65. Dynamic Wait
		uiDriver.dynamicWait();
		
		//66. Type $Parama1 Date in CMS Open Date  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.txtCMS_Open_Date", input.get("TypeDate@CMS_Open_Date"));
		
		//67. Dynamic Wait
		uiDriver.dynamicWait();
		
		//68. Type $data in Acms ID field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.txtAcms_ID", input.get("Type@Acms_ID"));
		
		//69. ConfigFileReadWrite TRANSFORMALTID6 $Parama1
		uiDriver.readWrite("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltTRANSFORMALTID6",input.get("ConfigFileReadWrite@TRANSFORMALTID6"));
		
		//70. TypeConcatenatedGlobalValue given in $Parama1 in Acms ID 
		uiDriver.typeConcatenatedGlobalValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.txtAcms_ID", input.get("TypeConcatenatedGlobalValue@Acms_ID"));
		
		//71. Dynamic Wait
		uiDriver.dynamicWait();
		
		//72. Verfies that text $Parama1 is present in CMS Parent 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.eltCMS_Parent",input.get("AssertTextPresent@CMS_Parent"));
		
		//73. Click CMS Parent_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCMS_Parent_N",input.get("ClickWithSkip@CMS_Parent_N"));
		
		//74. Click CMS Parent_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCMS_Parent_NONE",input.get("ClickWithSkip@CMS_Parent_NONE"));
		
		//75. Click CMS Parent_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCMS_Parent_Y",input.get("ClickWithSkip@CMS_Parent_Y"));
		
		//76. Click CMS HK_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCMS_HK_Y",input.get("ClickWithSkip@CMS_HK_Y"));
		
		//77. Click CMS GPH_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP2.btnCMS_GPH_Y",input.get("ClickWithSkip@CMS_GPH_Y"));
		
		//78. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_fill_retailCustomer_HK(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  RetailCustomer to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_retailCustomer_HK.txtRetailCustomer",input.get("setRunTimeGlobalValue@RetailCustomer"));
		
		//4. Click Title if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.txtTitle",input.get("ClickWithSkip@Title"));
		
		//5. Click Mr if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.txtMr",input.get("ClickWithSkip@Mr"));
		
		//6. Type $data in First Name field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtFirst_Name", input.get("Type@First_Name"));
		
		//7. Type $data in GB Name 1 field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtGB_Name_1", input.get("Type@GB_Name_1"));
		
		//8. Type $data in GB Short Name field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtGB_Short_Name", input.get("Type@GB_Short_Name"));
		
		//9. Click Gender_Male if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.btnGender_Male",input.get("ClickWithSkip@Gender_Male"));
		
		//10. Type $data in Sector field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtSector", input.get("Type@Sector"));
		
		//11. Send Key Action $Parama1 at Sector 
		uiDriver.sendKeyEvents("act_fill_retailCustomer_HK.txtSector", input.get("SendKeyAction@Sector"));
		
		//12. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//13. Type $data in H.O. IND CD field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtH_O_IND_CD", input.get("Type@H_O_IND_CD"));
		
		//14. Type $data in Target field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtTarget", input.get("Type@Target"));
		
		//15. Type $data in Customer Rating field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtCustomer_Rating", input.get("Type@Customer_Rating"));
		
		//16. Type $data in Account Officer field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtAccount_Officer", input.get("Type@Account_Officer"));
		
		//17. Type $data in Place Of Incorp field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtPlace_Of_Incorp", input.get("Type@Place_Of_Incorp"));
		
		//18. Type $Parama1 Date in Foundation Date  textbox
		uiDriver.TypeDate("act_fill_retailCustomer_HK.txtFoundation_Date", input.get("TypeDate@Foundation_Date"));
		
		//19. Type $data in Customer Status field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtCustomer_Status", input.get("Type@Customer_Status"));
		
		//20. Type $data in Place Of Business field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtPlace_Of_Business", input.get("Type@Place_Of_Business"));
		
		//21. Type $data in Address Country field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtAddress_Country", input.get("Type@Address_Country"));
		
		//22. Type $data in GB Street field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtGB_Street", input.get("Type@GB_Street"));
		
		//23. Type $data in Address Item1 field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtAddress_Item1", input.get("Type@Address_Item1"));
		
		//24. Type $data in GB Legal Address.1 field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtGB_Legal_Address_1", input.get("Type@GB_Legal_Address_1"));
		
		//25. Click GB Country
		uiDriver.click("act_fill_retailCustomer_HK.txtGB_Country");
		
		//26. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//27. Click HK if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.txtHK",input.get("ClickWithSkip@HK"));
		
		//28. Click Further Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.txtFurther_Details",input.get("ClickWithSkip@Further_Details"));
		
		//29. Type $Parama1 Date in Customer Since  textbox
		uiDriver.TypeDate("act_fill_retailCustomer_HK.txtCustomer_Since", input.get("TypeDate@Customer_Since"));
		
		//30. Click KYC if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_retailCustomer_HK.txtKYC",input.get("ClickWithSkip@KYC"));
		
		//31. Type $data in Manual Risk Class field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtManual_Risk_Class", input.get("Type@Manual_Risk_Class"));
		
		//32. Type $data in Override Reason field
		uiDriver.setValue("act_fill_retailCustomer_HK.txtOverride_Reason", input.get("Type@Override_Reason"));
		
	}
	
	public void act_SendKeyAction(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Send Key Action $Parama1 at CustomerId 
		uiDriver.sendKeyEvents("act_SendKeyAction.txtCustomerId", input.get("SendKeyAction@CustomerId"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void CorporateCustomerDetails_HK(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//3. Set RunTime Global Value from getting the text  Corporate Customer to $Parama1
		uiDriver.setRunTimeGlobalValue("CorporateCustomerDetails_HK.eltCorporate_Customer",input.get("setRunTimeGlobalValue@Corporate_Customer"));
		
		//4. Type $data in GB Name 1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtGB_Name_1", input.get("Type@GB_Name_1"));
		
		//5. Type $data in GN Short Name field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtGN_Short_Name", input.get("Type@GN_Short_Name"));
		
		//6. Enter global value for the key $Parama1 in Mnemonic 
		uiDriver.typeGlobalValue("CorporateCustomerDetails_HK.txtMnemonic", input.get("TypeGlobalValue@Mnemonic"));
		
		//7. Type $data in Sector field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtSector", input.get("Type@Sector"));
		
		//8. Click on H.O. IND CD WebElement
		uiDriver.click("CorporateCustomerDetails_HK.eltH_O_IND_CD");
		
		//9. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//10. Type $data in H.O. IND CD field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtH_O_IND_CD", input.get("Type@H_O_IND_CD"));
		
		//11. Type $data in Customer Rating field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCustomer_Rating", input.get("Type@Customer_Rating"));
		
		//12. Type $data in Target field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtTarget", input.get("Type@Target"));
		
		//13. Type $data in Account Officer field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtAccount_Officer", input.get("Type@Account_Officer"));
		
		//14. Type $data in Place Of Incorp field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPlace_Of_Incorp", input.get("Type@Place_Of_Incorp"));
		
		//15. Type $Parama1 Date in Foundation Date  textbox
		uiDriver.TypeDate("CorporateCustomerDetails_HK.txtFoundation_Date", input.get("TypeDate@Foundation_Date"));
		
		//16. Type $data in AC TYP field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtAC_TYP", input.get("Type@AC_TYP"));
		
		//17. Type $data in Customer Status field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCustomer_Status", input.get("Type@Customer_Status"));
		
		//18. Type $data in Place Of Business field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPlace_Of_Business", input.get("Type@Place_Of_Business"));
		
		//19. Type $data in Address Country field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtAddress_Country", input.get("Type@Address_Country"));
		
		//20. Type $data in GB Street field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtGB_Street", input.get("Type@GB_Street"));
		
		//21. Type $data in Address Item1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtAddress_Item1", input.get("Type@Address_Item1"));
		
		//22. Type $data in GB Legal Address.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtGB_Legal_Address_1", input.get("Type@GB_Legal_Address_1"));
		
		//23. Type $data in Po Box Number field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPo_Box_Number", input.get("Type@Po_Box_Number"));
		
		//24. Click GB Country
		uiDriver.click("CorporateCustomerDetails_HK.txtGB_Country");
		
		//25. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//26. Click HK if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnHK",input.get("ClickWithSkip@HK"));
		
		//27. Click ES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnES",input.get("ClickWithSkip@ES"));
		
		//28. Click KR if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnKR",input.get("ClickWithSkip@KR"));
		
		//29. Click TH if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnTH",input.get("ClickWithSkip@TH"));
		
		//30. Click ID if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnID",input.get("ClickWithSkip@ID"));
		
		//31. Click Further Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltFurther_Details",input.get("ClickWithSkip@Further_Details#1"));
		
		//32. Type $Parama1 Date in Customer Since  textbox
		uiDriver.TypeDate("CorporateCustomerDetails_HK.txtCustomer_Since", input.get("TypeDate@Customer_Since"));
		
		//33. Click KYC if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltKYC",input.get("ClickWithSkip@KYC"));
		
		//34. Click KYC_Null if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltKYC_Null",input.get("ClickWithSkip@KYC_Null"));
		
		//35. Click KYC_Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltKYC_Yes",input.get("ClickWithSkip@KYC_Yes"));
		
		//36. Type $data in Manual Risk Class field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtManual_Risk_Class", input.get("Type@Manual_Risk_Class"));
		
		//37. Type $data in Override Reason field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtOverride_Reason", input.get("Type@Override_Reason"));
		
		//38. Click Relation if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltRelation",input.get("ClickWithSkip@Relation"));
		
		//39. Type $data in Relation Code.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRelation_Code_1", input.get("Type@Relation_Code_1"));
		
		//40. Enter global value for the key $Parama1 in Relation customer.1 
		uiDriver.typeGlobalValue("CorporateCustomerDetails_HK.txtRelation_customer_1", input.get("TypeGlobalValue@Relation_customer_1"));
		
		//41. Type $data in More Role Info.1.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtMore_Role_Info_1_1", input.get("Type@More_Role_Info_1_1"));
		
		//42. Type $data in Role Notes.1.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRole_Notes_1_1", input.get("Type@Role_Notes_1_1"));
		
		//43. Type $data in Role.1.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRole_1_1", input.get("Type@Role_1_1"));
		
		//44. Click MULTI VALUE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE",input.get("ClickWithSkip@MULTI_VALUE"));
		
		//45. Type $data in Relation Code.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRelation_Code_2", input.get("Type@Relation_Code_2"));
		
		//46. Enter global value for the key $Parama1 in Relation customer.2 
		uiDriver.typeGlobalValue("CorporateCustomerDetails_HK.txtRelation_customer_2", input.get("TypeGlobalValue@Relation_customer_2"));
		
		//47. Type $data in More Role Info.2.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtMore_Role_Info_2_1", input.get("Type@More_Role_Info_2_1"));
		
		//48. Type $data in Role Notes.2.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRole_Notes_2_1", input.get("Type@Role_Notes_2_1"));
		
		//49. Type $data in Role.2.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtRole_2_1", input.get("Type@Role_2_1"));
		
		//50. Type $data in Other Fin Relation.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtOther_Fin_Relation_1", input.get("Type@Other_Fin_Relation_1"));
		
		//51. Type $data in Other Fin Institution.1	 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtOther_Fin_Institution_1_", input.get("Type@Other_Fin_Institution_1_"));
		
		//52. Click Further Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltFurther_Details",input.get("ClickWithSkip@Further_Details#2"));
		
		//53. Type $data in Previous Name.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPrevious_Name_1", input.get("Type@Previous_Name_1"));
		
		//54. Type $Parama1 Date in 	Change Date.1	  textbox
		uiDriver.TypeDate("CorporateCustomerDetails_HK.txt_Change_Date_1_", input.get("TypeDate@_Change_Date_1_"));
		
		//55. Type $data in Change Reason.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtChange_Reason_1", input.get("Type@Change_Reason_1"));
		
		//56. Click MULTI VALUE 1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_1",input.get("ClickWithSkip@MULTI_VALUE_1"));
		
		//57. Type $data in Previous Name.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPrevious_Name_2", input.get("Type@Previous_Name_2"));
		
		//58. Type $Parama1 Date in 	Change Date.2	  textbox
		uiDriver.TypeDate("CorporateCustomerDetails_HK.txt_Change_Date_2_", input.get("TypeDate@_Change_Date_2_"));
		
		//59. Type $data in Change Reason.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtChange_Reason_2", input.get("Type@Change_Reason_2"));
		
		//60. Type $data in Domicile field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtDomicile", input.get("Type@Domicile"));
		
		//61. Type $data in Other Place Of Incorp.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtOther_Place_Of_Incorp_1", input.get("Type@Other_Place_Of_Incorp_1"));
		
		//62. Click MULTI VALUE 2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_2",input.get("ClickWithSkip@MULTI_VALUE_2"));
		
		//63. Type $data in Other Place Of Incorp.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtOther_Place_Of_Incorp_2", input.get("Type@Other_Place_Of_Incorp_2"));
		
		//64. Type $data in Any_further_details field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtAny_further_details", input.get("Type@Any_further_details"));
		
		//65. Click Communication Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltCommunication_Details",input.get("ClickWithSkip@Communication_Details"));
		
		//66. Click MULTI VALUE 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_3",input.get("ClickWithSkip@MULTI_VALUE_3#1"));
		
		//67. Click MULTI VALUE 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_3",input.get("ClickWithSkip@MULTI_VALUE_3#2"));
		
		//68. Click MULTI VALUE 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_3",input.get("ClickWithSkip@MULTI_VALUE_3#3"));
		
		//69. Click MULTI VALUE 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_3",input.get("ClickWithSkip@MULTI_VALUE_3#4"));
		
		//70. Click MULTI VALUE 3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMULTI_VALUE_3",input.get("ClickWithSkip@MULTI_VALUE_3#5"));
		
		//71. Type $data in Communication Type.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_1", input.get("Type@Communication_Type_1"));
		
		//72. Type $data in Pref Channel.1 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_1", input.get("Type@Pref_Channel_1"));
		
		//73. Type $data in Communication Type.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_2", input.get("Type@Communication_Type_2"));
		
		//74. Type $data in Pref Channel.2 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_2", input.get("Type@Pref_Channel_2"));
		
		//75. Type $data in Communication Type.3 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_3", input.get("Type@Communication_Type_3"));
		
		//76. Type $data in Pref Channel.3 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_3", input.get("Type@Pref_Channel_3"));
		
		//77. Type $data in Communication Type.4 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_4", input.get("Type@Communication_Type_4"));
		
		//78. Type $data in Pref Channel.4 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_4", input.get("Type@Pref_Channel_4"));
		
		//79. Type $data in Communication Type.5 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_5", input.get("Type@Communication_Type_5"));
		
		//80. Type $data in Pref Channel.5 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_5", input.get("Type@Pref_Channel_5"));
		
		//81. Type $data in Communication Type.6 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtCommunication_Type_6", input.get("Type@Communication_Type_6"));
		
		//82. Type $data in Pref Channel.6 field
		uiDriver.setValue("CorporateCustomerDetails_HK.txtPref_Channel_6", input.get("Type@Pref_Channel_6"));
		
		//83. Click Confidential Y/N?_YES if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnConfidential_Y_N_YES",input.get("ClickWithSkip@Confidential_Y_N_YES"));
		
		//84. Click Other Details if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.eltOther_Details",input.get("ClickWithSkip@Other_Details"));
		
		//85. Enter global value for the key $Parama1 in Merged To 
		uiDriver.typeGlobalValue("CorporateCustomerDetails_HK.txtMerged_To", input.get("TypeGlobalValue@Merged_To"));
		
		//86. Click Merged Status_Merged if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("CorporateCustomerDetails_HK.btnMerged_Status_Merged",input.get("ClickWithSkip@Merged_Status_Merged"));
		
	}
	
	public void act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Check  Trust/ Client is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltTrust_Client",input.get("AssertElementPresent@Trust_Client"));
		
		//4. Click [None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btn_None_",input.get("ClickWithSkip@_None_"));
		
		//5. Click Trust A/c if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnTrust_A_c",input.get("ClickWithSkip@Trust_A_c"));
		
		//6. Click Bare Trust A/c if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBare_Trust_A_c",input.get("ClickWithSkip@Bare_Trust_A_c"));
		
		//7. Click Client A/c if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnClient_A_c",input.get("ClickWithSkip@Client_A_c"));
		
		//8. Check  Local Resident is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltLocal_Resident",input.get("AssertElementPresent@Local_Resident"));
		
		//9. Click No if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnNo",input.get("ClickWithSkip@No"));
		
		//10. Click Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnYes",input.get("ClickWithSkip@Yes"));
		
		//11. Check  Qtr Cpa is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltQtr_Cpa",input.get("AssertElementPresent@Qtr_Cpa"));
		
		//12. Click Q[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnQ_None_",input.get("ClickWithSkip@Q_None_"));
		
		//13. Click QN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnQN",input.get("ClickWithSkip@QN"));
		
		//14. Click QY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnQY",input.get("ClickWithSkip@QY"));
		
		//15. Check  Guar is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltGuar",input.get("AssertElementPresent@Guar"));
		
		//16. Click G[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnG_None_",input.get("ClickWithSkip@G_None_"));
		
		//17. Click Pure Guarantor if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnPure_Guarantor",input.get("ClickWithSkip@Pure_Guarantor"));
		
		//18. Click Guarantor With Credit Facility if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnGuarantor_With_Credit_Facility",input.get("ClickWithSkip@Guarantor_With_Credit_Facility"));
		
		//19. Click Guarantor Without Credit Facility if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnGuarantor_Without_Credit_Facility",input.get("ClickWithSkip@Guarantor_Without_Credit_Facility"));
		
		//20. Check  Borrower Grade is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltBorrower_Grade",input.get("AssertElementPresent@Borrower_Grade"));
		
		//21. $Parama1 Borrower Grade
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("DpdownValCheck@Borrower_Grade#1"));
		
		//22. $Parama1 Borrower Grade
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("DpdownValCheck@Borrower_Grade#2"));
		
		//23. $Parama1 Borrower Grade
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("DpdownValCheck@Borrower_Grade#3"));
		
		//24. $Parama1 Borrower Grade
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("DpdownValCheck@Borrower_Grade#4"));
		
		//25. $Parama1 Borrower Grade
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("DpdownValCheck@Borrower_Grade#5"));
		
		//26. Select $data from the Borrower Grade list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstBorrower_Grade", input.get("Select@Borrower_Grade"));
		
		//27. Check  Related A/C is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltRelated_A_C",input.get("AssertElementPresent@Related_A_C"));
		
		//28. Type $data in Related A/C field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.txtRelated_A_C", input.get("Type@Related_A_C"));
		
		//29. Check  Lead is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltLead",input.get("AssertElementPresent@Lead"));
		
		//30. Click L[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnL_None_",input.get("ClickWithSkip@L_None_"));
		
		//31. Click LN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnLN",input.get("ClickWithSkip@LN"));
		
		//32. Click LY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnLY",input.get("ClickWithSkip@LY"));
		
		//33. Check  Bal-Imp is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltBal_Imp",input.get("AssertElementPresent@Bal_Imp"));
		
		//34. Click Bi[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBi_None_",input.get("ClickWithSkip@Bi_None_"));
		
		//35. Click BiN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBiN",input.get("ClickWithSkip@BiN"));
		
		//36. Click BiY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBiY",input.get("ClickWithSkip@BiY"));
		
		//37. Check  Bal-Exp is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltBal_Exp",input.get("AssertElementPresent@Bal_Exp"));
		
		//38. Click Be[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBe_None_",input.get("ClickWithSkip@Be_None_"));
		
		//39. Click BeN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBeN",input.get("ClickWithSkip@BeN"));
		
		//40. Click BeY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBeY",input.get("ClickWithSkip@BeY"));
		
		//41. Check  Bal-Loans is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltBal_Loans",input.get("AssertElementPresent@Bal_Loans"));
		
		//42. Click Bl[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBl_None_",input.get("ClickWithSkip@Bl_None_"));
		
		//43. Click BlN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBlN",input.get("ClickWithSkip@BlN"));
		
		//44. Click BlY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnBlY",input.get("ClickWithSkip@BlY"));
		
		//45. Check  Complex is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltComplex",input.get("AssertElementPresent@Complex"));
		
		//46. Click C[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnC_None_",input.get("ClickWithSkip@C_None_"));
		
		//47. Click CN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnCN",input.get("ClickWithSkip@CN"));
		
		//48. Click CY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnCY",input.get("ClickWithSkip@CY"));
		
		//49. Check  Audit is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltAudit",input.get("AssertElementPresent@Audit"));
		
		//50. Click A[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnA_None_",input.get("ClickWithSkip@A_None_"));
		
		//51. Click AN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnAN",input.get("ClickWithSkip@AN"));
		
		//52. Click AY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.btnAY",input.get("ClickWithSkip@AY"));
		
		//53. Check  Audit Mth is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltAudit_Mth",input.get("AssertElementPresent@Audit_Mth"));
		
		//54. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#4"));
		
		//55. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#5"));
		
		//56. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#6"));
		
		//57. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#7"));
		
		//58. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#8"));
		
		//59. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#9"));
		
		//60. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#10"));
		
		//61. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#11"));
		
		//62. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#12"));
		
		//63. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#1"));
		
		//64. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#2"));
		
		//65. $Parama1 Audit Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("DpdownValCheck@Audit_Mth#3"));
		
		//66. Select $data from the Audit Mth list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstAudit_Mth", input.get("Select@Audit_Mth"));
		
		//67. Check  ID Conf is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltID_Conf",input.get("AssertElementPresent@ID_Conf"));
		
		//68. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#1"));
		
		//69. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#2"));
		
		//70. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#3"));
		
		//71. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#4"));
		
		//72. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#5"));
		
		//73. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#6"));
		
		//74. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#7"));
		
		//75. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#8"));
		
		//76. $Parama1 ID Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("DpdownValCheck@ID_Conf#9"));
		
		//77. Select $data from the ID Conf list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf", input.get("Select@ID_Conf"));
		
		//78. Check  ID Conf Reason is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.eltID_Conf_Reason",input.get("AssertElementPresent@ID_Conf_Reason"));
		
		//79. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#1"));
		
		//80. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#2"));
		
		//81. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#3"));
		
		//82. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#4"));
		
		//83. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#5"));
		
		//84. $Parama1 ID Conf Reason
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("DpdownValCheck@ID_Conf_Reason#6"));
		
		//85. Select $data from the ID Conf Reason list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP1.lstID_Conf_Reason", input.get("Select@ID_Conf_Reason"));
		
	}
	
	public void act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click Japanese/Non-Japanese_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtJapanese_Non_Japanese_1",input.get("ClickWithSkip@Japanese_Non_Japanese_1"));
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. Type $data in Competent Division field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtCompetent_Division", input.get("Type@Competent_Division"));
		
		//6. Dynamic Wait
		uiDriver.dynamicWait();
		
		//7. Check  Fiscal Yr End Mth is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltFiscal_Yr_End_Mth",input.get("AssertElementPresent@Fiscal_Yr_End_Mth"));
		
		//8. $Parama1 Fiscal Yr End Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFiscal_Yr_End_Mth", input.get("DpdownValCheck@Fiscal_Yr_End_Mth#1"));
		
		//9. $Parama1 Fiscal Yr End Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFiscal_Yr_End_Mth", input.get("DpdownValCheck@Fiscal_Yr_End_Mth#2"));
		
		//10. $Parama1 Fiscal Yr End Mth
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFiscal_Yr_End_Mth", input.get("DpdownValCheck@Fiscal_Yr_End_Mth#3"));
		
		//11. Type $data in Fiscal Yr End Mth field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtFiscal_Yr_End_Mth", input.get("Type@Fiscal_Yr_End_Mth"));
		
		//12. Dynamic Wait
		uiDriver.dynamicWait();
		
		//13. Verfies that text $Parama1 is present in Spe 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltSpe",input.get("AssertTextPresent@Spe"));
		
		//14. Click Spe_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnSpe_N",input.get("ClickWithSkip@Spe_N"));
		
		//15. Click Spe_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnSpe_Y",input.get("ClickWithSkip@Spe_Y"));
		
		//16. Click Spe_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnSpe_None",input.get("ClickWithSkip@Spe_None"));
		
		//17. Dynamic Wait
		uiDriver.dynamicWait();
		
		//18. Verfies that text $Parama1 is present in Internal Flag 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltInternal_Flag",input.get("AssertTextPresent@Internal_Flag"));
		
		//19. Click Internal Flag_0 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnInternal_Flag_0",input.get("ClickWithSkip@Internal_Flag_0"));
		
		//20. Click Internal Flag_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnInternal_Flag_1",input.get("ClickWithSkip@Internal_Flag_1"));
		
		//21. Click Internal Flag_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnInternal_Flag_NONE",input.get("ClickWithSkip@Internal_Flag_NONE"));
		
		//22. Dynamic Wait
		uiDriver.dynamicWait();
		
		//23. Verfies that text $Parama1 is present in Soverign/Private 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltSoverign_Private",input.get("AssertTextPresent@Soverign_Private"));
		
		//24. Click Soverign/Private_P if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnSoverign_Private_P",input.get("ClickWithSkip@Soverign_Private_P"));
		
		//25. Click Soverign/Private_S if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnSoverign_Private_S",input.get("ClickWithSkip@Soverign_Private_S"));
		
		//26. Dynamic Wait
		uiDriver.dynamicWait();
		
		//27. Verfies that text $Parama1 is present in BTM Classification 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltBTM_Classification",input.get("AssertTextPresent@BTM_Classification"));
		
		//28. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#1"));
		
		//29. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#2"));
		
		//30. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#3"));
		
		//31. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#4"));
		
		//32. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#5"));
		
		//33. $Parama1 BTM Classification
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstBTM_Classification", input.get("DpdownValCheck@BTM_Classification#6"));
		
		//34. Type $data in BTM Classification field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtBTM_Classification", input.get("Type@BTM_Classification"));
		
		//35. Dynamic Wait
		uiDriver.dynamicWait();
		
		//36. Verfies that text $Parama1 is present in Parent Country 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltParent_Country",input.get("AssertTextPresent@Parent_Country"));
		
		//37. Type $data in Parent Country field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtParent_Country", input.get("Type@Parent_Country"));
		
		//38. Dynamic Wait
		uiDriver.dynamicWait();
		
		//39. Verfies that text $Parama1 is present in Eff Dt of FX Web Confirm 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltEff_Dt_of_FX_Web_Confirm",input.get("AssertTextPresent@Eff_Dt_of_FX_Web_Confirm"));
		
		//40. Type $Parama1 Date in Eff Dt of FX Web Confirm  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtEff_Dt_of_FX_Web_Confirm", input.get("TypeDate@Eff_Dt_of_FX_Web_Confirm"));
		
		//41. Dynamic Wait
		uiDriver.dynamicWait();
		
		//42. Verfies that text $Parama1 is present in H.O Country 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltH_O_Country",input.get("AssertTextPresent@H_O_Country"));
		
		//43. Type $data in H.O Country field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtH_O_Country", input.get("Type@H_O_Country"));
		
		//44. Dynamic Wait
		uiDriver.dynamicWait();
		
		//45. Verfies that text $Parama1 is present in Parent Company Name 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltParent_Company_Name",input.get("AssertTextPresent@Parent_Company_Name"));
		
		//46. Type $data in Parent Company Name field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtParent_Company_Name", input.get("Type@Parent_Company_Name"));
		
		//47. Dynamic Wait
		uiDriver.dynamicWait();
		
		//48. Verfies that text $Parama1 is present in Company Size 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltCompany_Size",input.get("AssertTextPresent@Company_Size"));
		
		//49. Click Company Size_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnCompany_Size_None",input.get("ClickWithSkip@Company_Size_None"));
		
		//50. Click Company Size_1 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnCompany_Size_1",input.get("ClickWithSkip@Company_Size_1"));
		
		//51. Click Company Size_2 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnCompany_Size_2",input.get("ClickWithSkip@Company_Size_2"));
		
		//52. Click Company Size_3 if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnCompany_Size_3",input.get("ClickWithSkip@Company_Size_3"));
		
		//53. Dynamic Wait
		uiDriver.dynamicWait();
		
		//54. Verfies that text $Parama1 is present in Listed/Unlisted 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltListed_Unlisted",input.get("AssertTextPresent@Listed_Unlisted"));
		
		//55. Click Listed/Unlisted_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnListed_Unlisted_None",input.get("ClickWithSkip@Listed_Unlisted_None"));
		
		//56. Click Listed/Unlisted_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnListed_Unlisted_N",input.get("ClickWithSkip@Listed_Unlisted_N"));
		
		//57. Click Listed/Unlisted_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnListed_Unlisted_Y",input.get("ClickWithSkip@Listed_Unlisted_Y"));
		
		//58. Dynamic Wait
		uiDriver.dynamicWait();
		
		//59. Verfies that text $Parama1 is present in Zip Flag 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltZip_Flag",input.get("AssertTextPresent@Zip_Flag"));
		
		//60. Click Zip Flag_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnZip_Flag_N",input.get("ClickWithSkip@Zip_Flag_N"));
		
		//61. Click Zip Flag_Y if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnZip_Flag_Y",input.get("ClickWithSkip@Zip_Flag_Y"));
		
		//62. Click Zip Flag_NONE if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnZip_Flag_NONE",input.get("ClickWithSkip@Zip_Flag_NONE"));
		
		//63. Dynamic Wait
		uiDriver.dynamicWait();
		
		//64. Verfies that text $Parama1 is present in Mufg Status 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltMufg_Status",input.get("AssertTextPresent@Mufg_Status"));
		
		//65. $Parama1 Mufg Status
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstMufg_Status", input.get("DpdownValCheck@Mufg_Status#1"));
		
		//66. $Parama1 Mufg Status
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstMufg_Status", input.get("DpdownValCheck@Mufg_Status#2"));
		
		//67. $Parama1 Mufg Status
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstMufg_Status", input.get("DpdownValCheck@Mufg_Status#3"));
		
		//68. $Parama1 Mufg Status
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstMufg_Status", input.get("DpdownValCheck@Mufg_Status#4"));
		
		//69. Verfies that text $Parama1 is present in Rating Approval Date 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltRating_Approval_Date",input.get("AssertTextPresent@Rating_Approval_Date"));
		
		//70. Type $Parama1 Date in Rating Approval Date  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtRating_Approval_Date", input.get("TypeDate@Rating_Approval_Date"));
		
		//71. Verfies that text $Parama1 is present in Rating Expiry Date 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltRating_Expiry_Date",input.get("AssertTextPresent@Rating_Expiry_Date"));
		
		//72. Type $Parama1 Date in Rating Expiry Date_T  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtRating_Expiry_Date_T", input.get("TypeDate@Rating_Expiry_Date_T"));
		
		//73. Dynamic Wait
		uiDriver.dynamicWait();
		
		//74. Verfies that text $Parama1 is present in Rating Outlook 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltRating_Outlook",input.get("AssertTextPresent@Rating_Outlook"));
		
		//75. Click Rating Outlook_None if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnRating_Outlook_None",input.get("ClickWithSkip@Rating_Outlook_None"));
		
		//76. Click Rating Outlook_N if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnRating_Outlook_N",input.get("ClickWithSkip@Rating_Outlook_N"));
		
		//77. Click Rating Outlook_P if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnRating_Outlook_P",input.get("ClickWithSkip@Rating_Outlook_P"));
		
		//78. Click Rating Outlook_S if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnRating_Outlook_S",input.get("ClickWithSkip@Rating_Outlook_S"));
		
		//79. Dynamic Wait
		uiDriver.dynamicWait();
		
		//80. Verfies that text $Parama1 is present in Discretion 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltDiscretion",input.get("AssertTextPresent@Discretion"));
		
		//81. $Parama1 Discretion
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstDiscretion", input.get("DpdownValCheck@Discretion#1"));
		
		//82. $Parama1 Discretion
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstDiscretion", input.get("DpdownValCheck@Discretion#2"));
		
		//83. $Parama1 Discretion
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstDiscretion", input.get("DpdownValCheck@Discretion#3"));
		
		//84. $Parama1 Discretion
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstDiscretion", input.get("DpdownValCheck@Discretion#4"));
		
		//85. $Parama1 Discretion
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstDiscretion", input.get("DpdownValCheck@Discretion#5"));
		
		//86. Dynamic Wait
		uiDriver.dynamicWait();
		
		//87. Verfies that text $Parama1 is present in Frequency Advice 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltFrequency_Advice",input.get("AssertTextPresent@Frequency_Advice"));
		
		//88. $Parama1 Frequency Advice
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFrequency_Advice", input.get("DpdownValCheck@Frequency_Advice#1"));
		
		//89. $Parama1 Frequency Advice
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFrequency_Advice", input.get("DpdownValCheck@Frequency_Advice#2"));
		
		//90. $Parama1 Frequency Advice
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFrequency_Advice", input.get("DpdownValCheck@Frequency_Advice#3"));
		
		//91. $Parama1 Frequency Advice
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.lstFrequency_Advice", input.get("DpdownValCheck@Frequency_Advice#4"));
		
		//92. Dynamic Wait
		uiDriver.dynamicWait();
		
		//93. Verfies that text $Parama1 is present in Advice Password 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltAdvice_Password",input.get("AssertTextPresent@Advice_Password"));
		
		//94. Type $data in Advice Password field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.txtAdvice_Password", input.get("Type@Advice_Password"));
		
		//95. Dynamic Wait
		uiDriver.dynamicWait();
		
		//96. Click Audit if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.btnAudit",input.get("ClickWithSkip@Audit"));
		
		//97. Verfies that text $Parama1 is present in Inputter  
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltInputter_",input.get("AssertTextPresent@Inputter_"));
		
		//98. Verfies that text $Parama1 is present in Authoriser 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltAuthoriser",input.get("AssertTextPresent@Authoriser"));
		
		//99. Verfies that text $Parama1 is present in Record Status 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltRecord_Status",input.get("AssertTextPresent@Record_Status"));
		
		//100. Verfies that text $Parama1 is present in Department Code 
		uiDriver.checkText("act_verify_EB_MUFG_CUSTOMER_DETS_MUFGHK_AMEND.eltDepartment_Code",input.get("AssertTextPresent@Department_Code"));
		
	}
	
	public void act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Check  Derv Knowledge is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltDerv_Knowledge",input.get("AssertElementPresent@Derv_Knowledge"));
		
		//4. Click DK[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnDK_None_",input.get("ClickWithSkip@DK_None_"));
		
		//5. Click DkN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnDkN",input.get("ClickWithSkip@DkN"));
		
		//6. Click DkY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnDkY",input.get("ClickWithSkip@DkY"));
		
		//7. Check  Education is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltEducation",input.get("AssertElementPresent@Education"));
		
		//8. $Parama1 Education
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("DpdownValCheck@Education#1"));
		
		//9. $Parama1 Education
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("DpdownValCheck@Education#2"));
		
		//10. $Parama1 Education
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("DpdownValCheck@Education#3"));
		
		//11. $Parama1 Education
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("DpdownValCheck@Education#4"));
		
		//12. $Parama1 Education
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("DpdownValCheck@Education#5"));
		
		//13. Select $data from the Education list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstEducation", input.get("Select@Education"));
		
		//14. Check  Vc Safeguard is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltVc_Safeguard",input.get("AssertElementPresent@Vc_Safeguard"));
		
		//15. $Parama1 Vc Safeguard
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstVc_Safeguard", input.get("DpdownValCheck@Vc_Safeguard#1"));
		
		//16. $Parama1 Vc Safeguard
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstVc_Safeguard", input.get("DpdownValCheck@Vc_Safeguard#2"));
		
		//17. $Parama1 Vc Safeguard
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstVc_Safeguard", input.get("DpdownValCheck@Vc_Safeguard#3"));
		
		//18. $Parama1 Vc Safeguard
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstVc_Safeguard", input.get("DpdownValCheck@Vc_Safeguard#4"));
		
		//19. Select $data from the Vc Safeguard list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstVc_Safeguard", input.get("Select@Vc_Safeguard"));
		
		//20. Check  Suitability Assess Rt is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltSuitability_Assess_Rt",input.get("AssertElementPresent@Suitability_Assess_Rt"));
		
		//21. $Parama1 Suitability Assess Rt
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("DpdownValCheck@Suitability_Assess_Rt#1"));
		
		//22. $Parama1 Suitability Assess Rt
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("DpdownValCheck@Suitability_Assess_Rt#2"));
		
		//23. $Parama1 Suitability Assess Rt
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("DpdownValCheck@Suitability_Assess_Rt#3"));
		
		//24. $Parama1 Suitability Assess Rt
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("DpdownValCheck@Suitability_Assess_Rt#4"));
		
		//25. $Parama1 Suitability Assess Rt
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("DpdownValCheck@Suitability_Assess_Rt#5"));
		
		//26. Select $data from the Suitability Assess Rt list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstSuitability_Assess_Rt", input.get("Select@Suitability_Assess_Rt"));
		
		//27. Check  Lst Fiscal Stmt is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltLst_Fiscal_Stmt",input.get("AssertElementPresent@Lst_Fiscal_Stmt"));
		
		//28. Check  Gcms+Id is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltGcms_Id",input.get("AssertElementPresent@Gcms_Id"));
		
		//29. Type $data in Gcms+Id field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtGcms_Id", input.get("Type@Gcms_Id"));
		
		//30. Check  CMS HK is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMS_HK",input.get("AssertElementPresent@CMS_HK"));
		
		//31. Click ChkN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnChkN",input.get("ClickWithSkip@ChkN"));
		
		//32. Click ChkY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnChkY",input.get("ClickWithSkip@ChkY"));
		
		//33. Check  CMS GPH is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMS_GPH",input.get("AssertElementPresent@CMS_GPH"));
		
		//34. Click CGP[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCGP_None_",input.get("ClickWithSkip@CGP_None_"));
		
		//35. Click CgpN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCgpN",input.get("ClickWithSkip@CgpN"));
		
		//36. Click CgpY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCgpY",input.get("ClickWithSkip@CgpY"));
		
		//37. Check  ISDA Agreement Signed Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltISDA_Agreement_Signed_Date",input.get("AssertElementPresent@ISDA_Agreement_Signed_Date"));
		
		//38. Type $Parama1 Date in ISDA Agreement Signed Date  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtISDA_Agreement_Signed_Date", input.get("TypeDate@ISDA_Agreement_Signed_Date"));
		
		//39. Check  FX Agreement Signed Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltFX_Agreement_Signed_Date",input.get("AssertElementPresent@FX_Agreement_Signed_Date"));
		
		//40. Type $Parama1 Date in FX Agreement Signed Date  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtFX_Agreement_Signed_Date", input.get("TypeDate@FX_Agreement_Signed_Date"));
		
		//41. Check  Facility Reference Number is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltFacility_Reference_Number",input.get("AssertElementPresent@Facility_Reference_Number"));
		
		//42. Type $data in Facility Reference Number field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtFacility_Reference_Number", input.get("Type@Facility_Reference_Number"));
		
		//43. Check  Credit/Non-Credit is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCredit_Non_Credit",input.get("AssertElementPresent@Credit_Non_Credit"));
		
		//44. Click CNC[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCNC_None_",input.get("ClickWithSkip@CNC_None_"));
		
		//45. Click CncY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCncY",input.get("ClickWithSkip@CncY"));
		
		//46. Click CncN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCncN",input.get("ClickWithSkip@CncN"));
		
		//47. Check  Cash Pooling Flag is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCash_Pooling_Flag",input.get("AssertElementPresent@Cash_Pooling_Flag"));
		
		//48. Click CPF[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCPF_None_",input.get("ClickWithSkip@CPF_None_"));
		
		//49. Click CpfN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCpfN",input.get("ClickWithSkip@CpfN"));
		
		//50. Click CpfY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCpfY",input.get("ClickWithSkip@CpfY"));
		
		//51. Check  Cmp Gp is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCmp_Gp",input.get("AssertElementPresent@Cmp_Gp"));
		
		//52. Type $data in Cmp Gp field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtCmp_Gp", input.get("Type@Cmp_Gp"));
		
		//53. Check  Overdue Claim Date is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltOverdue_Claim_Date",input.get("AssertElementPresent@Overdue_Claim_Date"));
		
		//54. Type $Parama1 Date in Overdue Claim Date  textbox
		uiDriver.TypeDate("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtOverdue_Claim_Date", input.get("TypeDate@Overdue_Claim_Date"));
		
		//55. Check  Cross Default Clause is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCross_Default_Clause",input.get("AssertElementPresent@Cross_Default_Clause"));
		
		//56. Click CDC[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCDC_None_",input.get("ClickWithSkip@CDC_None_"));
		
		//57. Click CdcN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCdcN",input.get("ClickWithSkip@CdcN"));
		
		//58. Click CdcY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCdcY",input.get("ClickWithSkip@CdcY"));
		
		//59. Check  DPS Cust Type is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltDPS_Cust_Type",input.get("AssertElementPresent@DPS_Cust_Type"));
		
		//60. Type $data in DPS Cust Type field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtDPS_Cust_Type", input.get("Type@DPS_Cust_Type"));
		
		//61. Check  Designated Merchant is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltDesignated_Merchant",input.get("AssertElementPresent@Designated_Merchant"));
		
		//62. Type $data in Designated Merchant field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtDesignated_Merchant", input.get("Type@Designated_Merchant"));
		
		//63. Check  BTMU Connected is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltBTMU_Connected",input.get("AssertElementPresent@BTMU_Connected"));
		
		//64. Type $data in BTMU Connected field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtBTMU_Connected", input.get("Type@BTMU_Connected"));
		
		//65. Check  MABS23 Cust Type is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltMABS23_Cust_Type",input.get("AssertElementPresent@MABS23_Cust_Type"));
		
		//66. Type $data in MABS23 Cust Type field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtMABS23_Cust_Type", input.get("Type@MABS23_Cust_Type"));
		
		//67. Check  Delivery Mode is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltDelivery_Mode",input.get("AssertElementPresent@Delivery_Mode"));
		
		//68. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#1"));
		
		//69. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#2"));
		
		//70. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#3"));
		
		//71. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#4"));
		
		//72. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#5"));
		
		//73. $Parama1 Delivery Mode
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstDelivery_Mode", input.get("DpdownValCheck@Delivery_Mode#6"));
		
		//74. Type $data in Delivery Mode field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtDelivery_Mode", input.get("Type@Delivery_Mode"));
		
		//75. Check  Local Industry is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltLocal_Industry",input.get("AssertElementPresent@Local_Industry"));
		
		//76. Type $data in Local Industry field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtLocal_Industry", input.get("Type@Local_Industry"));
		
		//77. Check  Company Grp Name.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCompany_Grp_Name_1",input.get("AssertElementPresent@Company_Grp_Name_1"));
		
		//78. Type $data in Company Grp Name.1 field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtCompany_Grp_Name_1", input.get("Type@Company_Grp_Name_1"));
		
		//79. Check  CMSP Cus Name.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMSP_Cus_Name_1",input.get("AssertElementPresent@CMSP_Cus_Name_1"));
		
		//80. Type $data in CMSP Cus Name.1 field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtCMSP_Cus_Name_1", input.get("Type@CMSP_Cus_Name_1"));
		
		//81. Check  CMSP Entity Code.1 is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMSP_Entity_Code_1",input.get("AssertElementPresent@CMSP_Entity_Code_1"));
		
		//82. Type $data in CMSP Entity Code.1 field
		uiDriver.setValue("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.txtCMSP_Entity_Code_1", input.get("Type@CMSP_Entity_Code_1"));
		
		//83. Check  CMSP Mode of Conf is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMSP_Mode_of_Conf",input.get("AssertElementPresent@CMSP_Mode_of_Conf"));
		
		//84. $Parama1 CMSP Mode of Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstCMSP_Mode_of_Conf", input.get("DpdownValCheck@CMSP_Mode_of_Conf#1"));
		
		//85. $Parama1 CMSP Mode of Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstCMSP_Mode_of_Conf", input.get("DpdownValCheck@CMSP_Mode_of_Conf#2"));
		
		//86. $Parama1 CMSP Mode of Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstCMSP_Mode_of_Conf", input.get("DpdownValCheck@CMSP_Mode_of_Conf#3"));
		
		//87. $Parama1 CMSP Mode of Conf
		uiDriver.verifyDpDownList("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstCMSP_Mode_of_Conf", input.get("DpdownValCheck@CMSP_Mode_of_Conf#4"));
		
		//88. Select $data from the CMSP Mode of Conf list
		uiDriver.select("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.lstCMSP_Mode_of_Conf", input.get("Select@CMSP_Mode_of_Conf"));
		
		//89. Check  CMSP Cus Flag is present or not with $Parama1 seconds wait
		uiDriver.checkElementPresent("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.eltCMSP_Cus_Flag",input.get("AssertElementPresent@CMSP_Cus_Flag"));
		
		//90. Click CMSP_CF[None] if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCMSP_CF_None_",input.get("ClickWithSkip@CMSP_CF_None_"));
		
		//91. Click Cmsp_cfN if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCmsp_cfN",input.get("ClickWithSkip@Cmsp_cfN"));
		
		//92. Click Cmsp_cfY if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_verify_EB_MUFG_CUSTOMER_DETS_HK_MUFGHK_AMEND_COMP3.btnCmsp_cfY",input.get("ClickWithSkip@Cmsp_cfY"));
		
	}
	
	public void act_fill_RD_CENTRAL_BANK_DIR(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Type $data in Bic field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtBic", input.get("Type@Bic"));
		
		//3. Type $data in Address.1 field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtAddress_1", input.get("Type@Address_1"));
		
		//4. Type $data in Country.1 field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtCountry_1", input.get("Type@Country_1"));
		
		//5. Type $data in Status field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtStatus", input.get("Type@Status"));
		
		//6. Set RunTime Global Value from getting the text  Bic to $Parama1
		uiDriver.setRunTimeGlobalValue("act_fill_RD_CENTRAL_BANK_DIR.txtBic",input.get("setRunTimeGlobalValue@Bic"));
		
		//7. Type $data in Institution Name.1 field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtInstitution_Name_1", input.get("Type@Institution_Name_1"));
		
		//8. Type $data in City field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtCity", input.get("Type@City"));
		
		//9. Type $data in Bic8 field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtBic8", input.get("Type@Bic8"));
		
		//10. Type $data in Branch Code field
		uiDriver.setValue("act_fill_RD_CENTRAL_BANK_DIR.txtBranch_Code", input.get("Type@Branch_Code"));
		
	}
	
	public void act_fill_GB_Country_Field(DataRow input, DataRow output) {
		//1. Click Physical Address TAB if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_GB_Country_Field.eltPhysical_Address_TAB",input.get("ClickWithSkip@Physical_Address_TAB"));
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//3. Click GB_Country_SelectionScreen if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_GB_Country_Field.eltGB_Country_SelectionScreen",input.get("ClickWithSkip@GB_Country_SelectionScreen"));
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//5. Type $data in Country.Name field
		uiDriver.setValue("act_fill_GB_Country_Field.txtCountry_Name", input.get("Type@Country_Name"));
		
		//6. Click FIND if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_GB_Country_Field.eltFIND",input.get("ClickWithSkip@FIND"));
		
		//7. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//8. Click CountryCode if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_fill_GB_Country_Field.eltCountryCode",input.get("ClickWithSkip@CountryCode"));
		
	}
	

	/**
	*Overriding toString() method of object class to print Common
	*format string
	**/
	public String toString(){
		return "CommonDriver()";
	}
}
