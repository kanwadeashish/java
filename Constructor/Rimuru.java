class Rimuru{
	
	public Rimuru(){
		
		this("Rimuru");
		System.out.println("No argumental constructor.");
		
	}
	public Rimuru(String name){
		
		this("Rimuru",1);
		System.out.println("one argumental constructor.");
		System.out.println("Name = "+name);
		
	}
	public Rimuru(String name,int id){
		
		this("Rimuru",1,123456789L);
		System.out.println("Two argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Rimuru(String name,int id,long phoneNumber){
		
		this("Rimuru",1,123456789L,99.99);
		System.out.println("Three argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Rimuru(String name,int id,long phoneNumber,double percentage){
		
		this("Rimuru",1,123456789L,99.99,99.99f);
		System.out.println("Four argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Rimuru(String name,int id,long phoneNumber,double percentage,float passRate){
		
		this("Rimuru",1,123456789L,99.99,99.99f,'s');
		System.out.println("Five argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Rimuru(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		this("Rimuru",1,123456789L,99.99,99.99f,'s',true);
		System.out.println("Six argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Rimuru(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
		System.out.println("Seven argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		System.out.println("Is graduate = "+isGraduate);
		
	}
	
}