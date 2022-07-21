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
//import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
//import io.appium.java_client.android.AndroidDriver
//import io.appium.java_client.android.AndroidKey


//***Uncomment section if running individually***
Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Events List/android.widget.TextView - ENTER'), 0)

Mobile.delay(3)

Mobile.delay(2)

//Enter Admin Settings by selecting Gear Icon
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Gear Icon'), 0)

//Select Manage Users
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.TextView - Manage Users'), 1)

//Click Search icon button
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.TextView - Search Icon'), 3)

//Enter in specific text for attendee name then click "Done" button
Mobile.setText(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.EditText - Search User'), 'Man Pig', 0)

Mobile.delay(50)

//Research Done Key
//WebUI.sendKeys(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.EditText - Search User'), 'Enter')
//AndroidDriver<?> driver = MobileDriverFactory.getDriver()
//driver.pressKey(AndroidKey.Enter)


////Select the top Item (Should be Man Pig)
//Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.RelativeLayout - Top Search List Item'), 3)
//Ensure Man Pig is seen in Users list
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Specific Admin Users/android.widget.TextView - Man Pig'), 
    3, FailureHandling.STOP_ON_FAILURE)

//Select Back to exit search list
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Specific Admin Users/android.widget.ImageButton - Back'), 
    0)

Mobile.delay(1)

//Select Back a second time to return  to Admin Settings
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.ImageButton - Back'), 0)

Mobile.delay(1)

//Select Back a THIRD time to return  to Admin Toolkit
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.ImageButton - Back'), 0)

