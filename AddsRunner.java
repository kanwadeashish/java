class AddsRunner{
	
	public static void main(String[]args){
		
		int sourcesOfAdds=4533; 
		int adds=Adds.dailyAdds(sourcesOfAdds);
		System.out.println(adds);
		
		String addSubCompany="MI";
		String name=Adds.addCompany(addSubCompany);
		System.out.println(name);
		
		long yearlyAdds=15675L;
		long number=Adds.numOfAdds(yearlyAdds);
		System.out.println(number);
		
		float addRate=5.0F;
		float percentage=Adds.addInterval(addRate);
		System.out.println(percentage);
		
		double addLoss=8.5;
		double totalPercentage=Adds.addProfit(addLoss);
		System.out.println(totalPercentage);
		
		boolean isAddInappropriate=false;
		boolean information=Adds.isAddOkay(isAddInappropriate);
		System.out.println(information);
		
		char gradeOfAddCompany='A';
		char rating=Adds.addGrade(gradeOfAddCompany);
		System.out.println(rating);
		
	}
	
}