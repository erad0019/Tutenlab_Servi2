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

WebUI.setText(findTestObject('Object Repository/Prueba2/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    'victoriasosa37')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Var_registro_UTA/Page_YOPmail/Span/span_Equipo_SERVI2'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_Inbox/h3_Hola victoriasosa37yopmail.com,'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_Inbox/span_Para restablecer su contrasea por favo_6518de'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_Inbox/a_Restablecer contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Ingresa tu nueva contrasea_change-pas_6d71ed'), 
    'vfhd4Bi3vig=')

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    'vfhd4Bi3vig=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/div_Restablecer contrasea Ingresa tu nueva _b97d45'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Ingresa tu nueva contrasea_change-pas_6d71ed'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/section_ContraseaEl campo es requeridoConfi_8c1b76'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Ingresa tu nueva contrasea_change-pas_6d71ed'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/small_Debe tener al menos 6 caracteres de l_d86fb5'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/section_ContraseaDebe tener al menos 6 cara_b1f8ce'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Ingresa tu nueva contrasea_change-pas_6d71ed'), 
    'qbUqbD2XcjAX2os+vCIfqw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/small_La contrasea no coincide'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/section_ContraseaConfirmar contraseaLa cont_507f4d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    'tG6c/20XpQZC5AdlNUv15w==')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/section_ContraseaConfirmar contraseaLa cont_507f4d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Contrasea_change-password-confirmPassword'), 
    'tG6c/20XpQZC5AdlNUv15w==')

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/div_Restablecer contrasea Ingresa tu nueva _256dd4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/input_Ingresa tu nueva contrasea_change-pas_6d71ed'), 
    'tG6c/20XpQZC5AdlNUv15w==')

WebUI.rightClick(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/button_Cancelar'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/button_Restablecer contrasea'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/div_Hemos restablecido tu nueva contrasea con xito'))

WebUI.click(findTestObject('Object Repository/Prueba2/Page_TutenServi2Web/div_Hemos restablecido tu nueva contrasea con xito'))

WebUI.closeBrowser()

