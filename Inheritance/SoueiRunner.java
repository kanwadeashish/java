class SoueiRunner{
	
	public static void main(String[]args){
		
		Souei one = new Souei();
		Souei two = new Souei("Souei");
		Souei three = new Souei("Souei",6);
		Souei four = new Souei("Souei",6,623456789L);
		Souei five = new Souei("Souei",6,623456789L,94.94);
		Souei six = new Souei("Souei",6,623456789L,94.94,94.94f);
		Souei seven = new Souei("Souei",6,623456789L,94.94,94.94f,'a');
		Souei eight = new Souei("Souei",6,623456789L,94.94,94.94f,'a',true);
		
		one.displayName("Souei");
		one.displayId(6);
		one.displayPhoneNumber(623456789L);
		one.displayPercentage(94.94);
		one.displayPassRate(94.94f);
		one.displayRating('a');
		one.displayIsGraduate(true);
		
	}
	
}