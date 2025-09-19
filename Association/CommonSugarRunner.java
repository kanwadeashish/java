class CommonSugarRunner{
	
	public static void main(String[]args){
		
		CommonSugar sugar = new CommonSugar(1,false);
		CommonSugar brownSugar = new CommonSugar(2,true);
		CommonSugar blackSugar = new CommonSugar(3,false);
		
		ColdCoffee cold = new ColdCoffee(35,"StarBucks",blackSugar);
		Coffee coffee = new Coffee(20,"Coffee Adda",brownSugar);
		LemonTea tea = new LemonTea(15,"Tea Adda",sugar);
		
		cold.displayColdCoffee();
		coffee.displayCoffee();
		tea.displayLemonTea();
		
	}
	
}