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

//***Uncomment section if running individually***
Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.TextView - ENTER'), 0)
Mobile.delay(3)

Mobile.delay(2)

//Enter Admin Settings by selecting Gear Icon
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Gear Icon'), 0)

//Select Manage Users
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.TextView - Manage Users'), 1)

//Select Add a user
Mobile.tap(findTestObject('Admin Toolkit/Admin Settings/Users/android.widget.ImageView - Add a User Button'), 1)

//***Verify ADD USER header is found (or fail here)***
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/android.widget.TextView - ADD USER header'),
	3, FailureHandling.STOP_ON_FAILURE)

//Scroll down for button access
	

//***Select "Save..." button WITHOUT entering anything into the Email text box and ensure that correct error popup message is seen (then close it out)***
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/android.widget.Button - SAVE AND INVITE TO APP button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/ErrorPop_Invalid Email'),
	3, FailureHandling.STOP_ON_FAILURE) //Invalid Email popup header
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/ErrorPop_Email field cannot be empty'),
	3, FailureHandling.STOP_ON_FAILURE) //Email cannot be empty popup
	
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/ErrorPop_OK btn'), 0) //Close popup modal
Mobile.delay(2)


//***Enter in an email for a user ALREADY added and Select "Save..." and ensure that correct error popup message is seen (then close it out)***
Mobile.setText(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/android.widget.EditText - Email Text Field'), 
	GlobalVariable.OtherUser, 0) //User email that exists on the event in the users list

Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/android.widget.Button - SAVE AND INVITE TO APP button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/ErrorPop_You already invited this user'),
	3, FailureHandling.STOP_ON_FAILURE) //"You already invited this user" error
	
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Add User/ErrorPop_OK btn'), 0) //Close popup modal
Mobile.delay(2)




//Select Back to exit Add User page
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/Specific Admin Users/android.widget.ImageButton - Back'), 0)
Mobile.delay(1)

//Select Back a second time to return  to Admin Settings
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/Users/android.widget.ImageButton - Back'), 0)
Mobile.delay(1)

//Select Back a THIRD time to return  to Admin Toolkit
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Admin Settings/android.widget.ImageButton - Back'), 0)





