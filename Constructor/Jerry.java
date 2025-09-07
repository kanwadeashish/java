class Jerry{
	
	public Jerry(){
		this("Jerry");
		System.out.println("This is no argumental constructor.");
	}
	
	public Jerry(String name){
		this("Jerry",2);
		System.out.println("This is 1 argumental constructor.");
		System.out.println("This is argumental constructor where name = "+name);
	}
	
	public Jerry(String name,int id){
		this("Jerry",2,123456789L);
		System.out.println("This is 2 argumental constructor.");
		System.out.println("This is argumental constructor where id = "+id);
	}
	
	public Jerry(String name,int id,long phoneNumber){
		this("Jerry",2,123456789L,99.99);
		System.out.println("This is 3 argumental constructor.");
		System.out.println("This is argumental constructor where phoneNumber = "+phoneNumber);
	}
	
	public Jerry(String name,int id,long phoneNumber,double percentage){
		this("Jerry",2,123456789L,99.99,98.98f);
		System.out.println("This is 4 argumental constructor.");
		System.out.println("This is argumental constructor where percentage = "+percentage);
	}
	
	public Jerry(String name,int id,long phoneNumber,double percentage,float result){
		this("Jerry",2,123456789L,99.99,98.98f,true);
		System.out.println("This is 5 argumental constructor.");
		System.out.println("This is argumental constructor where result = "+result);
	}
	
	public Jerry(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed){
		this("Jerry",2,123456789L,99.99,98.98f,true,'a');
		System.out.println("This is 6 argumental constructor.");
		System.out.println("This is argumental constructor where isPassed = "+isPassed);
	}
	
	public Jerry(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed,char rating){
		System.out.println("This is 7 argumental constructor.");
		System.out.println("This is argumental constructor where rating = "+rating);
	}
	
}