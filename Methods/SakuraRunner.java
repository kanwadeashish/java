class SakuraRunner{
	
	public static void main(String[]args){
		
		Sakura sakura = new Sakura();
		
		sakura.displayDetails(1);
		sakura.displayDetails(1,"Sakura");
		sakura.displayDetails(1,"Sakura",123456789L);
		sakura.displayDetails(1,"Sakura",123456789L,99.99);
		sakura.displayDetails(1,"Sakura",123456789L,99.99,98.98f);
		sakura.displayDetails(1,"Sakura",123456789L,99.99,98.98f,'a');
		sakura.displayDetails(1,"Sakura",123456789L,99.99,98.98f,'a',true);
		
	}
	
}