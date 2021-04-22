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

WebUI.navigateToUrl('https://www.grocerycrud.com/demo/offices_management')

WebUI.click(findTestObject('OfficeList/Button_AddOffice'))

WebUI.setText(findTestObject('AddOffice/input__city'), 'bekasi')

WebUI.setText(findTestObject('AddOffice/input_Phone'), '12345')

WebUI.setText(findTestObject('AddOffice/input_AddressLine1'), 'bekasii')

WebUI.setText(findTestObject('AddOffice/input_AddressLine2'), 'bekasi')

WebUI.setText(findTestObject('AddOffice/input_State'), 'indonesia')

WebUI.setText(findTestObject('AddOffice/input_Country'), 'indonesia')

WebUI.setText(findTestObject('AddOffice/input_PostalCode'), '332e')

WebUI.setText(findTestObject('AddOffice/input_Territory'), 'tambun')

WebUI.click(findTestObject('AddOffice/Button_SaveAndBackToList'))

WebUI.setText(findTestObject('OfficeList/input_SearchCity'), 'bekasi')

WebUI.click(findTestObject('OfficeList/Button_Clone'))

WebUI.setText(findTestObject('AddOffice/input__city'), 'bekasi')

WebUI.setText(findTestObject('AddOffice/input_Phone'), '12345')

WebUI.setText(findTestObject('AddOffice/input_AddressLine1'), 'bekasii')

WebUI.setText(findTestObject('AddOffice/input_AddressLine2'), 'bekasi')

WebUI.setText(findTestObject('AddOffice/input_State'), 'indonesia')

WebUI.setText(findTestObject('AddOffice/input_Country'), 'indonesia')

WebUI.setText(findTestObject('AddOffice/input_PostalCode'), '332e')

WebUI.setText(findTestObject('AddOffice/input_Territory'), 'tambun')

WebUI.click(findTestObject('AddOffice/Button_SaveAndBackToList'))

WebUI.setText(findTestObject('OfficeList/input_SearchCity'), 'bekasi')

WebUI.click(findTestObject('OfficeList/Button_View'))

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_City')), 'bekasi')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_Phone')), '12345')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_AddressLine1')), 'bekasii')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_AddressLine2')), 'bekasi')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_State')), 'indonesia')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_Country')), 'indonesia')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_PostalCode')), '332e')

WS.verifyEqual(WebUI.getText(findTestObject('ViewOffice/Object_Territory')), 'tambun')

WebUI.click(findTestObject('ViewOffice/Button_BackToList'))

WebUI.setText(findTestObject('OfficeList/input_SearchCity'), 'bekasi')

WebUI.click(findTestObject('OfficeList/Button_Delete'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('OfficeList/input_SearchCity'), 'bekasi')

WebUI.click(findTestObject('OfficeList/Button_Delete'))

WebUI.acceptAlert()

WebUI.closeBrowser()

