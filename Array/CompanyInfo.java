class CompanyInfo{
	
	public void companyDetails(EmployeeDetails [] employeeDetails){
		
		for(int num = 0;num<employeeDetails.length; num++){
			
			EmployeeDetails display = employeeDetails[num];
			
			display.employeeInfo();
			
		}
		
	}
	
}