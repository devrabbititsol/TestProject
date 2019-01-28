package web.testproject1.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class TestScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"TestProject1\",\"project_description\":\"\",\"project_id\":206,\"module_name\":\"DevrabbitTest\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":349,\"testcase_name\":\"TC_HomePage\",\"testcase_id\":414,\"testset_id\":0,\"executed_timestamp\":-1829630268,\"browser_type\":\"chrome\"}";

	public static String projectName = "testproject1";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public TestScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_292647A;
	public String clkAContact_292647() {
		waitForExpectedElement(driver, Contact_292647A);		
		String text = Contact_292647A.getText();
		Contact_292647A.click();
		return text;
	}

}