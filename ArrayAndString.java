 class ArrayAndString{
		
	public static int intArray(String input){
		int ajay=10;
		int vijay=20;
		int don=30;
		int god=40;
		int goddess=50;
		
		int [] rollNumbers= {ajay,vijay,don,god,goddess};
		
		for(int number=0;number<rollNumbers.length;number++){
			if(input == "demon"){
				int demon=60;
				rollNumbers[4]=demon;
			}
			int print=rollNumbers[number];
			System.out.println("Roll numbers ="+print);
		}
		return 0;
	}
		
	public static long longArray(String input){
		long dom=10201020L;
		long sun=20302030L;
		long moon=30403040L;
		long star=40504050L;
		long air=50605060L;
		
		long [] phoneNumbers= {dom,sun,moon,star,air};
		
		for(int number=0;number<phoneNumbers.length;number++){
			if(input=="space"){
				long space=60706070L;
				phoneNumbers[4]=space;
			}
			long print=phoneNumbers[number];
			System.out.println("phone numbers ="+print);
		}
		return 0;
	}
		
		
	public static float floatArray(String input){	
		float karl=1.0f;
		float victor=2.0f;
		float garry=3.0f;
		float harry=4.0f;
		float ginny=5.0f;
		
		float [] sharesPercentage= {karl,victor,garry,harry,ginny};
		
		for(int number=0;number<sharesPercentage.length;number++){
			if(input=="demoness"){
				float demoness=6.0f;
				sharesPercentage[4]=demoness;
			}
			float print=sharesPercentage[number];
			System.out.println("shares percentage ="+print);
		}
		return 0;
	}	
		
	public static double doubleArray(String input){	
		double amen=10.0;
		double vinny=20.0;
		double luffy=30.0;
		double sanji=40.00;
		double zoro=50.0;
		
		double [] percentage= {amen,vinny,luffy,sanji,zoro};
		
		for(int number=0;number<percentage.length;number++){
			if(input=="nami"){
				double nami=60.0;
				percentage[4]=nami;
			}
			double print=percentage[number];
			System.out.println("percentage ="+print);
		}
		return 0;
	}
		
	public static boolean booleanArray(String input){	
		boolean nico=true;
		boolean robin=true;
		boolean jimbei=true;
		boolean brook=false;
		boolean chopper=true;
		
		boolean [] passedTheExam= {nico,robin,jimbei,brook,chopper};
		
		for(int number=0;number<passedTheExam.length;number++){
			if(input=="franky"){
				boolean franky=false;
				passedTheExam[4]=franky;
			}
			boolean print=passedTheExam[number];
			System.out.println("Passed the exam ="+print);
		}
		return true;
	}

	public static char charArray(String input){
		char akainu='a';
		char aokiji='b';
		char roger='c';
		char zebek='d';
		char garp='a';
		
		char [] grades= {akainu,aokiji,roger,zebek,garp};
		
		for(int number=0;number<grades.length;number++){
			if(input=="sengoku"){
				char sengoku='d';
				grades[4]=sengoku;
			}
			char print=grades[number];
			System.out.println("grades ="+print);
		}
		return 'x';
	}
}