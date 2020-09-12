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

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Review'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_OptionNo'), 10, FailureHandling.OPTIONAL)

Mobile.clearText(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.EditText - Title (optional)'), 10, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.EditText - Title (optional)'), GlobalVariable.ReviewTitle, 
    0)

Mobile.setText(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.EditText - Please review more than 100 words do not spam to get reward points'), 
    GlobalVariable.ReviewExplain, 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Post'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Rate'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_No.Person'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Option_8'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Expense'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Option_500000 '), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Comeback'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Option_Sure'), 0)

Mobile.setSliderValue(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.SeekBar - 50.0'), 80, 0)

Mobile.setSliderValue(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.SeekBar - 50.0 (1)'), 80, 0)

Mobile.setSliderValue(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.SeekBar - 50.0 (2)'), 80, 0)

Mobile.setSliderValue(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.SeekBar - 50.0 (3)'), 80, 0)

Mobile.setSliderValue(findTestObject('FoodyApp/Tab Home/Search/Review/android.widget.SeekBar - 50.0 (4)'), 80, 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Done'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_Post'), 0)

Mobile.tap(findTestObject('FoodyApp/Tab Home/Search/Review/Btn_CLOSE'), 0)

Mobile.verifyElementText(findTestObject('FoodyApp/Tab Home/Search/Review/Ttl_Rasanya'), GlobalVariable.ReviewTitle)

Mobile.verifyElementText(findTestObject('FoodyApp/Tab Home/Search/Review/Ttl_Mantab'), GlobalVariable.ReviewExplain)

