class Peter extends DoctorPeter{
	
	public int salary;
	public String doctorName;
	public long phoneNumber;
	public double curedPercentage;
	public float tax;
	public char rating;
	public boolean isCured;
	
	public Peter(){
		
		super();
		System.out.println("This is no argumental constructor in Peter class.");
		
	}
	public Peter(int salary,String doctorName,long phoneNumber,double curedPercentage,float tax,char rating,boolean isCured){
		
		super.salary=salary;
		super.doctorName=doctorName;
		super.phoneNumber=phoneNumber;
		super.curedPercentage=curedPercentage;
		super.tax=tax;
		super.rating=rating;
		super.isCured=isCured;
		
		this.salary=salary;
		this.doctorName=doctorName;
		this.phoneNumber=phoneNumber;
		this.curedPercentage=curedPercentage;
		this.tax=tax;
		this.rating=rating;
		this.isCured=isCured;
		
	}
	
	public void displayInfo(){
		
		System.out.println("DoctorPeter class salary = "+super.salary);
		System.out.println("DoctorPeter class doctorName = "+super.doctorName);
		System.out.println("DoctorPeter class phoneNumber = "+super.phoneNumber);
		System.out.println("DoctorPeter class curedPercentage = "+super.curedPercentage);
		System.out.println("DoctorPeter class tax = "+super.tax);
		System.out.println("DoctorPeter class rating = "+super.rating);
		System.out.println("DoctorPeter class isCured = "+super.isCured);
		
		System.out.println("Peter class salary = "+this.salary);
		System.out.println("Peter class doctorName = "+this.doctorName);
		System.out.println("Peter class phoneNumber = "+this.phoneNumber);
		System.out.println("Peter class curedPercentage = "+this.curedPercentage);
		System.out.println("Peter class tax = "+this.tax);
		System.out.println("Peter class rating = "+this.rating);
		System.out.println("Peter class isCured = "+this.isCured);
		
	}
	
}