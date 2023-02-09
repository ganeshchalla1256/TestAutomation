/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:16
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
public class ForexDealsDriver extends BaseWebModuleDriver {
	public ForexDealsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_CapNDFVanillaDeal(DataRow input, DataRow output) {
		//1. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//2. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//3. Type $data in Counterparty field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtCounterparty", input.get("Type@Counterparty"));
		
		//4. Enter global value for the key $Parama1 in Counterparty 
		uiDriver.typeGlobalValue("fill_CapNDFVanillaDeal.txtCounterparty", input.get("TypeGlobalValue@Counterparty"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. Type Dealer Desk $Parama1
		uiDriver.setValue("fill_CapNDFVanillaDeal.eltDealer_Desk", input.get("Type@Dealer_Desk"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Click Sell if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_CapNDFVanillaDeal.eltSell",input.get("ClickWithSkip@Sell"));
		
		//9. Click Buy if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_CapNDFVanillaDeal.eltBuy",input.get("ClickWithSkip@Buy"));
		
		//10. Type $data in Deal Currency field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtDeal_Currency", input.get("Type@Deal_Currency"));
		
		//11. Dynamic Wait
		uiDriver.dynamicWait();
		
		//12. Type Settlement CCY $Parama1
		uiDriver.setValue("fill_CapNDFVanillaDeal.eltSettlement_CCY", input.get("Type@Settlement_CCY"));
		
		//13. Dynamic Wait
		uiDriver.dynamicWait();
		
		//14. Set RunTime Global Value from getting the text  Deal Currency to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_CapNDFVanillaDeal.eltDeal_Currency",input.get("setRunTimeGlobalValue@Deal_Currency"));
		
		//15. Set RunTime Global Value from getting the text  Settlement CCY to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_CapNDFVanillaDeal.eltSettlement_CCY",input.get("setRunTimeGlobalValue@Settlement_CCY"));
		
		//16. Type Deal Amount $Parama1
		uiDriver.setValue("fill_CapNDFVanillaDeal.eltDeal_Amount", input.get("Type@Deal_Amount"));
		
		//17. Enter global value for the key $Parama1 in Settlement Ccy 
		uiDriver.typeGlobalValue("fill_CapNDFVanillaDeal.txtSettlement_Ccy", input.get("TypeGlobalValue@Settlement_Ccy"));
		
		//18. Dynamic Wait
		uiDriver.dynamicWait();
		
		//19. Set RunTime Global Value from getting the text  NDF Vanilla Trade to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_CapNDFVanillaDeal.eltNDF_Vanilla_Trade",input.get("setRunTimeGlobalValue@NDF_Vanilla_Trade"));
		
		//20. Dynamic Wait
		uiDriver.dynamicWait();
		
		//21. Set RunTime Global Value from getting the text  Fr Deal Number_ID to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_CapNDFVanillaDeal.txtFr_Deal_Number_ID",input.get("setRunTimeGlobalValue@Fr_Deal_Number_ID"));
		
		//22. Enter global value for the key $Parama1 in Fr Deal Number 
		uiDriver.typeGlobalValue("fill_CapNDFVanillaDeal.txtFr_Deal_Number", input.get("TypeGlobalValue@Fr_Deal_Number"));
		
		//23. Type $data in Fr CIF Type field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtFr_CIF_Type", input.get("Type@Fr_CIF_Type"));
		
		//24. Type $data in FXAT Memo field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtFXAT_Memo", input.get("Type@FXAT_Memo"));
		
		//25. Type $data in Base currency field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtBase_currency", input.get("Type@Base_currency"));
		
		//26. Type $data in Limit Reference field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtLimit_Reference", input.get("Type@Limit_Reference"));
		
		//27. Type $Parama1 Date in Fixed Date  textbox
		uiDriver.TypeDate("fill_CapNDFVanillaDeal.txtFixed_Date", input.get("TypeDate@Fixed_Date"));
		
		//28. Type $data in Agreement Type field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtAgreement_Type", input.get("Type@Agreement_Type"));
		
		//29. Dynamic Wait
		uiDriver.dynamicWait();
		
		//30. Type $Parama1 Date in Value Date  textbox
		uiDriver.TypeDate("fill_CapNDFVanillaDeal.txtValue_Date", input.get("TypeDate@Value_Date"));
		
		//31. Type Settlement Rate Source 1 $Parama1
		uiDriver.setValue("fill_CapNDFVanillaDeal.eltSettlement_Rate_Source_1", input.get("Type@Settlement_Rate_Source_1"));
		
		//32. Dynamic Wait
		uiDriver.dynamicWait();
		
		//33. Type $Parama1 Date in Deal Date  textbox
		uiDriver.TypeDate("fill_CapNDFVanillaDeal.txtDeal_Date", input.get("TypeDate@Deal_Date"));
		
		//34. Dynamic Wait
		uiDriver.dynamicWait();
		
		//35. Click Settlement Instructions if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_CapNDFVanillaDeal.eltSettlement_Instructions",input.get("ClickWithSkip@Settlement_Instructions"));
		
		//36. Enter global value for the key $Parama1 in Settlement Account 
		uiDriver.typeGlobalValue("fill_CapNDFVanillaDeal.eltSettlement_Account", input.get("TypeGlobalValue@Settlement_Account"));
		
		//37. Type $data in SettlementAccount field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtSettlementAccount", input.get("Type@SettlementAccount"));
		
		//38. Dynamic Wait
		uiDriver.dynamicWait();
		
		//39. Type $data in CpartyCorrNo field
		uiDriver.setValue("fill_CapNDFVanillaDeal.txtCpartyCorrNo", input.get("Type@CpartyCorrNo"));
		
		//40. Enter global value for the key $Parama1 in Cparty Corr No 
		uiDriver.typeGlobalValue("fill_CapNDFVanillaDeal.eltCparty_Corr_No", input.get("TypeGlobalValue@Cparty_Corr_No"));
		
		//41. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	

	/**
	*Overriding toString() method of object class to print ForexDeals
	*format string
	**/
	public String toString(){
		return "ForexDealsDriver()";
	}
}
