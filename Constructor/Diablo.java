class Diablo{
	
	public Diablo(){
		
		this("Diablo");
		System.out.println("No argumental constructor.");
		
	}
	public Diablo(String name){
		
		this("Diablo",2);
		System.out.println("one argumental constructor.");
		System.out.println("Name = "+name);
		
	}
	public Diablo(String name,int id){
		
		this("Diablo",2,987654321L);
		System.out.println("Two argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Diablo(String name,int id,long phoneNumber){
		
		this("Diablo",2,987654321L,98.98);
		System.out.println("Three argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Diablo(String name,int id,long phoneNumber,double percentage){
		
		this("Diablo",2,987654321L,98.98,98.98f);
		System.out.println("Four argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Diablo(String name,int id,long phoneNumber,double percentage,float passRate){
		
		this("Diablo",2,987654321L,98.98,98.98f,'a');
		System.out.println("Five argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Diablo(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		this("Diablo",2,987654321L,98.98,98.98f,'a',true);
		System.out.println("Six argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Diablo(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
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