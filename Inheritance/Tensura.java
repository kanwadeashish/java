class Tensura{
	
	public Tensura(){
		
		System.out.println("No argumental Constructor in Parent or super class.");
		
	}
	public Tensura(String name){
		
		System.out.println("one argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		
	}
	public Tensura(String name,int id){
		
		System.out.println("Two argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Tensura(String name,int id,long phoneNumber){
		
		System.out.println("Three argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Tensura(String name,int id,long phoneNumber,double percentage){
		
		System.out.println("Four argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Tensura(String name,int id,long phoneNumber,double percentage,float passRate){
		
		System.out.println("Five argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Tensura(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		System.out.println("Six argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Tensura(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
		System.out.println("Seven argumental Constructor in Parent or super class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		System.out.println("Is graduate = "+isGraduate);
		
	}
	
	public void displayName(String name){
		
		System.out.println("Name = "+name);
		
	}
	public void displayId(int id){
		
		System.out.println("Id = "+id);
		
	}
	public void displayPhoneNumber(long phoneNumber){
		
		System.out.println("Phone Number = "+phoneNumber);
		
	}
	public void displayPercentage(double percentage){
		
		System.out.println("Percentage = "+percentage);
		
	}
	public void displayPassRate(float passRate){
		
		System.out.println("Pass Rate = "+passRate);
		
	}
	public void displayRating(char rating){
		
		System.out.println("Rating = "+rating);
		
	}
	public void displayIsGraduate(boolean isGraduate){
		
		System.out.println("Is Graduate = "+isGraduate);
		
	}
	
}