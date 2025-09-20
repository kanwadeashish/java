class CollegeStaff{
	
	public String staffName;
	public int numberOfStaff;
	
	public CollegeStaff(String staffName,int numberOfStaff){
		
		this.staffName=staffName;
		this.numberOfStaff=numberOfStaff;
		
	}
	
	public void staffInfo(){
		
		System.out.println("This is in the CollegeStaff.");
		System.out.println("Staff name = "+staffName);
		System.out.println("Number of Staff = "+numberOfStaff);
		
	}
	
}