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

// Prueba 1: Verificar hipervínculo Olvidar Contraseña

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))

text_Olvidar_clave = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Login_Olvidaste_contrasea'))

WebUI.verifyEqual(text_Olvidar_clave, texto_1)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Login_Olvidaste_contrasea'))

url_Forgotpass = WebUI.getUrl()

WebUI.verifyEqual(url_Forgotpass, url_1)

// Prueba 2: Verificar textos en la vista Forgertpass

text_Banner_Forgotpass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_Forgotpass_Banner_text'))

WebUI.verifyEqual(text_Banner_Forgotpass, texto_Banner_2)

label_correo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_Forgortpass_insert_email_text'))

WebUI.verifyEqual(label_correo, label_Enviar_Correo)

button_Forgotpass_Cancelar = WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Cancelar'))

WebUI.verifyEqual(button_Forgotpass_Cancelar, boton_Cancelar)

button_Forgotpass_Enviar_Correo = WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

WebUI.verifyEqual(button_Forgotpass_Enviar_Correo, boton_Enviar_Correo)

// Prueba 3: Insertar correo no valido, verificar alertas y botón enviar inhabilitado 

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Forgotpass_Insert_Email'),insert_Correo_1)

alert_Forgotpass_Email = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Forgotpass_Email_Invalido'))

WebUI.verifyEqual(alert_Forgotpass_Email,alerta_Correo_1)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

// Prueba 4: Insertar correo no valido con @ y dirección errada, botón enviar inhabilitado y alerta de email invalido

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Forgotpass_Insert_Email'),insert_Correo_2)

WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

alert_Forgotpass_Email_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Forgotpass_Email_Invalido_II'))

WebUI.verifyEqual(alert_Forgotpass_Email_II,alerta_Correo_2)

// Prueba 5: Botón Cancelar, redireccion a vista Home

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Cancelar'))

url_Home = WebUI.getUrl()

WebUI.verifyEqual(url_Home, url_2)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Login'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Login_Olvidaste_contrasea'))

// Prueba 6: Insertar correo valido, verificar ausencia de alertas y botón enviar habilitado

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Forgotpass_Insert_Email'),insert_Correo_3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Forgotpass_Email_Invalido'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Forgotpass_Enviar_Correo'))

alert_email_send = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Forgotpass_Email_Enviado'))

WebUI.verifyEqual(alert_email_send, alerta_Correo_3)

// Cambiar a vista correo 

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Inputs/input_Email'), id_correo)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Login'))

// Prueba 7: Comprobar Titulo, asunto y contenido del correo

email_title = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Equipo_SERVI2'))

WebUI.verifyEqual(email_title, correo_Titulo)

email_asunto = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Div/div_Email_Cambio_Contrasea'))

WebUI.verifyEqual(email_asunto, correo_Asunto)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Equipo_SERVI2'))

email_Pasos = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Span/span_Email_Pasos'))

WebUI.verifyEqual(email_Pasos, correo_Pasos)

email_Button = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Restablecer_Contrasea'))

WebUI.verifyEqual(email_Button, correo_Boton_Restablecer)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_YOPmail/Buttons/button_Restablecer_Contrasea'))

WebUI.closeWindowIndex(0)

WebUI.switchToWindowIndex(currentWindow + 1)

// Prueba 8: Redirección a la Pagina Cambiar Contraseña, comprobar Labels

url_ChangePass = WebUI.getUrl()

WebUI.verifyEqual(url_ChangePass, url_3)

changePass_Titulo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_ChangePass_Tittle'))

WebUI.verifyEqual(changePass_Titulo, ventana_Restablecer_Titulo)

changePass_Subtitulo = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Labels/label_ChangePass_H3_Ingresar_Pass'))

WebUI.verifyEqual(changePass_Subtitulo, ventana_Restablecer_Subtitulo)

changeePass_Label_Pass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_ChangePass_Contrasea'))

WebUI.verifyEqual(changeePass_Label_Pass, restablecer_Insertar_Pass)

changePass_Label_Confirm_Pass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_ChangePass_Confirmar_Contrasea'))

WebUI.verifyEqual(changePass_Label_Confirm_Pass, restablecer_Confirmar_Pass)

// Prueba 9: Alerta de campos vacios
// El botón restablecer contraseña permanecera inactivo hasta llenar con campos validos

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	'1')

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'),
	'1')

WebUI.sendKeys(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'), Keys.chord(Keys.BACK_SPACE))

changePass_Alerta_Clave = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Pass_Invalida'))

WebUI.verifyEqual(changePass_Alerta_Clave, insertar_Pass_Alerta_1)

changePass_Alerta_Confirm_Clave = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Confirm_Pass_Invalida'))

WebUI.verifyEqual(changePass_Alerta_Confirm_Clave, confirmar_Pass_Alerta_1)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

// Prueba 10: Insertar contraseñas básicas y distintas, verificar alertas

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	'1234')

changePass_Alerta_Clave_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Pass_InvalidaII'))

WebUI.verifyEqual(changePass_Alerta_Clave_II, insertar_Pass_Alerta_2)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'),
	'12345')

changePass_Alerta_Confirm_Clave_II = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_ChangePass_Confirm_Pass_InvalidaII'))

WebUI.verifyEqual(changePass_Alerta_Confirm_Clave_II, confirmar_Pass_Alerta_2)

// Prueba 11: Insertar datos validos

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Insert_New_Pass'),
	new_Pass)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_ChangePass_Confirm_New_Pass'),
	new_Pass)

WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_ChangePass_Restablecer_Contrasea'))

home_SuccessPass = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Home_Sucess_Change_Pass'))

WebUI.verifyEqual(home_SuccessPass, alerta_Cambio_Exitoso)

Url_SuccessPass = WebUI.getUrl()

WebUI.verifyEqual(Url_SuccessPass, url_4)

WebUI.closeBrowser()