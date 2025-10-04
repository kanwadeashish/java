class Shion{
	
	public Shion(){
		
		this("Shion");
		System.out.println("No argumental constructor.");
		
	}
	public Shion(String name){
		
		this("Shion",3);
		System.out.println("one argumental constructor.");
		System.out.println("Name = "+name);
		
	}
	public Shion(String name,int id){
		
		this("Shion",3,543219876L);
		System.out.println("Two argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Shion(String name,int id,long phoneNumber){
		
		this("Shion",3,543219876L,97.97);
		System.out.println("Three argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Shion(String name,int id,long phoneNumber,double percentage){
		
		this("Shion",3,543219876L,97.97,97.97f);
		System.out.println("Four argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Shion(String name,int id,long phoneNumber,double percentage,float passRate){
		
		this("Shion",3,543219876L,97.97,97.97f,'a');
		System.out.println("Five argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Shion(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		this("Shion",3,543219876L,97.97,97.97f,'a',true);
		System.out.println("Six argumental constructor.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Shion(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
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