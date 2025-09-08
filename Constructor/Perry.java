class Perry{
	
	public static String name;
	public static int id;
	public static long phoneNumber;
	public static double percentage;
	public static float result;
	public static char rating;
	public static boolean isPassed;
	
	public Perry(String name,int id,long phoneNumber,double percentage,float result,char rating,boolean isPassed){
		
		this.name=name;
		this.id=id;
		this.phoneNumber=phoneNumber;
		this.percentage=percentage;
		this.result=result;
		this.rating=rating;
		this.isPassed=isPassed;
		
		System.out.println("Name ="+this.name);
		System.out.println("id ="+this.id);
		System.out.println("phoneNumber ="+this.phoneNumber);
		System.out.println("percentage ="+this.percentage);
		System.out.println("result ="+this.result);
		System.out.println("rating ="+this.rating);
		System.out.println("isPassed ="+this.isPassed);
		
	}
	
}