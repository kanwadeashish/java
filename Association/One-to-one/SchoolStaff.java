class SchoolStaff{
	
	public String staffName;
	public int numberOfStaff;
	
	public SchoolStaff(String staffName,int numberOfStaff){
		
		this.staffName=staffName;
		this.numberOfStaff=numberOfStaff;
		
	}
	
	public void staffInfo(){
		
		System.out.println("This is in the SchoolStaff.");
		System.out.println("Staff name = "+staffName);
		System.out.println("Number of Staff = "+numberOfStaff);
		
	}
	
}