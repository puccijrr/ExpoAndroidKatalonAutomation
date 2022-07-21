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

//Select Previous Events
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Exhibitor Access'), 1)


//ensure that page loaded by locating header, or stop here
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.TextView - HEADER - EXHIBITOR ACCESS'), 3, FailureHandling.STOP_ON_FAILURE)

//Find all expected page elements (including all 6 event code textboxes)
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.TextView - Exhibitor Accesss text instructions'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Instructions
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox1'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 1
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox2'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 2
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox3'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 3
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox4'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 4
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox5'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 5
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.EditText - CodeBox6'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Code Text Box 6
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Exhibitor Access/android.widget.Button - SUBMIT'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Submit code button

//Mobile.closeApplication()
	

