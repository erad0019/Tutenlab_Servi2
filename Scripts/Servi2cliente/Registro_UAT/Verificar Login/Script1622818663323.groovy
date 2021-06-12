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

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))

// Prueba 1: Campos vacios, botón Ingresar deshabilitado 

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

// Prueba 2: Campo correo con valores incorrectos, campo clave vacio, botón Ingresar deshabilitado

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_1)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

// Prueba 3: Campo correo vacio, campo clave con valores incorrectos, botón Ingresar deshabilitado

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), '')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_1)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

// Prueba 4: Campo correo con valores incorrectos, campo clave con valores incorrectos, botón Ingresar habilitado, alerta email invalido

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_1)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_1)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido'))

alert_Email = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido'))

WebUI.verifyEqual(alert_Email, Alerta_1)

// Prueba 5: Campo correo con valores incorrectos II, campo clave con valores incorrectos, botón Ingresar habilitado, alerta email invalido II

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_2)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_1)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido_II'))

alert_Email_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Invalido_II'))

WebUI.verifyEqual(alert_Email_II, Alerta_2)

// Prueba 6: Campo correo con valores correctos, campo clave con valores incorrectos, botón Ingresar habilitado, alerta email o clave errada

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_3)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_1)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

alert_Wrong_Values = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Home_Login_Email_Password_Wrong'))

WebUI.verifyEqual(alert_Wrong_Values, Alerta_3)

// Prueba 7: Campos con valores correctos, usuario cliente Servi2
// Check Recuérdame inactivo, cerrar y volver a abrir la pagina

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_3)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_3)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

label_Request_Assistance = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_User_Servi2_Solicitar_Asistencias'))

WebUI.verifyEqual(label_Request_Assistance, Alerta_4)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.maximizeWindow()

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_User_Servi2_Solicitar_Asistencias'), 0)

// Prueba 8: Campos con valores correctos, usuario cliente No Servi2
// Check Recuérdame activo, cerrar y volver a abrir la pagina

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Email'), Correo_4)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Home_Login_Password'), Password_4)

check_Recuerdame = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Text_Recurdame'))

WebUI.verifyEqual(check_Recuerdame, Alerta_5)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Home_Recuerdame'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Ingresar'))

label_Request_Service = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_User_No_Servi2_Contrata_Plan'))

WebUI.verifyEqual(label_Request_Service, Alerta_6)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(currentWindow + 0)

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_User_No_Servi2_Contrata_Plan'), 0)

WebUI.closeBrowser()

