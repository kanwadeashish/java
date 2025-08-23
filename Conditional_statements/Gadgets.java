class Gadgets{
	
	public static int price(String name,int amount){
		
		int price=0;
		
		if(name=="Mobile" || amount==15000){
			price =12000;
			System.out.println("We have Mobile worth :"+price);
		}else if(name=="PC" || amount==25000){
			price =22000;
			System.out.println("We have PC worth :"+price);
		}else if(name=="Laptop" || amount==50000){
			price =45000;
			System.out.println("We have Laptop worth :"+price);
		}else if(name=="Charger" || amount==1000){
			price =750;
			System.out.println("We have Charger worth :"+price);
		}else if(name=="USB" || amount==1900){
			price =1500;
			System.out.println("We have USB worth :"+price);
		}else if(name=="Mouse" || amount==1500){
			price =1200;
			System.out.println("We have Mouse worth :"+price);
		}else if(name=="KeyBoard" || amount==2000){
			price =1000;
			System.out.println("We have KeyBoard worth :"+price);
		}else if(name=="EarPhone" || amount==2500){
			price =2000;
			System.out.println("We have EarPhone worth :"+price);
		}else if(name=="HeadPhone" || amount==1200){
			price =1800;
			System.out.println("We have HeadPhone worth :"+price);
		}else if(name=="Connector" || amount==1100){
			price =500;
			System.out.println("We have Connector worth :"+price);
		}else if(name=="SSD" || amount==21000){
			price =12500;
			System.out.println("We have SSD worth :"+price);
		}else if(name=="HDD" || amount==22000){
			price =10000;
			System.out.println("We have HDD worth :"+price);
		}else if(name=="EarBuds" || amount==5000){
			price =2000;
			System.out.println("We have EarBuds worth :"+price);
		}else if(name=="MicroUSB" || amount==1300){
			price =800;
			System.out.println("We have MicroUSB worth :"+price);
		}else if(name=="SmartPhone" || amount==20000){
			price =18000;
			System.out.println("We have SmartPhone worth :"+price);
		}else {
			System.out.println("We don't have gadgets that you require.");
		}
		return price;
		
	}
	
}