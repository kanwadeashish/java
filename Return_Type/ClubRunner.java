class ClubRunner{
	
	public static void main(String[]args){
		
		int entryFee=Club.entryFee();
		System.out.println("entryFee="+entryFee);
		
		int drinkCharge=Club.drink();
		System.out.println("drink charges="+drinkCharge);
		
		int food=Club.food();
		System.out.println("food charges="+food);
		
		int massage=Club.massage();
		System.out.println("massage fee="+massage);
		
		int parking=Club.parking();
		System.out.println("parking charges="+parking);
		
	}
	
}