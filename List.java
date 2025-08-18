class List{
	
	public static void main(String[]args){
		
		int ajay=10;
		int vijay=20;
		int don=30;
		int god=40;
		int goddess=50;
		
		int [] rollNumbers= {ajay,vijay,don,god,goddess};
		
		int demon=60;
		rollNumbers[4]=demon;
		
		for(int number=0;number<rollNumbers.length;number++){
			int print=rollNumbers[number];
			System.out.println("Roll numbers ="+print);
		}
		
		long dom=10201020L;
		long sun=20302030L;
		long moon=30403040L;
		long star=40504050L;
		long air=50605060L;
		
		long [] phoneNumbers= {dom,sun,moon,star,air};
		
		long space=60706070L;
		phoneNumbers[4]=space;
		
		for(int number=0;number<phoneNumbers.length;number++){
			long print=phoneNumbers[number];
			System.out.println("phone numbers ="+print);
		}
		
		float karl=1.0f;
		float victor=2.0f;
		float garry=3.0f;
		float harry=4.0f;
		float ginny=5.0f;
		
		float [] sharesPercentage= {karl,victor,garry,harry,ginny};
		
		float demoness=6.0f;
		sharesPercentage[4]=demoness;
		
		for(int number=0;number<sharesPercentage.length;number++){
			float print=sharesPercentage[number];
			System.out.println("shares percentage ="+print);
		}
		
		double amen=10.0;
		double vinny=20.0;
		double luffy=30.0;
		double sanji=40.00;
		double zoro=50.0;
		
		double [] percentage= {amen,vinny,luffy,sanji,zoro};
		
		double nami=60.0;
		percentage[4]=nami;
		
		for(int number=0;number<percentage.length;number++){
			double print=percentage[number];
			System.out.println("percentage ="+print);
		}
		
		boolean nico=true;
		boolean robin=true;
		boolean jimbei=true;
		boolean brook=false;
		boolean chopper=true;
		
		boolean [] passedTheExam= {nico,robin,jimbei,brook,chopper};
		
		boolean franky=false;
		passedTheExam[4]=franky;
		
		for(int number=0;number<passedTheExam.length;number++){
			boolean print=passedTheExam[number];
			System.out.println("Passed the exam ="+print);
		}
		
		char akainu='a';
		char aokiji='b';
		char roger='c';
		char zebek='d';
		char garp='a';
		
		char [] grades= {akainu,aokiji,roger,zebek,garp};
		
		char sengoku='d';
		grades[4]=sengoku;
		
		for(int number=0;number<grades.length;number++){
			char print=grades[number];
			System.out.println("grades ="+print);
		}
		
	}
	
}