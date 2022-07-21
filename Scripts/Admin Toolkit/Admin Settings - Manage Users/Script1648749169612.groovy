import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

////***Uncomment section if running individually***
//Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)
//Mobile.tap(findTestObject('Object Repository/Events List/android.widget.TextView - ENTER'), 0)
//Mobile.delay(3)

Mobile.delay(2)

//Enter Admin Settings by selecting Gear Icon
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Gear Icon'), 0)

//Select Manage Users
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.TextView - Manage Users'), 1)


//***Verify all expected elements are found on Users page for Automation event***

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.TextView - USERS Header'),
	3, FailureHandling.STOP_ON_FAILURE) //**Check USERS header is found (or fail here)**
	
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.TextView - Search Icon'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Search icon

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.ImageView - Add a User Button'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Add User + Button

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.TextView - Add a user Text'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //"Add a User" text

//Ensure current admin user is found (***May need to update with test admin***)!
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Specific Admin Users/android.widget.TextView - Man Pig'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Man Pig (rick+admin1)


//Select Back TWICE to return to Admin Toolkit
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.ImageButton - Back'), 0) //Manage Users back button
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.ImageButton - Back'), 2) //Admin Settings back button





