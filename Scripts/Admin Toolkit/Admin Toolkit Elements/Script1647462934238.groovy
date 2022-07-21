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

//***Verify all expected elements are found on Admin Toolkit for Automation event***


Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - ADMIN TOOLKIT Header'),
	3, FailureHandling.STOP_ON_FAILURE) //**Check Admin Toolkit header is found (or fail here)**
	
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.ImageButton - Hamburger Menu'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Hamburger Menu icon

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Gear Icon'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Gear (settings) icon

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.ImageView - Icon'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Logo Icon

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Automation Header'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Event Name: Automation Header

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Start Date'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Start date of event (should always be the same, end date gets extended for testing)

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Event Sessions'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Event Sessions option

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Event Attendees'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Event Attendees option

//Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.ImageView - Map Location'),
//	0, FailureHandling.CONTINUE_ON_FAILURE) //Event map location

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Automation Name'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Event Name: Automation address title

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Address and Site'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Event address and website






