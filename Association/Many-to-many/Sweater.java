class Sweater{
	
	public String productName;
	public int productPrice;
	public Canvas canvas;
	public Cashmere cashmere;
	public Chenille chenille;
	
	public Sweater(String productName,int productPrice,Canvas canvas,Cashmere cashmere,Chenille chenille){
		
		this.productName=productName;
		this.productPrice=productPrice;
		this.canvas=canvas;
		this.cashmere=cashmere;
		this.chenille=chenille;
		
	}
	public void sweaterDetails(){
		
		System.out.println("The name of the product is = "+productName);
		System.out.println("The price of the product is = "+productPrice);
		System.out.println("The price of the fabric used in the product is = "+canvas.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+canvas.fabricName);
		System.out.println("The price of the fabric used in the product is = "+cashmere.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+cashmere.fabricName);
		System.out.println("The price of the fabric used in the product is = "+chenille.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+chenille.fabricName);
		
	}
	
}