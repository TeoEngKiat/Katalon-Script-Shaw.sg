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
import com.kms.katalon.core.testobject.ConditionType

String available_seat = "https://nonprodngsstorageshawsg.blob.core.windows.net/uat/content/images/layout/default/en-sg/seat-curr-avail.png"
String unavailable_seat = "https://nonprodngsstorageshawsg.blob.core.windows.net/uat/content/images/layout/default/en-sg/seat-curr-unavail.png"
String selected_seat = "https://nonprodngsstorageshawsg.blob.core.windows.net/uat/content/images/layout/default/en-sg/seat-curr-select.png"
String onHold_seat = "https://nonprodngsstorageshawsg.blob.core.windows.net/uat/content/images/layout/default/en-sg/seat-curr-hold.png"
String handicap_seat = "https://nonprodngsstorageshawsg.blob.core.windows.net/uat/content/images/layout/default/en-sg/seat-curr-wheelchair-avail.png"


hall = WebUI.getText(findTestObject('Flores - Test Objects/Page_Cart/p_Shaw Theatres Lido Hall 3'))

String[] parts = hall.split(' ')
String hall_no = parts[-1]
String seat_no = '0001'


//if seat selected is unavailable, click next seat
while (true) {
	
	//create test object for seat_no
	String seat_xpath = """//*[@id="LIDO${hall_no}_SD_EL${seat_no}_shape"]"""
	TestObject seat = new TestObject()
	seat.addProperty("xpath", ConditionType.EQUALS, seat_xpath)
	
	//gets the seat type
	String seat_type = WebUI.getAttribute(seat, 'xlink:href')
	
	
	if (seat_type == available_seat) {
		WebUI.click(seat)
		break

	}
	
	else {
		seat_no = String.format("%0" + seat_no.length() + "d", Long.parseLong(seat_no) + 1)
		
	}
}


WebUI.scrollToElement(findTestObject('Flores - Test Objects/Page_Cart/a_CONFIRM SEAT(S)'), 0)

WebUI.click(findTestObject('Flores - Test Objects/Page_Cart/a_CONFIRM SEAT(S)'))

WebUI.click(findTestObject('Flores - Test Objects/Page_Cart/a_Agree'))

