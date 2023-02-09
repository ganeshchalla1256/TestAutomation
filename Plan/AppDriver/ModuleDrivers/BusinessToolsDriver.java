/******************************************************************************
Created by : gachalla
Created\Updated on : 17-01-2023 09:41:19
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
public class BusinessToolsDriver extends BaseWebModuleDriver {
	public BusinessToolsDriver(KeywordDriver kwDriver) {
		super(kwDriver);
	}
	
	public void act_UploadImage(DataRow input, DataRow output) {
		//1. Click Image if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_UploadImage.eltImage",input.get("ClickWithSkip@Image"));
		
		//2. Click Document if  $Parama1 is not SKIP
		uiDriver.clickWithSkip("act_UploadImage.eltDocument",input.get("ClickWithSkip@Document"));
		
		//3. SwitchToWindow with Title as  $Parama1
		uiDriver.SwitchToWindow(input.get("SwitchToWindow"));
		
		//4. UploadFile Choose File $Parama1
		uiDriver.FileUpload("act_UploadImage.eltChoose_File", input.get("UploadFile@Choose_File"));
		
		//5. SleepTime $Parama1
		uiDriver.SleepTime(input.get("SleepTime"));
		
		//6. Click on RightIcon WebElement
		uiDriver.click("act_UploadImage.eltRightIcon");
		
		//7. SwitchAndCloseWindow $Parama1
		uiDriver.SwitchAndCloseWindow(input.get("SwitchAndCloseWindow"));
		
	}
	

	/**
	*Overriding toString() method of object class to print BusinessTools
	*format string
	**/
	public String toString(){
		return "BusinessToolsDriver()";
	}
}
