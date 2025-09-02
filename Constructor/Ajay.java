class Ajay{
	
	public static String name;
	public static int id;
	public static long phoneNumber;
	public static float percentageSSC;
	public static double percentageHSC;
	public static boolean isGraduated;
	public static char educationRating;
	
	public static void info(){
		System.out.println("Value before reassining ="+name);
		name = "Ajay";
		System.out.println("Value After reassining ="+name);
		
		System.out.println("Value before reassining ="+id);
		id = 1;
		System.out.println("Value After reassining ="+id);
		
		System.out.println("Value before reassining ="+phoneNumber);
		phoneNumber = 123456789L;
		System.out.println("Value After reassining ="+phoneNumber);
		
		System.out.println("Value before reassining ="+percentageSSC);
		percentageSSC = 99.99f;
		System.out.println("Value After reassining ="+percentageSSC);
		
		System.out.println("Value before reassining ="+percentageHSC);
		percentageHSC = 88.88;
		System.out.println("Value After reassining ="+percentageHSC);
		
		System.out.println("Value before reassining ="+isGraduated);
		isGraduated = true;
		System.out.println("Value After reassining ="+isGraduated);
		
		System.out.println("Value before reassining ="+educationRating);
		educationRating = 'a';
		System.out.println("Value After reassining ="+educationRating);
	}
	
	
}