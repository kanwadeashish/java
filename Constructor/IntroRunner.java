class IntroRunner{
	
	public static void main(String[]args){
		
		Intro intro = new Intro();
		
		System.out.println("These are static variables printed below.");
		System.out.println(intro.name);
		System.out.println(intro.id);
		System.out.println(intro.phoneNumber);
		System.out.println(intro.percentage);
		System.out.println(intro.profit);
		System.out.println(intro.rating);
		System.out.println(intro.isPassed);
		
		System.out.println("These are static methods printed below.");
		intro.name();
		intro.id();
		intro.phoneNumber();
		intro.percentage();
		intro.profit();
		intro.rating();
		intro.isPassed();
		
	}
	
}