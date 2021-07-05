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

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Home_Registro'))

// Prueba 9: Verificar campos de contraseña

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Registrarme'))
/*
WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Nombre'), "Nombre")

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Apellido'), "Apellido")

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_PhoneNumber'), "5212345678")

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Email'), "correo@gmail.com")

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_ConfirmEmail'), "correo@gmail.com")
*/

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Body_Cliente_Engie'))

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Cuenta_Contrato'), GlobalVariable.user_Cuenta_Contrato_I)

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Cliente_Engie'), GlobalVariable.user_Cliente_Engie_I)

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Validar_Datos'))

WebUI.setText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Password'), "Chilo-01")

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_ConfirmPassword'), "Chilo-01")

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Checks/check_Registrar_Form_TermsAndConditions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrar_Form_Registrarme'))

//WebUI.closeBrowser()