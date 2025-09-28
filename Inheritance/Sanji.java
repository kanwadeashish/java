class Sanji extends Nami{
	
	public Sanji(){
		
		super();
		System.out.println("This is a non argumental constructor from SubClss.");
		
	}
	public Sanji(int id){
		
		super(1);
		System.out.println("This is a argumental constructor with one argument from SubClss.");
		System.out.println("Id = "+id);
		
	}
	public Sanji(int id,String name){
		
		super(1,"Nami");
		System.out.println("This is a argumental constructor with two argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		
	}
	public Sanji(int id,String name,long phoneNumber){
		
		super(1,"Nami",123456789L);
		System.out.println("This is a argumental constructor with three argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		System.out.println("Phone Number = "+phoneNumber);	
		
	}
	public Sanji(int id,String name,long phoneNumber,double result){
		
		super(1,"Nami",123456789L,99.99);
		System.out.println("This is a argumental constructor with four argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		
	}
	public Sanji(int id,String name,long phoneNumber,double result,float percentage){
		
		super(1,"Nami",123456789L,99.99,98.98f);
		System.out.println("This is a argumental constructor with five argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		
	}
	public Sanji(int id,String name,long phoneNumber,double result,float percentage,char rating){
		
		super(1,"Nami",123456789L,99.99,98.98f,'a');
		System.out.println("This is a argumental constructor with six argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		System.out.println("Rating = "+rating);
		
	}
	public Sanji(int id,String name,long phoneNumber,double result,float percentage,char rating,boolean isPassed){
		
		super(1,"Nami",123456789L,99.99,98.98f,'a',true);
		System.out.println("This is a argumental constructor with Seven argument from SubClss.");
		System.out.println("Id = "+id);	
		System.out.println("Name = "+name);	
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		System.out.println("Is passed = "+isPassed);
		
	}
	
}