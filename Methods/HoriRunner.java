class HoriRunner{
	
	public static void main(String[]args){
		
		Hori hori = new Hori();
		
		hori.displayDetails(1);
		hori.displayDetails(1,"Hori");
		hori.displayDetails(1,"Hori",123456789L);
		hori.displayDetails(1,"Hori",123456789L,99.99);
		hori.displayDetails(1,"Hori",123456789L,99.99,98.98f);
		hori.displayDetails(1,"Hori",123456789L,99.99,98.98f,'a');
		hori.displayDetails(1,"Hori",123456789L,99.99,98.98f,'a',true);
		
	}
	
}