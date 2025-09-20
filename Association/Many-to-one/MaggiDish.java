class MaggiDish{
	
	public String dishName;
	public Maggi maggi;
	public HotWater hotWater;
	public MaggiMasala maggiMasala;
	
	public MaggiDish(String dishName,Maggi maggi,HotWater hotWater,MaggiMasala maggiMasala){
		
		this.dishName=dishName;
		this.maggi=maggi;
		this.hotWater=hotWater;
		this.maggiMasala=maggiMasala;
		
	}
	
	public void displayMaggiDishInfo(){
		
		System.out.println("This is MaggiDish class.");
		System.out.println("Ths name of the dish = "+dishName);
		System.out.println("The raw ingredient required to make the dish is = "+maggi.ingredientName);
		System.out.println("The water required is = "+hotWater.typeOfWater);
		System.out.println("The masala required is = "+maggiMasala.masala);
		
	}
	
}