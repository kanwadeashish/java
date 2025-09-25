class Amir extends Person{
	
	public int idNumber;
	public String personName;
	public long phoneNumber;
	public double percentageHSC;
	public float percentageSSC;
	public char rating;
	public boolean isGraduate;
	
	public Amir(){
		
		super();
		System.out.println("This is no argumental constructor in Amir class.");
		
	}
	public Amir(int idNumber,String personName,long phoneNumber,double percentageHSC,float percentageSSC,char rating,boolean isGraduate){
		
		this();
		
		super.idNumber=idNumber;
		super.personName=personName;
		super.phoneNumber=phoneNumber;
		super.percentageHSC=percentageHSC;
		super.percentageSSC=percentageSSC;
		super.rating=rating;
		super.isGraduate=isGraduate;
		
		this.idNumber=idNumber;
		this.personName=personName;
		this.phoneNumber=phoneNumber;
		this.percentageHSC=percentageHSC;
		this.percentageSSC=percentageSSC;
		this.rating=rating;
		this.isGraduate=isGraduate;
		
	}
	
	public void displayInfo(){
		
		System.out.println("Person class id Number = "+super.idNumber);
		System.out.println("Person class person Name = "+super.personName);
		System.out.println("Person class phone Number = "+super.phoneNumber);
		System.out.println("Person class percentage HSC = "+super.percentageHSC);
		System.out.println("Person class percentage SSC = "+super.percentageSSC);
		System.out.println("Person class rating = "+super.rating);
		System.out.println("Person class is Graduate = "+super.isGraduate);
		
		System.out.println("Amir class id Number = "+this.idNumber);
		System.out.println("Amir class person Name = "+this.personName);
		System.out.println("Amir class phone Number = "+this.phoneNumber);
		System.out.println("Amir class percentage HSC = "+this.percentageHSC);
		System.out.println("Amir class percentage SSC = "+this.percentageSSC);
		System.out.println("Amir class rating = "+this.rating);
		System.out.println("Amir class is Graduate = "+this.isGraduate);
		
	}
	
}