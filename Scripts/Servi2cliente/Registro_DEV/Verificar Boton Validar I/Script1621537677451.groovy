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

WebUI.navigateToUrl('https://devservi2.tutenlabs.dev/clientes/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Registrarse'))

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/check_Engie'))

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Validar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values'), 0)

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values')), 'Por favor introduzca los datos solicitados para proceder a la validación')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Registrarse'))

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/check_Engie'))

WebUI.setText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Insert_NumberAccount'), '5000000001')

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Validar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values'), 0)

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values')), 'Por favor introduzca los datos solicitados para proceder a la validación')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Registrarse'))

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/check_Engie'))

WebUI.setText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Insert_Interlocutor'), '400000001')

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Validar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values'), 0)

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_All_Values')), 'Por favor introduzca los datos solicitados para proceder a la validación')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Registrarse'))

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/check_Engie'))

WebUI.setText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Insert_Interlocutor'), '400000001')

WebUI.setText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Insert_NumberAccount'), '5000000001')

WebUI.click(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/button_Validar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/input_Alert_Wrong_Values'), 0)

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Var_registro_DEV/Page_TutenServi2Web/Input_Alert_Wrong_Values_Text')), 'No se encontró cuenta engie')

WebUI.closeBrowser()

