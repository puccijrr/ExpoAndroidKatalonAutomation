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

Mobile.startApplication(GlobalVariable.App, true)

Mobile.delay(1)

//Tap Login Button on home screen
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN Selection'), 0)

//Enter in email to Email textbox
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Email'), GlobalVariable.UsernameSensitive, 
    0)

//Enter in password to Password textbox
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Password'), GlobalVariable.Password, 
    0)

//Tap Login button and delay
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN'), 0)

Mobile.delay(5)

//Check for "Upcoming Events" Header is found to ensure login
Mobile.verifyElementExist(findTestObject('Events List/android.widget.TextView - HEADER - UPCOMING EVENTS'), 20, FailureHandling.STOP_ON_FAILURE)

