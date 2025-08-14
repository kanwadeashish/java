class VegetablesRunner{
	
	public static void main(String[]args){
		
		int units=150; 
		int price=Vegetables.price(units);
		System.out.println(price);
		
		String state="Frseh";
		String name=Vegetables.vegetableName(state);
		System.out.println(name);
		
		long investement=15675L;
		long number=Vegetables.totalVegetables(investement);
		System.out.println(number);
		
		float waterContains=5.0F;
		float percentage=Vegetables.vegetablesDiscount(waterContains);
		System.out.println(percentage);
		
		double commission=8.5;
		double total=Vegetables.profitPercentage(commission);
		System.out.println(total);
		
		boolean isCheap=true;
		boolean information=Vegetables.isFresh(isCheap);
		System.out.println(information);
		
		char freshness='A';
		char rating=Vegetables.qualityRating(freshness);
		System.out.println(rating);
		
	}
	
}