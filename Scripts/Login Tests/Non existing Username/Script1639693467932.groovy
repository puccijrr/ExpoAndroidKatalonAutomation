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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

////***Uncomment section if running individually***
//Mobile.startApplication(GlobalVariable.App, true)

Mobile.delay(1)

//Tap Login Button on home screen
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN Selection'), 0)

//Enter passowrd but a username that doesn't exist
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Email'), "fake@expopass.com", 0)
Mobile.setText(findTestObject('Object Repository/Login Objects/android.widget.EditText - Password'), GlobalVariable.Password, 0)

//Attempt to login
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN'), 0)

//Ensure that proper error appeared
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/ErrorPop_Authentication Failed'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/ErrorPop_Invalid email or password'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

//Tap Ok to close error popup
Mobile.tap(findTestObject('Object Repository/Login Objects/ErrorPop_OK, THANKS button'), 0)

//Tap BACK button to reset username and password fields
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.ImageButton - BACK'), 2)

//Mobile.closeApplication()

