class Ranga extends Tensura{
	
	public Ranga(){
		
		super();
		System.out.println("No argumental Constructor in Child or sub class.");
		
	}
	public Ranga(String name){
		
		super("Tensura");
		System.out.println("one argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		
	}
	public Ranga(String name,int id){
		
		super("Tensura",9);
		System.out.println("Two argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		
	}
	public Ranga(String name,int id,long phoneNumber){
		
		super("Tensura",9,999999999L);
		System.out.println("Three argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		
	}
	public Ranga(String name,int id,long phoneNumber,double percentage){
		
		super("Tensura",9,999999999L,99.99);
		System.out.println("Four argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		
	}
	public Ranga(String name,int id,long phoneNumber,double percentage,float passRate){
		
		super("Tensura",9,999999999L,99.99,99.99f);
		System.out.println("Five argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		
	}
	public Ranga(String name,int id,long phoneNumber,double percentage,float passRate,char rating){
		
		super("Tensura",9,999999999L,99.99,99.99f,'s');
		System.out.println("Six argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		
	}
	public Ranga(String name,int id,long phoneNumber,double percentage,float passRate,char rating,boolean isGraduate){
		
		super("Tensura",9,999999999L,99.99,99.99f,'s',true);
		System.out.println("Seven argumental Constructor in Child or sub class.");
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Percentage = "+percentage);
		System.out.println("Pasing Rate = "+passRate);
		System.out.println("Education Rating = "+rating);
		System.out.println("Is graduate = "+isGraduate);
		
	}
	
	public void displayName(String name){
		
		System.out.println("Overriden Value");
		System.out.println("Name = "+name);
		
	}
	public void displayId(int id){
		
		System.out.println("Overriden Value");
		System.out.println("Id = "+id);
		
	}
	public void displayPhoneNumber(long phoneNumber){
		
		System.out.println("Overriden Value");
		System.out.println("Phone Number = "+phoneNumber);
		
	}
	public void displayPercentage(double percentage){
		
		System.out.println("Overriden Value");
		System.out.println("Percentage = "+percentage);
		
	}
	public void displayPassRate(float passRate){
		
		System.out.println("Overriden Value");
		System.out.println("Pass Rate = "+passRate);
		
	}
	public void displayRating(char rating){
		
		System.out.println("Overriden Value");
		System.out.println("Rating = "+rating);
		
	}
	public void displayIsGraduate(boolean isGraduate){
		
		System.out.println("Overriden Value");
		System.out.println("Is Graduate = "+isGraduate);
		
	}
	
}