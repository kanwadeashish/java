class BenimaruRunner{
	
	public static void main(String[]args){
		
		Benimaru one = new Benimaru();
		Benimaru two = new Benimaru("Benimaru");
		Benimaru three = new Benimaru("Benimaru",4);
		Benimaru four = new Benimaru("Benimaru",4,423456789L);
		Benimaru five = new Benimaru("Benimaru",4,423456789L,96.96);
		Benimaru six = new Benimaru("Benimaru",4,423456789L,96.96,96.96f);
		Benimaru seven = new Benimaru("Benimaru",4,423456789L,96.96,96.96f,'a');
		Benimaru eight = new Benimaru("Benimaru",4,423456789L,96.96,96.96f,'a',true);
		
		one.displayName("Benimaru");
		one.displayId(4);
		one.displayPhoneNumber(423456789L);
		one.displayPercentage(96.96);
		one.displayPassRate(96.96f);
		one.displayRating('a');
		one.displayIsGraduate(true);
		
	}
	
}