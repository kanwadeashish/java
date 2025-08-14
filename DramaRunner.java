class DramaRunner{
	
	public static void main(String[]args){
		
		int previousYearNumOfDramas=222; 
		int num=Drama.numOfDrama(previousYearNumOfDramas);
		System.out.println(num);
		
		String dramaNickName="Dark";
		String name=Drama.dramaName(dramaNickName);
		System.out.println(name);
		
		long dramaInvestment=15675L;
		long number=Drama.dramaPofit(dramaInvestment);
		System.out.println(number);
		
		float increaseInProfit=3.0F;
		float profit=Drama.increaseInPopularity(increaseInProfit);
		System.out.println(profit);
		
		double increaseInTicketSales=5.9;
		double increase=Drama.dicreaseInLoss(increaseInTicketSales);
		System.out.println(increase);
		
		boolean isDramaMakingMoney=true;
		boolean information=Drama.isDramaPopular(isDramaMakingMoney);
		System.out.println(information);
		
		char dramaOverSeesGrade='A';
		char rating=Drama.dramaGrade(dramaOverSeesGrade);
		System.out.println(rating);
		
	}
	
}