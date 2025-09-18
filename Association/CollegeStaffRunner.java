class CollegeStaffRunner{
	
	public static void main(String[]args){
		
		CollegeStaff staff = new CollegeStaff("Vijay",2);
		
		CollegeClass collegeClass=new CollegeClass(2,"Earth",staff);
		
		staff.staffInfo();
		collegeClass.displayInfo();
		
	}
	
}