class Cloths{
	
	public static int clothsPrice(String type,int price){
		
		int clothsPrice=0;
		
		if(type=="shirt" && price<1000){
			clothsPrice=900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="pant" && price<2000){
			clothsPrice=1900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="tShirt" && price<500){
			clothsPrice=400;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="jeans" && price<1500){
			clothsPrice=1400;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="formalShirt" && price<1200){
			clothsPrice=1100;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="formalPants" && price<2200){
			clothsPrice=2100;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="casualShirt" && price<1300){
			clothsPrice=1200;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="casualPant" && price<2300){
			clothsPrice=2200;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="suit" && price<3000){
			clothsPrice=2900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="dhoti" && price<100){
			clothsPrice=90;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="western" && price<4000){
			clothsPrice=3900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="southern" && price<5000){
			clothsPrice=4900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="blazer" && price<4500){
			clothsPrice=4400;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="shorts" && price<400){
			clothsPrice=390;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else if(type=="kurta" && price<10000){
			clothsPrice=9900;
			System.out.println("We have what you require at a price of :"+clothsPrice);
		}else {
			System.out.println("Sorry we don't have what you want.");
		}
		return clothsPrice;
	}
	
}