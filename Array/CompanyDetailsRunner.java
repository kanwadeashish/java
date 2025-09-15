class CompanyDetailsRunner{
	
	public static void main(String [] args){
		
		CompanyInfo info = new CompanyInfo();
		
		EmployeeDetails detailsOne = new EmployeeDetails(1,"Ajay");
		EmployeeDetails detailsTwo = new EmployeeDetails(2,"Ajit");
		EmployeeDetails detailsThree = new EmployeeDetails(3,"Sujay");
		EmployeeDetails detailsFour = new EmployeeDetails(4,"Sajay");
		EmployeeDetails detailsFive = new EmployeeDetails(5,"Vijay");
		
		EmployeeDetails [] details = {detailsOne,detailsTwo,detailsThree,detailsFour,detailsFive};
		
		info.companyDetails(details);
		
	}
	
}