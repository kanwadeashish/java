class Sakura extends Sasuke{
	
	public void displayDetails(){
		
		super.displayDetails();
		System.out.println("This is no argumental method in sub class.");
		
	}
	public void displayDetails(int id){
		
		super.displayDetails(2);
		System.out.println("This is one argumental method in sub class.");
		System.out.println("Id = "+id);
		
	}
	public void displayDetails(int id,String name){
		
		super.displayDetails(2,"Super Class");
		System.out.println("This is two argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		
	}
	public void displayDetails(int id,String name,long phoneNumber){
		
		super.displayDetails(2,"Super Class",987654321L);
		System.out.println("This is three argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Phone Number = "+phoneNumber);
		
	}
	public void displayDetails(int id,String name,long phoneNumber,double result){
		
		super.displayDetails(2,"Super Class",987654321L,11.11);
		System.out.println("This is four argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		
	}
	public void displayDetails(int id,String name,long phoneNumber,double result,float percentage){
		
		super.displayDetails(2,"Super Class",987654321L,11.11,22.22f);
		System.out.println("This is five argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		
	}
	public void displayDetails(int id,String name,long phoneNumber,double result,float percentage,char rating){
		
		super.displayDetails(2,"Super Class",987654321L,11.11,22.22f,'f');
		System.out.println("This is six argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		System.out.println("Rating = "+rating);
		
	}
	public void displayDetails(int id,String name,long phoneNumber,double result,float percentage,char rating,boolean isPassed){
		
		super.displayDetails(2,"Super Class",987654321L,11.11,22.22f,'f',false);
		System.out.println("This is seven argumental method in sub class.");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Result = "+result);
		System.out.println("Percentage = "+percentage);
		System.out.println("Rating = "+rating);
		System.out.println("Is passed = "+isPassed);
		
	}
	
}