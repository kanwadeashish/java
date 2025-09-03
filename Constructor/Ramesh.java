class Ramesh{
	
	public static String name;
	public static int id;
	public static long phoneNumber;
	public static float percentageSSC;
	public static double percentageHSC;
	public static boolean isGraduated;
	public static char educationRating;
	
	public static void info(){
		System.out.println("Value before reassining ="+name);
		name = "Ramesh";
		System.out.println("Value After reassining ="+name);
		
		System.out.println("Value before reassining ="+id);
		id = 2;
		System.out.println("Value After reassining ="+id);
		
		System.out.println("Value before reassining ="+phoneNumber);
		phoneNumber = 213456789L;
		System.out.println("Value After reassining ="+phoneNumber);
		
		System.out.println("Value before reassining ="+percentageSSC);
		percentageSSC = 91.91f;
		System.out.println("Value After reassining ="+percentageSSC);
		
		System.out.println("Value before reassining ="+percentageHSC);
		percentageHSC = 81.81;
		System.out.println("Value After reassining ="+percentageHSC);
		
		System.out.println("Value before reassining ="+isGraduated);
		isGraduated = true;
		System.out.println("Value After reassining ="+isGraduated);
		
		System.out.println("Value before reassining ="+educationRating);
		educationRating = 'b';
		System.out.println("Value After reassining ="+educationRating);
	}
	
	
}