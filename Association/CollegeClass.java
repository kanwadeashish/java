class CollegeClass{
	
	public int classNumber;
	public String className;
	public CollegeStaff collegeStaff;
	
	public CollegeClass(int classNumber,String className,CollegeStaff collegeStaff){
		
		this.classNumber=classNumber;
		this.className=className;
		this.collegeStaff=collegeStaff;
		
	}
	
	public void displayInfo(){
		
		System.out.println("This is in the CollegeClass.");
		System.out.println("Class Number = "+classNumber);
		System.out.println("Class Name = "+className);
		System.out.println("Staff Name = "+collegeStaff.staffName);
		System.out.println("Number of Staff = "+collegeStaff.numberOfStaff);
		
	}
	
}