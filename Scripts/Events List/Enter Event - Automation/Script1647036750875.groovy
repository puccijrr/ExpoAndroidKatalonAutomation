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

////***Uncomment section if running individually***
//Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

//ensure that default upcoming event is found "Automation" in the events list
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Event Specific/android.widget.TextView - Automation'), 3, FailureHandling.STOP_ON_FAILURE)

//Enter Event and wait for load
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.TextView - ENTER'), 0)
Mobile.delay(5)

//Ensure right event is found based on header
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Automation Header'), 3, FailureHandling.STOP_ON_FAILURE)


