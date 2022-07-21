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
//Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)

Mobile.delay(2)


//***Edit fields to new data***
    
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Email (Locked)'),
	3, FailureHandling.STOP_ON_FAILURE) //Ensure that email cannot be edited or fail here!

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - First Name'), 
	"First" , 0) //Set first name to "First"

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Last Name'), 
	"Last" , 0) //Set last name to "Last"

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Company'),
	"Company" , 0) //Set company name to "Company"

Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Job Title'),
	"Job Title" , 0) //Set Job Title to "Job Title"

//Save Data changes
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'), 0)

//Delay for profile has been updated
Mobile.delay(3)


//***Verify fields are updated to new data***

//Go back into Edit Your Profile
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Edit'), 0)

//Verify Fields updated
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - First'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks  that first name is NOW "First"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Last'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks  that last name is NOW "Last"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - rickadmin1expopass.com'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that account email is still "rick+admin1@expopass.com"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Company'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Company name is NOW "Company"

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/Event Specific/Automation/android.widget.EditText - Job Title'),
	0, FailureHandling.CONTINUE_ON_FAILURE) //Checks that Job Title is "QA"


//Set fields back to defaults and save
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - First Name'), "Man" , 0)
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Last Name'), "Pig" , 0)
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Company'), "Expo" , 0)
Mobile.setText(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.EditText - Job Title'), "QA" , 0)
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/Edit Profile/android.widget.Button - SAVE'), 0)


//Mobile.closeApplication()
	