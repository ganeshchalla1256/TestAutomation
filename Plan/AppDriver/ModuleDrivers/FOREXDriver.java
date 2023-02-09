/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:39:41
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
public class FOREXDriver extends BaseWebModuleDriver {
	public FOREXDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void fill_ForexSpotDeal(DataRow input, DataRow output) {
		//1. Set RunTime Global Value from getting the text  ForexSpotDeal to $Parama1
		uiDriver.setRunTimeGlobalValue("fill_ForexSpotDeal.eltForexSpotDeal",input.get("setRunTimeGlobalValue@ForexSpotDeal"));
		
		//2. Enter global value for the key $Parama1 in Counterparty 
		uiDriver.typeGlobalValue("fill_ForexSpotDeal.txtCounterparty", input.get("TypeGlobalValue@Counterparty"));
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//4. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//5. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow"));
		
		//6. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//7. Send Key Action $Parama1 at Counterparty 
		uiDriver.sendKeyEvents("fill_ForexSpotDeal.txtCounterparty", input.get("SendKeyAction@Counterparty"));
		
		//8. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//9. Type $data in Front Deal Number field
		uiDriver.setValue("fill_ForexSpotDeal.txtFront_Deal_Number", input.get("Type@Front_Deal_Number"));
		
		//10. Enter global value for the key $Parama1 in Front Deal Number 
		uiDriver.typeGlobalValue("fill_ForexSpotDeal.txtFront_Deal_Number", input.get("TypeGlobalValue@Front_Deal_Number"));
		
		//11. Type $Parama1 Date in Deal Date  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtDeal_Date", input.get("TypeDate@Deal_Date"));
		
		//12. Type $data in Currency Bought field
		uiDriver.setValue("fill_ForexSpotDeal.txtCurrency_Bought", input.get("Type@Currency_Bought"));
		
		//13. Type $data in Currency Sold field
		uiDriver.setValue("fill_ForexSpotDeal.txtCurrency_Sold", input.get("Type@Currency_Sold"));
		
		//14. Type $data in Buy Amount field
		uiDriver.setValue("fill_ForexSpotDeal.txtBuy_Amount", input.get("Type@Buy_Amount"));
		
		//15. Type $data in Sell Amount field
		uiDriver.setValue("fill_ForexSpotDeal.txtSell_Amount", input.get("Type@Sell_Amount"));
		
		//16. Type $Parama1 Date in Value Date Buy  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtValue_Date_Buy", input.get("TypeDate@Value_Date_Buy#2"));
		
		//17. Type $Parama1 Date in Value Date Sell  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtValue_Date_Sell", input.get("TypeDate@Value_Date_Sell#2"));
		
		//18. Type $Parama1 Date in Option Avail Date  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtOption_Avail_Date", input.get("TypeDate@Option_Avail_Date"));
		
		//19. Type $data in Option Ccy field
		uiDriver.setValue("fill_ForexSpotDeal.txtOption_Ccy", input.get("Type@Option_Ccy"));
		
		//20. Type $data in Dealer Desk field
		uiDriver.setValue("fill_ForexSpotDeal.txtDealer_Desk", input.get("Type@Dealer_Desk"));
		
		//21. Type $data in Spot Rate field
		uiDriver.setValue("fill_ForexSpotDeal.txtSpot_Rate", input.get("Type@Spot_Rate"));
		
		//22. Type $data in Forward Rate field
		uiDriver.setValue("fill_ForexSpotDeal.txtForward_Rate", input.get("Type@Forward_Rate"));
		
		//23. Click CLS Deal_Yes if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.btnCLS_Deal_Yes",input.get("ClickWithSkip@CLS_Deal_Yes"));
		
		//24. Type $data in FXATMemo field
		uiDriver.setValue("fill_ForexSpotDeal.txtFXATMemo", input.get("Type@FXATMemo"));
		
		//25. Click Settlement Instruction if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.eltSettlement_Instruction",input.get("ClickWithSkip@Settlement_Instruction"));
		
		//26. Type $data in Settlement Type field
		uiDriver.setValue("fill_ForexSpotDeal.txtSettlement_Type", input.get("Type@Settlement_Type"));
		
		//27. Click Seettlement Type_S if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.txtSeettlement_Type_S",input.get("ClickWithSkip@Seettlement_Type_S"));
		
		//28. Click Seettlement Type_P if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.eltSeettlement_Type_P",input.get("ClickWithSkip@Seettlement_Type_P"));
		
		//29. Type $data in Settlement Account For Sell field
		uiDriver.setValue("fill_ForexSpotDeal.txtSettlement_Account_For_Sell", input.get("Type@Settlement_Account_For_Sell"));
		
		//30. Enter global value for the key $Parama1 in Settlement Account For Sell 
		uiDriver.typeGlobalValue("fill_ForexSpotDeal.txtSettlement_Account_For_Sell", input.get("TypeGlobalValue@Settlement_Account_For_Sell"));
		
		//31. Type $data in Settlement Account For buy field
		uiDriver.setValue("fill_ForexSpotDeal.txtSettlement_Account_For_buy", input.get("Type@Settlement_Account_For_buy"));
		
		//32. Enter global value for the key $Parama1 in Settlement Account For buy 
		uiDriver.typeGlobalValue("fill_ForexSpotDeal.txtSettlement_Account_For_buy", input.get("TypeGlobalValue@Settlement_Account_For_buy"));
		
		//33. Type $data in Counterparty SSI.1 field
		uiDriver.setValue("fill_ForexSpotDeal.txtCounterparty_SSI_1", input.get("Type@Counterparty_SSI_1"));
		
		//34. Enter global value for the key $Parama1 in Counterparty SSI.1 
		uiDriver.typeGlobalValue("fill_ForexSpotDeal.txtCounterparty_SSI_1", input.get("TypeGlobalValue@Counterparty_SSI_1"));
		
		//35. Click Front Fields if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.txtFront_Fields",input.get("ClickWithSkip@Front_Fields"));
		
		//36. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#3"));
		
		//37. Click MD Type Main Contra_D if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.txtMD_Type_Main_Contra_D",input.get("ClickWithSkip@MD_Type_Main_Contra_D"));
		
		//38. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#4"));
		
		//39. Click Buy Sell Code_S if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.txtBuy_Sell_Code_S",input.get("ClickWithSkip@Buy_Sell_Code_S"));
		
		//40. Click Buy Sell Code_B if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.eltBuy_Sell_Code_B",input.get("ClickWithSkip@Buy_Sell_Code_B"));
		
		//41. Click Forward Deal if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.eltForward_Deal",input.get("ClickWithSkip@Forward_Deal"));
		
		//42. Type $Parama1 Date in Value date buy  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtValue_date_buy", input.get("TypeDate@Value_date_buy#1"));
		
		//43. Type $Parama1 Date in Value date sell  textbox
		uiDriver.TypeDate("fill_ForexSpotDeal.txtValue_date_sell", input.get("TypeDate@Value_date_sell#1"));
		
		//44. Click Forex if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.eltForex",input.get("ClickWithSkip@Forex"));
		
		//45. Click Sod_no if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("fill_ForexSpotDeal.txtSod_no",input.get("ClickWithSkip@Sod_no"));
		
	}
	

	/**
	*Overriding toString() method of object class to print FOREX
	*format string
	**/
	public String toString(){
		return "FOREXDriver()";
	}
}
