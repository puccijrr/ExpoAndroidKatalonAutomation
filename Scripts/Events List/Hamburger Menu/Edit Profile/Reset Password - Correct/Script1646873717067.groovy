import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

////***Uncomment section if running individually***
//Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)
//Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)


Mobile.delay(3)

//Tap Edit to enter Edit Your Profile Page
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)

//***Set A new Password for both password fields and save, then logout***
    
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Password'), 
	"Password2" , 0) //Set first password to "Password1"

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Confirm Password'), 
	"Password2" , 0) //Set first password to "Password2"

//Hit Save and delay for update
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'), 0)
Mobile.delay(3)

//Logout
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Log Out'), 1)
Mobile.tap(findTestObject('Object Repository/Login Objects/Log Out Popup/android.widget.Button - LOG OUT'), 2)



//***Ensure Password change updated correctly by logging in with new password***

Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN Selection'), 0)
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Email'), GlobalVariable.Username, 0)

//Enter in NEW password to Password textbox
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Password'), "Password2", 0)

Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN'), 0)
Mobile.delay(5)

//Check for "Upcoming Events" Header is found to ensure login
Mobile.verifyElementExist(findTestObject('Events List/android.widget.TextView - HEADER - UPCOMING EVENTS'), 15, FailureHandling.STOP_ON_FAILURE)


//Set Password back to original default
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Password'), "Password1" , 0) 
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Confirm Password'), "Password1" , 0)
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'), 0)
Mobile.delay(3)
Mobile.tapAtPosition(200, 500) //Close hamburger menu


//Mobile.closeApplication()
	