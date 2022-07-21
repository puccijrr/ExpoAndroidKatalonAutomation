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

//Select "Privacy Policy" option
Mobile.tap(findTestObject('Object Repository/Events List/Hamburger Menu/android.widget.TextView - Privacy Policy'), 1)
Mobile.delay(3)

//https://www.expopass.com/privacy-policy/
//Ensure page direct is correct by checking elements on Privacy Policy page and correct date
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Privacy Policy Page/android.widget.TextView - Privacy Policy'), 0, FailureHandling.STOP_ON_FAILURE) //Page Title
Mobile.verifyElementExist(findTestObject('Object Repository/Login Objects/Privacy Policy Page/android.widget.TextView - LAST UPDATED August 13, 2020'), 0, FailureHandling.STOP_ON_FAILURE) //Current date version **WILL NEED TO BE UPDATED WITH NEW VERSIONS**

//Intiate Android specific back button press
Mobile.pressBack()


//Mobile.closeApplication()

