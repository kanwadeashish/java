class KyokoRunner{
	
	public static void main(String[]args){
		
		Kyoko kyoko = new Kyoko();
		
		kyoko.displayDetails(1);
		kyoko.displayDetails(1,"Kyoko");
		kyoko.displayDetails(1,"Kyoko",123456789L);
		kyoko.displayDetails(1,"Kyoko",123456789L,99.99);
		kyoko.displayDetails(1,"Kyoko",123456789L,99.99,98.98f);
		kyoko.displayDetails(1,"KyokoKyoko",123456789L,99.99,98.98f,'a');
		kyoko.displayDetails(1,"Kyoko",123456789L,99.99,98.98f,'a',true);
		
	}
	
}