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

//Select About Expo option
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - FAQs'), 1)

//Check navigation to FAQ's support.expopass.com by checking Help Center header (or fail here)
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Help Center/android.widget.Image - Expo Pass Help Center'), 5, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(1)

//Click "Go to Expo Pass" navigate button in the top right and make sure it goes to About Expo page again
Mobile.tap(findTestObject('Object Repository/Events List/Help Center/android.widget.TextView - Go to Expo Pass Button'), 2)

Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Homepage Expopass/android.widget.Image - EXPO PASS'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Main page logo
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Homepage Expopass/android.widget.TextView - Expo Home Hamburger'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Homepage right hamburger button
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Homepage Expopass/android.widget.TextView - Your next event just got next level'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Descriptive page text
Mobile.verifyElementExist(findTestObject('Object Repository/Events List/Homepage Expopass/android.widget.TextView - Find out how Button'), 3, FailureHandling.CONTINUE_ON_FAILURE) //"Find out how" button


//Intiate Android specific back button press
Mobile.pressBack()


//Mobile.closeApplication()
	



