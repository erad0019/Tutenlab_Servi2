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

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Checks/check_Engie'))

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number'), '400061845')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_NumberAccount_Number'), '5000058051')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Icon_Search'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Account_Already_Used')), 
    'Esta cuenta contrato ya esta siendo usada')

WebUI.refresh()

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Registrarse_II'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Checks/check_Engie'))

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number'), '400054125')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_NumberAccount_Number'), '5000049447')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Icon_Search'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Success_Account_Added')),
	'Exito')

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Alerts/alert_Input_Sucess_Account_II')),
	'Cuenta engie agregada')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Icon_Remove'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number')), 
    '')

WebUI.verifyEqual(WebUI.getText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_NumberAccount_Number')), 
    '')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number'), '400054125')

WebUI.setText(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_NumberAccount_Number'), '5000049447')

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Icon_Search'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_Icon_Add'))

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number'), 'value'),WebUI.getAttribute(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_interlocutor_II'), 'value'))

WebUI.sendKeys(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_interlocutor_II'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_Insert_Interlocutor_Number'), 'value'),WebUI.getAttribute(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Inputs/input_interlocutor_II'), 'value'))

WebUI.closeBrowser()

