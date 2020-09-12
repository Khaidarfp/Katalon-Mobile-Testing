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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('FoodyApp/HomePage/Btn_Profile'), 0)

Mobile.tap(findTestObject('FoodyApp/TabProfile/Btn_Login'), 0)

Mobile.tap(findTestObject('FoodyApp/TabProfile/Login/Btn_LoginWithFB'), 0)

Mobile.setText(findTestObject('FoodyApp/TabProfile/Login/LoginWithFB/Txt_EmailFB'), GlobalVariable.Email, 0)

Mobile.setEncryptedText(findTestObject('FoodyApp/TabProfile/Login/LoginWithFB/Txt_PasswordFB'), 'tgRiCg92igqvM6iUyz1NiA==', 
    0)

Mobile.tap(findTestObject('FoodyApp/TabProfile/Login/LoginWithFB/Btn_LoginFB'), 0)

Mobile.tap(findTestObject('FoodyApp/TabProfile/Login/LoginWithFB/Btn_ContinueAs'), 0)

