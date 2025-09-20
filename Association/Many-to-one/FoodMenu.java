class FoodMenu{
	
	public String hotelName;
	public int numberOfItemsOnMenu;
	public Dosa dosa;
	public Paratha paratha;
	public Samosa samosa;
	
	public FoodMenu(String hotelName,int numberOfItemsOnMenu,Dosa dosa,Paratha paratha,Samosa samosa){
		
		this.hotelName=hotelName;
		this.numberOfItemsOnMenu=numberOfItemsOnMenu;
		this.dosa=dosa;
		this.paratha=paratha;
		this.samosa=samosa;
		
	}
	
	public void displayFoodMenuInfo(){
		
		System.out.println("This is FoodMenu class.");
		System.out.println("Hotel Name = "+hotelName);
		System.out.println("Number of items on menu = "+numberOfItemsOnMenu);
		System.out.println("Price of Dosa = "+dosa.dosaPrice);
		System.out.println("Price of Paratha = "+paratha.parathaPrice);
		System.out.println("Price of Samosa = "+samosa.samosaPrice);
		
	}
}