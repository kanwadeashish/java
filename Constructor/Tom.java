class Tom{
	
	public Tom(){
		this("Tom");
		System.out.println("This is no argumental constructor.");
	}
	
	public Tom(String name){
		this("Tom",1);
		System.out.println("This is 1 argumental constructor.");
		System.out.println("This is argumental constructor where name = "+name);
	}
	
	public Tom(String name,int id){
		this("Tom",1,123456789L);
		System.out.println("This is 2 argumental constructor.");
		System.out.println("This is argumental constructor where id = "+id);
	}
	
	public Tom(String name,int id,long phoneNumber){
		this("Tom",1,123456789L,99.99);
		System.out.println("This is 3 argumental constructor.");
		System.out.println("This is argumental constructor where phoneNumber = "+phoneNumber);
	}
	
	public Tom(String name,int id,long phoneNumber,double percentage){
		this("Tom",1,123456789L,99.99,98.98f);
		System.out.println("This is 4 argumental constructor.");
		System.out.println("This is argumental constructor where percentage = "+percentage);
	}
	
	public Tom(String name,int id,long phoneNumber,double percentage,float result){
		this("Tom",1,123456789L,99.99,98.98f,true);
		System.out.println("This is 5 argumental constructor.");
		System.out.println("This is argumental constructor where result = "+result);
	}
	
	public Tom(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed){
		this("Tom",1,123456789L,99.99,98.98f,true,'a');
		System.out.println("This is 6 argumental constructor.");
		System.out.println("This is argumental constructor where isPassed = "+isPassed);
	}
	
	public Tom(String name,int id,long phoneNumber,double percentage,float result,boolean isPassed,char rating){
		System.out.println("This is 7 argumental constructor.");
		System.out.println("This is argumental constructor where rating = "+rating);
	}
	
}