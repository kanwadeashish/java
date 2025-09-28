class RobinRunner{
	
	public static void main(String[]args){
		
		Robin robin = new Robin();
		Robin robinOne = new Robin(2);
		Robin robinTwo = new Robin(2,"Robin");
		Robin robinThree = new Robin(2,"Robin",678956789L);
		Robin robinFour = new Robin(2,"Robin",678956789L,35.99);
		Robin robinFive = new Robin(2,"Robin",678956789L,35.99,49.98f);
		Robin robinSix = new Robin(2,"Robin",678956789L,35.99,49.98f,'d');
		Robin robinSeven = new Robin(2,"Robin",678956789L,35.99,49.98f,'d',true);
		
	}
	
}