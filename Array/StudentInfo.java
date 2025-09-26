class StudentInfo{
	
	public String studentName;
	public int id;
	public long phoneNumber;
	public double result;
	public char rating;
	
	public StudentInfo(String studentName,int id,long phoneNumber,double result,char rating){
		
		this.studentName=studentName;
		this.id=id;
		this.phoneNumber=phoneNumber;
		this.result=result;
		this.rating=rating;
		
	}
	
	public void displayStudentInfo(){
		
		System.out.println("The name of the student is = "+studentName);
		System.out.println("The id of the student is = "+id);
		System.out.println("The phone Number of the student is = "+phoneNumber);
		System.out.println("The result of the student is = "+result);
		System.out.println("The rating of the student is = "+rating);
		
	}
	
}