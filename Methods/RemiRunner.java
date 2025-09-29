class RemiRunner{
	
	public static void main(String[]args){
		
		Remi remi = new Remi();
		
		remi.displayDetails(1);
		remi.displayDetails(1,"Remi");
		remi.displayDetails(1,"Remi",123456789L);
		remi.displayDetails(1,"Remi",123456789L,99.99);
		remi.displayDetails(1,"Remi",123456789L,99.99,98.98f);
		remi.displayDetails(1,"Remi",123456789L,99.99,98.98f,'a');
		remi.displayDetails(1,"Remi",123456789L,99.99,98.98f,'a',true);
		
	}
	
}