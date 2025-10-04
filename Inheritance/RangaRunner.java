class RangaRunner{
	
	public static void main(String[]args){
		
		Ranga one = new Ranga();
		Ranga two = new Ranga("Ranga");
		Ranga three = new Ranga("Ranga",5);
		Ranga four = new Ranga("Ranga",5,523456789L);
		Ranga five = new Ranga("Ranga",5,523456789L,95.95);
		Ranga six = new Ranga("Ranga",5,523456789L,95.95,95.95f);
		Ranga seven = new Ranga("Ranga",5,523456789L,95.95,95.95f,'a');
		Ranga eight = new Ranga("Ranga",5,523456789L,95.95,95.95f,'a',true);
		
		one.displayName("Ranga");
		one.displayId(5);
		one.displayPhoneNumber(523456789L);
		one.displayPercentage(95.95);
		one.displayPassRate(95.95f);
		one.displayRating('a');
		one.displayIsGraduate(true);
		
	}
	
}