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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Assign Leave'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__assignleavetxtEmployeeempName'), 'ja')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Jadine Jackie'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_--Select--CAN - BereavementCAN - FML_ae6862'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_view details'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Balance_closeButton'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img__ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_Full DayHalf DaySpecify Time'), 'half_day', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_MorningAfternoon'), 'PM', true)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/textarea_Comment_assignleavetxtComment'), 'no comment')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__assignBtn'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM - Confirm Leave Assignment__93908b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Successfully Assigned       Close'))

WebUI.closeBrowser()

