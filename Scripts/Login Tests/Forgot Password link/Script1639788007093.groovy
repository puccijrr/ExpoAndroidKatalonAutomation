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

//Tap "Having Trouble Logging In" button
Mobile.tap(findTestObject('Object Repository/Login Objects/android.widget.TextView - Having Trouble Logging In'), 0)

//Ensure page is correct by checking elements on Forgot Password page
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.TextView - FORGOT PASSWORD Page Title'), 0, FailureHandling.STOP_ON_FAILURE) //Page Title
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.TextView - Having Trouble Logging In Header'), 0, FailureHandling.STOP_ON_FAILURE) //Header
Mobile.verifyElementExist(findTestObject('Login Objects/Forgot Password Page/android.widget.TextView - Forgot Password Body Text'), 0, FailureHandling.STOP_ON_FAILURE) //"No Worries..." body text

//Enter in username to Email Address textbox
Mobile.setText(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.EditText - Email Address Text Box'), GlobalVariable.Username, 0)

//Tap Send Magic Link button (ensures visability of button)
Mobile.tap(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.TextView - Send Magic Link Button'), 0)

//Ensure page is correct by checking elements on Sent magic link page
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.TextView - Your Magic Link Has Been Sent'), 0, FailureHandling.STOP_ON_FAILURE) //Header
Mobile.verifyElementExist(findTestObject('Login Objects/Forgot Password Page/android.widget.TextView - We sent you a Magic Link Body Text'), 0, FailureHandling.STOP_ON_FAILURE) //"We sent you a Magic Link..." body text
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.TextView - Resend Magic Link'), 0, FailureHandling.STOP_ON_FAILURE) //Resnd Magic Link button

//Tap Cancel button to go back to the Login page
Mobile.tap(findTestObject('Object Repository/Login Objects/Forgot Password Page/android.widget.Button - Cancel'), 2)


//Mobile.closeApplication()

