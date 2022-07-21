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

Mobile.delay(2)

//Tap Edit to enter Edit Your Profile Page
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)


//***Set A Different Password for both password fields and confirm error appears***
    
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Password'), 
	"Password1" , 0) //Set first password to "Password1"

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Confirm Password'), 
	"Password2" , 0) //Set confirm password to "Password2"

//Hit Save
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'), 0)

//Ensure that correct error message popup is seen for mismatched passwords
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.TextView - Invalid Password'), 3)

//Ok button to close popup
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - Error Popup - OK'), 2)

//Back to hamburger nav
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.ImageButton - Back'), 2)


//Mobile.closeApplication()
	