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

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Registro'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/span_Registro'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrate'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_Regstrate'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia hogar 247'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia hogar 247'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia gas'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia gas'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia telemedicina'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1_2'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia telemedicina'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Djanos tus datos de contacto'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/h3_Djanos tus datos de contacto'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE_ui-chkbox-box ui-widg_a4bb45'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE_ui-chkbox-box ui-widg_a4bb45'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Clave de cliente'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Soy cliente ENGIE_engie-interlocutor-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Clave de cliente_btn-show-factura-clave-c_749fcf'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Cuenta contrato'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Clave de cliente_engie-accountNumber-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Cuenta contrato_btn-show-factura-cuenta-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/span_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Nombre(s)'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Apellido(s)'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Telfono de contato'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Correo electrnico'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Confirmar correo electrnico'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Contrasea'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Contrasea_btn-show-password'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Confirmar contrasea'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Confirmar contrasea_btn-show-confirmPassword'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Acepto los Trminos y condiciones'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/a_Trminos y condiciones'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Acepto los_ui-chkbox-box ui-widget ui-c_cb49d3'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Cancelar'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/form_Soy cliente ENGIE Nombre(s)Apellido(s)_8ea8cb'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), 'Axel')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)Telfono de contato'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'), 'Excel')

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'), 
    '5846479454')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    'correo@gmail.com')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_be95b4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    '3fMF5eVBwrI=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaConfirmar contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    '3fMF5eVBwrI=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Acepto los_ui-chkbox-box ui-widget ui-c_cb49d3'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Registrarme'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)Telfono de contato'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), '56564648')

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'), '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)El campo es req_b0aa12'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'), 
    '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_79a09e'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    'correo')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Debe ser un email vlido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    'correo@gmail')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Correo electrnicoConfirmar correo e_97e34b'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    '')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Correo electrnicoConfirmar correo e_d5b8be'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    'correos')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Email no coincide'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_79a09e_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4_5'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    'lnBUteI2ioQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Debe tener al menos 6 caracteres de lar_5de2b2'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaDebe tener al menos 6 cara_a9a6ec'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4_5_6'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaDebe tener al menos 6 cara_a9a6ec'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    'lnBUteI2ioQ=')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.maximizeWindow()

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Registro'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/span_Registro'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrate'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_Regstrate'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia hogar 247'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia hogar 247'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia gas'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia gas'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_asistencia telemedicina'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1_2'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/p_asistencia telemedicina'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Djanos tus datos de contacto'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/h3_Djanos tus datos de contacto'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE_ui-chkbox-box ui-widg_a4bb45'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE_ui-chkbox-box ui-widg_a4bb45'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Clave de cliente'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Soy cliente ENGIE_engie-interlocutor-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Clave de cliente_btn-show-factura-clave-c_749fcf'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Cuenta contrato'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Clave de cliente_engie-accountNumber-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Cuenta contrato_btn-show-factura-cuenta-0'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/span_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Validar datos'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Nombre(s)'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Apellido(s)'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Telfono de contato'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Correo electrnico'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Confirmar correo electrnico'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Contrasea'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Contrasea_btn-show-password'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Confirmar contrasea'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Confirmar contrasea_btn-show-confirmPassword'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Acepto los Trminos y condiciones'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/a_Trminos y condiciones'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Acepto los_ui-chkbox-box ui-widget ui-c_cb49d3'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Cancelar'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/form_Soy cliente ENGIE Nombre(s)Apellido(s)_8ea8cb'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), 'Axel')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)Telfono de contato'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'), 'Excel')

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'), 
    '5846479454')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    'correo@gmail.com')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_be95b4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    '3fMF5eVBwrI=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaConfirmar contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    '3fMF5eVBwrI=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Acepto los_ui-chkbox-box ui-widget ui-c_cb49d3'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/button_Registrarme'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)Telfono de contato'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Validar datos_register-client-name'), '56564648')

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Nombre(s)_register-client-lastName'), '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Nombre(s)Apellido(s)El campo es req_b0aa12'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Apellido(s)_register-client-phoneNumber'), 
    '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2'))

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_79a09e'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    '')

WebUI.rightClick(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/small_El campo es requerido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    'correo')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Debe ser un email vlido'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Telfono de contato_register-client-email'), 
    'correo@gmail')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Correo electrnicoConfirmar correo e_97e34b'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    '')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_Correo electrnicoConfirmar correo e_d5b8be'))

WebUI.setText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Correo electrnico_register-client-con_382a5e'), 
    'correos')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Email no coincide'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Regstrateasistencia hogar 247asistencia_79a09e_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4_5'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Confirmar correo electrnico_register-_320b4d'), 
    'lnBUteI2ioQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Debe tener al menos 6 caracteres de lar_5de2b2'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaDebe tener al menos 6 cara_a9a6ec'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_El campo es requerido_1_2_3_4_5_6'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/section_ContraseaDebe tener al menos 6 cara_a9a6ec'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/input_Contrasea_register-client-confirmPassword'), 
    'lnBUteI2ioQ=')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uatservi2.tutenlabs.dev/clientes/home')

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/span_Registro'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Soy cliente ENGIE_ui-chkbox-box ui-widg_a4bb45'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Clave de cliente_btn-show-factura-clave-c_749fcf'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Clave de cliente_ui-overlaypanel-content'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/i_Cuenta contrato_btn-show-factura-cuenta-0'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/div_Cuenta contrato_ui-overlaypanel-content'))

WebUI.click(findTestObject('Object Repository/Prueba/Page_TutenServi2Web/img_1_2_3_4'))

WebUI.closeBrowser()

