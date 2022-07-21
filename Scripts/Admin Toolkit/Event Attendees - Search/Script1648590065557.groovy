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
//Mobile.tap(findTestObject('Object Repository/Events List/android.widget.TextView - ENTER'), 0)
//Mobile.delay(3)

Mobile.delay(2)

//Click to Enter Event Attendees
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/android.widget.TextView - Event Attendees'), 0)

//Click Search icon button
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Event Attendees/android.widget.TextView - Search Icon'), 3)

//Enter in specific text for attendee name
Mobile.setText(findTestObject('Object Repository/Admin Toolkit/Event Attendees/android.widget.EditText - Search Attendee'), "Attendee Bob", 0)
Mobile.delay(1)

//Select the top Item (Should be Attendee Bob)
Mobile.tap(findTestObject('Object Repository/Admin Toolkit/Event Attendees/android.widget.TextView - Top Search List Item'), 3)

//Ensure Attendee Bob is found in attendees list
Mobile.verifyElementExist(findTestObject('Object Repository/Admin Toolkit/Event Attendees/Attendees/android.widget.TextView - Attendee Bob'),
	3, FailureHandling.STOP_ON_FAILURE)


//Select Back to exit search list
Mobile.tap(findTestObject('Admin Toolkit/Event Attendees/android.widget.ImageButton - Back'), 0)
Mobile.delay(1)

//Select Back a second time to return  to admin menu
Mobile.tap(findTestObject('Admin Toolkit/Event Attendees/android.widget.ImageButton - Back'), 0)


