class SandWichRunner{
	
	public static void main(String [] args){
		
		Paneer paneer = new Paneer(75,"Amul");
		
		Bread bread = new Bread(30,"Balaji");
		
		SandWich sandwich = new SandWich(90,"Panner Sandwich",paneer,bread);
		sandwich.sandWichDetails();
		
	}
	
}