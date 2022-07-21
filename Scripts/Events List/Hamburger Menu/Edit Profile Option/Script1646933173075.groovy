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

Mobile.delay(1)

//Open Hamburger menu
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)
Mobile.delay(3)

//Select the 'Edit' button on the main profile
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)

//Ensure EDIT YOUR PROFILE Header is found, or fail here
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.TextView - EDIT YOUR PROFILE'),
	3, FailureHandling.STOP_ON_FAILURE) //Check Profile Picture exists

//Check all expected fields and options exist (and are in the right  order)
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.ImageView'), 
    0, FailureHandling.CONTINUE_ON_FAILURE) //Check Profile Picture slot exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.TextView - Change profile picture'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Check Change profile picture option exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - First Name'), 
    0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that first name field exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Last Name'), 
    0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that last name field exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Email (Locked)'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that locked Email field exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Company'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Company name field exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Job Title'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Job Title field exists

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Save button exists

//Back to previous menu
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.ImageButton - Back'), 0)


//Mobile.closeApplication()
	