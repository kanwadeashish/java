class Food{
	
	public static void foodPrice(String foodName){
		
		int foodPrice=0;
		
		if(foodName=="Idly"){
			foodPrice=25;
			System.out.println("Price of idly="+foodPrice);
		}else if(foodName=="Pohe"){
			foodPrice=35;
			System.out.println("Price of Pohe="+foodPrice);
		}else if(foodName=="Dosa"){
			foodPrice=45;
			System.out.println("Price of Dosa="+foodPrice);
		}else if(foodName=="Upama"){
			foodPrice=20;
			System.out.println("Price of Upama="+foodPrice);
		}else if(foodName=="Shira"){
			foodPrice=30;
			System.out.println("Price of Shira="+foodPrice);
		}else if(foodName=="Vadapav"){
			foodPrice=15;
			System.out.println("Price of Vadapav="+foodPrice);
		}else if(foodName=="Bhaji"){
			foodPrice=40;
			System.out.println("Price of Bhaji="+foodPrice);
		}else if(foodName=="Chai"){
			foodPrice=10;
			System.out.println("Price of Chai="+foodPrice);
		}else if(foodName=="Coffee"){
			foodPrice=12;
			System.out.println("Price of Coffee="+foodPrice);
		}else if(foodName=="Rice"){
			foodPrice=50;
			System.out.println("Price of Rice="+foodPrice);
		}else{
			System.out.println("The food item you entered is not available.");
		}
	}
	
}