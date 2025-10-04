class Geld extends Orc{
	
	public Geld(){
		
		super();
		System.out.println("No argumental Constructor in child or sub class.");
		
	}
	public Geld(String name){
		
		this();
		System.out.println("one argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		
	}
	public Geld(String name,int id){
		
		this("Geld");
		System.out.println("Two argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Geld(String name,int id,long phoneNumber){
		
		this("Geld",2);
		System.out.println("Three argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Geld(String name,int id,long phoneNumber,double percentage){
		
		this("Geld",2,123456789L);
		System.out.println("Four argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Geld(String name,int id,long phoneNumber,double percentage,float passRate){
		
		this("Geld",2,123456789L,22.22);
		System.out.println("Five argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Geld(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		this("Geld",2,123456789L,22.22,22.22f);
		System.out.println("Six argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Geld(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
		this("Geld",2,123456789L,22.22,22.22f,'b');
		System.out.println("Seven argumental Constructor in child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		System.out.println("Is graduate = "+isGraduate);
		
	}
	
}