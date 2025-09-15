class EmployeeDetails{
	
	public int employeeId ;
	public String employeeName ;
	
	public EmployeeDetails(int employeeId,String employeeName){
		
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
	}
	
	public void employeeInfo(){
		
		System.out.println("Employee Id = "+employeeId+" Employee Name = "+employeeName);
		
	}
	
}