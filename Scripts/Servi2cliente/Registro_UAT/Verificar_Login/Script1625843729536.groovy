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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_UAT_Home)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), email)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), 
    password)

input_Login_Email = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), 
    'value')

input_Login_Password = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), 
    'value')

// Prueba 1: Campos vacios, botón Ingresar deshabilitado
// Prueba 2: Campo correo vacio, campo clave con valores incorrectos, botón Ingresar deshabilitado
// Prueba 3: Campo correo con valores incorrectos, campo clave vacio, botón Ingresar deshabilitado, Verificar Alerta
// Prueba 4: Campo correo con formato incorrecto, campo clave con valores incorrectos, botón Ingresar inhabilitado
// Prueba 5: Campo correo en formato correcto pero cuenta inexistente, campo clave con valores incorrectos, botón Ingresar habilitado, alerta de cuenta Inexistente
// Prueba 6: Campo correo con valores correctos, campo clave con valores incorrectos, botón Ingresar habilitado, alerta email o clave errada
// Prueba 7: Campos Email y Password con valores correctos, usuario cliente Servi2, Check Recuérdame inactivo
// Prueba 8: Campos Email y Password con valores correctos, usuario cliente Servi2, Check Recuérdame activo

// Verificar campos del Overlay Login 

test_Login_Email_Empty = WebUI.verifyEqual(input_Login_Email, "", FailureHandling.OPTIONAL)

test_Login_Password_Empty = WebUI.verifyEqual(input_Login_Password, '', FailureHandling.OPTIONAL)

if (test_Login_Email_Empty == true) {
    if (test_Login_Password_Empty == true) {
        
		//Prueba 1
		WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar')) 
		
    } else {
		
		//Prueba 2
		WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))
		
	}
}

if (test_Login_Email_Empty == false) {
    if (test_Login_Password_Empty == true) {
        
		//Prueba 3
		WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

		alert_Login_Email = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido'))
		
		WebUI.verifyEqual(alert_Login_Email, alert_Email)
		
    }
}

button_Ingresar_Off = WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'), FailureHandling.OPTIONAL)

if (test_Login_Email_Empty == false) {
	if (test_Login_Password_Empty == false) {
		if (button_Ingresar_Off == true) {
			
			//Prueba 4
			alert_Login_Email = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido'))
			
			WebUI.verifyEqual(alert_Login_Email, alert_Email)
			
		} else if (button_Ingresar_Off == false) {
			
			//Pruebas 5 a la 8
			WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))
			
			WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))
			
			WebUI.delay(3)
			
			url_Actually = WebUI.getUrl()
			
			url_Validation = WebUI.verifyEqual(url_Actually, GlobalVariable.url_UAT_Home, FailureHandling.OPTIONAL)
			
			if (url_Validation == true) {
				
				alert_Login_PopUP = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Password_Wrong'))
				
				WebUI.verifyEqual(alert_Login_PopUP, alert_PopUp)
				
			} else if (url_Validation == false) {
				
				WebUI.refresh()
				
				url_Actually = WebUI.getUrl()
				
				url_Validation = WebUI.verifyEqual(url_Actually, GlobalVariable.url_UAT_Home)
				
				WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))
				
				WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), email)
				
				WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'),
					password)
				
				WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Home_Recuerdame'))
				
				WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))
				
				WebUI.refresh()
				
				url_Actually = WebUI.getUrl()
				
				url_Validation = WebUI.verifyEqual(url_Actually, GlobalVariable.url_UAT_Resumen)
												
			}
			
		}
		
	}
}



WebUI.closeBrowser()