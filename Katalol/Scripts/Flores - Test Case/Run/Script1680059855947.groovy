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

import com.kms.katalon.core.testobject.TestObject


WebUI.callTestCase(findTestCase('Flores - Test Case/Open Shaw Sg'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Flores - Test Case/First Movie First Showtime'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Flores - Test Case/Select Seat'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Flores - Test Case/Check Cart And Pay'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Flores - Test Case/End Case'), null, FailureHandling.STOP_ON_FAILURE)

