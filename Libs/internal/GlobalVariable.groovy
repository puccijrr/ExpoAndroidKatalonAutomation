package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p>Profile Admin User : App APK</p>
     */
    public static Object App
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p>Profile Admin User : Case Sensitive username</p>
     */
    public static Object UsernameSensitive
     
    /**
     * <p>Profile Admin User : Expo Pass home url</p>
     */
    public static Object expoURL
     
    /**
     * <p>Profile Admin User : Another user on the event</p>
     */
    public static Object OtherUser
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            App = selectedVariables['App']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            UsernameSensitive = selectedVariables['UsernameSensitive']
            expoURL = selectedVariables['expoURL']
            OtherUser = selectedVariables['OtherUser']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
