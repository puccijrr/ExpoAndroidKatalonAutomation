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

//***Uncomment section if running individually***
Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

//Open Hamburger menu
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)

//Select the 'Edit' button on the main profile
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)


//**Ensure all expected fields have the correct data by default
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.ImageView'), 
    3, FailureHandling.CONTINUE_ON_FAILURE) //Check Profile Picture exists
    
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Man'), 
    0, FailureHandling.CONTINUE_ON_FAILURE) //Checks  that first name is "Man"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Pig'), 
    0, FailureHandling.CONTINUE_ON_FAILURE) //Checks  that last name is "Pig"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - rickadmin1expopass.com'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that account email is "rick+admin1@expopass.com"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Expo'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Company name is "Expo"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - QA'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Job Title is "QA"


//Mobile.closeApplication()
	