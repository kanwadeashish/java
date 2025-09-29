class YukiRunner{
	
	public static void main(String[]args){
		
		Yuki yuki = new Yuki();
		
		yuki.displayDetails(1);
		yuki.displayDetails(1,"Yuki");
		yuki.displayDetails(1,"Yuki",123456789L);
		yuki.displayDetails(1,"Yuki",123456789L,99.99);
		yuki.displayDetails(1,"Yuki",123456789L,99.99,98.98f);
		yuki.displayDetails(1,"Yuki",123456789L,99.99,98.98f,'a');
		yuki.displayDetails(1,"Yuki",123456789L,99.99,98.98f,'a',true);
		
	}
	
}