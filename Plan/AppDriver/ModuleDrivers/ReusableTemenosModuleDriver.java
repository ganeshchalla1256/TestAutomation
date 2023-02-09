/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:38:11
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
public class ReusableTemenosModuleDriver extends BaseWebModuleDriver {
	public ReusableTemenosModuleDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_Commit(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. Click on Commit Link
		uiDriver.click("act_Commit.lnkCommit");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
		//4. checkElementPresent DuplicateRecrdElmnt
		uiDriver.checkElementPresent("act_Commit.eltDuplicateRecrdElmnt");
		
	}
	
	public void act_SelectOverrideDrpDwnOpt(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. clickIfPresent IntroductryDoc
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltIntroductryDoc");
		
		//3. clickIfPresent Intro_Received
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltIntro_Received");
		
		//4. clickIfPresent BusinessLcns
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltBusinessLcns");
		
		//5. clickIfPresent Bus_Received
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltBus_Received");
		
		//6. clickIfPresent Memo
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltMemo");
		
		//7. clickIfPresent Memo_Received
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltMemo_Received");
		
		//8. clickIfPresent LcApplctn
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltLcApplctn");
		
		//9. clickIfPresent LcApplctnrec
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltLcApplctnrec");
		
		//10. clickIfPresent Promissory Note
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltPromissory_Note");
		
		//11. clickIfPresent Promissory Note Recv
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltPromissory_Note_Recv");
		
		//12. clickIfPresent Guarantor Letter
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltGuarantor_Letter");
		
		//13. clickIfPresent Guarantor Letter Recv
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltGuarantor_Letter_Recv");
		
		//14. clickIfPresent Loan Agreement
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltLoan_Agreement");
		
		//15. clickIfPresent Loan Agreement Recv
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltLoan_Agreement_Recv");
		
		//16. clickIfPresent Deposit Agreement
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltDeposit_Agreement");
		
		//17. clickIfPresent Deposit Agreement Recvd
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltDeposit_Agreement_Recvd");
		
		//18. clickIfPresent Overdraft Agreement
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltOverdraft_Agreement");
		
		//19. clickIfPresent Overdraft Agreement Recvd
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltOverdraft_Agreement_Recvd");
		
		//20. clickIfPresent SpotRate
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltSpotRate");
		
		//21. clickIfPresent SpotRateY
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltSpotRateY");
		
		//22. clickIfPresent NotCounterparty
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltNotCounterparty");
		
		//23. clickIfPresent NotCounterparty YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltNotCounterparty_YES");
		
		//24. clickIfPresent NO CONTROL ON INTEREST RATE
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltNO_CONTROL_ON_INTEREST_RATE");
		
		//25. clickIfPresent NO CONTROL ON INTEREST RATE YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltNO_CONTROL_ON_INTEREST_RATE_YES");
		
		//26. clickIfPresent Forward rate exceeds
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltForward_rate_exceeds");
		
		//27. clickIfPresent Forward rate exceeds YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltForward_rate_exceeds_YES");
		
		//28. clickIfPresent Maturity Date
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltMaturity_Date");
		
		//29. clickIfPresent Maturity Date YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltMaturity_Date_YES");
		
		//30. clickIfPresent Drawdown Account
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltDrawdown_Account");
		
		//31. clickIfPresent Drawdown Account YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltDrawdown_Account_YES");
		
		//32. clickIfPresent General YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltGeneral_YES");
		
		//33. clickIfPresent Value Date
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltValue_Date");
		
		//34. clickIfPresent Value Date YES
		uiDriver.clickIfPresent("act_SelectOverrideDrpDwnOpt.eltValue_Date_YES");
		
	}
	
	public void act_ReportTxnMessage(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#1"));
		
		//2. checkElementPresent TxnCompleteMsg
		uiDriver.checkElementPresent("act_ReportTxnMessage.eltTxnCompleteMsg");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
		//4. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime#2"));
		
	}
	
