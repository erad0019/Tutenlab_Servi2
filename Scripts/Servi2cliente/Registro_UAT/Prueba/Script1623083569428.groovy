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

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Login_Olvidaste_Contrasea'))

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Forgotpass_Insert_Email'), 
    'victoriasosa37@yopmail.com')

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

// Ingresar al correo
WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Inputs/input_Email'), 'victoriasosa37')

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Login'))

// Comprobar Titulo, asunto y contenido del correo
email_title = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Equipo_SERVI2'))

WebUI.verifyEqual(email_title, 'Equipo SERVI2')

email_asunto = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Div/div_Email_Cambio_Contrasea'))

WebUI.verifyEqual(email_asunto, 'Cambio de contraseña')

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Equipo_SERVI2'))

email_Pasos = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Email_Pasos'))

email_Button = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Restablecer_Contrasea'))

WebUI.verifyEqual(email_Button, 'Restablecer contraseña')

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Restablecer_Contrasea'))

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(currentWindow + 1)

// Pagina Cambiar Contraseña, comprobar Labels

changePass_Titulo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_ChangePass_Tittle'))

WebUI.verifyEqual(changePass_Titulo, 'Restablecer contraseña')

changePass_Subtitulo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_ChangePass_H3_Ingresar_Pass'))

WebUI.verifyEqual(changePass_Subtitulo, 'Ingresa tu nueva contraseña.')

changeePass_Label_Pass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_ChangePass_Contrasea'))

WebUI.verifyEqual(changeePass_Label_Pass, 'Contraseña')

changePass_Label_Confirm_Pass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_ChangePass_Confirmar_Contrasea'))

WebUI.verifyEqual(changePass_Label_Confirm_Pass, 'Confirmar contraseña')


// Campos vacios
// El botón restablecer contraseña permanecera inactivo hasta llenar con campos validos 

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	'1')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'),
	'1')

WebUI.sendKeys(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'), Keys.chord(Keys.BACK_SPACE))

changePass_Alerta_Clave = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Pass_Invalida'))

WebUI.verifyEqual(changePass_Alerta_Clave, 'El campo es requerido')

changePass_Alerta_Confirm_Clave = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Confirm_Pass_Invalida'))

WebUI.verifyEqual(changePass_Alerta_Confirm_Clave, 'El campo es requerido')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

// Insertar contraseñas básicas y distintas, verificar alertas

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	'1234')

changePass_Alerta_Clave_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Pass_InvalidaII'))

WebUI.verifyEqual(changePass_Alerta_Clave_II, 'Debe tener al menos 6 caracteres de largo, 1 mayúscula, 1 minúscula, 1 numero, 1 carácter especial ( @ . - _ *) y no debe poseer espacios')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'), 
    '12345')

changePass_Alerta_Confirm_Clave_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Confirm_Pass_InvalidaII'))

WebUI.verifyEqual(changePass_Alerta_Confirm_Clave_II, 'La contraseña no coincide')

// Insertar datos validos

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	'Prueba1.')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'),
	'Prueba1.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

home_SuccessPass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Sucess_Change_Pass'))

WebUI.verifyEqual(home_SuccessPass, '¡Hemos restablecido tu nueva contraseña con éxito!')

Url_SuccessPass = WebUI.getUrl()

WebUI.verifyEqual(Url_SuccessPass, 'https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.closeBrowser()