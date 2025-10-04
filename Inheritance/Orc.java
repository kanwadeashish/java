class Orc{
	
	public Orc(){
		
		this("Orc");
		System.out.println("No argumental Constructor in Parent or super class.");
		
	}
	public Orc(String name){
		
		this("Orc",1);
		System.out.println("one argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		
	}
	public Orc(String name,int id){
		
		this("Orc",1,987654321L);
		System.out.println("Two argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Orc(String name,int id,long phoneNumber){
		
		this("Orc",1,987654321L,11.11);
		System.out.println("Three argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Orc(String name,int id,long phoneNumber,double percentage){
		
		this("Orc",1,987654321L,11.11,11.11f);
		System.out.println("Four argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Orc(String name,int id,long phoneNumber,double percentage,float passRate){
		
		this("Orc",1,987654321L,11.11,11.11f,'a');
		System.out.println("Five argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Orc(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		this("Orc",1,987654321L,11.11,11.11f,'a',true);
		System.out.println("Six argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Orc(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
		System.out.println("Seven argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		System.out.println("Is graduate = "+isGraduate);
		
	}
	
}