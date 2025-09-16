class CompanyInfoOne{
	
	public void companyDetails(EmployeeDetailsOne [] employeeDetails){
		
		//This is normal for loop.
		//for(int num = 0;num<employeeDetails.length; num++){
		//	EmployeeDetailsOne display = employeeDetails[num];
		//	display.employeeInfo();
		//}
		
		//This is for loop written with different approche.
		for(EmployeeDetailsOne display : employeeDetails){
			
			display.employeeInfo();
			
		}
		
	}
	
}