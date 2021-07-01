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

//Acceder a la vista Registro 

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Registro'))

url_Registro = WebUI.getUrl()

WebUI.verifyEqual(url_Registro, url_Registrar)

//Prueba 1: Verificar Banner

registrar_Banner_Title = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Banner_Titulo')) 

WebUI.verifyEqual(registrar_Banner_Title, banner_Titulo)

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Images/image_Registrar_Banner_Hogar'))

registrar_Banner_Asistencia_Hogar = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Banner_Hogar'))

WebUI.verifyEqual(registrar_Banner_Asistencia_Hogar, banner_Asistencia_Hogar)

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Images/image_Registrar_Banner_Gas'))

registrar_Banner_Asistencia_Gas = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Banner_Gas'))

WebUI.verifyEqual(registrar_Banner_Asistencia_Gas, banner_Asistencia_Gas)

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Images/image_Registrar_Banner_Telemedicina'))

registrar_Banner_Asistencia_Telemedicina = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Banner_Telemedicina'))

WebUI.verifyEqual(registrar_Banner_Asistencia_Telemedicina, banner_Asistencia_Telemedicina)

// Prueba 2: Verificar Cliente Engie Campos

registrar_Body_Titulo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Body_Titulo'))

WebUI.verifyEqual(registrar_Body_Titulo, body_Titulo)

registrar_Body_Cliente_Engie = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Body_Cliente_Engie'))

WebUI.verifyEqual(registrar_Body_Cliente_Engie, body_Cliente_Engie)

registrar_Check_Cliente_Engie_off = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Body_Cliente_Engie'), 'class')

WebUI.verifyEqual(registrar_Check_Cliente_Engie_off, body_Check_Engie_Off)

//Verificar ausencia de campos Engie

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Clave_Cliente'), 0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Cuenta_Contrato'), 0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Validar_Datos'), 0)

//verificar presencia de campos Engie

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Body_Cliente_Engie'))

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Body_Cliente_Engie'), 'class')

registrar_Check_Cliente_Engie_on = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Body_Cliente_Engie'), 'class')

WebUI.verifyEqual(registrar_Check_Cliente_Engie_on, body_Check_Engie_On)

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Clave_Cliente'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Cuenta_Contrato'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Validar_Datos'), 0)

//Verificar nombre de los campos

registrar_Form_Clave_Cliente = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Clave_Cliente'))

WebUI.verifyEqual(registrar_Form_Clave_Cliente, label_Clave_Cliente)

registrar_Form_Cuenta_Contrato = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Cuenta_Contrato'))

WebUI.verifyEqual(registrar_Form_Cuenta_Contrato, label_Cuenta_Contrato)

registrar_Form_Clave_Cliente_Placeholder = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Cliente_Engie'), 'placeholder')

WebUI.verifyEqual(registrar_Form_Clave_Cliente_Placeholder, placeholder_Clave_Cliente)

registrar_Form_Cuenta_Contrato_Placeholder = WebUI.getAttribute(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Cuenta_Contrato'), 'placeholder')

WebUI.verifyEqual(registrar_Form_Cuenta_Contrato_Placeholder, placeholder_Cuenta_Contrato)

registrar_Form_Button_Validar_Datos = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Validar_Datos'))

WebUI.verifyEqual(registrar_Form_Button_Validar_Datos, button_Validar_Datos)

//Verificar imagenes de ayuda

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Icons/icon_Registrar_Form_Clave_Cliente'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Images/image_Registrar_Form_Factura_Clave_Cliente'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Icons/icon_Registrar_Form_Cuenta_Contrato'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Images/image_Registrar_Form_Factura_Cuenta_Contrato'))

WebUI.closeBrowser()