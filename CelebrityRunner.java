class CelebrityRunner{
	
	public static void main(String[]args){
		
		int numOfNonCelebrities=2; 
		int seconds=Celebrity.numOfCelebrities(numOfNonCelebrities);
		System.out.println(seconds);
		
		String nameOfFemaleCelebrity="Rin";
		String colour=Celebrity.nameOfMaleCelebrity(nameOfFemaleCelebrity);
		System.out.println(colour);
		
		long femaleCelebritySalary=15675L;
		long number=Celebrity.maleCelebritySalary(femaleCelebritySalary);
		System.out.println(number);
		
		float performanceDifference=3.0F;
		float interval=Celebrity.salaryDifference(performanceDifference);
		System.out.println(interval);
		
		double heightOfFemale=5.9;
		double timeInterval=Celebrity.heightOfMale(heightOfFemale);
		System.out.println(timeInterval);
		
		boolean isCelebrityFemale=true;
		boolean information=Celebrity.isCelebrityMale(isCelebrityFemale);
		System.out.println(information);
		
		char femaleGrade='A';
		char rating=Celebrity.maleGrade(femaleGrade);
		System.out.println(rating);
		
	}
	
}