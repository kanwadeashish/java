class MaggiDishRunner{
	
	public static void main(String[]args){
		
		Maggi maggi = new Maggi("Noodles");
		HotWater water = new HotWater("Hot water");
		MaggiMasala masala = new MaggiMasala("Maggi Masala");
		
		MaggiDish dish = new MaggiDish("Maggi",maggi,water,masala);
		
		dish.displayMaggiDishInfo();
		
	}
	
}