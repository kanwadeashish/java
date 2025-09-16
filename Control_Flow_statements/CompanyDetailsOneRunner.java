class CompanyDetailsOneRunner{
	
	public static void main(String [] args){
		
		CompanyInfoOne info = new CompanyInfoOne();
		
		EmployeeDetailsOne detailsOne = new EmployeeDetailsOne(1,"Ajay");
		EmployeeDetailsOne detailsTwo = new EmployeeDetailsOne(2,"Ajit");
		EmployeeDetailsOne detailsThree = new EmployeeDetailsOne(3,"Sujay");
		EmployeeDetailsOne detailsFour = new EmployeeDetailsOne(4,"Sajay");
		EmployeeDetailsOne detailsFive = new EmployeeDetailsOne(5,"Vijay");
		
		EmployeeDetailsOne [] details = {detailsOne,detailsTwo,detailsThree,detailsFour,detailsFive};
		
		info.companyDetails(details);
		
	}
	
}