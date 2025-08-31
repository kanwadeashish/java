class Intro{
	
	static String name = "Rimuru";
	static int id = 01;
	static long phoneNumber = 123456789L;
	static double percentage = 99.99;
	static float profit = 8.8f;
	static char rating = 'a';
	static boolean isPassed = true;
	
	public static String name(){
		System.out.println("Name="+name);
		return name;
	}
	
	public static int id(){
		System.out.println("Identification number="+id);
		return id;
	}
	
	public static long phoneNumber(){
		System.out.println("Phone Number="+phoneNumber);
		return phoneNumber;
	}
	
	public static double percentage(){
		System.out.println("Percentage="+percentage);
		return percentage;
	}
	
	public static float profit(){
		System.out.println("Profit="+profit);
		return profit;
	}
	
	public static char rating(){
		System.out.println("Rating="+rating);
		return rating;
	}
	
	public static boolean isPassed(){
		System.out.println("Is passed="+isPassed);
		return isPassed;
	}
	
}