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

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Buttons/button_REGISTRARSE'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Checks/check_Engie'))

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Icons/icon_Help_Outline_Interlocutor'))

WebUI.verifyElementPresent(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Images/image_Help_Interlocutor'), 0)

WebUI.click(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Icons/icon_Help_Outline_Interlocutor'))

WebUI.verifyElementPresent(findTestObject('Var_registro_UTA/Page_TutenServi2Web/Images/image_Help_NumberAccount'), 0)

WebUI.closeBrowser()

