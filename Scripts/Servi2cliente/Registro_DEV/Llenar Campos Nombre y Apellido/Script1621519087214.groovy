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

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_REGISTRARSE'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Name'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_LastName'))

//WebUI.verifyElementPresent(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Name_Condition'), 0)

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Name_Condition')),
	'El campo es requerido')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Name'))

//WebUI.verifyElementVisible(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_LastName_Condition'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_LastName_Condition')),
	'El campo es requerido')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Name'), 'Nombre01')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_LastName'), 'Apellido01')

WebUI.verifyElementNotPresent(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Name_Condition'), 0)

WebUI.verifyElementNotPresent(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_LastName_Condition'), 0)

WebUI.closeBrowser()

