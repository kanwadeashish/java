class HomeTownRunner{
	
	public static void main(String[]args){
		
		int areaOfHomeTown=4000; 
		int distance=HomeTown.distanceInKM(areaOfHomeTown);
		System.out.println(distance);
		
		String townNearHomeTown="Vasagade";
		String name=HomeTown.nameOfHomeTown(townNearHomeTown);
		System.out.println(name);
		
		long migrates=15675L;
		long number=HomeTown.population(migrates);
		System.out.println(number);
		
		float withJobs=5.0F;
		float percentage=HomeTown.jobLess(withJobs);
		System.out.println(percentage);
		
		double teenagers=8.5;
		double totalPercentage=HomeTown.newBorns(teenagers);
		System.out.println(totalPercentage);
		
		boolean isHomeTownSmall=true;
		boolean information=HomeTown.isHomeTownBig(isHomeTownSmall);
		System.out.println(information);
		
		char disciplineryGrade='A';
		char rating=HomeTown.cleanessGrade(disciplineryGrade);
		System.out.println(rating);
		
	}
	
}