	public void act_TakeScreenshot(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Take screenshot of Take 
		uiDriver.takescreenshot();
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void CloseAllWindows(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow"));
		
	}
	
	public void act_SwitchAndClsAAAccCreation(DataRow input, DataRow output) {
		//1. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow#1"));
		
		//2. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow#2"));
		
	}
	
	public void act_SwtAndClsWindowThree(DataRow input, DataRow output) {
		//1. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow#1"));
		
		//2. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow#2"));
		
		//3. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow#3"));
		
	}
	
	public void act_click_audit(DataRow input, DataRow output) {
		//1. Click Audit
		uiDriver.click("act_click_audit.txtAudit");
		
	}
	
	public void TemenosLaunchLogin(DataRow input, DataRow output) {
		//1. Navigate to $data URL using CHROME browser
		uiDriver.launchApplication(input.get("Navigate@CHROME"));
		
		//2. Type Username $Parama1
		uiDriver.setValue("TemenosLaunchLogin.eltUsername", input.get("Type@Username"));
		
		//3. Type Password $Parama1
		uiDriver.setValue("TemenosLaunchLogin.eltPassword", input.get("Type@Password"));
		
		//4. Click on Sign in button
		uiDriver.click("TemenosLaunchLogin.btnSign_in");
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void act_Validate(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on Validate WebElement
		uiDriver.click("act_Validate.eltValidate");
		
		//3. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
	}
	
	public void act_Logout(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//3. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//4. Click on LogOut WebElement
		uiDriver.click("act_Logout.eltLogOut");
		
	}
	
	public void act_ClickEditBtn(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on EditPencilIcon WebElement
		uiDriver.click("act_ClickEditBtn.eltEditPencilIcon");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_ClickView(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on View WebElement
		uiDriver.click("act_ClickView.eltView");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_ClickReturnToApplScreen(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click on ReturnButton button
		uiDriver.click("act_ClickReturnToApplScreen.btnReturnButton");
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_ClickPerformAction(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on PerformAction button
		uiDriver.click("act_ClickPerformAction.btnPerformAction");
		
		//3. Dynamic Wait
		uiDriver.dynamicWait();
		
	}
	
	public void act_ClickOverView(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. Click on OverviewBtn button
		uiDriver.click("act_ClickOverView.btnOverviewBtn");
		
	}
	
	public void act_ViewRecord(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//3. Click on ViewRecord WebElement
		uiDriver.click("act_ViewRecord.eltViewRecord");
		
	}
	
	public void act_click_New_Deal(DataRow input, DataRow output) {
		//1. Dynamic Wait
		uiDriver.dynamicWait();
		
		//2. Click on New Deal WebElement
		uiDriver.click("act_click_New_Deal.eltNew_Deal");
		
	}
	
	public void act_moreActions(DataRow input, DataRow output) {
		//1. Type $data in MoreActions field
		uiDriver.setValue("act_moreActions.txtMoreActions", input.get("Type@MoreActions"));
		
		//2. Dynamic Wait
		uiDriver.dynamicWait();
		
		//3. Click on Go button
		uiDriver.click("act_moreActions.btnGo");
		
		//4. Dynamic Wait
		uiDriver.dynamicWait();
		
		//5. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
	}
	
	public void act_RunVersion(DataRow input, DataRow output) {
		//1. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//2. MoveOutOfFrame
		uiDriver.OutOfFrame();
		
		//3. AAFrame $Parama1
		uiDriver.AAframe(input.get("AAFrame"));
		
		//4. Type $data in Version field
		uiDriver.setValue("act_RunVersion.txtVersion", input.get("Type@Version"));
		
		//5. Dynamic Wait
		uiDriver.dynamicWait();
		
		//6. TypeConcatenatedGlobalValue given in $Parama1 in CVersion 
		uiDriver.typeConcatenatedGlobalValue("act_RunVersion.txtCVersion", input.get("TypeConcatenatedGlobalValue@CVersion"));
		
		//7. Dynamic Wait
		uiDriver.dynamicWait();
		
		//8. Click on ExecuteCmnd button
		uiDriver.click("act_RunVersion.btnExecuteCmnd");
		
	}
	

	/**
	*Overriding toString() method of object class to print ReusableTemenosModule
	*format string
	**/
	public String toString(){
		return "ReusableTemenosModuleDriver()";
	}
}
