class Oggy{
	
	public Oggy(){
		this("Oggy");
		System.out.println("This is no argumental constructor.");
	}
	
	public Oggy(String name){
		this("Oggy",4);
		System.out.println("This is 1 argumental constructor.");
		System.out.println("This is argumental constructor where name = "+name);
	}
	
	public Oggy(String name,int id){
		this("Oggy",4,123456789L);
		System.out.println("This is 2 argumental constructor.");
		System.out.println("This is argumental constructor where id = "+id);
	}
	
	public Oggy(String name,int id,long phoneNumber){
		this("Oggy",4,123456789L,99.99);
		System.out.println("This is 3 argumental constructor.");
		System.out.println("This is argumental constructor where phoneNumber = "+phoneNumber);
	}
	
	public Oggy(String name,int id,long phoneNumber,double percentage){
		this("Oggy",4,123456789L,99.99,98.98f);
		System.out.println("This is 4 argumental constructor.");
		System.out.println("This is argumental constructor where percentage = "+percentage);
	}
	
	public Oggy(String name,int id,long phoneNumber,double percentage,float result){
		this("Oggy",4,123456789L,99.99,98.98f,true);
		System.out.println("This is 5 argumental constructor.");
		System.out.println("This is argumental constructor where result = "+result);
	}
	
	public Oggy(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed){
		this("Oggy",4,123456789L,99.99,98.98f,true,'a');
		System.out.println("This is 6 argumental constructor.");
		System.out.println("This is argumental constructor where isPassed = "+isPassed);
	}
	
	public Oggy(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed,char rating){
		System.out.println("This is 7 argumental constructor.");
		System.out.println("This is argumental constructor where rating = "+rating);
	}
	
}