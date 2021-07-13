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

// Prueba 10: Verificar Placeholder en campos del formulario de registro

registrar_Form_Name = WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Nombre(s)'))

registrar_Form_Name_Placeholder = WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Nombre'), "placeholder")

WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_Apellido(s)'))

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Apellido'), "placeholder")

WebUI.getText(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Div/div_Registrar_Form_PhoneNumber'))

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_PhoneNumber'), "placeholder")

//WebUI.getText()

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Email'), "placeholder")

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_ConfirmEmail'), "placeholder")

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_Password'), "placeholder")

WebUI.getAttribute(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Registrar_Form_ConfirmPassword'), "placeholder")

