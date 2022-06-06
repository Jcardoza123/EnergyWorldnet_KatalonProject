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

WebUI.navigateToUrl('https://trytestingthis.netlify.app/')

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Username_uname'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Password_pwd'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/input'))

WebUI.click(findTestObject('Object Repository/Page_Login Success/a_Home'))

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_First name_fname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Last name_lname'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/label_Female'))

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/fieldset_This is your form title           _ab06a4'))

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/fieldset_This is your form title           _ab06a4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Try Testing This/select_Option                  Option 1    _1847e3'), 
    'option 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Try Testing This/select_Choose multiple options             _cdf8f3'), 
    'option 2', true)

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/label_Option 2'))

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/button_Submit'))

WebUI.closeBrowser()

