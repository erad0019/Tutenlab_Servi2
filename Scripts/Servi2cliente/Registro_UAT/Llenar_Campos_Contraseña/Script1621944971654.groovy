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

WebUI.click(findTestObject('Object Repository/Var_registro_UTA/Page_TutenServi2Web/Buttons/button_REGISTRARSE'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alertInput_El_campo_es_requerido'))

WebUI.setEncryptedText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Confirmar_Contraseña'), 
    'XZoapIqFutIZDk5bxe+WjQ==')

WebUI.setEncryptedText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Contraseña'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alertInput_Las_contraseñas_no_coinciden'))

WebUI.setEncryptedText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Contraseña'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alertInput_El_campo_es_requerido_1'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alertInput_Las_contraseñas_no_coinciden'))

WebUI.setEncryptedText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Contraseña'), 'XZoapIqFutIZDk5bxe+WjQ==')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Objects/objectInfo_Debe_tener_al_menos_6_caracteres'))

