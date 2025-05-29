package TestNG;

import org.openqa.selenium.By;

public class Pageobject {
	//WebDriver driver;

	// Sheet 1- Apply Reim
	By Advanced = By.xpath("//a[@id='details-button']");
	By Proceed = By.xpath("//a[@id='proceed-link']");

	By Reimbursement = By.xpath("//a[text()='Reimbursement']");
	By Apply_Reimbursement = By.xpath("//a[text()='Apply Reimbursement']");
	By Reimbursement_Status = By.xpath("//select[@id='ddlReimbStatus']");
	By Office_Location = By.xpath("//select[@id='ddlLocation']");
	By Project = By.xpath("//select[@id='1_Project']");
	By Manager = By.xpath("//select[@id='1_Manager']");
	By Requested_date = By.xpath("//input[@id='1_Requested_Date']");
	
	By Requested_date1 = By.xpath("//span[text()='Prev']");
	//By Requested_date2=By.xpath("//a[text()='" + day + "']");
	
	
	//By Requested_date2 = By.xpath("//a[text()='3']");
	
	By Reim_Type = By.xpath("//select[@id='1_Reim_Type']");
	By Receipt_Id = By.xpath("//input[@id='1_ReceiptId']");
	By Receipt_Date = By.xpath("//input[@id='1_ReceiptDate']");
	By Receipt_Date1 = By.xpath("//span[text()='Prev']");
	By Receipt_Date2 = By.xpath("//a[text()='2']");
	By Time_In = By.xpath("//*[@id='1_TimeIn']");
	By Time_In1 = By.xpath("/html/body/div[8]/ul/li[1]/a");
	By Time_out = By.xpath("//input[@id='1_Timeout']");
	By Time_out1 = By.xpath("/html/body/div[8]/ul/li[2]/a");
	By Conveyance_Details = By.xpath("//select[@id='1_conveyance_Details']");
	By Conveyance_Details1 = By.xpath("//option[text()='Office-Home']");
	By Conveyance_Details2 = By.xpath("//input[@id='1_Amount']");
	By Amount = By.xpath("//input[@id='1_Amount']");
	By Comments = By.xpath("//textarea[@id='1_Emp_Comments']");
	By Save_and_Submit = By.xpath("//input[@id='btnSubmit']");
	By Ok_button = By.xpath("//button[text()='Ok']");
	
	By Mon_loc = By.xpath("//span[@class='ui-datepicker-month']");
	By year_loc =By.xpath("//span[@class='ui-datepicker-year']");
	By no_records= By.xpath("//b[text()='No records to view']");

	
	public String Requested_date(String day) {
		return "//a[text()='"+day+"']";	 
	}
	
	

	
	//
//	public By Receipt_Date2(int day) {
//		By Receipt_Date2 = By.xpath("//a[text()='" + day + "']");
//		return Receipt_Date2;
//	}
//	

	
	// Sheet 2- Apply Broad Reim
	
	
	//By Reimbursement =  By.xpath("//a[text()='Reimbursement']");
	By Apply_Broadband_Reimbursement=  By.xpath("//a[text()='Apply Broadband Reimbursement']");
	//By Office_Location=  By.xpath("//*[@id="ddlLocation"]");
	//By Project=  By.xpath("//*[@id="1_Project"]");
	//By Manager=  By.xpath("//*[@id="1_Manager"]");
	By Bill_Month=  By.xpath("//select[@id='1_BillMonth']/option[@value='09-2022']");
	By Bill_From_Date=  By.xpath("//*[@id='1_BillFromDate']");
	By Bill_From_Date1=  By.xpath("//span[text()='Prev']");
	By Bill_From_Date2=  By.xpath("//a[text()='2']");
	By Bill_End_Date=  By.xpath("//*[@id='1_BillEndDate']");
	By Bill_End_Date1=  By.xpath("//span[text()='Prev']");
	By Bill_End_Date2=  By.xpath("//a[text()='3']");
	By Bill_ID=  By.xpath("//input[@id='1_BillNumber']");
	By Bill_Date=  By.xpath("//*[@id='1_BillDate']");
	By Bill_Date1=  By.xpath("//span[text()='Prev']");
	By Bill_Date2=  By.xpath("//a[text()='1']");
	//By Amount=  By.xpath("//input[@id='1_Amount']");
	By FileUpload=  By.xpath("//input[@id='1_FileUpload']");
	//By Comments=  By.xpath("//textarea[@id='1_Emp_Comments']");
	By Submit=  By.xpath("//input[@id='btnSubmit']");
	//By Ok_button=  By.xpath("//button[text()='Ok']");

	
	

	//Sheet-3 -Approve 
	
	By Actions  = By.xpath("//a[@id='hlnActions']");
	By Manager_Approval = By.xpath("//a[text()='Manager Approval']");
	By Get_Details  = By.xpath("//input[@id='btnGetDetails']");
	By Approve = By.xpath("(//a[@title='Approve'])[1]//img");
	By Continue = By.xpath("//button[text()='Continue']");
	By Approved = By.xpath("//select[@id='ddlStatus']");
	//By Get_Details  = By.xpath("//input[@id='btnGetDetails']");
	By Rejected = By.xpath("//select[@id='ddlStatus']");
	//By Get_Details  = By.xpath("//input[@id='btnGetDetails']");
	
	
	//Sheet 4 -Approve broadband
	
	//By Actions = By.xpath("//a[@id='hlnActions']");
	//By Manager_Approval= By.xpath("//a[text()='Manager Broadband Approval']");
	//By Get_Details = By.xpath("//input[@id='btnGetDetails']");
	//By Approve= By.xpath("(//a[@title='Approve'])[1]//img");
	//By Approved= By.xpath("//select[@id='ddlStatus']");
	//By Get_Details = By.xpath("//input[@id='btnGetDetails']");
	//By Rejected= By.xpath("//select[@id='ddlStatus']");
	//By Get_Details = By.xpath("//input[@id='btnGetDetails']");
	
	
}
