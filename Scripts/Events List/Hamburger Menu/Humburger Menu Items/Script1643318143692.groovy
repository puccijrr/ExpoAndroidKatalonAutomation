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
//Mobile.startApplication('C:\\Users\\pucci\\Programming\\katalon-automation\\Android Main\\androidapp\\app-release.apk', 
//    true)
//Mobile.callTestCase(findTestCase('Login Tests/Login Android'), [('email') : GlobalVariable.Username, ('Password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

//Open Hamburger menu
Mobile.tap(findTestObject('Object Repository/Events List/android.widget.ImageButton - Hamburger Menu'), 0)

//Ensure all options are present
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Upcoming Events'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Upcoming Events option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Previous Events'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Previous Events option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Exhibitor Access'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Exhibitor Access option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - About Expo'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //About Expo option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - FAQs'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //FAQs option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Privacy Policy'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Privacy Policy option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Terms of Use'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Terms of Use option
    )

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Log Out'), 
    0, FailureHandling.CONTINUE_ON_FAILURE //Log Out button
    )
	
	
//Close out menu by tapping right side of screen
Mobile.tapAtPosition(200, 500)
	
//Mobile.closeApplication()
	