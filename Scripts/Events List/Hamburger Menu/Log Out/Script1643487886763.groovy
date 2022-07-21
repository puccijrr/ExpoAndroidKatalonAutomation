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

//Select Log Out button
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Log Out'), 1)

//Check confirmation warning popup appears via text
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Log Out Popup/android.widget.TextView - Do you want to log out'), 3, FailureHandling.STOP_ON_FAILURE) //POPUP dialog text

//Select Cancel to close confirmation popup
Mobile.tap(findTestObject('Object Repository/Login Objects/Log Out Popup/android.widget.Button - CANCEL'), 1)
Mobile.delay(2)

//Open Hamburger menu again and select Log Out button
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Log Out'), 1)

//Now select Log out confirmation
Mobile.tap(findTestObject('Object Repository/Login Objects/Log Out Popup/android.widget.Button - LOG OUT'), 2)
Mobile.delay(3)

//Ensure succesful logout based on objects
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/android.widget.Button - LOG IN Selection'), 3, FailureHandling.STOP_ON_FAILURE) //Login Screen "Login" option
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/android.widget.Button - CREATE AN ACCOUNT'), 3, FailureHandling.STOP_ON_FAILURE) //Login Screen "Create An Account"


//Mobile.closeApplication()
	



